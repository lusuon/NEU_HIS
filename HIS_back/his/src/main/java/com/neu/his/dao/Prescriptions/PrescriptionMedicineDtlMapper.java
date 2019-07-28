package com.neu.his.dao.Prescriptions;

import com.neu.his.entity.PrescriptionMedicineDtlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface PrescriptionMedicineDtlMapper extends JpaRepository<PrescriptionMedicineDtlEntity,Integer> {
    /**
     * 通过病历号查找明细
     * @param cid
     * @return
     */
    @Query(value = "SELECT prescription_medicine.id, drug_name,unit_price,quantity,generate_time " +
            "FROM prescription_medicine join prescription_medicine_dtl join drug " +
            "on prescription_medicine.id = prescription_medicine_dtl.prescription_id " +
            "and medicine_id = drug.id " +
            "WHERE case_id = ?1 " +
            "AND prescription_medicine.prescription_status = 4 " +
            "AND prescription_medicine_dtl.prescription_status = 4"
            ,nativeQuery = true)
    List<Object> findAllToPayPrescriptionDtlByCaseId(int cid);

    /**
     * 通过病历号查找明细：设状态5为已开立，未发药
     * @param cid
     * @return
     */
    @Query(value = "SELECT drug_name,unit_price,quantity,prescription_name,real_name,generate_time,prescription_id " +
            "FROM prescription_medicine join prescription_medicine_dtl join drug join all_user " +
            "on prescription_medicine.id = prescription_medicine_dtl.prescription_id " +
            "and medicine_id = drug.id " +
            "and all_user.id = prescription_medicine.doctor_id " +
            "WHERE case_id = ?1 " +
            "AND prescription_medicine.prescription_status = 5  " +
            "AND prescription_medicine_dtl.prescription_status = 5"
            ,nativeQuery = true)
    List<Object> findAllToReleasePrescriptionDtlByCaseId(int cid);

    /**
     * 更新处方明细内项目的状态，未发药5->6为已发药
     * @param pids
     * @return
     */
    @Transactional
    @Modifying
    @Query("update PrescriptionMedicineDtlEntity d set d.prescriptionStatus = 6 where d.prescriptionId in :pids")
    Integer releaseDrugByPrescriptionIds(@Param("pids") List<Integer> pids);
}

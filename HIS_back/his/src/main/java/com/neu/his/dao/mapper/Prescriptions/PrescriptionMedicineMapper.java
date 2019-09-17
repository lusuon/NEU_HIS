package com.neu.his.dao.mapper.Prescriptions;

import com.neu.his.dao.entity.PrescriptionMedicineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PrescriptionMedicineMapper extends JpaRepository<PrescriptionMedicineEntity,Integer> {
    @Query(value = "call generate_medicine_pre(:i1,:i2,:i3)",nativeQuery = true)
    boolean apply(@Param("i1") int rid,
                  @Param("i2") String gpn,
                  @Param("i3") String list
    );
}

package com.neu.his.service.drug;

import com.neu.his.dao.mapper.Prescriptions.PrescriptionMedicineDtlMapper;
import com.neu.his.dao.mapper.Prescriptions.PrescriptionMedicineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugService {
    @Autowired
    PrescriptionMedicineDtlMapper prescriptionMedicineDtlMapper;
    @Autowired
    PrescriptionMedicineMapper prescriptionMedicineMapper;

    public List<Object> findAllToReleaseDrugs(int c){
        return prescriptionMedicineDtlMapper.findAllToReleasePrescriptionDtlByCaseId(c);
    }

    public Integer releaseDrugByPrescriptionIds(Integer[] pids){
        // todo:检查，如果对应处方id下全开药，更改处方状态
        return prescriptionMedicineDtlMapper.releaseDrugByPrescriptionIds(pids);
    }
}

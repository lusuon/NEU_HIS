package com.neu.his.service.drug;

import com.neu.his.dao.interfaces.Prescriptions.PrescriptionMedicineDtlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugService {
    @Autowired
    PrescriptionMedicineDtlMapper prescriptionMedicineDtlMapper;

    public List<Object> findAllToReleaseDrugs(int c){
        return prescriptionMedicineDtlMapper.findAllToReleasePrescriptionDtlByCaseId(c);
    }

    public Integer releaseDrugByPrescriptionIds(List<Integer> pids){
        return prescriptionMedicineDtlMapper.releaseDrugByPrescriptionIds(pids);
    }
}

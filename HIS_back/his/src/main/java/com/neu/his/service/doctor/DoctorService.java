package com.neu.his.service.doctor;

import com.neu.his.dao.CaseMapper;
import com.neu.his.dao.Prescriptions.PrescriptionMedicineMapper;
import com.neu.his.entity.CaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    CaseMapper caseMapper;
    @Autowired
    PrescriptionMedicineMapper prescriptionMedicineMapper;

    /**
     * 录入诊断信息
     * @return
     */
    public boolean diag(int reg_id,
                       String sym,
                       String cur_med_his,
                       String cur_dis_tre,
                       String med_his,
                       String in_allergy,
                       String bod_ins,
                       String sug,
                       String att,
                       String ins_res,
                       String dia_res,
                       String adv){
        return caseMapper.diag(reg_id,
                sym,
                cur_med_his,
                cur_dis_tre,
                med_his,
                in_allergy,
                bod_ins,
                sug,
                att,
                ins_res,
                dia_res,
                adv
        );
    }

    /**
     * 开药（目前只支持成药）
     * @param rid
     * @param gpn
     * @param list
     * @return
     */
    public boolean apply(int rid,String gpn,String list){
        return prescriptionMedicineMapper.apply(rid,gpn,list);
    }

    public CaseEntity showCase(int regId) {
        return caseMapper.findTopByRegId(regId);
    }
}

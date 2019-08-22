package com.neu.his.service.doctor;

import com.neu.his.dao.mapper.CaseMapper;
import com.neu.his.dao.mapper.DiagnosisMapper;
import com.neu.his.dao.mapper.Prescriptions.PrescriptionMedicineMapper;
import com.neu.his.dao.entity.CaseEntity;
import com.neu.his.dao.entity.DiagnosisEntity;
import com.neu.his.util.requestBody.doctor.DiagnosisBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DoctorService {
    @Autowired
    CaseMapper caseMapper;
    @Autowired
    PrescriptionMedicineMapper prescriptionMedicineMapper;
    @Autowired
    DiagnosisMapper diagnosisMapper;


    /**
     * 录入诊断明细（疾病）
     * @param bodys
     */
    public boolean recordDiagnosis(DiagnosisBody[] bodys){
        ArrayList<DiagnosisEntity> list = new ArrayList<>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for(DiagnosisBody db:bodys){
            DiagnosisEntity de = new DiagnosisEntity();
            de.setCaseId(db.getCaseId());
            de.setRegId(db.getRegId());
            de.setDiseaseId(db.getDiseaseId());
            de.setDiagnosisType((byte)db.getDiagnosisType());
            String formatted = df.format(new Date());
            System.out.println(formatted);
            de.setOnsetTime(Timestamp.valueOf(formatted));
            de.setDiagnosisClass((byte)db.getDiagnosisClass());
            list.add(de);
        }
        diagnosisMapper.saveAll(list);
        return true;
    }

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

    public List<Object> showAllDiagnosisByRegId(int regId){
        return diagnosisMapper.findAllByRegId(regId);
    }
}

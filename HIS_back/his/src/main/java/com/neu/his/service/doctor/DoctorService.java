package com.neu.his.service.doctor;

import com.neu.his.Dao.interfaces.CaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {
    @Autowired
    CaseMapper caseMapper;

    /**
     * 录入诊断信息
     * @return
     */
    public boolean see(int reg_id,
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
        return caseMapper.see(reg_id,
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
}

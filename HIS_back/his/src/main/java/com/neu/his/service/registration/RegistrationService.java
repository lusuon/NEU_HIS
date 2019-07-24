package com.neu.his.service.registration;

import com.neu.his.dao.RegistrationMapper;


import com.neu.his.entity.RegistrationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {
    @Autowired
    RegistrationMapper registrationMapper;


    /**
     * 根据病历号获取患者挂号记录;用户输入病历号，点击“搜索”，表格中列出当日，当前病历号下的所有挂号信息，
     * TODO:可以采用JSTL标签库的循环标签输出挂号列表，要求分页显示。
     * @return
     */
    public List<RegistrationEntity> findAllRegistrationByCaseNo(int c){
        return registrationMapper.findAllByCaseNo(c);
    }



    /**
     * 用于诊断页面，展示医生当天待诊 / 已诊断
     * @return
     */
    public List<RegistrationEntity> showPatientToSee(int doc_id) {return registrationMapper.findPatients(doc_id,1);}

    /**
     * 用于诊断页面，展示医生当天已诊断
     * @return
     */
    public List<RegistrationEntity> showPatientSeen(int doc_id) {
        return registrationMapper.findPatients(doc_id,2);
    }

    public RegistrationEntity findFirstByCaseNo(int c) {
        return registrationMapper.findFirstByCaseNo(c);
    }

    /**
     * 找出当前病历号最大者
     * @return
     */
    public int findCurrentMaxCaseNo(){
        return registrationMapper.findTopByOrderByCaseNoDesc().getCaseNo();
    }


    /**
     * 调用注册存储过程
     * @param reg_pid
     * @param reg_name
     * @param reg_sex
     * @param reg_birth
     * @param reg_addr
     * @param reg_ins_date
     * @param reg_noon
     * @param reg_dept
     * @param reg_doc
     * @param reg_reg_level
     * @param reg_settle
     * @param reg_need
     * @param reg_oper
     * @return
     */
    public int register(String reg_pid, String reg_name, int reg_sex, String reg_birth, String reg_addr, String reg_ins_date, String reg_noon, int reg_dept, int reg_doc, int reg_reg_level, int reg_settle, int reg_need, int reg_oper) {
        return registrationMapper.register( reg_pid,  reg_name, reg_sex,  reg_birth,  reg_addr,  reg_ins_date,  reg_noon, reg_dept, reg_doc, reg_reg_level, reg_settle, reg_need, reg_oper);
    }

    /**
     * 调用退号存储过程
     * @param unreg_id
     * @return
     */
    public int unregister(int unreg_id) {
        return registrationMapper.unregister(unreg_id);
    }


}

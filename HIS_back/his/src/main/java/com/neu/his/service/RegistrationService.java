package com.neu.his.service;

import com.neu.his.Dao.RegistrationMapper;
import com.neu.his.entity.RegistrationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public List<RegistrationEntity> getRegistrationByCaseNo(int c){
        return registrationMapper.findAllByCaseNo(c);
    }

    /**
     * 选择某一行的挂号信息，点击退号，对退号操作进行校验，已经看诊的，不能退号，已经退号的，不能二次退号，退号成功，弹出提示框。
     * “已退号”状态不能进行后续操作，如缴费，退费等
     */
    public int unregister(int c){
        return 0;
    }

    /**
     * 用于挂号页面，展示医生当天待诊 / 已诊断
     * @return
     */
    public List<RegistrationEntity> getRegistrationByCaseNo(Date d, int i){
        return registrationMapper.findAllByRegTimeAndInspectionStatus(d,i);
    }

}

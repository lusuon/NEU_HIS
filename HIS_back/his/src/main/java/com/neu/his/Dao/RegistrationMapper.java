package com.neu.his.Dao;

import com.neu.his.entity.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface RegistrationMapper extends JpaRepository<RegistrationEntity,Integer> {
    /**
     * 通过病历号获取
     * @param c
     * @return
     */
    public List<RegistrationEntity> findAllByCaseNo(int c);

    /**
     * 通过病历号获取患者个人信息
     * @param c
     * @return
     */
    public RegistrationEntity findFirstByCaseNo(int c);
    /**
     * TODO:通过时间与状态查找
     * 当前使用的不能查找到当日
     * @return
     */
    public List<RegistrationEntity> findAllByRegTimeAndInspectionStatus(Date d,int i);

    /**
     * 找出最大病历号
     * @return
     */
    public RegistrationEntity findTopByOrderByCaseNoDesc();


    //public Integer reg(String rpid,String rname,int rsex,String rbirth,String raddr,String rinsdate,String rnoon,int rdept,int rdoc,int rrlevel,int rsettle,int rneed,int roper);
}

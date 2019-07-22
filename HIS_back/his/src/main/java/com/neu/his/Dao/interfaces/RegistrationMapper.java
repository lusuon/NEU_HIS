package com.neu.his.Dao.interfaces;

import com.neu.his.entity.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

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

    /**
     * 找出该医生下待诊断 / 已诊断患者
     * @param d
     * @param i
     * @return
     */
    @Query("select r from RegistrationEntity r where r.doctorId = ?1 and (r.seeDate = current_date) and r.inspectionStatus =?2 ")
    List<RegistrationEntity> findPatients(int d,int i);

}

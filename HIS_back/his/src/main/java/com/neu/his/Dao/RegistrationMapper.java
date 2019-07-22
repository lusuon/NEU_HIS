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
     * TODO:通过时间与状态查找
     * 当前使用的不能查找到当日
     * @return
     */
    public List<RegistrationEntity> findAllByRegTimeAndInspectionStatus(Date d,int i);
}

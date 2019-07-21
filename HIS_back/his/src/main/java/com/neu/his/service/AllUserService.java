package com.neu.his.service;

import com.neu.his.Dao.AllUserMapper;
import com.neu.his.entity.AllUserEntity;
import com.neu.his.entity.CategoryRegEntity;
import com.neu.his.entity.DeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllUserService {
    @Autowired
    AllUserMapper allUserMapper;

    /**
     * 获取科室下所有医生
     * @return
     */
    public List<AllUserEntity> getDoctorUnderDeptAndRegLevel(DeptEntity deptEntity, CategoryRegEntity categoryRegEntity){
        return null;
        //return allUserMapper.getAllUserEntitiesByUserTypeAndAndDeptIdAndAndRegLevelId(3,deptEntity.getId(),categoryRegEntity.getId());
    }
}

package com.neu.his.Dao;

import com.neu.his.entity.AllUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllUserMapper extends JpaRepository<AllUserEntity,Integer> {
    /**
     * 获得指定科室下的所有医生
     * @param ut
     * @param d
     * @return
     */
    //public List<AllUserEntity> getAllUserEntitiesByUserTypeAndDeptIdAnd(int ut,int d);

}

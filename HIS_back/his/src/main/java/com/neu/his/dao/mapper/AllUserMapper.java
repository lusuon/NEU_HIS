package com.neu.his.dao.mapper;

import com.neu.his.dao.entity.AllUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AllUserMapper extends JpaRepository<AllUserEntity,Integer> {
    /**
     * 获得所有医生
     * @return
     */
    List<AllUserEntity> findAllByUserType(String ut);
    AllUserEntity findByUsername(String un);
}

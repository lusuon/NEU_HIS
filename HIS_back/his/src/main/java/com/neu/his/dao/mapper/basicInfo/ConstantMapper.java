package com.neu.his.dao.mapper.basicInfo;

import com.neu.his.dao.entity.ConstantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConstantMapper extends JpaRepository<ConstantEntity,Integer> {
    /**
     * 根据常数类别id 获得对应类型的常数项
     * @param id
     * @return
     */
    List<ConstantEntity> getConstantEntitiesByCategoryId(int id);
}

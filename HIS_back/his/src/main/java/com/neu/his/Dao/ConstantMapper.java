package com.neu.his.Dao;

import com.neu.his.entity.ConstantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConstantMapper extends JpaRepository<ConstantEntity,Integer> {
    public List<ConstantEntity> getConstantEntitiesByCategoryId(int id);
}

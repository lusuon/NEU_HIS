package com.neu.his.dao.interfaces;


import com.neu.his.entity.DeptEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptMapper extends JpaRepository<DeptEntity,Integer> {

}
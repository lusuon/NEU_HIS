package com.neu.his.service.basic;

import com.neu.his.dao.mapper.DeptMapper;
import com.neu.his.dao.entity.DeptEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {
    @Autowired
    DeptMapper deptMapper;

    public List<DeptEntity> getAllDept(){
        return deptMapper.findAll();
    }
}

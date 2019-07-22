package com.neu.his.service.basic;

import com.neu.his.Dao.interfaces.CategoryRegMapper;
import com.neu.his.entity.CategoryRegEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CategoryRegService {
    @Autowired
    CategoryRegMapper categoryRegMapper;

    public List<CategoryRegEntity> getAllCategoryReg(){
        return categoryRegMapper.findAll();
    }
}

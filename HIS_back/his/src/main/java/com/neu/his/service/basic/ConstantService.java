package com.neu.his.service.basic;


import com.neu.his.Dao.ConstantMapper;
import com.neu.his.entity.ConstantEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConstantService {
    @Autowired
    ConstantMapper constantMapper;

    /**
     * 获取科室分类常数
     * @return
     */
    public List<ConstantEntity> getDeptConstant(){
        return constantMapper.getConstantEntitiesByCategoryId(1);
    }
    /**
     * 获取收费方式常数
     * @return
     */
    public List<ConstantEntity> getPayConstant(){
        return constantMapper.getConstantEntitiesByCategoryId(5);
    }
    /**
     * 获取性别常数
     * @return
     */
    public List<ConstantEntity> getSexConstant(){
        return constantMapper.getConstantEntitiesByCategoryId(7);
    }

    /**
     * 获取医生职称常数
     * @return
     */
    public List<ConstantEntity> getTitleConstant(){
        return constantMapper.getConstantEntitiesByCategoryId(8);
    }

    /**
     * 获取药品类型常数
     * @return
     */
    public List<ConstantEntity> getDrugTypeConstant(){
        return constantMapper.getConstantEntitiesByCategoryId(10);
    }

    /**
     * 获取药品剂型常数
     * @return
     */
    public List<ConstantEntity> getDrugDosageConstant(){
        return constantMapper.getConstantEntitiesByCategoryId(11);
    }


}

package com.neu.his.service;

import com.neu.his.dao.mapper.basicInfo.DiseaseMapper;
import com.neu.his.dao.entity.DiseaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasicInfoService {
    @Autowired
    DiseaseMapper diseaseMapper;
    public List<DiseaseEntity> getAllDiseases(){
        return diseaseMapper.findAll().subList(0,30);
    }
    public DiseaseEntity getDiseaseInfo(int id){
        return diseaseMapper.findById(id).get();
    }
}

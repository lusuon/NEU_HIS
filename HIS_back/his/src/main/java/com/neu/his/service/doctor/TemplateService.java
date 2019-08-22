package com.neu.his.service.doctor;

import com.neu.his.dao.mapper.templates.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateService {
    @Autowired
    TemplateDtlHerbMapper templateDtlHerbMapper;
    @Autowired
    TemplateDtlMediMapper templateDtlMediMapper;
    @Autowired
    TemplateHerbMapper templateHerbMapper;
    @Autowired
    TemplateMediMapper templateMediMapper;
    @Autowired
    TemplateNonDrugMapper templateNonDrugMapper;
    @Autowired
    TemplateDtlNonDrugMapper templateDtlNonDrugMapper;

    /**
     * 查找医生id下所有可用模板
     * @param d
     * @return
     */
    public List<Object> findUsableTemplates(int d){
        return templateMediMapper.findAllUsableTeamplate(d);
    }
    /*
    public HashMap<String,List> findUsableTemplates(int d){
        HashMap<String,List> allTemplates = new HashMap<>(3);
        allTemplates.put("h",templateHerbMapper.findAllUsableTeamplate(d));
        allTemplates.put("m",templateMediMapper.findAllUsableTeamplate(d));
        allTemplates.put("n",templateNonDrugMapper.findAllUsableTeamplate(d));
        return allTemplates;
    }
    */
}

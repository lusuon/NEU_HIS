package com.neu.his.service.doctor;

import com.neu.his.dao.templates.TemplateDtlHerbMapper;
import com.neu.his.dao.templates.TemplateDtlMediMapper;
import com.neu.his.dao.templates.TemplateDtlNonDrugMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateDtlService {
    @Autowired
    TemplateDtlHerbMapper templateDtlHerbMapper;
    @Autowired
    TemplateDtlMediMapper templateDtlMediMapper;
    @Autowired
    TemplateDtlNonDrugMapper templateDtlNonDrugMapper;

    public List<Object> getTemplateDtlHerb(int t){
        return templateDtlHerbMapper.findAllByTemplateId(t);
    }

    public List<Object> getTemplateDtlMedi(int t){
        return templateDtlMediMapper.findAllByTemplateId(t);
    }

    public List<Object> getTemplateDtlNonDrug(int t){
        return templateDtlNonDrugMapper.findAllByTemplateId(t);
    }

}

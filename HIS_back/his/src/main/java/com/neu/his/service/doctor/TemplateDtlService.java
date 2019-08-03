package com.neu.his.service.doctor;

import com.neu.his.dao.templates.TemplateDtlHerbMapper;
import com.neu.his.dao.templates.TemplateDtlMediMapper;
import com.neu.his.dao.templates.TemplateDtlNonDrugMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
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

    public ArrayList<HashMap<String, Object>> getTemplateDtlMedi(int t){
        ArrayList<HashMap<String,Object>> result = new ArrayList<>();
        for (List<Object> l: templateDtlMediMapper.findAllByTemplateId(t) ) {
            HashMap<String,Object> subResult = new HashMap<>();
            subResult.put("dtl", l.get(0));
            subResult.put("drug", l.get(1));
            result.add(subResult);
        }
        return result;
    }

    public List<Object> getTemplateDtlNonDrug(int t){
        return templateDtlNonDrugMapper.findAllByTemplateId(t);
    }

}

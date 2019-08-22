package com.neu.his.controller;

import com.neu.his.util.response.CommonResponse;
import com.neu.his.service.BasicInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicInfoController {
    @Autowired
    BasicInfoService basicInfoService;

    @GetMapping("/api/disease")
    public CommonResponse getAllDiseases(){
        return CommonResponse.succuess(basicInfoService.getAllDiseases());
    }

    @GetMapping("/api/disease/{disId}")
    public CommonResponse getAllDiseases(@PathVariable("disId") int disId){
        return CommonResponse.succuess(basicInfoService.getDiseaseInfo(disId));
    }
}

package com.neu.his.controller;

import com.neu.his.service.CategoryRegService;
import com.neu.his.service.ConstantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class RegistrationController {
    @Autowired
    CategoryRegService categoryRegService;
    @Autowired
    ConstantService constantService;

    /**
     * 1.2 根据号别切换诊费，普通号别和专家号别的费用从数据库中读取。
     * 1.3 初始化性别，号别，科室，医生信息，显示在下拉列表中。
     * 1.4 科室和医生是一对多的关系，切换科室和号别，更新医生列表。
     * 1.5 使用病历号挂号，如果是第一次挂号，需要用户填写姓名，性别，出生日期，如果之前已经使用该病历号挂过号，输入病历号，直接列出以上用户信息。
     * @return
     */
    @GetMapping("/registration")
    public HashMap<String, List> getNecessaryInfo(){
        HashMap<String,List> info = new HashMap<>();
        // 初始化性别
        info.put("sex",constantService.getSexConstant());
        // 初始化号别
        info.put("reg_level",categoryRegService.getAll());
        // 初始化科室与医生信息        info.put("dept_and_doc",)
        return info;
    }
}

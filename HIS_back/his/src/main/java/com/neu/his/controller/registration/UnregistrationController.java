package com.neu.his.controller.registration;

import com.neu.his.entity.RegistrationEntity;
import com.neu.his.service.CategoryRegService;
import com.neu.his.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UnregistrationController {
    @Autowired
    RegistrationService registrationService;

    @GetMapping("/unregistration")
    public List<RegistrationEntity> getPatientRegistration(@RequestParam(value="case_no") int c){
        return registrationService.getRegistrationByCaseNo(c);
    }

    /**
     * 选择某一行的挂号信息，点击退号，对退号操作进行校验，已经看诊的，不能退号，已经退号的，不能二次退号，退号成功，弹出提示框。
     * “已退号”状态不能进行后续操作，如缴费，退费等
     */
    @PutMapping
    public

}

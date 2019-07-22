package com.neu.his.controller.doctor;

import com.neu.his.entity.RegistrationEntity;
import com.neu.his.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 医生看诊
 * 3.1 输入医生的用户名和密码，登录医生系统。
 * 3.2 【可选】采用过滤器完成系统的防盗链功能，如果用户未登录，不可以直接访问系统功能，需要跳转到登陆页面。
 * 3.3 医生登录成功后，查找该医生当日，待诊患者和已诊患者列表，使用JSTL标签库中的循环标签将数据展示在页面上。需要判断患者的挂号状态，已经退号患者不能出现在待诊列表中，可以使用JSTL标签库中的判断标签实现。
 * 3.4 在待诊患者列表中选择某一位患者，点击“门诊病历”，填写病历信息，使用JS实现页面校验，如果没有选择待诊患者，弹出提示信息，不能填写病历。
 * 3.5 保存后更改就诊信息，“已就诊”的患者不能执行退号操作
 */
@RestController
public class SeeController {
    @Autowired
    RegistrationService registrationService;

    /**
     * 当日、未诊
     */
    @GetMapping("/doctor/toSee")
    public List<RegistrationEntity> showPatientToSee(){
        return registrationService;
    }
    /**
     * 当日、以诊
     */
    @GetMapping("/doctor/seen")
    public List<RegistrationEntity> showPattientSeen(){
        return registrationService;
    }
}

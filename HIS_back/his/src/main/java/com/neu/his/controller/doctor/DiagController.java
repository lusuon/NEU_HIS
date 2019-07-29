package com.neu.his.controller.doctor;

import com.neu.his.common.response.CommonResponse;
import com.neu.his.entity.CaseEntity;
import com.neu.his.entity.RegistrationEntity;
import com.neu.his.requestBody.doctor.DiagBody;
import com.neu.his.service.doctor.DoctorService;
import com.neu.his.service.registration.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 医生看诊
 * TODO:3.1 输入医生的用户名和密码，登录医生系统。
 * TODO:3.2 【可选】采用过滤器完成系统的防盗链功能，如果用户未登录，不可以直接访问系统功能，需要跳转到登陆页面。
 * 3.3 医生登录成功后，查找该医生当日，待诊患者和已诊患者列表，使用JSTL标签库中的循环标签将数据展示在页面上。需要判断患者的挂号状态，已经退号患者不能出现在待诊列表中，可以使用JSTL标签库中的判断标签实现。
 * 3.4 在待诊患者列表中选择某一位患者，点击“门诊病历”，填写病历信息，使用JS实现页面校验，如果没有选择待诊患者，弹出提示信息，不能填写病历。
 * 3.5 保存后更改就诊信息，“已就诊”的患者不能执行退号操作
 */
@RestController
public class DiagController {
    @Autowired
    RegistrationService registrationService;
    @Autowired
    DoctorService doctorService;



    /**
     * 当日、未诊
     */
    @GetMapping("/api/doctor/{doc_id}/toSee")
    public CommonResponse showPatientToSee(@PathVariable("doc_id") int doc_id){
        List<RegistrationEntity> result = registrationService.showPatientToSee(doc_id);
        return CommonResponse.succuess(result);
    }
    /**
     * 当日、以诊
     */
    @GetMapping("/api/doctor/{doc_id}/seen")
    public CommonResponse showPatientSeen(@PathVariable("doc_id") int doc_id){
        List<RegistrationEntity> result = registrationService.showPatientSeen(doc_id);
        return CommonResponse.succuess(result);
    }

    @GetMapping("/api/doctor/diag/{regId}")
    public CommonResponse showPatientDiag(@PathVariable("regId") int regId){
        CaseEntity caseEntity = doctorService.showCase(regId);
        return CommonResponse.succuess(caseEntity);
    }

    /**
     * 调用存储过程记录诊断
     */
    @PostMapping("/api/doctor/diag")
    public CommonResponse diag(@RequestBody DiagBody diagBody){
       boolean result = doctorService.diag(
               diagBody.getRegId(),
               diagBody.getSym(),
               diagBody.getCurMedHis(),
               diagBody.getCurDisTre(),
               diagBody.getMedHis(),
               diagBody.getInAllergy(),
               diagBody.getBodIns(),
               diagBody.getSug(),
               diagBody.getAtt(),
               diagBody.getInsRes(),
               diagBody.getDiaRes(),
               diagBody.getAdv()
       );
        return result?CommonResponse.succuess("Insert successfully"):CommonResponse.fail("Fail to unreg.");
    }
}

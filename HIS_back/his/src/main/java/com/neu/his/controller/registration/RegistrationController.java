package com.neu.his.controller.registration;

import com.neu.his.common.response.CommonResponse;
import com.neu.his.entity.RegistrationEntity;
import com.neu.his.requestBodyClass.Patient;
import com.neu.his.service.basic.CategoryRegService;
import com.neu.his.service.basic.ConstantService;
import com.neu.his.service.basic.DeptService;
import com.neu.his.service.financial.FinancialService;
import com.neu.his.service.registration.RegistrationService;
import com.neu.his.service.users.AllUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * 实现挂号、退号功能
 */
@RestController
public class RegistrationController {
    @Autowired
    CategoryRegService categoryRegService;
    @Autowired
    ConstantService constantService;
    @Autowired
    AllUserService allUserService;
    @Autowired
    DeptService deptService;
    @Autowired
    RegistrationService registrationService;
    @Autowired
    FinancialService financialService;

    /**
     * 进入页面时初始化信息——POSTMAN测试返回:【OK】
     * 【已实现】向前端传常数项：性别、号别、科室、医生；
     * 仅提供以下行为所需信息，剩余操作前端完成
     * 1.1 系统自动生成可用病历号，病历号要求不重复，格式无要求【OK】
     * 1.2 根据号别切换诊费，普通号别和专家号别的费用从数据库中读取。【OK】
     * 1.3 初始化性别，号别，科室，医生信息，显示在下拉列表中。【ok】
     * 1.4 科室和医生是一对多的关系，切换科室和号别，更新医生列表。【ok】
     *
     * @return
     */
    @GetMapping("/api/registration/basic")
    public CommonResponse getBasicInfo(){
        HashMap<String,Object> info = new HashMap<>();
        // 初始化性别
        info.put("sex",constantService.getSexConstant());
        // 初始化号别
        info.put("reg_level",categoryRegService.getAllCategoryReg());
        // 初始化科室与医生信息
        info.put("doc",allUserService.getAllDoctor());
        info.put("dept",deptService.getAllDept());
        // 仅向前端演示，实际以存储过程为准
        info.put("next_case_no",registrationService.findCurrentMaxCaseNo()+1);
        // 同上
        info.put("next_invoice_no",financialService.findCurrentMaxInvoiceNo()+1);
        return CommonResponse.succuess(info);
    }

    /**
     * 1.5 使用病历号挂号，如果是第一次挂号，需要用户填写姓名，性别，出生日期，如果之前已经使用该病历号挂过号，输入病历号，直接列出以上用户信息。
     * 根据病历号获取患者信息；前端需求，当返回响应对象的data字段为null，前端解除个人信息输入限制，允许输入个人信息创建病历
     *
     */
    @GetMapping("/api/registration/first/{case_no}")
    public CommonResponse getPatientInfo(@PathVariable("case_no") int case_no){
        RegistrationEntity patientRecord = registrationService.findFirstByCaseNo(case_no);
        return CommonResponse.succuess(patientRecord);
    }

    /**
     * 根据病历号显示所有挂号信息
     */
    @GetMapping("/api/unregistration/all/{case_no}")
    public CommonResponse getPatientRegistrationRecord(@PathVariable("case_no") int case_no){
        List<RegistrationEntity> result =  registrationService.findAllRegistrationByCaseNo(case_no);
        return CommonResponse.succuess(result);
    }


    // restful 传参：http://liuyanwei.jumppo.com/2015/05/28/spring-2.html
    // Hibernate 调用存储过程
    /**
     *
     1.6 点击“挂号”，使用JS实现表单验证，表单校验正确，提交表单，否则弹出错误提示信息，不提交表单。
     1.7 保存挂号信息，为每次挂号生成系统唯一的挂号ID，挂号ID可以采用UUID生成，也可以采用数据库自增主键，挂号完成弹出成功提示。
     * 挂号，直接调用存储过程
     * @return
     */
    @PostMapping("/api/registration")
    public CommonResponse register(
            @RequestBody RegistrationInfo registrationInfo
    ){
        @RequestParam(value="reg_pid") String reg_pid,
        @RequestParam(value="reg_name") String reg_name,
        @RequestParam(value="reg_sex") int reg_sex,
        @RequestParam(value="reg_birth") String reg_birth,
        @RequestParam(value="reg_addr") String reg_addr,
        @RequestParam(value="reg_ins_date") String reg_ins_date,
        @RequestParam(value="reg_noon") String reg_noon,
        @RequestParam(value="reg_dept") int reg_dept,
        @RequestParam(value="reg_doc") int reg_doc,
        @RequestParam(value="reg_reg_level") int reg_reg_level,
        @RequestParam(value="reg_settle") int reg_settle,
        @RequestParam(value="reg_need") int reg_need,
        @RequestParam(value="reg_oper") int reg_oper
       boolean result = registrationService.register(reg_pid,reg_name,reg_sex,reg_birth,reg_addr,reg_ins_date,reg_noon,reg_dept,reg_doc,reg_reg_level,reg_settle,reg_need,reg_oper);
       return result?CommonResponse.succuess():CommonResponse.fail("Fail to insert");
    }



    /**
     * 选择某一行的挂号信息，点击退号，对退号操作进行校验，已经看诊的，不能退号，已经退号的，不能二次退号，退号成功，弹出提示框。
     * “已退号”状态不能进行后续操作，如缴费，退费等
     *  结果使用CommonResponse封装
     */
    @PutMapping("/api/unregistration/{id}")
    public CommonResponse unregister(@PathVariable("id") int unreg_id){
        boolean result = registrationService.unregister(unreg_id);
        return result?CommonResponse.succuess():CommonResponse.fail("Fail to unreg.");
    }
}

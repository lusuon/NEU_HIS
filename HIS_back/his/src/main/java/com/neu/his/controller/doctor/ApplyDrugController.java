package com.neu.his.controller.doctor;

import com.neu.his.util.response.CommonResponse;
import com.neu.his.util.requestBody.doctor.ApplyBody;
import com.neu.his.service.doctor.DoctorService;
import com.neu.his.service.doctor.TemplateDtlService;
import com.neu.his.service.doctor.TemplateService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 医生开药
 */
@RestController
public class ApplyDrugController {
    @Autowired
    TemplateService templateService;
    @Autowired
    TemplateDtlService templateDtlService;
    @Autowired
    DoctorService doctorService;

    /**
     * 获取医生可用处方
     * @return
     */
    @GetMapping("/api/doctor/{doc_id}/template")
    @RequiresRoles("3")
    public CommonResponse findUsableTemplate(@PathVariable("doc_id") int doc_id){
        return CommonResponse.succuess(templateService.findUsableTemplates(doc_id));
    }

    /**
     * 根据模板号显示模板明细
     */
    @GetMapping("/api/template/{type}/{id}/Dtl")
    @RequiresRoles("3")
    public CommonResponse showDtl(
            @PathVariable("type") String t,
            @PathVariable("id") int i
    ){
        if (t.equals("herb")) {
            return CommonResponse.succuess(templateDtlService.getTemplateDtlHerb(i));
        }else if (t.equals("medi")){
            return CommonResponse.succuess(templateDtlService.getTemplateDtlMedi(i));
        }else if (t.equals("nonDrug")){
            return CommonResponse.succuess(templateDtlService.getTemplateDtlNonDrug(i));
        }else{
            return CommonResponse.fail("无效参数");
        }
    }

    /**
     *  根据
     */
    @PostMapping("/api/doctor/apply")
    @RequiresRoles("3")
    public CommonResponse apply(@RequestBody ApplyBody applyBody){
        return doctorService.apply(applyBody.getRid(),applyBody.getGpn(),applyBody.getList())?CommonResponse.succuess("OK"):CommonResponse.fail("Fail.");
    }
}

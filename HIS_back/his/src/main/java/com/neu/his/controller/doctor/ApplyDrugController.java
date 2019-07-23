package com.neu.his.controller.doctor;

import com.neu.his.common.response.CommonResponse;
import com.neu.his.service.doctor.DoctorService;
import com.neu.his.service.doctor.TemplateDtlService;
import com.neu.his.service.doctor.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
     * @param doc
     * @return
     */
    @GetMapping("/apply")
    public CommonResponse findUsableTemplate(@RequestParam("doc_id") int doc){
        return CommonResponse.succuess(templateService.findUsableTemplates(doc));
    }



    /**
     * 根据模板号显示模板明细
     */
    @GetMapping("/apply/detail")
    public CommonResponse showDtl(
            @RequestParam("template_type") String t,
            @RequestParam("template_id") int i
    ){
        if (t.equals("h")) {
            return CommonResponse.succuess(templateDtlService.getTemplateDtlHerb(i));
        }else if (t.equals("m")){
            return CommonResponse.succuess(templateDtlService.getTemplateDtlMedi(i));
        }else if (t.equals("n")){
            return CommonResponse.succuess(templateDtlService.getTemplateDtlNonDrug(i));
        }
        else{
            return CommonResponse.fail("无效参数");
        }
    }

    /**
     *  根据
     */
    @PostMapping("/apply")
    public CommonResponse apply(
            @RequestParam("rid") int rid,
            @RequestParam("gpn") String gpn,
            @RequestParam("list") String list
    ){
        return doctorService.apply(rid,gpn,list)?CommonResponse.succuess("OK"):CommonResponse.fail("Fail.");
    }
}

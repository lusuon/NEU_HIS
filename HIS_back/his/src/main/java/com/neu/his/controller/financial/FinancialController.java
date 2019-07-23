package com.neu.his.controller.financial;

import com.neu.his.common.response.CommonResponse;
import com.neu.his.requestBody.financial.PaymentBody;
import com.neu.his.service.financial.FinancialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FinancialController {
    @Autowired
    FinancialService financialService;
    /**
     * 5. 完成收费功能（必做，参考界面如下）
     *
     *
     * 具体要求：
     * 5.1 输入病历号，列出药品列表，包括费用信息。
     * 5.2 点击列头的“全选”，使用JS选中所有行。
     * 5.3 选择某些行，点击“收费结算”，弹出“发票信息（交费）”页面，填写实收金额，使用js自动计算找零金额。
     * 5.4 点击“收费”，保存收费信息到数据库。
     */

    /**
     * 根据病历号，获取病人信息
     * @return
     */
    @GetMapping("/api/payment/{case_no}")
    public CommonResponse getPatientUnPayDtl(@PathVariable("case_no") int case_no){
        List<Object> result = financialService.getPatientUnPayMedicineDtl(case_no);
        return CommonResponse.succuess(result);
    }

    /**
     * 输入处方id进行缴费
     *
     * @return
     */
    @PostMapping("/api/payment")
    public CommonResponse pay(@RequestBody PaymentBody pb){
        boolean result = financialService.pay(pb.getPid(),pb.getOid(),pb.getItyp(),pb.getPtyp());
        return result?CommonResponse.succuess():CommonResponse.fail("Fail to pay.");
    }
}

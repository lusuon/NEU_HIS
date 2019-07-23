package com.neu.his.controller.drugAdmin;

import com.neu.his.common.response.CommonResponse;
import com.neu.his.requestBody.drugAdmin.ReleaseDrugBody;
import com.neu.his.service.drug.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 6. 药品发药【可选】
 */
@RestController
public class ReleaseDrugController {
    @Autowired
    DrugService drugService;

    @GetMapping("/api/drug/toRelease/{case_no}")
    public CommonResponse getDrugToRelease(@PathVariable("case_no") int case_no){
        List<Object> result = drugService.findAllToReleaseDrugs(case_no);
        return CommonResponse.succuess(result);
    }

    /**
     * 发药，入参为pid组成的，以逗号分隔字符串
     * @return
     */
    @PutMapping("/api/drug/release")
    public CommonResponse releaseDrugs(@RequestBody ReleaseDrugBody rb){
        String[] pstr = rb.getList().split(",");
        ArrayList<Integer> pids = new ArrayList<>();
        for(String pst :pstr){
            pids.add(Integer.parseInt(pst));
        }
        return drugService.releaseDrugByPrescriptionIds(pids)!=0?CommonResponse.succuess("有条目修改"):CommonResponse.fail("无条目修改");
    }

}

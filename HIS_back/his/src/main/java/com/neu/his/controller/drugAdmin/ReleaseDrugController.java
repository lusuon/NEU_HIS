package com.neu.his.controller.drugAdmin;

import com.neu.his.common.response.CommonResponse;
import com.neu.his.service.drug.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/drug")
    public CommonResponse getDrugToRelease(@RequestParam("case_no") int c){
        List<Object> result = drugService.findAllToReleaseDrugs(c);
        return CommonResponse.succuess(result);
    }

    /**
     * 发药，入参为pid组成的，以逗号分隔字符串
     * @return
     */
    @PutMapping("/drug/release")
    public CommonResponse releaseDrugs(@RequestParam("pids") String pidstr){
        String[] pstr = pidstr.split(",");
        ArrayList<Integer> pids = new ArrayList<>();
        for(String pst :pstr){
            pids.add(Integer.parseInt(pst));
        }
        return drugService.releaseDrugByPrescriptionIds(pids)!=0?CommonResponse.succuess("有条目修改"):CommonResponse.fail("无条目修改");
    }

}

package com.neu.his.requestBody.doctor;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

@Data
public class DiagBody {
     int reg_id;
     String sym;
     String cur_med_his;
     String cur_dis_tre;
     String med_his;
     String in_allergy;
     String bod_ins;
     String sug;
     String att;
     String ins_res;
     String dia_res;
     String adv;
}

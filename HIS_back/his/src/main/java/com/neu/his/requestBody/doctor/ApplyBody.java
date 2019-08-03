package com.neu.his.requestBody.doctor;

import lombok.Data;

@Data
public class ApplyBody {
    int rid; //挂号id
    String gpn; //处方名称
    String list; //逗号分隔的开药信息
}

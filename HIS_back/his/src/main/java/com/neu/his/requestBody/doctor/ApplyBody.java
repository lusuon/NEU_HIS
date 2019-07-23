package com.neu.his.requestBody.doctor;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

@Data
public class ApplyBody {
    int rid;
    String gpn;
    String list;
}

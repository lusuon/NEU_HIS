package com.neu.his.requestBody.financial;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

@Data
public class PaymentBody {
    int pid;
    int oid;
    int ityp;
    int ptyp;
}

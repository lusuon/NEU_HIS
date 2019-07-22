package com.neu.his.service.financial;

import com.neu.his.Dao.InvoiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancialService {
    @Autowired
    InvoiceMapper invoiceMapper;

    public int findCurrentMaxInvoiceNo(){
        return invoiceMapper.findTopByOrderByInvoiceNoDesc().getInvoiceNo();
    }
}

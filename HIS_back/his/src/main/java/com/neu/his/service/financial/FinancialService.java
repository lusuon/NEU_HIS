package com.neu.his.service.financial;

import com.neu.his.Dao.interfaces.InvoiceMapper;
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

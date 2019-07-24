package com.neu.his.service.financial;

import com.neu.his.dao.financial.InvoiceMapper;
import com.neu.his.dao.Prescriptions.PrescriptionMedicineDtlMapper;
import com.neu.his.dao.Prescriptions.PrescriptionMedicineMapper;
import com.neu.his.dao.financial.PaymentDtlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class FinancialService {
    @Autowired
    InvoiceMapper invoiceMapper;
    @Autowired
    PrescriptionMedicineMapper prescriptionMedicineMapper;
    @Autowired
    PrescriptionMedicineDtlMapper prescriptionMedicineDtlMapper;
    @Autowired
    PaymentDtlMapper paymentDtlMapper;

    public int findCurrentMaxInvoiceNo(){
        return invoiceMapper.findTopByOrderByInvoiceNoDesc().getInvoiceNo();
    }


    public List<Object> getPatientUnPayMedicineDtl(int c) {
        HashMap<String,Object> result = new HashMap<>();
        List<Object> dtl = prescriptionMedicineDtlMapper.findAllToPayPrescriptionDtlByCaseId(c);
        return dtl;
    }

    public boolean pay(int pid, int oid, int ityp, int ptyp) {
        return paymentDtlMapper.pay(pid,oid,ityp,ptyp);
    }
}

package com.neu.his.dao.interfaces.financial;

import com.neu.his.entity.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceMapper extends JpaRepository<InvoiceEntity,Integer> {
    public InvoiceEntity findTopByOrderByInvoiceNoDesc();

}

package com.neu.his.dao.mapper.financial;

import com.neu.his.dao.entity.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceMapper extends JpaRepository<InvoiceEntity,Integer> {
    public InvoiceEntity findTopByOrderByInvoiceNoDesc();

}

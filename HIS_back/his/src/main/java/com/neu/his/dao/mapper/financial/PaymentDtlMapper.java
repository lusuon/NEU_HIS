package com.neu.his.dao.mapper.financial;

import com.neu.his.dao.entity.PaymentDtlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PaymentDtlMapper extends JpaRepository<PaymentDtlEntity,Integer> {
    @Query(value = "call pay_med(:i1,:i2,:i3,:i4)", nativeQuery = true)
    boolean pay(@Param("i1") int pid,//处方id
                @Param("i2") int oid,//操作员id
                @Param("i3") int ityp,//
                @Param("i4") int ptyp
    );
}

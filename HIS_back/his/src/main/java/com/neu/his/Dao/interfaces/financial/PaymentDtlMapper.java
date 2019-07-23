package com.neu.his.Dao.interfaces.financial;

import com.neu.his.entity.PaymentDtlEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PaymentDtlMapper extends JpaRepository<PaymentDtlEntity,Integer> {
    @Query(value = "call pay_med(:i1,:i2,:i3,:i4)", nativeQuery = true)
    boolean pay(@Param("i1") int pid,
                @Param("i2") int oid,
                @Param("i3") int ityp,
                @Param("i4") int ptyp
    );
}

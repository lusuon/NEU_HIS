package com.neu.his.dao;

import com.neu.his.entity.CaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CaseMapper extends JpaRepository<CaseEntity,Integer> {
    @Query(value = "SELECT * FROM `case` WHERE reg_id = :i1",nativeQuery = true)
    CaseEntity findTopByRegId(@Param("i1") int regId);

    @Query(value = "call diag( :i1,:i2,:i3,:i4,:i5,:i6,:i7,:i8,:i9,:i10,:i11,:i12 )", nativeQuery = true)
    boolean diag(@Param("i1") int regId,
                @Param("i2") String sym,
                @Param("i3") String curMedHis,
                @Param("i4") String curDisTre,
                @Param("i5") String medHis,
                @Param("i6") String inAllergy,
                @Param("i7") String bodIns,
                @Param("i8") String sug,
                @Param("i9") String att,
                @Param("i10") String insRes,
                @Param("i11") String diaRes,
                @Param("i12") String adv
    );
}

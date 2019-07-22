package com.neu.his.Dao.interfaces;

import com.neu.his.entity.CaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CaseMapper extends JpaRepository<CaseEntity,Integer> {
    @Query(value = "call diag(:i1,:i2,:i3,:i4,:i5,:i6,:i7,:i8,:i9,:i10,:i11,:i12)", nativeQuery = true)
    boolean see(@Param("i1") int reg_id,
                @Param("i2") String sym,
                @Param("i3") String cur_med_his,
                @Param("i4") String cur_dis_tre,
                @Param("i5") String med_his,
                @Param("i6") String in_allergy,
                @Param("i7") String bod_ins,
                @Param("i8") String sug,
                @Param("i9") String att,
                @Param("i10") String ins_res,
                @Param("i11") String dia_res,
                @Param("i12") String adv
    );
}

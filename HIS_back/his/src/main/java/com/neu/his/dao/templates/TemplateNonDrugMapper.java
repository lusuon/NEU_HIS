package com.neu.his.dao.templates;

import com.neu.his.entity.TemplateNonDrugEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TemplateNonDrugMapper extends JpaRepository<TemplateNonDrugEntity,Integer> {
    /**
     * 可用的检查检验处置
     * @param doc
     * @param dept
     * @return
     */
    @Query("select t from TemplateNonDrugEntity t " +
            "where (t.range = 1 and t.doctorId = ?1) " +
            "or (t.range = 2 and t.doctorId in (select a.id from AllUserEntity a where a.deptId = (select d.deptId from AllUserEntity d where d.id = ?1 ))) " +
            "or t.range= 3 ")
    List<TemplateNonDrugEntity> findAllUsableTeamplate(int doc);
}
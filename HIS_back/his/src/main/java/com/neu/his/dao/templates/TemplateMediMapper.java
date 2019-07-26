package com.neu.his.dao.templates;

import com.neu.his.entity.TemplateMediEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TemplateMediMapper extends JpaRepository<TemplateMediEntity,Integer> {
    @Query("select t.name,t.range,t.id from TemplateMediEntity t " +
            "where (t.range = 1 and t.doctorId = ?1) " +
            "or (t.range = 2 and t.doctorId in (select a.id from AllUserEntity a where a.deptId = (select d.deptId from AllUserEntity d where d.id = ?1 ))) " +
            "or t.range= 3 ")
    List<Object> findAllUsableTeamplate(int doc);
}
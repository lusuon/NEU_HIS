package com.neu.his.dao.mapper.templates;

import com.neu.his.dao.entity.TemplateDtlHerbEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface TemplateDtlHerbMapper extends JpaRepository<TemplateDtlHerbEntity,Integer> {
    @Query("select d.drugName,t from DrugEntity d , TemplateDtlHerbEntity t where t.templateId = ?1 and d.id = t.herbId")
    List<Object> findAllByTemplateId(int tid);
}

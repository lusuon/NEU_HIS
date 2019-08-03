package com.neu.his.dao.templates;

import com.neu.his.entity.TemplateDtlMediEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TemplateDtlMediMapper extends JpaRepository<TemplateDtlMediEntity,Integer> {
    //d.drugName,d.standard,d.unit,t.method,t.consumption,t.frequency
    @Query("select t,d " +
            "from DrugEntity d , TemplateDtlMediEntity t " +
            "where t.templateId = ?1 and d.id = t.medicineId")
    List<List<Object>> findAllByTemplateId(int tid);
}
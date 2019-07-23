package com.neu.his.Dao.interfaces.templates;

import com.neu.his.entity.TemplateDtlMediEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TemplateDtlMediMapper extends JpaRepository<TemplateDtlMediEntity,Integer> {

    @Query("select d.drugName,t from DrugEntity d , TemplateDtlMediEntity t where t.templateId = ?1 and d.id = t.medicineId")
    List<Object> findAllByTemplateId(int tid);
}
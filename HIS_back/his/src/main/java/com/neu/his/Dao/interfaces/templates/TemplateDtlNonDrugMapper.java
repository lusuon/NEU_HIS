package com.neu.his.dao.interfaces.templates;

import com.neu.his.entity.TemplateDtlNonDrugEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TemplateDtlNonDrugMapper extends JpaRepository<TemplateDtlNonDrugEntity,Integer> {

    @Query("select n.nonDrugName,t from NonDrugEntity n , TemplateDtlNonDrugEntity t where t.templateId = ?1 and n.id = t.itemId")
    List<Object> findAllByTemplateId(int tid);
}
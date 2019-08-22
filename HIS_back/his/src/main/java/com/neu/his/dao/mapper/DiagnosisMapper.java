package com.neu.his.dao.mapper;

import com.neu.his.dao.entity.DiagnosisEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DiagnosisMapper extends JpaRepository<DiagnosisEntity,Integer> {
    @Query(value = "select dis.icd,dis.deseaseName,dia.onsetTime " +
            "from DiagnosisEntity dia join DiseaseEntity dis on (dia.diseaseId = dis.id) " +
            "where dia.regId = (:i1)")
    List<Object> findAllByRegId(@Param("i1")int regId);
}

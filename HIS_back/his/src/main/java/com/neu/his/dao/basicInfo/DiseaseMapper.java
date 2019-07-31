package com.neu.his.dao.basicInfo;

import com.neu.his.entity.DiseaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseaseMapper extends JpaRepository<DiseaseEntity,Integer> {
}

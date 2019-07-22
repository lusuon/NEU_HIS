package com.neu.his.Dao;

import com.neu.his.entity.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationMapper extends JpaRepository<RegistrationEntity,Integer> {
    public List<RegistrationEntity> getByCaseNo(int c);
}

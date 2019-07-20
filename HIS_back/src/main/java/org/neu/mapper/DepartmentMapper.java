package org.neu.mapper;

import org.apache.ibatis.annotations.Param;
import org.neu.bean.Department;

import java.util.List;

/**
 * Created by neu on 2018/1/7.
 */
public interface DepartmentMapper {
    void addDep(@Param("dep") Department department);

    void deleteDep(@Param("dep") Department department);

    List<Department> getDepByPid(Long pid);

    List<Department> getAllDeps();
}

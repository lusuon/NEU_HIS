package org.neu.mapper;

import org.apache.ibatis.annotations.Param;
import org.neu.bean.Role;

import java.util.List;

/**
 * Created by neu on 2018/1/1.
 */
public interface RoleMapper {
    List<Role> roles();

    int addNewRole(@Param("role") String role, @Param("roleZh") String roleZh);

    int deleteRoleById(Long rid);
}

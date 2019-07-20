package org.neu.DAO.userManagementMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import entity.User;
import entity.UserExample;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:35:23 CST 2019
     */
    long countByExample(UserExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:35:23 CST 2019
     */
    int deleteByExample(UserExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:35:23 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:35:23 CST 2019
     */
    int insert(User record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:35:23 CST 2019
     */
    int insertSelective(User record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:35:23 CST 2019
     */
    List<User> selectByExample(UserExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:35:23 CST 2019
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:35:23 CST 2019
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:35:23 CST 2019
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:35:23 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:35:23 CST 2019
     */
    int updateByPrimaryKey(User record);
}
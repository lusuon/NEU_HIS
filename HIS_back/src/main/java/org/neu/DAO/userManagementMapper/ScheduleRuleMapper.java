package org.neu.DAO.userManagementMapper;

import entity.ScheduleRule;
import entity.ScheduleRuleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ScheduleRuleMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:54 CST 2019
     */
    long countByExample(ScheduleRuleExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:54 CST 2019
     */
    int deleteByExample(ScheduleRuleExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:54 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:54 CST 2019
     */
    int insert(ScheduleRule record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:54 CST 2019
     */
    int insertSelective(ScheduleRule record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:54 CST 2019
     */
    List<ScheduleRule> selectByExample(ScheduleRuleExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:54 CST 2019
     */
    ScheduleRule selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:54 CST 2019
     */
    int updateByExampleSelective(@Param("record") ScheduleRule record, @Param("example") ScheduleRuleExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:54 CST 2019
     */
    int updateByExample(@Param("record") ScheduleRule record, @Param("example") ScheduleRuleExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:54 CST 2019
     */
    int updateByPrimaryKeySelective(ScheduleRule record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:54 CST 2019
     */
    int updateByPrimaryKey(ScheduleRule record);
}
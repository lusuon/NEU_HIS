package org.neu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.neu.entity.ScheduleRule;
import org.neu.entity.ScheduleRuleExample;

@Mapper
public interface ScheduleRuleMapper {
    long countByExample(ScheduleRuleExample example);

    int deleteByExample(ScheduleRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScheduleRule record);

    int insertSelective(ScheduleRule record);

    List<ScheduleRule> selectByExample(ScheduleRuleExample example);

    ScheduleRule selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_rule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ScheduleRule selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") ScheduleRule record, @Param("example") ScheduleRuleExample example);

    int updateByExample(@Param("record") ScheduleRule record, @Param("example") ScheduleRuleExample example);

    int updateByPrimaryKeySelective(ScheduleRule record);

    int updateByPrimaryKey(ScheduleRule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_rule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ScheduleRuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_rule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
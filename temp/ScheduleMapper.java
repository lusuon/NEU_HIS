package com.neu.his.Dao;

import com.neu.his.entity.Schedule;
import com.neu.his.entity.ScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface ScheduleMapper {
    @SelectProvider(type=ScheduleSqlProvider.class, method="countByExample")
    long countByExample(ScheduleExample example);

    @DeleteProvider(type=ScheduleSqlProvider.class, method="deleteByExample")
    int deleteByExample(ScheduleExample example);

    @Delete({
        "delete from schedule",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into schedule (arrange_time, dept_id, ",
        "doctor_id, noon, schedule_rule_id, ",
        "is_deleted)",
        "values (#{arrangeTime,jdbcType=DATE}, #{deptId,jdbcType=INTEGER}, ",
        "#{doctorId,jdbcType=INTEGER}, #{noon,jdbcType=CHAR}, #{scheduleRuleId,jdbcType=INTEGER}, ",
        "#{isDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Schedule record);

    @InsertProvider(type=ScheduleSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Schedule record);

    @SelectProvider(type=ScheduleSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="arrange_time", property="arrangeTime", jdbcType=JdbcType.DATE),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.INTEGER),
        @Result(column="doctor_id", property="doctorId", jdbcType=JdbcType.INTEGER),
        @Result(column="noon", property="noon", jdbcType=JdbcType.CHAR),
        @Result(column="schedule_rule_id", property="scheduleRuleId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT)
    })
    List<Schedule> selectByExample(ScheduleExample example);

    @Select({
        "select",
        "id, arrange_time, dept_id, doctor_id, noon, schedule_rule_id, is_deleted",
        "from schedule",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="arrange_time", property="arrangeTime", jdbcType=JdbcType.DATE),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.INTEGER),
        @Result(column="doctor_id", property="doctorId", jdbcType=JdbcType.INTEGER),
        @Result(column="noon", property="noon", jdbcType=JdbcType.CHAR),
        @Result(column="schedule_rule_id", property="scheduleRuleId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT)
    })
    Schedule selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Schedule selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    @UpdateProvider(type=ScheduleSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    @UpdateProvider(type=ScheduleSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    @UpdateProvider(type=ScheduleSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Schedule record);

    @Update({
        "update schedule",
        "set arrange_time = #{arrangeTime,jdbcType=DATE},",
          "dept_id = #{deptId,jdbcType=INTEGER},",
          "doctor_id = #{doctorId,jdbcType=INTEGER},",
          "noon = #{noon,jdbcType=CHAR},",
          "schedule_rule_id = #{scheduleRuleId,jdbcType=INTEGER},",
          "is_deleted = #{isDeleted,jdbcType=BIT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Schedule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ScheduleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
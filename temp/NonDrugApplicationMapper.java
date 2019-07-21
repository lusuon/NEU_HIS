package com.neu.his.Dao;

import com.neu.his.entity.NonDrugApplication;
import com.neu.his.entity.NonDrugApplicationExample;
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
public interface NonDrugApplicationMapper {
    @SelectProvider(type=NonDrugApplicationSqlProvider.class, method="countByExample")
    long countByExample(NonDrugApplicationExample example);

    @DeleteProvider(type=NonDrugApplicationSqlProvider.class, method="deleteByExample")
    int deleteByExample(NonDrugApplicationExample example);

    @Delete({
        "delete from non_drug_application",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into non_drug_application (case_id, reg_id, ",
        "item_id, item_name, ",
        "requirement, check_part, ",
        "is_urgent, num, generate_time, ",
        "generate_doctor_id, checker_id, ",
        "recorder_id, check_time, ",
        "check_result, result_time, ",
        "application_status, record_category, ",
        "is_deleted)",
        "values (#{caseId,jdbcType=INTEGER}, #{regId,jdbcType=INTEGER}, ",
        "#{itemId,jdbcType=INTEGER}, #{itemName,jdbcType=VARCHAR}, ",
        "#{requirement,jdbcType=VARCHAR}, #{checkPart,jdbcType=VARCHAR}, ",
        "#{isUrgent,jdbcType=BIT}, #{num,jdbcType=INTEGER}, #{generateTime,jdbcType=DATE}, ",
        "#{generateDoctorId,jdbcType=INTEGER}, #{checkerId,jdbcType=INTEGER}, ",
        "#{recorderId,jdbcType=INTEGER}, #{checkTime,jdbcType=DATE}, ",
        "#{checkResult,jdbcType=VARCHAR}, #{resultTime,jdbcType=DATE}, ",
        "#{applicationStatus,jdbcType=INTEGER}, #{recordCategory,jdbcType=INTEGER}, ",
        "#{isDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(NonDrugApplication record);

    @InsertProvider(type=NonDrugApplicationSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(NonDrugApplication record);

    @SelectProvider(type=NonDrugApplicationSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="case_id", property="caseId", jdbcType=JdbcType.INTEGER),
        @Result(column="reg_id", property="regId", jdbcType=JdbcType.INTEGER),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.INTEGER),
        @Result(column="item_name", property="itemName", jdbcType=JdbcType.VARCHAR),
        @Result(column="requirement", property="requirement", jdbcType=JdbcType.VARCHAR),
        @Result(column="check_part", property="checkPart", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_urgent", property="isUrgent", jdbcType=JdbcType.BIT),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER),
        @Result(column="generate_time", property="generateTime", jdbcType=JdbcType.DATE),
        @Result(column="generate_doctor_id", property="generateDoctorId", jdbcType=JdbcType.INTEGER),
        @Result(column="checker_id", property="checkerId", jdbcType=JdbcType.INTEGER),
        @Result(column="recorder_id", property="recorderId", jdbcType=JdbcType.INTEGER),
        @Result(column="check_time", property="checkTime", jdbcType=JdbcType.DATE),
        @Result(column="check_result", property="checkResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="result_time", property="resultTime", jdbcType=JdbcType.DATE),
        @Result(column="application_status", property="applicationStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="record_category", property="recordCategory", jdbcType=JdbcType.INTEGER),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT)
    })
    List<NonDrugApplication> selectByExample(NonDrugApplicationExample example);

    @Select({
        "select",
        "id, case_id, reg_id, item_id, item_name, requirement, check_part, is_urgent, ",
        "num, generate_time, generate_doctor_id, checker_id, recorder_id, check_time, ",
        "check_result, result_time, application_status, record_category, is_deleted",
        "from non_drug_application",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="case_id", property="caseId", jdbcType=JdbcType.INTEGER),
        @Result(column="reg_id", property="regId", jdbcType=JdbcType.INTEGER),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.INTEGER),
        @Result(column="item_name", property="itemName", jdbcType=JdbcType.VARCHAR),
        @Result(column="requirement", property="requirement", jdbcType=JdbcType.VARCHAR),
        @Result(column="check_part", property="checkPart", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_urgent", property="isUrgent", jdbcType=JdbcType.BIT),
        @Result(column="num", property="num", jdbcType=JdbcType.INTEGER),
        @Result(column="generate_time", property="generateTime", jdbcType=JdbcType.DATE),
        @Result(column="generate_doctor_id", property="generateDoctorId", jdbcType=JdbcType.INTEGER),
        @Result(column="checker_id", property="checkerId", jdbcType=JdbcType.INTEGER),
        @Result(column="recorder_id", property="recorderId", jdbcType=JdbcType.INTEGER),
        @Result(column="check_time", property="checkTime", jdbcType=JdbcType.DATE),
        @Result(column="check_result", property="checkResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="result_time", property="resultTime", jdbcType=JdbcType.DATE),
        @Result(column="application_status", property="applicationStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="record_category", property="recordCategory", jdbcType=JdbcType.INTEGER),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT)
    })
    NonDrugApplication selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table non_drug_application
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    NonDrugApplication selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    @UpdateProvider(type=NonDrugApplicationSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") NonDrugApplication record, @Param("example") NonDrugApplicationExample example);

    @UpdateProvider(type=NonDrugApplicationSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") NonDrugApplication record, @Param("example") NonDrugApplicationExample example);

    @UpdateProvider(type=NonDrugApplicationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(NonDrugApplication record);

    @Update({
        "update non_drug_application",
        "set case_id = #{caseId,jdbcType=INTEGER},",
          "reg_id = #{regId,jdbcType=INTEGER},",
          "item_id = #{itemId,jdbcType=INTEGER},",
          "item_name = #{itemName,jdbcType=VARCHAR},",
          "requirement = #{requirement,jdbcType=VARCHAR},",
          "check_part = #{checkPart,jdbcType=VARCHAR},",
          "is_urgent = #{isUrgent,jdbcType=BIT},",
          "num = #{num,jdbcType=INTEGER},",
          "generate_time = #{generateTime,jdbcType=DATE},",
          "generate_doctor_id = #{generateDoctorId,jdbcType=INTEGER},",
          "checker_id = #{checkerId,jdbcType=INTEGER},",
          "recorder_id = #{recorderId,jdbcType=INTEGER},",
          "check_time = #{checkTime,jdbcType=DATE},",
          "check_result = #{checkResult,jdbcType=VARCHAR},",
          "result_time = #{resultTime,jdbcType=DATE},",
          "application_status = #{applicationStatus,jdbcType=INTEGER},",
          "record_category = #{recordCategory,jdbcType=INTEGER},",
          "is_deleted = #{isDeleted,jdbcType=BIT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(NonDrugApplication record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table non_drug_application
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") NonDrugApplicationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table non_drug_application
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
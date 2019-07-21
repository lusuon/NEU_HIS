package com.neu.his.Dao;

import com.neu.his.entity.Registration;
import com.neu.his.entity.RegistrationExample;
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
public interface RegistrationMapper {
    @SelectProvider(type=RegistrationSqlProvider.class, method="countByExample")
    long countByExample(RegistrationExample example);

    @DeleteProvider(type=RegistrationSqlProvider.class, method="deleteByExample")
    int deleteByExample(RegistrationExample example);

    @Delete({
        "delete from registration",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into registration (case_no, patient_name, ",
        "sex, personal_id, ",
        "birthday, age, age_type, ",
        "address, see_date, noon, ",
        "dept_id, doctor_id, ",
        "reg_level_id, settlement_type, ",
        "need_case_book, reg_time, ",
        "operator, inspection_status, ",
        "is_deleted)",
        "values (#{caseNo,jdbcType=INTEGER}, #{patientName,jdbcType=VARCHAR}, ",
        "#{sex,jdbcType=SMALLINT}, #{personalId,jdbcType=VARCHAR}, ",
        "#{birthday,jdbcType=DATE}, #{age,jdbcType=INTEGER}, #{ageType,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{seeDate,jdbcType=DATE}, #{noon,jdbcType=VARCHAR}, ",
        "#{deptId,jdbcType=INTEGER}, #{doctorId,jdbcType=INTEGER}, ",
        "#{regLevelId,jdbcType=INTEGER}, #{settlementType,jdbcType=VARCHAR}, ",
        "#{needCaseBook,jdbcType=BIT}, #{regTime,jdbcType=TIMESTAMP}, ",
        "#{operator,jdbcType=INTEGER}, #{inspectionStatus,jdbcType=INTEGER}, ",
        "#{isDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Registration record);

    @InsertProvider(type=RegistrationSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Registration record);

    @SelectProvider(type=RegistrationSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="case_no", property="caseNo", jdbcType=JdbcType.INTEGER),
        @Result(column="patient_name", property="patientName", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.SMALLINT),
        @Result(column="personal_id", property="personalId", jdbcType=JdbcType.VARCHAR),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.DATE),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="age_type", property="ageType", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="see_date", property="seeDate", jdbcType=JdbcType.DATE),
        @Result(column="noon", property="noon", jdbcType=JdbcType.VARCHAR),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.INTEGER),
        @Result(column="doctor_id", property="doctorId", jdbcType=JdbcType.INTEGER),
        @Result(column="reg_level_id", property="regLevelId", jdbcType=JdbcType.INTEGER),
        @Result(column="settlement_type", property="settlementType", jdbcType=JdbcType.VARCHAR),
        @Result(column="need_case_book", property="needCaseBook", jdbcType=JdbcType.BIT),
        @Result(column="reg_time", property="regTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator", property="operator", jdbcType=JdbcType.INTEGER),
        @Result(column="inspection_status", property="inspectionStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT)
    })
    List<Registration> selectByExample(RegistrationExample example);

    @Select({
        "select",
        "id, case_no, patient_name, sex, personal_id, birthday, age, age_type, address, ",
        "see_date, noon, dept_id, doctor_id, reg_level_id, settlement_type, need_case_book, ",
        "reg_time, operator, inspection_status, is_deleted",
        "from registration",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="case_no", property="caseNo", jdbcType=JdbcType.INTEGER),
        @Result(column="patient_name", property="patientName", jdbcType=JdbcType.VARCHAR),
        @Result(column="sex", property="sex", jdbcType=JdbcType.SMALLINT),
        @Result(column="personal_id", property="personalId", jdbcType=JdbcType.VARCHAR),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.DATE),
        @Result(column="age", property="age", jdbcType=JdbcType.INTEGER),
        @Result(column="age_type", property="ageType", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="see_date", property="seeDate", jdbcType=JdbcType.DATE),
        @Result(column="noon", property="noon", jdbcType=JdbcType.VARCHAR),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.INTEGER),
        @Result(column="doctor_id", property="doctorId", jdbcType=JdbcType.INTEGER),
        @Result(column="reg_level_id", property="regLevelId", jdbcType=JdbcType.INTEGER),
        @Result(column="settlement_type", property="settlementType", jdbcType=JdbcType.VARCHAR),
        @Result(column="need_case_book", property="needCaseBook", jdbcType=JdbcType.BIT),
        @Result(column="reg_time", property="regTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator", property="operator", jdbcType=JdbcType.INTEGER),
        @Result(column="inspection_status", property="inspectionStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT)
    })
    Registration selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registration
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Registration selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    @UpdateProvider(type=RegistrationSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Registration record, @Param("example") RegistrationExample example);

    @UpdateProvider(type=RegistrationSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Registration record, @Param("example") RegistrationExample example);

    @UpdateProvider(type=RegistrationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Registration record);

    @Update({
        "update registration",
        "set case_no = #{caseNo,jdbcType=INTEGER},",
          "patient_name = #{patientName,jdbcType=VARCHAR},",
          "sex = #{sex,jdbcType=SMALLINT},",
          "personal_id = #{personalId,jdbcType=VARCHAR},",
          "birthday = #{birthday,jdbcType=DATE},",
          "age = #{age,jdbcType=INTEGER},",
          "age_type = #{ageType,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "see_date = #{seeDate,jdbcType=DATE},",
          "noon = #{noon,jdbcType=VARCHAR},",
          "dept_id = #{deptId,jdbcType=INTEGER},",
          "doctor_id = #{doctorId,jdbcType=INTEGER},",
          "reg_level_id = #{regLevelId,jdbcType=INTEGER},",
          "settlement_type = #{settlementType,jdbcType=VARCHAR},",
          "need_case_book = #{needCaseBook,jdbcType=BIT},",
          "reg_time = #{regTime,jdbcType=TIMESTAMP},",
          "operator = #{operator,jdbcType=INTEGER},",
          "inspection_status = #{inspectionStatus,jdbcType=INTEGER},",
          "is_deleted = #{isDeleted,jdbcType=BIT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Registration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registration
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") RegistrationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table registration
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
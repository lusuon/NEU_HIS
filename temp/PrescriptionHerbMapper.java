package com.neu.his.Dao;

import com.neu.his.entity.PrescriptionHerb;
import com.neu.his.entity.PrescriptionHerbExample;
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
public interface PrescriptionHerbMapper {
    @SelectProvider(type=PrescriptionHerbSqlProvider.class, method="countByExample")
    long countByExample(PrescriptionHerbExample example);

    @DeleteProvider(type=PrescriptionHerbSqlProvider.class, method="deleteByExample")
    int deleteByExample(PrescriptionHerbExample example);

    @Delete({
        "delete from prescription_herb",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into prescription_herb (case_id, reg_id, ",
        "doctor_id, prescription_name, ",
        "generate_time, prescription_type, ",
        "quantity, frequency, ",
        "method, treatment, ",
        "treatment_detail, doctor_advice, ",
        "prescription_status, is_deleted)",
        "values (#{caseId,jdbcType=INTEGER}, #{regId,jdbcType=INTEGER}, ",
        "#{doctorId,jdbcType=INTEGER}, #{prescriptionName,jdbcType=VARCHAR}, ",
        "#{generateTime,jdbcType=DATE}, #{prescriptionType,jdbcType=VARCHAR}, ",
        "#{quantity,jdbcType=INTEGER}, #{frequency,jdbcType=VARCHAR}, ",
        "#{method,jdbcType=VARCHAR}, #{treatment,jdbcType=VARCHAR}, ",
        "#{treatmentDetail,jdbcType=VARCHAR}, #{doctorAdvice,jdbcType=VARCHAR}, ",
        "#{prescriptionStatus,jdbcType=INTEGER}, #{isDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(PrescriptionHerb record);

    @InsertProvider(type=PrescriptionHerbSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(PrescriptionHerb record);

    @SelectProvider(type=PrescriptionHerbSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="case_id", property="caseId", jdbcType=JdbcType.INTEGER),
        @Result(column="reg_id", property="regId", jdbcType=JdbcType.INTEGER),
        @Result(column="doctor_id", property="doctorId", jdbcType=JdbcType.INTEGER),
        @Result(column="prescription_name", property="prescriptionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="generate_time", property="generateTime", jdbcType=JdbcType.DATE),
        @Result(column="prescription_type", property="prescriptionType", jdbcType=JdbcType.VARCHAR),
        @Result(column="quantity", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="frequency", property="frequency", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="treatment", property="treatment", jdbcType=JdbcType.VARCHAR),
        @Result(column="treatment_detail", property="treatmentDetail", jdbcType=JdbcType.VARCHAR),
        @Result(column="doctor_advice", property="doctorAdvice", jdbcType=JdbcType.VARCHAR),
        @Result(column="prescription_status", property="prescriptionStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT)
    })
    List<PrescriptionHerb> selectByExample(PrescriptionHerbExample example);

    @Select({
        "select",
        "id, case_id, reg_id, doctor_id, prescription_name, generate_time, prescription_type, ",
        "quantity, frequency, method, treatment, treatment_detail, doctor_advice, prescription_status, ",
        "is_deleted",
        "from prescription_herb",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="case_id", property="caseId", jdbcType=JdbcType.INTEGER),
        @Result(column="reg_id", property="regId", jdbcType=JdbcType.INTEGER),
        @Result(column="doctor_id", property="doctorId", jdbcType=JdbcType.INTEGER),
        @Result(column="prescription_name", property="prescriptionName", jdbcType=JdbcType.VARCHAR),
        @Result(column="generate_time", property="generateTime", jdbcType=JdbcType.DATE),
        @Result(column="prescription_type", property="prescriptionType", jdbcType=JdbcType.VARCHAR),
        @Result(column="quantity", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="frequency", property="frequency", jdbcType=JdbcType.VARCHAR),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="treatment", property="treatment", jdbcType=JdbcType.VARCHAR),
        @Result(column="treatment_detail", property="treatmentDetail", jdbcType=JdbcType.VARCHAR),
        @Result(column="doctor_advice", property="doctorAdvice", jdbcType=JdbcType.VARCHAR),
        @Result(column="prescription_status", property="prescriptionStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT)
    })
    PrescriptionHerb selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription_herb
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    PrescriptionHerb selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    @UpdateProvider(type=PrescriptionHerbSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PrescriptionHerb record, @Param("example") PrescriptionHerbExample example);

    @UpdateProvider(type=PrescriptionHerbSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PrescriptionHerb record, @Param("example") PrescriptionHerbExample example);

    @UpdateProvider(type=PrescriptionHerbSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PrescriptionHerb record);

    @Update({
        "update prescription_herb",
        "set case_id = #{caseId,jdbcType=INTEGER},",
          "reg_id = #{regId,jdbcType=INTEGER},",
          "doctor_id = #{doctorId,jdbcType=INTEGER},",
          "prescription_name = #{prescriptionName,jdbcType=VARCHAR},",
          "generate_time = #{generateTime,jdbcType=DATE},",
          "prescription_type = #{prescriptionType,jdbcType=VARCHAR},",
          "quantity = #{quantity,jdbcType=INTEGER},",
          "frequency = #{frequency,jdbcType=VARCHAR},",
          "method = #{method,jdbcType=VARCHAR},",
          "treatment = #{treatment,jdbcType=VARCHAR},",
          "treatment_detail = #{treatmentDetail,jdbcType=VARCHAR},",
          "doctor_advice = #{doctorAdvice,jdbcType=VARCHAR},",
          "prescription_status = #{prescriptionStatus,jdbcType=INTEGER},",
          "is_deleted = #{isDeleted,jdbcType=BIT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PrescriptionHerb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription_herb
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") PrescriptionHerbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription_herb
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
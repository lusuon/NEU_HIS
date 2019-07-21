package com.neu.his.Dao;

import com.neu.his.entity.Case;
import com.neu.his.entity.CaseExample;
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
public interface CaseMapper {
    @SelectProvider(type=CaseSqlProvider.class, method="countByExample")
    long countByExample(CaseExample example);

    @DeleteProvider(type=CaseSqlProvider.class, method="deleteByExample")
    int deleteByExample(CaseExample example);

    @Delete({
        "delete from case",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into case (case_no, reg_id, ",
        "symptom, current_medi_history, ",
        "current_disease_treatment, medi_history, ",
        "allergy, body_inspection, ",
        "suggestion, attention, ",
        "inspection_result, diagnose_result, ",
        "advise, case_status, ",
        "is_deleted)",
        "values (#{caseNo,jdbcType=INTEGER}, #{regId,jdbcType=INTEGER}, ",
        "#{symptom,jdbcType=VARCHAR}, #{currentMediHistory,jdbcType=VARCHAR}, ",
        "#{currentDiseaseTreatment,jdbcType=VARCHAR}, #{mediHistory,jdbcType=VARCHAR}, ",
        "#{allergy,jdbcType=VARCHAR}, #{bodyInspection,jdbcType=VARCHAR}, ",
        "#{suggestion,jdbcType=VARCHAR}, #{attention,jdbcType=VARCHAR}, ",
        "#{inspectionResult,jdbcType=VARCHAR}, #{diagnoseResult,jdbcType=VARCHAR}, ",
        "#{advise,jdbcType=VARCHAR}, #{caseStatus,jdbcType=INTEGER}, ",
        "#{isDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(Case record);

    @InsertProvider(type=CaseSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(Case record);

    @SelectProvider(type=CaseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="case_no", property="caseNo", jdbcType=JdbcType.INTEGER),
        @Result(column="reg_id", property="regId", jdbcType=JdbcType.INTEGER),
        @Result(column="symptom", property="symptom", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_medi_history", property="currentMediHistory", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_disease_treatment", property="currentDiseaseTreatment", jdbcType=JdbcType.VARCHAR),
        @Result(column="medi_history", property="mediHistory", jdbcType=JdbcType.VARCHAR),
        @Result(column="allergy", property="allergy", jdbcType=JdbcType.VARCHAR),
        @Result(column="body_inspection", property="bodyInspection", jdbcType=JdbcType.VARCHAR),
        @Result(column="suggestion", property="suggestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="attention", property="attention", jdbcType=JdbcType.VARCHAR),
        @Result(column="inspection_result", property="inspectionResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="diagnose_result", property="diagnoseResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="advise", property="advise", jdbcType=JdbcType.VARCHAR),
        @Result(column="case_status", property="caseStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT)
    })
    List<Case> selectByExample(CaseExample example);

    @Select({
        "select",
        "id, case_no, reg_id, symptom, current_medi_history, current_disease_treatment, ",
        "medi_history, allergy, body_inspection, suggestion, attention, inspection_result, ",
        "diagnose_result, advise, case_status, is_deleted",
        "from case",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="case_no", property="caseNo", jdbcType=JdbcType.INTEGER),
        @Result(column="reg_id", property="regId", jdbcType=JdbcType.INTEGER),
        @Result(column="symptom", property="symptom", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_medi_history", property="currentMediHistory", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_disease_treatment", property="currentDiseaseTreatment", jdbcType=JdbcType.VARCHAR),
        @Result(column="medi_history", property="mediHistory", jdbcType=JdbcType.VARCHAR),
        @Result(column="allergy", property="allergy", jdbcType=JdbcType.VARCHAR),
        @Result(column="body_inspection", property="bodyInspection", jdbcType=JdbcType.VARCHAR),
        @Result(column="suggestion", property="suggestion", jdbcType=JdbcType.VARCHAR),
        @Result(column="attention", property="attention", jdbcType=JdbcType.VARCHAR),
        @Result(column="inspection_result", property="inspectionResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="diagnose_result", property="diagnoseResult", jdbcType=JdbcType.VARCHAR),
        @Result(column="advise", property="advise", jdbcType=JdbcType.VARCHAR),
        @Result(column="case_status", property="caseStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT)
    })
    Case selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    Case selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    @UpdateProvider(type=CaseSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Case record, @Param("example") CaseExample example);

    @UpdateProvider(type=CaseSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Case record, @Param("example") CaseExample example);

    @UpdateProvider(type=CaseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Case record);

    @Update({
        "update case",
        "set case_no = #{caseNo,jdbcType=INTEGER},",
          "reg_id = #{regId,jdbcType=INTEGER},",
          "symptom = #{symptom,jdbcType=VARCHAR},",
          "current_medi_history = #{currentMediHistory,jdbcType=VARCHAR},",
          "current_disease_treatment = #{currentDiseaseTreatment,jdbcType=VARCHAR},",
          "medi_history = #{mediHistory,jdbcType=VARCHAR},",
          "allergy = #{allergy,jdbcType=VARCHAR},",
          "body_inspection = #{bodyInspection,jdbcType=VARCHAR},",
          "suggestion = #{suggestion,jdbcType=VARCHAR},",
          "attention = #{attention,jdbcType=VARCHAR},",
          "inspection_result = #{inspectionResult,jdbcType=VARCHAR},",
          "diagnose_result = #{diagnoseResult,jdbcType=VARCHAR},",
          "advise = #{advise,jdbcType=VARCHAR},",
          "case_status = #{caseStatus,jdbcType=INTEGER},",
          "is_deleted = #{isDeleted,jdbcType=BIT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Case record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") CaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
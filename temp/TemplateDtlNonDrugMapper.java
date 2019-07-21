package com.neu.his.Dao;

import com.neu.his.entity.TemplateDtlNonDrug;
import com.neu.his.entity.TemplateDtlNonDrugExample;
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
public interface TemplateDtlNonDrugMapper {
    @SelectProvider(type=TemplateDtlNonDrugSqlProvider.class, method="countByExample")
    long countByExample(TemplateDtlNonDrugExample example);

    @DeleteProvider(type=TemplateDtlNonDrugSqlProvider.class, method="deleteByExample")
    int deleteByExample(TemplateDtlNonDrugExample example);

    @Delete({
        "delete from template_dtl_non_drug",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into template_dtl_non_drug (item_id, template_id, ",
        "check_part, is_deleted)",
        "values (#{itemId,jdbcType=INTEGER}, #{templateId,jdbcType=INTEGER}, ",
        "#{checkPart,jdbcType=VARCHAR}, #{isDeleted,jdbcType=TINYINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(TemplateDtlNonDrug record);

    @InsertProvider(type=TemplateDtlNonDrugSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(TemplateDtlNonDrug record);

    @SelectProvider(type=TemplateDtlNonDrugSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.INTEGER),
        @Result(column="template_id", property="templateId", jdbcType=JdbcType.INTEGER),
        @Result(column="check_part", property="checkPart", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.TINYINT)
    })
    List<TemplateDtlNonDrug> selectByExample(TemplateDtlNonDrugExample example);

    @Select({
        "select",
        "id, item_id, template_id, check_part, is_deleted",
        "from template_dtl_non_drug",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.INTEGER),
        @Result(column="template_id", property="templateId", jdbcType=JdbcType.INTEGER),
        @Result(column="check_part", property="checkPart", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.TINYINT)
    })
    TemplateDtlNonDrug selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_dtl_non_drug
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TemplateDtlNonDrug selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    @UpdateProvider(type=TemplateDtlNonDrugSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TemplateDtlNonDrug record, @Param("example") TemplateDtlNonDrugExample example);

    @UpdateProvider(type=TemplateDtlNonDrugSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") TemplateDtlNonDrug record, @Param("example") TemplateDtlNonDrugExample example);

    @UpdateProvider(type=TemplateDtlNonDrugSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TemplateDtlNonDrug record);

    @Update({
        "update template_dtl_non_drug",
        "set item_id = #{itemId,jdbcType=INTEGER},",
          "template_id = #{templateId,jdbcType=INTEGER},",
          "check_part = #{checkPart,jdbcType=VARCHAR},",
          "is_deleted = #{isDeleted,jdbcType=TINYINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TemplateDtlNonDrug record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_dtl_non_drug
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") TemplateDtlNonDrugExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table template_dtl_non_drug
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
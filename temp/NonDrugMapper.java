package com.neu.his.Dao;

import com.neu.his.entity.NonDrug;
import com.neu.his.entity.NonDrugExample;
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
public interface NonDrugMapper {
    @SelectProvider(type=NonDrugSqlProvider.class, method="countByExample")
    long countByExample(NonDrugExample example);

    @DeleteProvider(type=NonDrugSqlProvider.class, method="deleteByExample")
    int deleteByExample(NonDrugExample example);

    @Delete({
        "delete from non_drug",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into non_drug (code, non_drug_name, ",
        "standard, unit_price, ",
        "category_payment_id, dept_id, ",
        "pinyin_mnemonic_code, create_time, ",
        "last_edit_time, item_type, ",
        "is_deleted)",
        "values (#{code,jdbcType=VARCHAR}, #{nonDrugName,jdbcType=VARCHAR}, ",
        "#{standard,jdbcType=VARCHAR}, #{unitPrice,jdbcType=DOUBLE}, ",
        "#{categoryPaymentId,jdbcType=INTEGER}, #{deptId,jdbcType=INTEGER}, ",
        "#{pinyinMnemonicCode,jdbcType=VARCHAR}, #{createTime,jdbcType=DATE}, ",
        "#{lastEditTime,jdbcType=DATE}, #{itemType,jdbcType=SMALLINT}, ",
        "#{isDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(NonDrug record);

    @InsertProvider(type=NonDrugSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(NonDrug record);

    @SelectProvider(type=NonDrugSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="non_drug_name", property="nonDrugName", jdbcType=JdbcType.VARCHAR),
        @Result(column="standard", property="standard", jdbcType=JdbcType.VARCHAR),
        @Result(column="unit_price", property="unitPrice", jdbcType=JdbcType.DOUBLE),
        @Result(column="category_payment_id", property="categoryPaymentId", jdbcType=JdbcType.INTEGER),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.INTEGER),
        @Result(column="pinyin_mnemonic_code", property="pinyinMnemonicCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.DATE),
        @Result(column="last_edit_time", property="lastEditTime", jdbcType=JdbcType.DATE),
        @Result(column="item_type", property="itemType", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT)
    })
    List<NonDrug> selectByExample(NonDrugExample example);

    @Select({
        "select",
        "id, code, non_drug_name, standard, unit_price, category_payment_id, dept_id, ",
        "pinyin_mnemonic_code, create_time, last_edit_time, item_type, is_deleted",
        "from non_drug",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="non_drug_name", property="nonDrugName", jdbcType=JdbcType.VARCHAR),
        @Result(column="standard", property="standard", jdbcType=JdbcType.VARCHAR),
        @Result(column="unit_price", property="unitPrice", jdbcType=JdbcType.DOUBLE),
        @Result(column="category_payment_id", property="categoryPaymentId", jdbcType=JdbcType.INTEGER),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.INTEGER),
        @Result(column="pinyin_mnemonic_code", property="pinyinMnemonicCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.DATE),
        @Result(column="last_edit_time", property="lastEditTime", jdbcType=JdbcType.DATE),
        @Result(column="item_type", property="itemType", jdbcType=JdbcType.SMALLINT),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT)
    })
    NonDrug selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table non_drug
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    NonDrug selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    @UpdateProvider(type=NonDrugSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") NonDrug record, @Param("example") NonDrugExample example);

    @UpdateProvider(type=NonDrugSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") NonDrug record, @Param("example") NonDrugExample example);

    @UpdateProvider(type=NonDrugSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(NonDrug record);

    @Update({
        "update non_drug",
        "set code = #{code,jdbcType=VARCHAR},",
          "non_drug_name = #{nonDrugName,jdbcType=VARCHAR},",
          "standard = #{standard,jdbcType=VARCHAR},",
          "unit_price = #{unitPrice,jdbcType=DOUBLE},",
          "category_payment_id = #{categoryPaymentId,jdbcType=INTEGER},",
          "dept_id = #{deptId,jdbcType=INTEGER},",
          "pinyin_mnemonic_code = #{pinyinMnemonicCode,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=DATE},",
          "last_edit_time = #{lastEditTime,jdbcType=DATE},",
          "item_type = #{itemType,jdbcType=SMALLINT},",
          "is_deleted = #{isDeleted,jdbcType=BIT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(NonDrug record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table non_drug
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") NonDrugExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table non_drug
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
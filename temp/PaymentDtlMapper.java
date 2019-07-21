package com.neu.his.Dao;

import com.neu.his.entity.PaymentDtl;
import com.neu.his.entity.PaymentDtlExample;
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
public interface PaymentDtlMapper {
    @SelectProvider(type=PaymentDtlSqlProvider.class, method="countByExample")
    long countByExample(PaymentDtlExample example);

    @DeleteProvider(type=PaymentDtlSqlProvider.class, method="deleteByExample")
    int deleteByExample(PaymentDtlExample example);

    @Delete({
        "delete from payment_dtl",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into payment_dtl (reg_id, invoice_no, ",
        "item_id, item_type, item_name, ",
        "item_unit_price, quantity, ",
        "dept_id, prescription_generation_time, ",
        "generator_id, payment_operation_time, ",
        "operator_id, method, ",
        "related_refund_id, is_deleted)",
        "values (#{regId,jdbcType=INTEGER}, #{invoiceNo,jdbcType=INTEGER}, ",
        "#{itemId,jdbcType=INTEGER}, #{itemType,jdbcType=BIT}, #{itemName,jdbcType=VARCHAR}, ",
        "#{itemUnitPrice,jdbcType=DOUBLE}, #{quantity,jdbcType=INTEGER}, ",
        "#{deptId,jdbcType=INTEGER}, #{prescriptionGenerationTime,jdbcType=TIMESTAMP}, ",
        "#{generatorId,jdbcType=INTEGER}, #{paymentOperationTime,jdbcType=TIMESTAMP}, ",
        "#{operatorId,jdbcType=INTEGER}, #{method,jdbcType=VARCHAR}, ",
        "#{relatedRefundId,jdbcType=INTEGER}, #{isDeleted,jdbcType=BIT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(PaymentDtl record);

    @InsertProvider(type=PaymentDtlSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(PaymentDtl record);

    @SelectProvider(type=PaymentDtlSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="reg_id", property="regId", jdbcType=JdbcType.INTEGER),
        @Result(column="invoice_no", property="invoiceNo", jdbcType=JdbcType.INTEGER),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.INTEGER),
        @Result(column="item_type", property="itemType", jdbcType=JdbcType.BIT),
        @Result(column="item_name", property="itemName", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_unit_price", property="itemUnitPrice", jdbcType=JdbcType.DOUBLE),
        @Result(column="quantity", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.INTEGER),
        @Result(column="prescription_generation_time", property="prescriptionGenerationTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="generator_id", property="generatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="payment_operation_time", property="paymentOperationTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="related_refund_id", property="relatedRefundId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT)
    })
    List<PaymentDtl> selectByExample(PaymentDtlExample example);

    @Select({
        "select",
        "id, reg_id, invoice_no, item_id, item_type, item_name, item_unit_price, quantity, ",
        "dept_id, prescription_generation_time, generator_id, payment_operation_time, ",
        "operator_id, method, related_refund_id, is_deleted",
        "from payment_dtl",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="reg_id", property="regId", jdbcType=JdbcType.INTEGER),
        @Result(column="invoice_no", property="invoiceNo", jdbcType=JdbcType.INTEGER),
        @Result(column="item_id", property="itemId", jdbcType=JdbcType.INTEGER),
        @Result(column="item_type", property="itemType", jdbcType=JdbcType.BIT),
        @Result(column="item_name", property="itemName", jdbcType=JdbcType.VARCHAR),
        @Result(column="item_unit_price", property="itemUnitPrice", jdbcType=JdbcType.DOUBLE),
        @Result(column="quantity", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="dept_id", property="deptId", jdbcType=JdbcType.INTEGER),
        @Result(column="prescription_generation_time", property="prescriptionGenerationTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="generator_id", property="generatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="payment_operation_time", property="paymentOperationTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="operator_id", property="operatorId", jdbcType=JdbcType.INTEGER),
        @Result(column="method", property="method", jdbcType=JdbcType.VARCHAR),
        @Result(column="related_refund_id", property="relatedRefundId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_deleted", property="isDeleted", jdbcType=JdbcType.BIT)
    })
    PaymentDtl selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_dtl
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    PaymentDtl selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    @UpdateProvider(type=PaymentDtlSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") PaymentDtl record, @Param("example") PaymentDtlExample example);

    @UpdateProvider(type=PaymentDtlSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") PaymentDtl record, @Param("example") PaymentDtlExample example);

    @UpdateProvider(type=PaymentDtlSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PaymentDtl record);

    @Update({
        "update payment_dtl",
        "set reg_id = #{regId,jdbcType=INTEGER},",
          "invoice_no = #{invoiceNo,jdbcType=INTEGER},",
          "item_id = #{itemId,jdbcType=INTEGER},",
          "item_type = #{itemType,jdbcType=BIT},",
          "item_name = #{itemName,jdbcType=VARCHAR},",
          "item_unit_price = #{itemUnitPrice,jdbcType=DOUBLE},",
          "quantity = #{quantity,jdbcType=INTEGER},",
          "dept_id = #{deptId,jdbcType=INTEGER},",
          "prescription_generation_time = #{prescriptionGenerationTime,jdbcType=TIMESTAMP},",
          "generator_id = #{generatorId,jdbcType=INTEGER},",
          "payment_operation_time = #{paymentOperationTime,jdbcType=TIMESTAMP},",
          "operator_id = #{operatorId,jdbcType=INTEGER},",
          "method = #{method,jdbcType=VARCHAR},",
          "related_refund_id = #{relatedRefundId,jdbcType=INTEGER},",
          "is_deleted = #{isDeleted,jdbcType=BIT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PaymentDtl record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_dtl
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") PaymentDtlExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_dtl
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
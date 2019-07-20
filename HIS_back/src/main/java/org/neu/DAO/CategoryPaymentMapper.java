package org.neu.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.neu.entity.CategoryPayment;
import org.neu.entity.CategoryPaymentExample;

@Mapper
public interface CategoryPaymentMapper {
    long countByExample(CategoryPaymentExample example);

    int deleteByExample(CategoryPaymentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CategoryPayment record);

    int insertSelective(CategoryPayment record);

    List<CategoryPayment> selectByExample(CategoryPaymentExample example);

    CategoryPayment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category_payment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    CategoryPayment selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    int updateByExampleSelective(@Param("record") CategoryPayment record, @Param("example") CategoryPaymentExample example);

    int updateByExample(@Param("record") CategoryPayment record, @Param("example") CategoryPaymentExample example);

    int updateByPrimaryKeySelective(CategoryPayment record);

    int updateByPrimaryKey(CategoryPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category_payment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") CategoryPaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table category_payment
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}
package org.neu.DAO.basicMapper;

import entity.CategoryPayment;
import entity.CategoryPaymentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CategoryPaymentMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:06 CST 2019
     */
    long countByExample(CategoryPaymentExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:06 CST 2019
     */
    int deleteByExample(CategoryPaymentExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:06 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:06 CST 2019
     */
    int insert(CategoryPayment record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:06 CST 2019
     */
    int insertSelective(CategoryPayment record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:06 CST 2019
     */
    List<CategoryPayment> selectByExample(CategoryPaymentExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:06 CST 2019
     */
    CategoryPayment selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") CategoryPayment record, @Param("example") CategoryPaymentExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:06 CST 2019
     */
    int updateByExample(@Param("record") CategoryPayment record, @Param("example") CategoryPaymentExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:06 CST 2019
     */
    int updateByPrimaryKeySelective(CategoryPayment record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:06 CST 2019
     */
    int updateByPrimaryKey(CategoryPayment record);
}
package org.neu.DAO.financialMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.neu.entity.PaymentDtl;
import entity.PaymentDtlExample;

import java.util.List;

@Mapper
public interface PaymentDtlMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:37 CST 2019
     */
    long countByExample(PaymentDtlExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:37 CST 2019
     */
    int deleteByExample(PaymentDtlExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:37 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:37 CST 2019
     */
    int insert(PaymentDtl record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:37 CST 2019
     */
    int insertSelective(PaymentDtl record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:37 CST 2019
     */
    List<PaymentDtl> selectByExample(PaymentDtlExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:37 CST 2019
     */
    PaymentDtl selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:37 CST 2019
     */
    int updateByExampleSelective(@Param("record") PaymentDtl record, @Param("example") PaymentDtlExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:37 CST 2019
     */
    int updateByExample(@Param("record") PaymentDtl record, @Param("example") PaymentDtlExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:37 CST 2019
     */
    int updateByPrimaryKeySelective(PaymentDtl record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:37 CST 2019
     */
    int updateByPrimaryKey(PaymentDtl record);
}
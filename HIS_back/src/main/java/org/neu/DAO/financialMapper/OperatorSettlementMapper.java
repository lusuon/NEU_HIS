package org.neu.DAO.financialMapper;

import entity.OperatorSettlement;
import entity.OperatorSettlementExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OperatorSettlementMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:35 CST 2019
     */
    long countByExample(OperatorSettlementExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:35 CST 2019
     */
    int deleteByExample(OperatorSettlementExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:35 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:35 CST 2019
     */
    int insert(OperatorSettlement record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:35 CST 2019
     */
    int insertSelective(OperatorSettlement record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:35 CST 2019
     */
    List<OperatorSettlement> selectByExample(OperatorSettlementExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:35 CST 2019
     */
    OperatorSettlement selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:35 CST 2019
     */
    int updateByExampleSelective(@Param("record") OperatorSettlement record, @Param("example") OperatorSettlementExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:35 CST 2019
     */
    int updateByExample(@Param("record") OperatorSettlement record, @Param("example") OperatorSettlementExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:35 CST 2019
     */
    int updateByPrimaryKeySelective(OperatorSettlement record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:35 CST 2019
     */
    int updateByPrimaryKey(OperatorSettlement record);
}
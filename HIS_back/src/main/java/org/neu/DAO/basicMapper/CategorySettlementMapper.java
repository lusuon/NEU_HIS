package org.neu.DAO.basicMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import entity.CategorySettlement;
import entity.CategorySettlementExample;

import java.util.List;

@Mapper
public interface CategorySettlementMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:10 CST 2019
     */
    long countByExample(CategorySettlementExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:10 CST 2019
     */
    int deleteByExample(CategorySettlementExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:10 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:10 CST 2019
     */
    int insert(CategorySettlement record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:10 CST 2019
     */
    int insertSelective(CategorySettlement record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:10 CST 2019
     */
    List<CategorySettlement> selectByExample(CategorySettlementExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:10 CST 2019
     */
    CategorySettlement selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") CategorySettlement record, @Param("example") CategorySettlementExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:10 CST 2019
     */
    int updateByExample(@Param("record") CategorySettlement record, @Param("example") CategorySettlementExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:10 CST 2019
     */
    int updateByPrimaryKeySelective(CategorySettlement record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:10 CST 2019
     */
    int updateByPrimaryKey(CategorySettlement record);
}
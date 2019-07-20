package org.neu.DAO.basicMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import entity.NonDrug;
import entity.NonDrugExample;

import java.util.List;

@Mapper
public interface NonDrugMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:30 CST 2019
     */
    long countByExample(NonDrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:30 CST 2019
     */
    int deleteByExample(NonDrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:30 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:30 CST 2019
     */
    int insert(NonDrug record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:30 CST 2019
     */
    int insertSelective(NonDrug record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:30 CST 2019
     */
    List<NonDrug> selectByExample(NonDrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:30 CST 2019
     */
    NonDrug selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:30 CST 2019
     */
    int updateByExampleSelective(@Param("record") NonDrug record, @Param("example") NonDrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:30 CST 2019
     */
    int updateByExample(@Param("record") NonDrug record, @Param("example") NonDrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:30 CST 2019
     */
    int updateByPrimaryKeySelective(NonDrug record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:30 CST 2019
     */
    int updateByPrimaryKey(NonDrug record);
}
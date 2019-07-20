package org.neu.DAO.prescribeMapper;

import entity.NonDrugApplication;
import entity.NonDrugApplicationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface NonDrugApplicationMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:32 CST 2019
     */
    long countByExample(NonDrugApplicationExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:32 CST 2019
     */
    int deleteByExample(NonDrugApplicationExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:32 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:32 CST 2019
     */
    int insert(NonDrugApplication record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:32 CST 2019
     */
    int insertSelective(NonDrugApplication record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:32 CST 2019
     */
    List<NonDrugApplication> selectByExample(NonDrugApplicationExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:32 CST 2019
     */
    NonDrugApplication selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:32 CST 2019
     */
    int updateByExampleSelective(@Param("record") NonDrugApplication record, @Param("example") NonDrugApplicationExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:32 CST 2019
     */
    int updateByExample(@Param("record") NonDrugApplication record, @Param("example") NonDrugApplicationExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:32 CST 2019
     */
    int updateByPrimaryKeySelective(NonDrugApplication record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:32 CST 2019
     */
    int updateByPrimaryKey(NonDrugApplication record);
}
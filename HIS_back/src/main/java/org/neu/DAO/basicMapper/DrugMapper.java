package org.neu.DAO.basicMapper;

import entity.Drug;
import entity.DrugExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DrugMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:21 CST 2019
     */
    long countByExample(DrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:21 CST 2019
     */
    int deleteByExample(DrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:21 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:21 CST 2019
     */
    int insert(Drug record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:21 CST 2019
     */
    int insertSelective(Drug record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:21 CST 2019
     */
    List<Drug> selectByExample(DrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:21 CST 2019
     */
    Drug selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:21 CST 2019
     */
    int updateByExampleSelective(@Param("record") Drug record, @Param("example") DrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:21 CST 2019
     */
    int updateByExample(@Param("record") Drug record, @Param("example") DrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:21 CST 2019
     */
    int updateByPrimaryKeySelective(Drug record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:21 CST 2019
     */
    int updateByPrimaryKey(Drug record);
}
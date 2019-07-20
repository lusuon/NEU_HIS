package org.neu.DAO.basicMapper;

import entity.Disease;
import entity.DiseaseExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DiseaseMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:19 CST 2019
     */
    long countByExample(DiseaseExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:19 CST 2019
     */
    int deleteByExample(DiseaseExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:19 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:19 CST 2019
     */
    int insert(Disease record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:19 CST 2019
     */
    int insertSelective(Disease record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:19 CST 2019
     */
    List<Disease> selectByExample(DiseaseExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:19 CST 2019
     */
    Disease selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:19 CST 2019
     */
    int updateByExampleSelective(@Param("record") Disease record, @Param("example") DiseaseExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:19 CST 2019
     */
    int updateByExample(@Param("record") Disease record, @Param("example") DiseaseExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:19 CST 2019
     */
    int updateByPrimaryKeySelective(Disease record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:19 CST 2019
     */
    int updateByPrimaryKey(Disease record);
}
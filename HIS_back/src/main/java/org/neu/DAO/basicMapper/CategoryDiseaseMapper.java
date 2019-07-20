package org.neu.DAO.basicMapper;

import entity.CategoryDisease;
import entity.CategoryDiseaseExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CategoryDiseaseMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:04 CST 2019
     */
    long countByExample(CategoryDiseaseExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:04 CST 2019
     */
    int deleteByExample(CategoryDiseaseExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:04 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:04 CST 2019
     */
    int insert(CategoryDisease record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:04 CST 2019
     */
    int insertSelective(CategoryDisease record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:04 CST 2019
     */
    List<CategoryDisease> selectByExample(CategoryDiseaseExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:04 CST 2019
     */
    CategoryDisease selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") CategoryDisease record, @Param("example") CategoryDiseaseExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:04 CST 2019
     */
    int updateByExample(@Param("record") CategoryDisease record, @Param("example") CategoryDiseaseExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:04 CST 2019
     */
    int updateByPrimaryKeySelective(CategoryDisease record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:04 CST 2019
     */
    int updateByPrimaryKey(CategoryDisease record);
}
package org.neu.DAO.basicMapper;

import entity.CategoryConstant;
import entity.CategoryConstantExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CategoryConstantMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:40:58 CST 2019
     */
    long countByExample(CategoryConstantExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:58 CST 2019
     */
    int deleteByExample(CategoryConstantExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:58 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:58 CST 2019
     */
    int insert(CategoryConstant record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:58 CST 2019
     */
    int insertSelective(CategoryConstant record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:58 CST 2019
     */
    List<CategoryConstant> selectByExample(CategoryConstantExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:58 CST 2019
     */
    CategoryConstant selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:58 CST 2019
     */
    int updateByExampleSelective(@Param("record") CategoryConstant record, @Param("example") CategoryConstantExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:58 CST 2019
     */
    int updateByExample(@Param("record") CategoryConstant record, @Param("example") CategoryConstantExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:58 CST 2019
     */
    int updateByPrimaryKeySelective(CategoryConstant record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:58 CST 2019
     */
    int updateByPrimaryKey(CategoryConstant record);
}
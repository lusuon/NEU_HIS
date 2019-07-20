package org.neu.DAO.basicMapper;

import entity.CategoryReg;
import entity.CategoryRegExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CategoryRegMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:08 CST 2019
     */
    long countByExample(CategoryRegExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:08 CST 2019
     */
    int deleteByExample(CategoryRegExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:08 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:08 CST 2019
     */
    int insert(CategoryReg record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:08 CST 2019
     */
    int insertSelective(CategoryReg record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:08 CST 2019
     */
    List<CategoryReg> selectByExample(CategoryRegExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:08 CST 2019
     */
    CategoryReg selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:08 CST 2019
     */
    int updateByExampleSelective(@Param("record") CategoryReg record, @Param("example") CategoryRegExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:08 CST 2019
     */
    int updateByExample(@Param("record") CategoryReg record, @Param("example") CategoryRegExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:08 CST 2019
     */
    int updateByPrimaryKeySelective(CategoryReg record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:08 CST 2019
     */
    int updateByPrimaryKey(CategoryReg record);
}
package org.neu.DAO.templateMapper;

import entity.TemplateDtlHerb;
import entity.TemplateDtlHerbExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TemplateDtlHerbMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:56 CST 2019
     */
    long countByExample(TemplateDtlHerbExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:56 CST 2019
     */
    int deleteByExample(TemplateDtlHerbExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:56 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:56 CST 2019
     */
    int insert(TemplateDtlHerb record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:56 CST 2019
     */
    int insertSelective(TemplateDtlHerb record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:56 CST 2019
     */
    List<TemplateDtlHerb> selectByExample(TemplateDtlHerbExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:56 CST 2019
     */
    TemplateDtlHerb selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") TemplateDtlHerb record, @Param("example") TemplateDtlHerbExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:56 CST 2019
     */
    int updateByExample(@Param("record") TemplateDtlHerb record, @Param("example") TemplateDtlHerbExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:56 CST 2019
     */
    int updateByPrimaryKeySelective(TemplateDtlHerb record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:56 CST 2019
     */
    int updateByPrimaryKey(TemplateDtlHerb record);
}
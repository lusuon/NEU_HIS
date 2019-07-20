package org.neu.DAO.templateMapper;

import entity.TemplateHerb;
import entity.TemplateHerbExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TemplateHerbMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:42:05 CST 2019
     */
    long countByExample(TemplateHerbExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:05 CST 2019
     */
    int deleteByExample(TemplateHerbExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:05 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:05 CST 2019
     */
    int insert(TemplateHerb record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:05 CST 2019
     */
    int insertSelective(TemplateHerb record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:05 CST 2019
     */
    List<TemplateHerb> selectByExample(TemplateHerbExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:05 CST 2019
     */
    TemplateHerb selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:05 CST 2019
     */
    int updateByExampleSelective(@Param("record") TemplateHerb record, @Param("example") TemplateHerbExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:05 CST 2019
     */
    int updateByExample(@Param("record") TemplateHerb record, @Param("example") TemplateHerbExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:05 CST 2019
     */
    int updateByPrimaryKeySelective(TemplateHerb record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:05 CST 2019
     */
    int updateByPrimaryKey(TemplateHerb record);
}
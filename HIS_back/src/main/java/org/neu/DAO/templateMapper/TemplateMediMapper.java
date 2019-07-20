package org.neu.DAO.templateMapper;

import entity.TemplateMedi;
import entity.TemplateMediExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TemplateMediMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:42:07 CST 2019
     */
    long countByExample(TemplateMediExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:07 CST 2019
     */
    int deleteByExample(TemplateMediExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:07 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:07 CST 2019
     */
    int insert(TemplateMedi record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:07 CST 2019
     */
    int insertSelective(TemplateMedi record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:07 CST 2019
     */
    List<TemplateMedi> selectByExample(TemplateMediExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:07 CST 2019
     */
    TemplateMedi selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:07 CST 2019
     */
    int updateByExampleSelective(@Param("record") TemplateMedi record, @Param("example") TemplateMediExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:07 CST 2019
     */
    int updateByExample(@Param("record") TemplateMedi record, @Param("example") TemplateMediExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:07 CST 2019
     */
    int updateByPrimaryKeySelective(TemplateMedi record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:07 CST 2019
     */
    int updateByPrimaryKey(TemplateMedi record);
}
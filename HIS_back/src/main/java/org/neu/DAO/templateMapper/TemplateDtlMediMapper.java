package org.neu.DAO.templateMapper;

import entity.TemplateDtlMedi;
import entity.TemplateDtlMediExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TemplateDtlMediMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:42:00 CST 2019
     */
    long countByExample(TemplateDtlMediExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:00 CST 2019
     */
    int deleteByExample(TemplateDtlMediExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:00 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:00 CST 2019
     */
    int insert(TemplateDtlMedi record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:00 CST 2019
     */
    int insertSelective(TemplateDtlMedi record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:00 CST 2019
     */
    List<TemplateDtlMedi> selectByExample(TemplateDtlMediExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:00 CST 2019
     */
    TemplateDtlMedi selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:00 CST 2019
     */
    int updateByExampleSelective(@Param("record") TemplateDtlMedi record, @Param("example") TemplateDtlMediExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:00 CST 2019
     */
    int updateByExample(@Param("record") TemplateDtlMedi record, @Param("example") TemplateDtlMediExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:00 CST 2019
     */
    int updateByPrimaryKeySelective(TemplateDtlMedi record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:00 CST 2019
     */
    int updateByPrimaryKey(TemplateDtlMedi record);
}
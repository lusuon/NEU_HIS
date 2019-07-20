package org.neu.DAO.templateMapper;

import entity.TemplateDtlNonDrug;
import entity.TemplateDtlNonDrugExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TemplateDtlNonDrugMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:42:02 CST 2019
     */
    long countByExample(TemplateDtlNonDrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:02 CST 2019
     */
    int deleteByExample(TemplateDtlNonDrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:02 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:02 CST 2019
     */
    int insert(TemplateDtlNonDrug record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:02 CST 2019
     */
    int insertSelective(TemplateDtlNonDrug record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:02 CST 2019
     */
    List<TemplateDtlNonDrug> selectByExample(TemplateDtlNonDrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:02 CST 2019
     */
    TemplateDtlNonDrug selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:02 CST 2019
     */
    int updateByExampleSelective(@Param("record") TemplateDtlNonDrug record, @Param("example") TemplateDtlNonDrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:02 CST 2019
     */
    int updateByExample(@Param("record") TemplateDtlNonDrug record, @Param("example") TemplateDtlNonDrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:02 CST 2019
     */
    int updateByPrimaryKeySelective(TemplateDtlNonDrug record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:02 CST 2019
     */
    int updateByPrimaryKey(TemplateDtlNonDrug record);
}
package org.neu.DAO.templateMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import entity.TemplateNonDrug;
import entity.TemplateNonDrugExample;

import java.util.List;

@Mapper
public interface TemplateNonDrugMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:42:09 CST 2019
     */
    long countByExample(TemplateNonDrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:09 CST 2019
     */
    int deleteByExample(TemplateNonDrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:09 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:09 CST 2019
     */
    int insert(TemplateNonDrug record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:09 CST 2019
     */
    int insertSelective(TemplateNonDrug record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:09 CST 2019
     */
    List<TemplateNonDrug> selectByExample(TemplateNonDrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:09 CST 2019
     */
    TemplateNonDrug selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") TemplateNonDrug record, @Param("example") TemplateNonDrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:09 CST 2019
     */
    int updateByExample(@Param("record") TemplateNonDrug record, @Param("example") TemplateNonDrugExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:09 CST 2019
     */
    int updateByPrimaryKeySelective(TemplateNonDrug record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:42:09 CST 2019
     */
    int updateByPrimaryKey(TemplateNonDrug record);
}
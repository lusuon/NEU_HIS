package org.neu.DAO.diagnoseMapper;

import entity.Case;
import entity.CaseExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CaseMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:40:55 CST 2019
     */
    long countByExample(CaseExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:55 CST 2019
     */
    int deleteByExample(CaseExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:55 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:55 CST 2019
     */
    int insert(Case record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:55 CST 2019
     */
    int insertSelective(Case record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:55 CST 2019
     */
    List<Case> selectByExample(CaseExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:55 CST 2019
     */
    Case selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:55 CST 2019
     */
    int updateByExampleSelective(@Param("record") Case record, @Param("example") CaseExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:55 CST 2019
     */
    int updateByExample(@Param("record") Case record, @Param("example") CaseExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:55 CST 2019
     */
    int updateByPrimaryKeySelective(Case record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:40:55 CST 2019
     */
    int updateByPrimaryKey(Case record);
}
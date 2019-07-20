package org.neu.DAO.diagnoseMapper;

import entity.Diagnosis;
import entity.DiagnosisExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DiagnosisMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:17 CST 2019
     */
    long countByExample(DiagnosisExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:17 CST 2019
     */
    int deleteByExample(DiagnosisExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:17 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:17 CST 2019
     */
    int insert(Diagnosis record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:17 CST 2019
     */
    int insertSelective(Diagnosis record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:17 CST 2019
     */
    List<Diagnosis> selectByExample(DiagnosisExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:17 CST 2019
     */
    Diagnosis selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:17 CST 2019
     */
    int updateByExampleSelective(@Param("record") Diagnosis record, @Param("example") DiagnosisExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:17 CST 2019
     */
    int updateByExample(@Param("record") Diagnosis record, @Param("example") DiagnosisExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:17 CST 2019
     */
    int updateByPrimaryKeySelective(Diagnosis record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:17 CST 2019
     */
    int updateByPrimaryKey(Diagnosis record);
}
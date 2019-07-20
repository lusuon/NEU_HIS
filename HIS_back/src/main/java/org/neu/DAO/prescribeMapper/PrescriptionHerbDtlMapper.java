package org.neu.DAO.prescribeMapper;

import entity.PrescriptionHerbDtl;
import entity.PrescriptionHerbDtlExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PrescriptionHerbDtlMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:41 CST 2019
     */
    long countByExample(PrescriptionHerbDtlExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:41 CST 2019
     */
    int deleteByExample(PrescriptionHerbDtlExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:41 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:41 CST 2019
     */
    int insert(PrescriptionHerbDtl record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:41 CST 2019
     */
    int insertSelective(PrescriptionHerbDtl record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:41 CST 2019
     */
    List<PrescriptionHerbDtl> selectByExample(PrescriptionHerbDtlExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:41 CST 2019
     */
    PrescriptionHerbDtl selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:41 CST 2019
     */
    int updateByExampleSelective(@Param("record") PrescriptionHerbDtl record, @Param("example") PrescriptionHerbDtlExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:41 CST 2019
     */
    int updateByExample(@Param("record") PrescriptionHerbDtl record, @Param("example") PrescriptionHerbDtlExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:41 CST 2019
     */
    int updateByPrimaryKeySelective(PrescriptionHerbDtl record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:41 CST 2019
     */
    int updateByPrimaryKey(PrescriptionHerbDtl record);
}
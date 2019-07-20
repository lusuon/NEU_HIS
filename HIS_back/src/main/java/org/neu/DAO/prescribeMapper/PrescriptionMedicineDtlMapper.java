package org.neu.DAO.prescribeMapper;

import entity.PrescriptionMedicineDtl;
import entity.PrescriptionMedicineDtlExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PrescriptionMedicineDtlMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:46 CST 2019
     */
    long countByExample(PrescriptionMedicineDtlExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:46 CST 2019
     */
    int deleteByExample(PrescriptionMedicineDtlExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:46 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:46 CST 2019
     */
    int insert(PrescriptionMedicineDtl record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:46 CST 2019
     */
    int insertSelective(PrescriptionMedicineDtl record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:46 CST 2019
     */
    List<PrescriptionMedicineDtl> selectByExample(PrescriptionMedicineDtlExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:46 CST 2019
     */
    PrescriptionMedicineDtl selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:46 CST 2019
     */
    int updateByExampleSelective(@Param("record") PrescriptionMedicineDtl record, @Param("example") PrescriptionMedicineDtlExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:46 CST 2019
     */
    int updateByExample(@Param("record") PrescriptionMedicineDtl record, @Param("example") PrescriptionMedicineDtlExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:46 CST 2019
     */
    int updateByPrimaryKeySelective(PrescriptionMedicineDtl record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:46 CST 2019
     */
    int updateByPrimaryKey(PrescriptionMedicineDtl record);
}
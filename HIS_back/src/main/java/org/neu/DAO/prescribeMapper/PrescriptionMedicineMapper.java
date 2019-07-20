package org.neu.DAO.prescribeMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import entity.PrescriptionMedicine;
import entity.PrescriptionMedicineExample;

import java.util.List;

@Mapper
public interface PrescriptionMedicineMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:44 CST 2019
     */
    long countByExample(PrescriptionMedicineExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:44 CST 2019
     */
    int deleteByExample(PrescriptionMedicineExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:44 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:44 CST 2019
     */
    int insert(PrescriptionMedicine record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:44 CST 2019
     */
    int insertSelective(PrescriptionMedicine record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:44 CST 2019
     */
    List<PrescriptionMedicine> selectByExample(PrescriptionMedicineExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:44 CST 2019
     */
    PrescriptionMedicine selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:44 CST 2019
     */
    int updateByExampleSelective(@Param("record") PrescriptionMedicine record, @Param("example") PrescriptionMedicineExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:44 CST 2019
     */
    int updateByExample(@Param("record") PrescriptionMedicine record, @Param("example") PrescriptionMedicineExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:44 CST 2019
     */
    int updateByPrimaryKeySelective(PrescriptionMedicine record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:44 CST 2019
     */
    int updateByPrimaryKey(PrescriptionMedicine record);
}
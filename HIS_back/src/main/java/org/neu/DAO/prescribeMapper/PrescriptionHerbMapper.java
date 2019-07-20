package org.neu.DAO.prescribeMapper;

import entity.PrescriptionHerb;
import entity.PrescriptionHerbExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PrescriptionHerbMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:39 CST 2019
     */
    long countByExample(PrescriptionHerbExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:39 CST 2019
     */
    int deleteByExample(PrescriptionHerbExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:39 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:39 CST 2019
     */
    int insert(PrescriptionHerb record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:39 CST 2019
     */
    int insertSelective(PrescriptionHerb record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:39 CST 2019
     */
    List<PrescriptionHerb> selectByExample(PrescriptionHerbExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:39 CST 2019
     */
    PrescriptionHerb selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:39 CST 2019
     */
    int updateByExampleSelective(@Param("record") PrescriptionHerb record, @Param("example") PrescriptionHerbExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:39 CST 2019
     */
    int updateByExample(@Param("record") PrescriptionHerb record, @Param("example") PrescriptionHerbExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:39 CST 2019
     */
    int updateByPrimaryKeySelective(PrescriptionHerb record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:39 CST 2019
     */
    int updateByPrimaryKey(PrescriptionHerb record);
}
package org.neu.DAO.basicMapper;

import entity.Constant;
import entity.ConstantExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConstantMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:12 CST 2019
     */
    long countByExample(ConstantExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:12 CST 2019
     */
    int deleteByExample(ConstantExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:12 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:12 CST 2019
     */
    int insert(Constant record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:12 CST 2019
     */
    int insertSelective(Constant record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:12 CST 2019
     */
    List<Constant> selectByExample(ConstantExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:12 CST 2019
     */
    Constant selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") Constant record, @Param("example") ConstantExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:12 CST 2019
     */
    int updateByExample(@Param("record") Constant record, @Param("example") ConstantExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:12 CST 2019
     */
    int updateByPrimaryKeySelective(Constant record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:12 CST 2019
     */
    int updateByPrimaryKey(Constant record);
}
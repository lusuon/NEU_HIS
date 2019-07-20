package org.neu.DAO.basicMapper;

import entity.Dept;
import entity.DeptExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DeptMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:15 CST 2019
     */
    long countByExample(DeptExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:15 CST 2019
     */
    int deleteByExample(DeptExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:15 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:15 CST 2019
     */
    int insert(Dept record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:15 CST 2019
     */
    int insertSelective(Dept record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:15 CST 2019
     */
    List<Dept> selectByExample(DeptExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:15 CST 2019
     */
    Dept selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:15 CST 2019
     */
    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:15 CST 2019
     */
    int updateByPrimaryKeySelective(Dept record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:15 CST 2019
     */
    int updateByPrimaryKey(Dept record);
}
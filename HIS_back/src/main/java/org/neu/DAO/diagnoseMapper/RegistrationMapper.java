package org.neu.DAO.diagnoseMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import entity.Registration;
import entity.RegistrationExample;

import java.util.List;

@Mapper
public interface RegistrationMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:49 CST 2019
     */
    long countByExample(RegistrationExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:49 CST 2019
     */
    int deleteByExample(RegistrationExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:49 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:49 CST 2019
     */
    int insert(Registration record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:49 CST 2019
     */
    int insertSelective(Registration record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:49 CST 2019
     */
    List<Registration> selectByExample(RegistrationExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:49 CST 2019
     */
    Registration selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:49 CST 2019
     */
    int updateByExampleSelective(@Param("record") Registration record, @Param("example") RegistrationExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:49 CST 2019
     */
    int updateByExample(@Param("record") Registration record, @Param("example") RegistrationExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:49 CST 2019
     */
    int updateByPrimaryKeySelective(Registration record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:49 CST 2019
     */
    int updateByPrimaryKey(Registration record);
}
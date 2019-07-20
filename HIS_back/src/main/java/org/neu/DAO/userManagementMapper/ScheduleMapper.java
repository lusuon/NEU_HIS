package org.neu.DAO.userManagementMapper;

import entity.Schedule;
import entity.ScheduleExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ScheduleMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:51 CST 2019
     */
    long countByExample(ScheduleExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:51 CST 2019
     */
    int deleteByExample(ScheduleExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:51 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:51 CST 2019
     */
    int insert(Schedule record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:51 CST 2019
     */
    int insertSelective(Schedule record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:51 CST 2019
     */
    List<Schedule> selectByExample(ScheduleExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:51 CST 2019
     */
    Schedule selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:51 CST 2019
     */
    int updateByExampleSelective(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:51 CST 2019
     */
    int updateByExample(@Param("record") Schedule record, @Param("example") ScheduleExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:51 CST 2019
     */
    int updateByPrimaryKeySelective(Schedule record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:51 CST 2019
     */
    int updateByPrimaryKey(Schedule record);
}
package org.neu.DAO.financialMapper;

import entity.Invoice;
import entity.InvoiceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InvoiceMapper {
    /**
     *
     * @mbg.generated Sat Jul 20 14:41:25 CST 2019
     */
    long countByExample(InvoiceExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:25 CST 2019
     */
    int deleteByExample(InvoiceExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:25 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:25 CST 2019
     */
    int insert(Invoice record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:25 CST 2019
     */
    int insertSelective(Invoice record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:25 CST 2019
     */
    List<Invoice> selectByExample(InvoiceExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:25 CST 2019
     */
    Invoice selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:25 CST 2019
     */
    int updateByExampleSelective(@Param("record") Invoice record, @Param("example") InvoiceExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:25 CST 2019
     */
    int updateByExample(@Param("record") Invoice record, @Param("example") InvoiceExample example);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:25 CST 2019
     */
    int updateByPrimaryKeySelective(Invoice record);

    /**
     *
     * @mbg.generated Sat Jul 20 14:41:25 CST 2019
     */
    int updateByPrimaryKey(Invoice record);
}
package org.neu.his.controller;

import org.neu.his.dao.TemplateDtlMediMapper;
import org.neu.his.entity.TemplateDtlMedi;
import org.neu.his.entity.TemplateDtlMediExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import org.neu.his.common.CommonResponse;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.annotation.Resource;
import java.util.List;

@Service
@RestController
@RequestMapping(path = "api/templateDtlMedi")
public class TemplateDtlMediRestController{
    @Resource
    TemplateDtlMediMapper mapper;

    @RequestMapping(path = "", method = RequestMethod.GET)
    @Transactional
    public CommonResponse getList(
            @RequestParam(value = "field", required = false) String field//要搜索的字段
            , @RequestParam(value = "type", defaultValue = "none") String type//搜索类型，支持in,notIn,like,notLike,equals,notEquals....

            , @RequestParam(value = "sort", required = false) String sort//排序字段
            , @RequestParam(value = "order", required = false) String order//排序方式

            , @RequestParam(value = "limit", required = false, defaultValue = "1") @Min(1) Integer limit//limit
            , @RequestParam(value = "offset", required = false, defaultValue = "100") @Max(1000) @Min(1) Integer offset//offset
        ) {

        TemplateDtlMediExample example = new TemplateDtlMediExample();

        //排序
        if (sort != null && order != null)
            switch (order.toLowerCase()) {
                case "asc":
                    example.setOrderByClause(TemplateDtlMedi.Column.valueOf(sort).asc());
                    break;
                case "desc":
                    example.setOrderByClause(TemplateDtlMedi.Column.valueOf(sort).desc());
                    break;
                default:
                    throw new RuntimeException("unsupported sorting method(only support asc or desc)");
            }

        //设置基于Limit/Offset分页插件的分页信息,如数据库不支持或使用了PageHelper，请自行更改实现方式
        example.setLimit(limit);
        example.setOffset(offset);

        return new CommonResponse<>(mapper.selectByExample(example)).total(mapper.countByExample(example));
    }


    /**
     * 插入单条数据
     * @param record the record you want to create
     * @return created records(with primary key if your mapper supports it)
     */
    @RequestMapping(path = "", method = RequestMethod.POST)
    @Transactional
    public TemplateDtlMedi insertOne(@RequestBody TemplateDtlMedi record) {
        mapper.insertSelective(record);
        return record;
    }


    /**
     * 批量插入
     * @param records the records you want to create
     * @return created records(with primary key if your mapper supports it)
     */
    @RequestMapping(path = "batch", method = RequestMethod.POST)
    @Transactional
    public List<TemplateDtlMedi> insertBatch(@RequestBody List<TemplateDtlMedi> records) {
        for (TemplateDtlMedi record : records) {
            mapper.insertSelective(record);
        }
        return records;
    }

    /**
     * 更新单条数据
     * @param record the records you want to update
     * @return affected row count
     */
    @RequestMapping(path = "", method = RequestMethod.PUT)
    @Transactional
    public int updateOne(@RequestBody TemplateDtlMedi record) {
        return mapper.updateByPrimaryKey(record);

    }

    /**
     * 批量更新数据
     * @param records the records you want to update
     * @return affected row count
     */
    // TODO: 2018/3/25 update batch
    @RequestMapping(path = "batch", method = RequestMethod.PUT)
    @Transactional
    public long updateBatch(@RequestBody List<TemplateDtlMedi> records) {
        int count = 0;
        for (TemplateDtlMedi record : records) {
            count += mapper.updateByPrimaryKey(record);
        }
        return count;
    }

    /**
     * delete a record by id
     *
     * @param id the id of the record you want to delete
     * @return affected row count
     */
    // TODO: 2018/3/25 delete one
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    @Transactional
    public int deleteOne(@PathVariable("id") Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    /**
     * batch delete
     *
     * @param ids the ids of the records you want to delete
     * @return affected row count
     */
    @RequestMapping(path = "", method = RequestMethod.DELETE)
    @Transactional
    public long deleteBatch(@RequestParam("id") List<Integer> ids) {
        long count = 0;
        for (Integer id : ids) {
            count += mapper.deleteByPrimaryKey(id);
        }
        return count;
    }

}
package com.neu.his.Dao;

import com.neu.his.entity.CategorySettlement;
import com.neu.his.entity.CategorySettlementExample.Criteria;
import com.neu.his.entity.CategorySettlementExample.Criterion;
import com.neu.his.entity.CategorySettlementExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class CategorySettlementSqlProvider {

    public String countByExample(CategorySettlementExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("category_settlement");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CategorySettlementExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("category_settlement");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(CategorySettlement record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("category_settlement");
        
        if (record.getCategoryNo() != null) {
            sql.VALUES("category_no", "#{categoryNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryName() != null) {
            sql.VALUES("category_name", "#{categoryName,jdbcType=VARCHAR}");
        }
        
        if (record.getSequence() != null) {
            sql.VALUES("sequence", "#{sequence,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.VALUES("is_deleted", "#{isDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(CategorySettlementExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("category_no");
        sql.SELECT("category_name");
        sql.SELECT("sequence");
        sql.SELECT("is_deleted");
        sql.FROM("category_settlement");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        CategorySettlement record = (CategorySettlement) parameter.get("record");
        CategorySettlementExample example = (CategorySettlementExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("category_settlement");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getCategoryNo() != null) {
            sql.SET("category_no = #{record.categoryNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryName() != null) {
            sql.SET("category_name = #{record.categoryName,jdbcType=VARCHAR}");
        }
        
        if (record.getSequence() != null) {
            sql.SET("sequence = #{record.sequence,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("category_settlement");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("category_no = #{record.categoryNo,jdbcType=VARCHAR}");
        sql.SET("category_name = #{record.categoryName,jdbcType=VARCHAR}");
        sql.SET("sequence = #{record.sequence,jdbcType=VARCHAR}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        
        CategorySettlementExample example = (CategorySettlementExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(CategorySettlement record) {
        SQL sql = new SQL();
        sql.UPDATE("category_settlement");
        
        if (record.getCategoryNo() != null) {
            sql.SET("category_no = #{categoryNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCategoryName() != null) {
            sql.SET("category_name = #{categoryName,jdbcType=VARCHAR}");
        }
        
        if (record.getSequence() != null) {
            sql.SET("sequence = #{sequence,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{isDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CategorySettlementExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}
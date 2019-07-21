package com.neu.his.Dao;

import com.neu.his.entity.NonDrug;
import com.neu.his.entity.NonDrugExample.Criteria;
import com.neu.his.entity.NonDrugExample.Criterion;
import com.neu.his.entity.NonDrugExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class NonDrugSqlProvider {

    public String countByExample(NonDrugExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("non_drug");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(NonDrugExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("non_drug");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(NonDrug record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("non_drug");
        
        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
        }
        
        if (record.getNonDrugName() != null) {
            sql.VALUES("non_drug_name", "#{nonDrugName,jdbcType=VARCHAR}");
        }
        
        if (record.getStandard() != null) {
            sql.VALUES("standard", "#{standard,jdbcType=VARCHAR}");
        }
        
        if (record.getUnitPrice() != null) {
            sql.VALUES("unit_price", "#{unitPrice,jdbcType=DOUBLE}");
        }
        
        if (record.getCategoryPaymentId() != null) {
            sql.VALUES("category_payment_id", "#{categoryPaymentId,jdbcType=INTEGER}");
        }
        
        if (record.getDeptId() != null) {
            sql.VALUES("dept_id", "#{deptId,jdbcType=INTEGER}");
        }
        
        if (record.getPinyinMnemonicCode() != null) {
            sql.VALUES("pinyin_mnemonic_code", "#{pinyinMnemonicCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=DATE}");
        }
        
        if (record.getLastEditTime() != null) {
            sql.VALUES("last_edit_time", "#{lastEditTime,jdbcType=DATE}");
        }
        
        if (record.getItemType() != null) {
            sql.VALUES("item_type", "#{itemType,jdbcType=SMALLINT}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.VALUES("is_deleted", "#{isDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(NonDrugExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("code");
        sql.SELECT("non_drug_name");
        sql.SELECT("standard");
        sql.SELECT("unit_price");
        sql.SELECT("category_payment_id");
        sql.SELECT("dept_id");
        sql.SELECT("pinyin_mnemonic_code");
        sql.SELECT("create_time");
        sql.SELECT("last_edit_time");
        sql.SELECT("item_type");
        sql.SELECT("is_deleted");
        sql.FROM("non_drug");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        NonDrug record = (NonDrug) parameter.get("record");
        NonDrugExample example = (NonDrugExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("non_drug");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getCode() != null) {
            sql.SET("code = #{record.code,jdbcType=VARCHAR}");
        }
        
        if (record.getNonDrugName() != null) {
            sql.SET("non_drug_name = #{record.nonDrugName,jdbcType=VARCHAR}");
        }
        
        if (record.getStandard() != null) {
            sql.SET("standard = #{record.standard,jdbcType=VARCHAR}");
        }
        
        if (record.getUnitPrice() != null) {
            sql.SET("unit_price = #{record.unitPrice,jdbcType=DOUBLE}");
        }
        
        if (record.getCategoryPaymentId() != null) {
            sql.SET("category_payment_id = #{record.categoryPaymentId,jdbcType=INTEGER}");
        }
        
        if (record.getDeptId() != null) {
            sql.SET("dept_id = #{record.deptId,jdbcType=INTEGER}");
        }
        
        if (record.getPinyinMnemonicCode() != null) {
            sql.SET("pinyin_mnemonic_code = #{record.pinyinMnemonicCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=DATE}");
        }
        
        if (record.getLastEditTime() != null) {
            sql.SET("last_edit_time = #{record.lastEditTime,jdbcType=DATE}");
        }
        
        if (record.getItemType() != null) {
            sql.SET("item_type = #{record.itemType,jdbcType=SMALLINT}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("non_drug");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("code = #{record.code,jdbcType=VARCHAR}");
        sql.SET("non_drug_name = #{record.nonDrugName,jdbcType=VARCHAR}");
        sql.SET("standard = #{record.standard,jdbcType=VARCHAR}");
        sql.SET("unit_price = #{record.unitPrice,jdbcType=DOUBLE}");
        sql.SET("category_payment_id = #{record.categoryPaymentId,jdbcType=INTEGER}");
        sql.SET("dept_id = #{record.deptId,jdbcType=INTEGER}");
        sql.SET("pinyin_mnemonic_code = #{record.pinyinMnemonicCode,jdbcType=VARCHAR}");
        sql.SET("create_time = #{record.createTime,jdbcType=DATE}");
        sql.SET("last_edit_time = #{record.lastEditTime,jdbcType=DATE}");
        sql.SET("item_type = #{record.itemType,jdbcType=SMALLINT}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        
        NonDrugExample example = (NonDrugExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(NonDrug record) {
        SQL sql = new SQL();
        sql.UPDATE("non_drug");
        
        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getNonDrugName() != null) {
            sql.SET("non_drug_name = #{nonDrugName,jdbcType=VARCHAR}");
        }
        
        if (record.getStandard() != null) {
            sql.SET("standard = #{standard,jdbcType=VARCHAR}");
        }
        
        if (record.getUnitPrice() != null) {
            sql.SET("unit_price = #{unitPrice,jdbcType=DOUBLE}");
        }
        
        if (record.getCategoryPaymentId() != null) {
            sql.SET("category_payment_id = #{categoryPaymentId,jdbcType=INTEGER}");
        }
        
        if (record.getDeptId() != null) {
            sql.SET("dept_id = #{deptId,jdbcType=INTEGER}");
        }
        
        if (record.getPinyinMnemonicCode() != null) {
            sql.SET("pinyin_mnemonic_code = #{pinyinMnemonicCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=DATE}");
        }
        
        if (record.getLastEditTime() != null) {
            sql.SET("last_edit_time = #{lastEditTime,jdbcType=DATE}");
        }
        
        if (record.getItemType() != null) {
            sql.SET("item_type = #{itemType,jdbcType=SMALLINT}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{isDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, NonDrugExample example, boolean includeExamplePhrase) {
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
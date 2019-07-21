package com.neu.his.Dao;

import com.neu.his.entity.Invoice;
import com.neu.his.entity.InvoiceExample.Criteria;
import com.neu.his.entity.InvoiceExample.Criterion;
import com.neu.his.entity.InvoiceExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class InvoiceSqlProvider {

    public String countByExample(InvoiceExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("invoice");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(InvoiceExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("invoice");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Invoice record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("invoice");
        
        if (record.getInvoiceNo() != null) {
            sql.VALUES("invoice_no", "#{invoiceNo,jdbcType=INTEGER}");
        }
        
        if (record.getAmount() != null) {
            sql.VALUES("amount", "#{amount,jdbcType=DOUBLE}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getOperateTime() != null) {
            sql.VALUES("operate_time", "#{operateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperatorId() != null) {
            sql.VALUES("operator_id", "#{operatorId,jdbcType=INTEGER}");
        }
        
        if (record.getRegId() != null) {
            sql.VALUES("reg_id", "#{regId,jdbcType=INTEGER}");
        }
        
        if (record.getPayMethod() != null) {
            sql.VALUES("pay_method", "#{payMethod,jdbcType=INTEGER}");
        }
        
        if (record.getRedInvoiceNo() != null) {
            sql.VALUES("red_invoice_no", "#{redInvoiceNo,jdbcType=INTEGER}");
        }
        
        if (record.getInvoiceStatus() != null) {
            sql.VALUES("invoice_status", "#{invoiceStatus,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.VALUES("is_deleted", "#{isDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(InvoiceExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("invoice_no");
        sql.SELECT("amount");
        sql.SELECT("type");
        sql.SELECT("operate_time");
        sql.SELECT("operator_id");
        sql.SELECT("reg_id");
        sql.SELECT("pay_method");
        sql.SELECT("red_invoice_no");
        sql.SELECT("invoice_status");
        sql.SELECT("is_deleted");
        sql.FROM("invoice");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Invoice record = (Invoice) parameter.get("record");
        InvoiceExample example = (InvoiceExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("invoice");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getInvoiceNo() != null) {
            sql.SET("invoice_no = #{record.invoiceNo,jdbcType=INTEGER}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("amount = #{record.amount,jdbcType=DOUBLE}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{record.type,jdbcType=INTEGER}");
        }
        
        if (record.getOperateTime() != null) {
            sql.SET("operate_time = #{record.operateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperatorId() != null) {
            sql.SET("operator_id = #{record.operatorId,jdbcType=INTEGER}");
        }
        
        if (record.getRegId() != null) {
            sql.SET("reg_id = #{record.regId,jdbcType=INTEGER}");
        }
        
        if (record.getPayMethod() != null) {
            sql.SET("pay_method = #{record.payMethod,jdbcType=INTEGER}");
        }
        
        if (record.getRedInvoiceNo() != null) {
            sql.SET("red_invoice_no = #{record.redInvoiceNo,jdbcType=INTEGER}");
        }
        
        if (record.getInvoiceStatus() != null) {
            sql.SET("invoice_status = #{record.invoiceStatus,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("invoice");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("invoice_no = #{record.invoiceNo,jdbcType=INTEGER}");
        sql.SET("amount = #{record.amount,jdbcType=DOUBLE}");
        sql.SET("type = #{record.type,jdbcType=INTEGER}");
        sql.SET("operate_time = #{record.operateTime,jdbcType=TIMESTAMP}");
        sql.SET("operator_id = #{record.operatorId,jdbcType=INTEGER}");
        sql.SET("reg_id = #{record.regId,jdbcType=INTEGER}");
        sql.SET("pay_method = #{record.payMethod,jdbcType=INTEGER}");
        sql.SET("red_invoice_no = #{record.redInvoiceNo,jdbcType=INTEGER}");
        sql.SET("invoice_status = #{record.invoiceStatus,jdbcType=INTEGER}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        
        InvoiceExample example = (InvoiceExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Invoice record) {
        SQL sql = new SQL();
        sql.UPDATE("invoice");
        
        if (record.getInvoiceNo() != null) {
            sql.SET("invoice_no = #{invoiceNo,jdbcType=INTEGER}");
        }
        
        if (record.getAmount() != null) {
            sql.SET("amount = #{amount,jdbcType=DOUBLE}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=INTEGER}");
        }
        
        if (record.getOperateTime() != null) {
            sql.SET("operate_time = #{operateTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperatorId() != null) {
            sql.SET("operator_id = #{operatorId,jdbcType=INTEGER}");
        }
        
        if (record.getRegId() != null) {
            sql.SET("reg_id = #{regId,jdbcType=INTEGER}");
        }
        
        if (record.getPayMethod() != null) {
            sql.SET("pay_method = #{payMethod,jdbcType=INTEGER}");
        }
        
        if (record.getRedInvoiceNo() != null) {
            sql.SET("red_invoice_no = #{redInvoiceNo,jdbcType=INTEGER}");
        }
        
        if (record.getInvoiceStatus() != null) {
            sql.SET("invoice_status = #{invoiceStatus,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{isDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, InvoiceExample example, boolean includeExamplePhrase) {
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
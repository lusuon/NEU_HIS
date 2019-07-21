package com.neu.his.Dao;

import com.neu.his.entity.PaymentDtl;
import com.neu.his.entity.PaymentDtlExample.Criteria;
import com.neu.his.entity.PaymentDtlExample.Criterion;
import com.neu.his.entity.PaymentDtlExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PaymentDtlSqlProvider {

    public String countByExample(PaymentDtlExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("payment_dtl");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PaymentDtlExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("payment_dtl");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PaymentDtl record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("payment_dtl");
        
        if (record.getRegId() != null) {
            sql.VALUES("reg_id", "#{regId,jdbcType=INTEGER}");
        }
        
        if (record.getInvoiceNo() != null) {
            sql.VALUES("invoice_no", "#{invoiceNo,jdbcType=INTEGER}");
        }
        
        if (record.getItemId() != null) {
            sql.VALUES("item_id", "#{itemId,jdbcType=INTEGER}");
        }
        
        if (record.getItemType() != null) {
            sql.VALUES("item_type", "#{itemType,jdbcType=BIT}");
        }
        
        if (record.getItemName() != null) {
            sql.VALUES("item_name", "#{itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getItemUnitPrice() != null) {
            sql.VALUES("item_unit_price", "#{itemUnitPrice,jdbcType=DOUBLE}");
        }
        
        if (record.getQuantity() != null) {
            sql.VALUES("quantity", "#{quantity,jdbcType=INTEGER}");
        }
        
        if (record.getDeptId() != null) {
            sql.VALUES("dept_id", "#{deptId,jdbcType=INTEGER}");
        }
        
        if (record.getPrescriptionGenerationTime() != null) {
            sql.VALUES("prescription_generation_time", "#{prescriptionGenerationTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGeneratorId() != null) {
            sql.VALUES("generator_id", "#{generatorId,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentOperationTime() != null) {
            sql.VALUES("payment_operation_time", "#{paymentOperationTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperatorId() != null) {
            sql.VALUES("operator_id", "#{operatorId,jdbcType=INTEGER}");
        }
        
        if (record.getMethod() != null) {
            sql.VALUES("method", "#{method,jdbcType=VARCHAR}");
        }
        
        if (record.getRelatedRefundId() != null) {
            sql.VALUES("related_refund_id", "#{relatedRefundId,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.VALUES("is_deleted", "#{isDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(PaymentDtlExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("reg_id");
        sql.SELECT("invoice_no");
        sql.SELECT("item_id");
        sql.SELECT("item_type");
        sql.SELECT("item_name");
        sql.SELECT("item_unit_price");
        sql.SELECT("quantity");
        sql.SELECT("dept_id");
        sql.SELECT("prescription_generation_time");
        sql.SELECT("generator_id");
        sql.SELECT("payment_operation_time");
        sql.SELECT("operator_id");
        sql.SELECT("method");
        sql.SELECT("related_refund_id");
        sql.SELECT("is_deleted");
        sql.FROM("payment_dtl");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PaymentDtl record = (PaymentDtl) parameter.get("record");
        PaymentDtlExample example = (PaymentDtlExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("payment_dtl");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getRegId() != null) {
            sql.SET("reg_id = #{record.regId,jdbcType=INTEGER}");
        }
        
        if (record.getInvoiceNo() != null) {
            sql.SET("invoice_no = #{record.invoiceNo,jdbcType=INTEGER}");
        }
        
        if (record.getItemId() != null) {
            sql.SET("item_id = #{record.itemId,jdbcType=INTEGER}");
        }
        
        if (record.getItemType() != null) {
            sql.SET("item_type = #{record.itemType,jdbcType=BIT}");
        }
        
        if (record.getItemName() != null) {
            sql.SET("item_name = #{record.itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getItemUnitPrice() != null) {
            sql.SET("item_unit_price = #{record.itemUnitPrice,jdbcType=DOUBLE}");
        }
        
        if (record.getQuantity() != null) {
            sql.SET("quantity = #{record.quantity,jdbcType=INTEGER}");
        }
        
        if (record.getDeptId() != null) {
            sql.SET("dept_id = #{record.deptId,jdbcType=INTEGER}");
        }
        
        if (record.getPrescriptionGenerationTime() != null) {
            sql.SET("prescription_generation_time = #{record.prescriptionGenerationTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGeneratorId() != null) {
            sql.SET("generator_id = #{record.generatorId,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentOperationTime() != null) {
            sql.SET("payment_operation_time = #{record.paymentOperationTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperatorId() != null) {
            sql.SET("operator_id = #{record.operatorId,jdbcType=INTEGER}");
        }
        
        if (record.getMethod() != null) {
            sql.SET("method = #{record.method,jdbcType=VARCHAR}");
        }
        
        if (record.getRelatedRefundId() != null) {
            sql.SET("related_refund_id = #{record.relatedRefundId,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("payment_dtl");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("reg_id = #{record.regId,jdbcType=INTEGER}");
        sql.SET("invoice_no = #{record.invoiceNo,jdbcType=INTEGER}");
        sql.SET("item_id = #{record.itemId,jdbcType=INTEGER}");
        sql.SET("item_type = #{record.itemType,jdbcType=BIT}");
        sql.SET("item_name = #{record.itemName,jdbcType=VARCHAR}");
        sql.SET("item_unit_price = #{record.itemUnitPrice,jdbcType=DOUBLE}");
        sql.SET("quantity = #{record.quantity,jdbcType=INTEGER}");
        sql.SET("dept_id = #{record.deptId,jdbcType=INTEGER}");
        sql.SET("prescription_generation_time = #{record.prescriptionGenerationTime,jdbcType=TIMESTAMP}");
        sql.SET("generator_id = #{record.generatorId,jdbcType=INTEGER}");
        sql.SET("payment_operation_time = #{record.paymentOperationTime,jdbcType=TIMESTAMP}");
        sql.SET("operator_id = #{record.operatorId,jdbcType=INTEGER}");
        sql.SET("method = #{record.method,jdbcType=VARCHAR}");
        sql.SET("related_refund_id = #{record.relatedRefundId,jdbcType=INTEGER}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        
        PaymentDtlExample example = (PaymentDtlExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PaymentDtl record) {
        SQL sql = new SQL();
        sql.UPDATE("payment_dtl");
        
        if (record.getRegId() != null) {
            sql.SET("reg_id = #{regId,jdbcType=INTEGER}");
        }
        
        if (record.getInvoiceNo() != null) {
            sql.SET("invoice_no = #{invoiceNo,jdbcType=INTEGER}");
        }
        
        if (record.getItemId() != null) {
            sql.SET("item_id = #{itemId,jdbcType=INTEGER}");
        }
        
        if (record.getItemType() != null) {
            sql.SET("item_type = #{itemType,jdbcType=BIT}");
        }
        
        if (record.getItemName() != null) {
            sql.SET("item_name = #{itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getItemUnitPrice() != null) {
            sql.SET("item_unit_price = #{itemUnitPrice,jdbcType=DOUBLE}");
        }
        
        if (record.getQuantity() != null) {
            sql.SET("quantity = #{quantity,jdbcType=INTEGER}");
        }
        
        if (record.getDeptId() != null) {
            sql.SET("dept_id = #{deptId,jdbcType=INTEGER}");
        }
        
        if (record.getPrescriptionGenerationTime() != null) {
            sql.SET("prescription_generation_time = #{prescriptionGenerationTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGeneratorId() != null) {
            sql.SET("generator_id = #{generatorId,jdbcType=INTEGER}");
        }
        
        if (record.getPaymentOperationTime() != null) {
            sql.SET("payment_operation_time = #{paymentOperationTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperatorId() != null) {
            sql.SET("operator_id = #{operatorId,jdbcType=INTEGER}");
        }
        
        if (record.getMethod() != null) {
            sql.SET("method = #{method,jdbcType=VARCHAR}");
        }
        
        if (record.getRelatedRefundId() != null) {
            sql.SET("related_refund_id = #{relatedRefundId,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{isDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PaymentDtlExample example, boolean includeExamplePhrase) {
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
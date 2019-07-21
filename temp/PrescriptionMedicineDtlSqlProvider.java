package com.neu.his.Dao;

import com.neu.his.entity.PrescriptionMedicineDtl;
import com.neu.his.entity.PrescriptionMedicineDtlExample.Criteria;
import com.neu.his.entity.PrescriptionMedicineDtlExample.Criterion;
import com.neu.his.entity.PrescriptionMedicineDtlExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PrescriptionMedicineDtlSqlProvider {

    public String countByExample(PrescriptionMedicineDtlExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("prescription_medicine_dtl");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PrescriptionMedicineDtlExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("prescription_medicine_dtl");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PrescriptionMedicineDtl record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("prescription_medicine_dtl");
        
        if (record.getPrescriptionId() != null) {
            sql.VALUES("prescription_id", "#{prescriptionId,jdbcType=INTEGER}");
        }
        
        if (record.getMedicineId() != null) {
            sql.VALUES("medicine_id", "#{medicineId,jdbcType=INTEGER}");
        }
        
        if (record.getMethod() != null) {
            sql.VALUES("method", "#{method,jdbcType=VARCHAR}");
        }
        
        if (record.getDosage() != null) {
            sql.VALUES("dosage", "#{dosage,jdbcType=VARCHAR}");
        }
        
        if (record.getFrequency() != null) {
            sql.VALUES("frequency", "#{frequency,jdbcType=VARCHAR}");
        }
        
        if (record.getQuantity() != null) {
            sql.VALUES("quantity", "#{quantity,jdbcType=INTEGER}");
        }
        
        if (record.getPrescriptionStatus() != null) {
            sql.VALUES("prescription_status", "#{prescriptionStatus,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.VALUES("is_deleted", "#{isDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(PrescriptionMedicineDtlExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("prescription_id");
        sql.SELECT("medicine_id");
        sql.SELECT("method");
        sql.SELECT("dosage");
        sql.SELECT("frequency");
        sql.SELECT("quantity");
        sql.SELECT("prescription_status");
        sql.SELECT("is_deleted");
        sql.FROM("prescription_medicine_dtl");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PrescriptionMedicineDtl record = (PrescriptionMedicineDtl) parameter.get("record");
        PrescriptionMedicineDtlExample example = (PrescriptionMedicineDtlExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("prescription_medicine_dtl");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getPrescriptionId() != null) {
            sql.SET("prescription_id = #{record.prescriptionId,jdbcType=INTEGER}");
        }
        
        if (record.getMedicineId() != null) {
            sql.SET("medicine_id = #{record.medicineId,jdbcType=INTEGER}");
        }
        
        if (record.getMethod() != null) {
            sql.SET("method = #{record.method,jdbcType=VARCHAR}");
        }
        
        if (record.getDosage() != null) {
            sql.SET("dosage = #{record.dosage,jdbcType=VARCHAR}");
        }
        
        if (record.getFrequency() != null) {
            sql.SET("frequency = #{record.frequency,jdbcType=VARCHAR}");
        }
        
        if (record.getQuantity() != null) {
            sql.SET("quantity = #{record.quantity,jdbcType=INTEGER}");
        }
        
        if (record.getPrescriptionStatus() != null) {
            sql.SET("prescription_status = #{record.prescriptionStatus,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("prescription_medicine_dtl");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("prescription_id = #{record.prescriptionId,jdbcType=INTEGER}");
        sql.SET("medicine_id = #{record.medicineId,jdbcType=INTEGER}");
        sql.SET("method = #{record.method,jdbcType=VARCHAR}");
        sql.SET("dosage = #{record.dosage,jdbcType=VARCHAR}");
        sql.SET("frequency = #{record.frequency,jdbcType=VARCHAR}");
        sql.SET("quantity = #{record.quantity,jdbcType=INTEGER}");
        sql.SET("prescription_status = #{record.prescriptionStatus,jdbcType=INTEGER}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        
        PrescriptionMedicineDtlExample example = (PrescriptionMedicineDtlExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PrescriptionMedicineDtl record) {
        SQL sql = new SQL();
        sql.UPDATE("prescription_medicine_dtl");
        
        if (record.getPrescriptionId() != null) {
            sql.SET("prescription_id = #{prescriptionId,jdbcType=INTEGER}");
        }
        
        if (record.getMedicineId() != null) {
            sql.SET("medicine_id = #{medicineId,jdbcType=INTEGER}");
        }
        
        if (record.getMethod() != null) {
            sql.SET("method = #{method,jdbcType=VARCHAR}");
        }
        
        if (record.getDosage() != null) {
            sql.SET("dosage = #{dosage,jdbcType=VARCHAR}");
        }
        
        if (record.getFrequency() != null) {
            sql.SET("frequency = #{frequency,jdbcType=VARCHAR}");
        }
        
        if (record.getQuantity() != null) {
            sql.SET("quantity = #{quantity,jdbcType=INTEGER}");
        }
        
        if (record.getPrescriptionStatus() != null) {
            sql.SET("prescription_status = #{prescriptionStatus,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{isDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PrescriptionMedicineDtlExample example, boolean includeExamplePhrase) {
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
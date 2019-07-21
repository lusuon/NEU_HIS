package com.neu.his.Dao;

import com.neu.his.entity.PrescriptionHerb;
import com.neu.his.entity.PrescriptionHerbExample.Criteria;
import com.neu.his.entity.PrescriptionHerbExample.Criterion;
import com.neu.his.entity.PrescriptionHerbExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PrescriptionHerbSqlProvider {

    public String countByExample(PrescriptionHerbExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("prescription_herb");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PrescriptionHerbExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("prescription_herb");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PrescriptionHerb record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("prescription_herb");
        
        if (record.getCaseId() != null) {
            sql.VALUES("case_id", "#{caseId,jdbcType=INTEGER}");
        }
        
        if (record.getRegId() != null) {
            sql.VALUES("reg_id", "#{regId,jdbcType=INTEGER}");
        }
        
        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=INTEGER}");
        }
        
        if (record.getPrescriptionName() != null) {
            sql.VALUES("prescription_name", "#{prescriptionName,jdbcType=VARCHAR}");
        }
        
        if (record.getGenerateTime() != null) {
            sql.VALUES("generate_time", "#{generateTime,jdbcType=DATE}");
        }
        
        if (record.getPrescriptionType() != null) {
            sql.VALUES("prescription_type", "#{prescriptionType,jdbcType=VARCHAR}");
        }
        
        if (record.getQuantity() != null) {
            sql.VALUES("quantity", "#{quantity,jdbcType=INTEGER}");
        }
        
        if (record.getFrequency() != null) {
            sql.VALUES("frequency", "#{frequency,jdbcType=VARCHAR}");
        }
        
        if (record.getMethod() != null) {
            sql.VALUES("method", "#{method,jdbcType=VARCHAR}");
        }
        
        if (record.getTreatment() != null) {
            sql.VALUES("treatment", "#{treatment,jdbcType=VARCHAR}");
        }
        
        if (record.getTreatmentDetail() != null) {
            sql.VALUES("treatment_detail", "#{treatmentDetail,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorAdvice() != null) {
            sql.VALUES("doctor_advice", "#{doctorAdvice,jdbcType=VARCHAR}");
        }
        
        if (record.getPrescriptionStatus() != null) {
            sql.VALUES("prescription_status", "#{prescriptionStatus,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.VALUES("is_deleted", "#{isDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(PrescriptionHerbExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("case_id");
        sql.SELECT("reg_id");
        sql.SELECT("doctor_id");
        sql.SELECT("prescription_name");
        sql.SELECT("generate_time");
        sql.SELECT("prescription_type");
        sql.SELECT("quantity");
        sql.SELECT("frequency");
        sql.SELECT("method");
        sql.SELECT("treatment");
        sql.SELECT("treatment_detail");
        sql.SELECT("doctor_advice");
        sql.SELECT("prescription_status");
        sql.SELECT("is_deleted");
        sql.FROM("prescription_herb");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PrescriptionHerb record = (PrescriptionHerb) parameter.get("record");
        PrescriptionHerbExample example = (PrescriptionHerbExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("prescription_herb");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getCaseId() != null) {
            sql.SET("case_id = #{record.caseId,jdbcType=INTEGER}");
        }
        
        if (record.getRegId() != null) {
            sql.SET("reg_id = #{record.regId,jdbcType=INTEGER}");
        }
        
        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{record.doctorId,jdbcType=INTEGER}");
        }
        
        if (record.getPrescriptionName() != null) {
            sql.SET("prescription_name = #{record.prescriptionName,jdbcType=VARCHAR}");
        }
        
        if (record.getGenerateTime() != null) {
            sql.SET("generate_time = #{record.generateTime,jdbcType=DATE}");
        }
        
        if (record.getPrescriptionType() != null) {
            sql.SET("prescription_type = #{record.prescriptionType,jdbcType=VARCHAR}");
        }
        
        if (record.getQuantity() != null) {
            sql.SET("quantity = #{record.quantity,jdbcType=INTEGER}");
        }
        
        if (record.getFrequency() != null) {
            sql.SET("frequency = #{record.frequency,jdbcType=VARCHAR}");
        }
        
        if (record.getMethod() != null) {
            sql.SET("method = #{record.method,jdbcType=VARCHAR}");
        }
        
        if (record.getTreatment() != null) {
            sql.SET("treatment = #{record.treatment,jdbcType=VARCHAR}");
        }
        
        if (record.getTreatmentDetail() != null) {
            sql.SET("treatment_detail = #{record.treatmentDetail,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorAdvice() != null) {
            sql.SET("doctor_advice = #{record.doctorAdvice,jdbcType=VARCHAR}");
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
        sql.UPDATE("prescription_herb");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("case_id = #{record.caseId,jdbcType=INTEGER}");
        sql.SET("reg_id = #{record.regId,jdbcType=INTEGER}");
        sql.SET("doctor_id = #{record.doctorId,jdbcType=INTEGER}");
        sql.SET("prescription_name = #{record.prescriptionName,jdbcType=VARCHAR}");
        sql.SET("generate_time = #{record.generateTime,jdbcType=DATE}");
        sql.SET("prescription_type = #{record.prescriptionType,jdbcType=VARCHAR}");
        sql.SET("quantity = #{record.quantity,jdbcType=INTEGER}");
        sql.SET("frequency = #{record.frequency,jdbcType=VARCHAR}");
        sql.SET("method = #{record.method,jdbcType=VARCHAR}");
        sql.SET("treatment = #{record.treatment,jdbcType=VARCHAR}");
        sql.SET("treatment_detail = #{record.treatmentDetail,jdbcType=VARCHAR}");
        sql.SET("doctor_advice = #{record.doctorAdvice,jdbcType=VARCHAR}");
        sql.SET("prescription_status = #{record.prescriptionStatus,jdbcType=INTEGER}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        
        PrescriptionHerbExample example = (PrescriptionHerbExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PrescriptionHerb record) {
        SQL sql = new SQL();
        sql.UPDATE("prescription_herb");
        
        if (record.getCaseId() != null) {
            sql.SET("case_id = #{caseId,jdbcType=INTEGER}");
        }
        
        if (record.getRegId() != null) {
            sql.SET("reg_id = #{regId,jdbcType=INTEGER}");
        }
        
        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=INTEGER}");
        }
        
        if (record.getPrescriptionName() != null) {
            sql.SET("prescription_name = #{prescriptionName,jdbcType=VARCHAR}");
        }
        
        if (record.getGenerateTime() != null) {
            sql.SET("generate_time = #{generateTime,jdbcType=DATE}");
        }
        
        if (record.getPrescriptionType() != null) {
            sql.SET("prescription_type = #{prescriptionType,jdbcType=VARCHAR}");
        }
        
        if (record.getQuantity() != null) {
            sql.SET("quantity = #{quantity,jdbcType=INTEGER}");
        }
        
        if (record.getFrequency() != null) {
            sql.SET("frequency = #{frequency,jdbcType=VARCHAR}");
        }
        
        if (record.getMethod() != null) {
            sql.SET("method = #{method,jdbcType=VARCHAR}");
        }
        
        if (record.getTreatment() != null) {
            sql.SET("treatment = #{treatment,jdbcType=VARCHAR}");
        }
        
        if (record.getTreatmentDetail() != null) {
            sql.SET("treatment_detail = #{treatmentDetail,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorAdvice() != null) {
            sql.SET("doctor_advice = #{doctorAdvice,jdbcType=VARCHAR}");
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

    protected void applyWhere(SQL sql, PrescriptionHerbExample example, boolean includeExamplePhrase) {
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
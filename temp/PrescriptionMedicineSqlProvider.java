package com.neu.his.Dao;

import com.neu.his.entity.PrescriptionMedicine;
import com.neu.his.entity.PrescriptionMedicineExample.Criteria;
import com.neu.his.entity.PrescriptionMedicineExample.Criterion;
import com.neu.his.entity.PrescriptionMedicineExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class PrescriptionMedicineSqlProvider {

    public String countByExample(PrescriptionMedicineExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("prescription_medicine");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(PrescriptionMedicineExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("prescription_medicine");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(PrescriptionMedicine record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("prescription_medicine");
        
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
        
        if (record.getPrescriptionStatus() != null) {
            sql.VALUES("prescription_status", "#{prescriptionStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.VALUES("is_deleted", "#{isDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(PrescriptionMedicineExample example) {
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
        sql.SELECT("prescription_status");
        sql.SELECT("is_deleted");
        sql.FROM("prescription_medicine");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        PrescriptionMedicine record = (PrescriptionMedicine) parameter.get("record");
        PrescriptionMedicineExample example = (PrescriptionMedicineExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("prescription_medicine");
        
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
        
        if (record.getPrescriptionStatus() != null) {
            sql.SET("prescription_status = #{record.prescriptionStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("prescription_medicine");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("case_id = #{record.caseId,jdbcType=INTEGER}");
        sql.SET("reg_id = #{record.regId,jdbcType=INTEGER}");
        sql.SET("doctor_id = #{record.doctorId,jdbcType=INTEGER}");
        sql.SET("prescription_name = #{record.prescriptionName,jdbcType=VARCHAR}");
        sql.SET("generate_time = #{record.generateTime,jdbcType=DATE}");
        sql.SET("prescription_status = #{record.prescriptionStatus,jdbcType=VARCHAR}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        
        PrescriptionMedicineExample example = (PrescriptionMedicineExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(PrescriptionMedicine record) {
        SQL sql = new SQL();
        sql.UPDATE("prescription_medicine");
        
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
        
        if (record.getPrescriptionStatus() != null) {
            sql.SET("prescription_status = #{prescriptionStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{isDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, PrescriptionMedicineExample example, boolean includeExamplePhrase) {
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
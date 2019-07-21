package com.neu.his.Dao;

import com.neu.his.entity.NonDrugApplication;
import com.neu.his.entity.NonDrugApplicationExample.Criteria;
import com.neu.his.entity.NonDrugApplicationExample.Criterion;
import com.neu.his.entity.NonDrugApplicationExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class NonDrugApplicationSqlProvider {

    public String countByExample(NonDrugApplicationExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("non_drug_application");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(NonDrugApplicationExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("non_drug_application");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(NonDrugApplication record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("non_drug_application");
        
        if (record.getCaseId() != null) {
            sql.VALUES("case_id", "#{caseId,jdbcType=INTEGER}");
        }
        
        if (record.getRegId() != null) {
            sql.VALUES("reg_id", "#{regId,jdbcType=INTEGER}");
        }
        
        if (record.getItemId() != null) {
            sql.VALUES("item_id", "#{itemId,jdbcType=INTEGER}");
        }
        
        if (record.getItemName() != null) {
            sql.VALUES("item_name", "#{itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getRequirement() != null) {
            sql.VALUES("requirement", "#{requirement,jdbcType=VARCHAR}");
        }
        
        if (record.getCheckPart() != null) {
            sql.VALUES("check_part", "#{checkPart,jdbcType=VARCHAR}");
        }
        
        if (record.getIsUrgent() != null) {
            sql.VALUES("is_urgent", "#{isUrgent,jdbcType=BIT}");
        }
        
        if (record.getNum() != null) {
            sql.VALUES("num", "#{num,jdbcType=INTEGER}");
        }
        
        if (record.getGenerateTime() != null) {
            sql.VALUES("generate_time", "#{generateTime,jdbcType=DATE}");
        }
        
        if (record.getGenerateDoctorId() != null) {
            sql.VALUES("generate_doctor_id", "#{generateDoctorId,jdbcType=INTEGER}");
        }
        
        if (record.getCheckerId() != null) {
            sql.VALUES("checker_id", "#{checkerId,jdbcType=INTEGER}");
        }
        
        if (record.getRecorderId() != null) {
            sql.VALUES("recorder_id", "#{recorderId,jdbcType=INTEGER}");
        }
        
        if (record.getCheckTime() != null) {
            sql.VALUES("check_time", "#{checkTime,jdbcType=DATE}");
        }
        
        if (record.getCheckResult() != null) {
            sql.VALUES("check_result", "#{checkResult,jdbcType=VARCHAR}");
        }
        
        if (record.getResultTime() != null) {
            sql.VALUES("result_time", "#{resultTime,jdbcType=DATE}");
        }
        
        if (record.getApplicationStatus() != null) {
            sql.VALUES("application_status", "#{applicationStatus,jdbcType=INTEGER}");
        }
        
        if (record.getRecordCategory() != null) {
            sql.VALUES("record_category", "#{recordCategory,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.VALUES("is_deleted", "#{isDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(NonDrugApplicationExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("case_id");
        sql.SELECT("reg_id");
        sql.SELECT("item_id");
        sql.SELECT("item_name");
        sql.SELECT("requirement");
        sql.SELECT("check_part");
        sql.SELECT("is_urgent");
        sql.SELECT("num");
        sql.SELECT("generate_time");
        sql.SELECT("generate_doctor_id");
        sql.SELECT("checker_id");
        sql.SELECT("recorder_id");
        sql.SELECT("check_time");
        sql.SELECT("check_result");
        sql.SELECT("result_time");
        sql.SELECT("application_status");
        sql.SELECT("record_category");
        sql.SELECT("is_deleted");
        sql.FROM("non_drug_application");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        NonDrugApplication record = (NonDrugApplication) parameter.get("record");
        NonDrugApplicationExample example = (NonDrugApplicationExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("non_drug_application");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getCaseId() != null) {
            sql.SET("case_id = #{record.caseId,jdbcType=INTEGER}");
        }
        
        if (record.getRegId() != null) {
            sql.SET("reg_id = #{record.regId,jdbcType=INTEGER}");
        }
        
        if (record.getItemId() != null) {
            sql.SET("item_id = #{record.itemId,jdbcType=INTEGER}");
        }
        
        if (record.getItemName() != null) {
            sql.SET("item_name = #{record.itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getRequirement() != null) {
            sql.SET("requirement = #{record.requirement,jdbcType=VARCHAR}");
        }
        
        if (record.getCheckPart() != null) {
            sql.SET("check_part = #{record.checkPart,jdbcType=VARCHAR}");
        }
        
        if (record.getIsUrgent() != null) {
            sql.SET("is_urgent = #{record.isUrgent,jdbcType=BIT}");
        }
        
        if (record.getNum() != null) {
            sql.SET("num = #{record.num,jdbcType=INTEGER}");
        }
        
        if (record.getGenerateTime() != null) {
            sql.SET("generate_time = #{record.generateTime,jdbcType=DATE}");
        }
        
        if (record.getGenerateDoctorId() != null) {
            sql.SET("generate_doctor_id = #{record.generateDoctorId,jdbcType=INTEGER}");
        }
        
        if (record.getCheckerId() != null) {
            sql.SET("checker_id = #{record.checkerId,jdbcType=INTEGER}");
        }
        
        if (record.getRecorderId() != null) {
            sql.SET("recorder_id = #{record.recorderId,jdbcType=INTEGER}");
        }
        
        if (record.getCheckTime() != null) {
            sql.SET("check_time = #{record.checkTime,jdbcType=DATE}");
        }
        
        if (record.getCheckResult() != null) {
            sql.SET("check_result = #{record.checkResult,jdbcType=VARCHAR}");
        }
        
        if (record.getResultTime() != null) {
            sql.SET("result_time = #{record.resultTime,jdbcType=DATE}");
        }
        
        if (record.getApplicationStatus() != null) {
            sql.SET("application_status = #{record.applicationStatus,jdbcType=INTEGER}");
        }
        
        if (record.getRecordCategory() != null) {
            sql.SET("record_category = #{record.recordCategory,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("non_drug_application");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("case_id = #{record.caseId,jdbcType=INTEGER}");
        sql.SET("reg_id = #{record.regId,jdbcType=INTEGER}");
        sql.SET("item_id = #{record.itemId,jdbcType=INTEGER}");
        sql.SET("item_name = #{record.itemName,jdbcType=VARCHAR}");
        sql.SET("requirement = #{record.requirement,jdbcType=VARCHAR}");
        sql.SET("check_part = #{record.checkPart,jdbcType=VARCHAR}");
        sql.SET("is_urgent = #{record.isUrgent,jdbcType=BIT}");
        sql.SET("num = #{record.num,jdbcType=INTEGER}");
        sql.SET("generate_time = #{record.generateTime,jdbcType=DATE}");
        sql.SET("generate_doctor_id = #{record.generateDoctorId,jdbcType=INTEGER}");
        sql.SET("checker_id = #{record.checkerId,jdbcType=INTEGER}");
        sql.SET("recorder_id = #{record.recorderId,jdbcType=INTEGER}");
        sql.SET("check_time = #{record.checkTime,jdbcType=DATE}");
        sql.SET("check_result = #{record.checkResult,jdbcType=VARCHAR}");
        sql.SET("result_time = #{record.resultTime,jdbcType=DATE}");
        sql.SET("application_status = #{record.applicationStatus,jdbcType=INTEGER}");
        sql.SET("record_category = #{record.recordCategory,jdbcType=INTEGER}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        
        NonDrugApplicationExample example = (NonDrugApplicationExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(NonDrugApplication record) {
        SQL sql = new SQL();
        sql.UPDATE("non_drug_application");
        
        if (record.getCaseId() != null) {
            sql.SET("case_id = #{caseId,jdbcType=INTEGER}");
        }
        
        if (record.getRegId() != null) {
            sql.SET("reg_id = #{regId,jdbcType=INTEGER}");
        }
        
        if (record.getItemId() != null) {
            sql.SET("item_id = #{itemId,jdbcType=INTEGER}");
        }
        
        if (record.getItemName() != null) {
            sql.SET("item_name = #{itemName,jdbcType=VARCHAR}");
        }
        
        if (record.getRequirement() != null) {
            sql.SET("requirement = #{requirement,jdbcType=VARCHAR}");
        }
        
        if (record.getCheckPart() != null) {
            sql.SET("check_part = #{checkPart,jdbcType=VARCHAR}");
        }
        
        if (record.getIsUrgent() != null) {
            sql.SET("is_urgent = #{isUrgent,jdbcType=BIT}");
        }
        
        if (record.getNum() != null) {
            sql.SET("num = #{num,jdbcType=INTEGER}");
        }
        
        if (record.getGenerateTime() != null) {
            sql.SET("generate_time = #{generateTime,jdbcType=DATE}");
        }
        
        if (record.getGenerateDoctorId() != null) {
            sql.SET("generate_doctor_id = #{generateDoctorId,jdbcType=INTEGER}");
        }
        
        if (record.getCheckerId() != null) {
            sql.SET("checker_id = #{checkerId,jdbcType=INTEGER}");
        }
        
        if (record.getRecorderId() != null) {
            sql.SET("recorder_id = #{recorderId,jdbcType=INTEGER}");
        }
        
        if (record.getCheckTime() != null) {
            sql.SET("check_time = #{checkTime,jdbcType=DATE}");
        }
        
        if (record.getCheckResult() != null) {
            sql.SET("check_result = #{checkResult,jdbcType=VARCHAR}");
        }
        
        if (record.getResultTime() != null) {
            sql.SET("result_time = #{resultTime,jdbcType=DATE}");
        }
        
        if (record.getApplicationStatus() != null) {
            sql.SET("application_status = #{applicationStatus,jdbcType=INTEGER}");
        }
        
        if (record.getRecordCategory() != null) {
            sql.SET("record_category = #{recordCategory,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{isDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, NonDrugApplicationExample example, boolean includeExamplePhrase) {
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
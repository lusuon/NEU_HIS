package com.neu.his.Dao;

import com.neu.his.entity.Case;
import com.neu.his.entity.CaseExample.Criteria;
import com.neu.his.entity.CaseExample.Criterion;
import com.neu.his.entity.CaseExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class CaseSqlProvider {

    public String countByExample(CaseExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("case");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CaseExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("case");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Case record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("case");
        
        if (record.getCaseNo() != null) {
            sql.VALUES("case_no", "#{caseNo,jdbcType=INTEGER}");
        }
        
        if (record.getRegId() != null) {
            sql.VALUES("reg_id", "#{regId,jdbcType=INTEGER}");
        }
        
        if (record.getSymptom() != null) {
            sql.VALUES("symptom", "#{symptom,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentMediHistory() != null) {
            sql.VALUES("current_medi_history", "#{currentMediHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentDiseaseTreatment() != null) {
            sql.VALUES("current_disease_treatment", "#{currentDiseaseTreatment,jdbcType=VARCHAR}");
        }
        
        if (record.getMediHistory() != null) {
            sql.VALUES("medi_history", "#{mediHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getAllergy() != null) {
            sql.VALUES("allergy", "#{allergy,jdbcType=VARCHAR}");
        }
        
        if (record.getBodyInspection() != null) {
            sql.VALUES("body_inspection", "#{bodyInspection,jdbcType=VARCHAR}");
        }
        
        if (record.getSuggestion() != null) {
            sql.VALUES("suggestion", "#{suggestion,jdbcType=VARCHAR}");
        }
        
        if (record.getAttention() != null) {
            sql.VALUES("attention", "#{attention,jdbcType=VARCHAR}");
        }
        
        if (record.getInspectionResult() != null) {
            sql.VALUES("inspection_result", "#{inspectionResult,jdbcType=VARCHAR}");
        }
        
        if (record.getDiagnoseResult() != null) {
            sql.VALUES("diagnose_result", "#{diagnoseResult,jdbcType=VARCHAR}");
        }
        
        if (record.getAdvise() != null) {
            sql.VALUES("advise", "#{advise,jdbcType=VARCHAR}");
        }
        
        if (record.getCaseStatus() != null) {
            sql.VALUES("case_status", "#{caseStatus,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.VALUES("is_deleted", "#{isDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(CaseExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("case_no");
        sql.SELECT("reg_id");
        sql.SELECT("symptom");
        sql.SELECT("current_medi_history");
        sql.SELECT("current_disease_treatment");
        sql.SELECT("medi_history");
        sql.SELECT("allergy");
        sql.SELECT("body_inspection");
        sql.SELECT("suggestion");
        sql.SELECT("attention");
        sql.SELECT("inspection_result");
        sql.SELECT("diagnose_result");
        sql.SELECT("advise");
        sql.SELECT("case_status");
        sql.SELECT("is_deleted");
        sql.FROM("case");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Case record = (Case) parameter.get("record");
        CaseExample example = (CaseExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("case");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getCaseNo() != null) {
            sql.SET("case_no = #{record.caseNo,jdbcType=INTEGER}");
        }
        
        if (record.getRegId() != null) {
            sql.SET("reg_id = #{record.regId,jdbcType=INTEGER}");
        }
        
        if (record.getSymptom() != null) {
            sql.SET("symptom = #{record.symptom,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentMediHistory() != null) {
            sql.SET("current_medi_history = #{record.currentMediHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentDiseaseTreatment() != null) {
            sql.SET("current_disease_treatment = #{record.currentDiseaseTreatment,jdbcType=VARCHAR}");
        }
        
        if (record.getMediHistory() != null) {
            sql.SET("medi_history = #{record.mediHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getAllergy() != null) {
            sql.SET("allergy = #{record.allergy,jdbcType=VARCHAR}");
        }
        
        if (record.getBodyInspection() != null) {
            sql.SET("body_inspection = #{record.bodyInspection,jdbcType=VARCHAR}");
        }
        
        if (record.getSuggestion() != null) {
            sql.SET("suggestion = #{record.suggestion,jdbcType=VARCHAR}");
        }
        
        if (record.getAttention() != null) {
            sql.SET("attention = #{record.attention,jdbcType=VARCHAR}");
        }
        
        if (record.getInspectionResult() != null) {
            sql.SET("inspection_result = #{record.inspectionResult,jdbcType=VARCHAR}");
        }
        
        if (record.getDiagnoseResult() != null) {
            sql.SET("diagnose_result = #{record.diagnoseResult,jdbcType=VARCHAR}");
        }
        
        if (record.getAdvise() != null) {
            sql.SET("advise = #{record.advise,jdbcType=VARCHAR}");
        }
        
        if (record.getCaseStatus() != null) {
            sql.SET("case_status = #{record.caseStatus,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("case");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("case_no = #{record.caseNo,jdbcType=INTEGER}");
        sql.SET("reg_id = #{record.regId,jdbcType=INTEGER}");
        sql.SET("symptom = #{record.symptom,jdbcType=VARCHAR}");
        sql.SET("current_medi_history = #{record.currentMediHistory,jdbcType=VARCHAR}");
        sql.SET("current_disease_treatment = #{record.currentDiseaseTreatment,jdbcType=VARCHAR}");
        sql.SET("medi_history = #{record.mediHistory,jdbcType=VARCHAR}");
        sql.SET("allergy = #{record.allergy,jdbcType=VARCHAR}");
        sql.SET("body_inspection = #{record.bodyInspection,jdbcType=VARCHAR}");
        sql.SET("suggestion = #{record.suggestion,jdbcType=VARCHAR}");
        sql.SET("attention = #{record.attention,jdbcType=VARCHAR}");
        sql.SET("inspection_result = #{record.inspectionResult,jdbcType=VARCHAR}");
        sql.SET("diagnose_result = #{record.diagnoseResult,jdbcType=VARCHAR}");
        sql.SET("advise = #{record.advise,jdbcType=VARCHAR}");
        sql.SET("case_status = #{record.caseStatus,jdbcType=INTEGER}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        
        CaseExample example = (CaseExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Case record) {
        SQL sql = new SQL();
        sql.UPDATE("case");
        
        if (record.getCaseNo() != null) {
            sql.SET("case_no = #{caseNo,jdbcType=INTEGER}");
        }
        
        if (record.getRegId() != null) {
            sql.SET("reg_id = #{regId,jdbcType=INTEGER}");
        }
        
        if (record.getSymptom() != null) {
            sql.SET("symptom = #{symptom,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentMediHistory() != null) {
            sql.SET("current_medi_history = #{currentMediHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentDiseaseTreatment() != null) {
            sql.SET("current_disease_treatment = #{currentDiseaseTreatment,jdbcType=VARCHAR}");
        }
        
        if (record.getMediHistory() != null) {
            sql.SET("medi_history = #{mediHistory,jdbcType=VARCHAR}");
        }
        
        if (record.getAllergy() != null) {
            sql.SET("allergy = #{allergy,jdbcType=VARCHAR}");
        }
        
        if (record.getBodyInspection() != null) {
            sql.SET("body_inspection = #{bodyInspection,jdbcType=VARCHAR}");
        }
        
        if (record.getSuggestion() != null) {
            sql.SET("suggestion = #{suggestion,jdbcType=VARCHAR}");
        }
        
        if (record.getAttention() != null) {
            sql.SET("attention = #{attention,jdbcType=VARCHAR}");
        }
        
        if (record.getInspectionResult() != null) {
            sql.SET("inspection_result = #{inspectionResult,jdbcType=VARCHAR}");
        }
        
        if (record.getDiagnoseResult() != null) {
            sql.SET("diagnose_result = #{diagnoseResult,jdbcType=VARCHAR}");
        }
        
        if (record.getAdvise() != null) {
            sql.SET("advise = #{advise,jdbcType=VARCHAR}");
        }
        
        if (record.getCaseStatus() != null) {
            sql.SET("case_status = #{caseStatus,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{isDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CaseExample example, boolean includeExamplePhrase) {
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
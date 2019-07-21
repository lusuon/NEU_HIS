package com.neu.his.Dao;

import com.neu.his.entity.Registration;
import com.neu.his.entity.RegistrationExample.Criteria;
import com.neu.his.entity.RegistrationExample.Criterion;
import com.neu.his.entity.RegistrationExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class RegistrationSqlProvider {

    public String countByExample(RegistrationExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("registration");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(RegistrationExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("registration");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Registration record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("registration");
        
        if (record.getCaseNo() != null) {
            sql.VALUES("case_no", "#{caseNo,jdbcType=INTEGER}");
        }
        
        if (record.getPatientName() != null) {
            sql.VALUES("patient_name", "#{patientName,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=SMALLINT}");
        }
        
        if (record.getPersonalId() != null) {
            sql.VALUES("personal_id", "#{personalId,jdbcType=VARCHAR}");
        }
        
        if (record.getBirthday() != null) {
            sql.VALUES("birthday", "#{birthday,jdbcType=DATE}");
        }
        
        if (record.getAge() != null) {
            sql.VALUES("age", "#{age,jdbcType=INTEGER}");
        }
        
        if (record.getAgeType() != null) {
            sql.VALUES("age_type", "#{ageType,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getSeeDate() != null) {
            sql.VALUES("see_date", "#{seeDate,jdbcType=DATE}");
        }
        
        if (record.getNoon() != null) {
            sql.VALUES("noon", "#{noon,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptId() != null) {
            sql.VALUES("dept_id", "#{deptId,jdbcType=INTEGER}");
        }
        
        if (record.getDoctorId() != null) {
            sql.VALUES("doctor_id", "#{doctorId,jdbcType=INTEGER}");
        }
        
        if (record.getRegLevelId() != null) {
            sql.VALUES("reg_level_id", "#{regLevelId,jdbcType=INTEGER}");
        }
        
        if (record.getSettlementType() != null) {
            sql.VALUES("settlement_type", "#{settlementType,jdbcType=VARCHAR}");
        }
        
        if (record.getNeedCaseBook() != null) {
            sql.VALUES("need_case_book", "#{needCaseBook,jdbcType=BIT}");
        }
        
        if (record.getRegTime() != null) {
            sql.VALUES("reg_time", "#{regTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperator() != null) {
            sql.VALUES("operator", "#{operator,jdbcType=INTEGER}");
        }
        
        if (record.getInspectionStatus() != null) {
            sql.VALUES("inspection_status", "#{inspectionStatus,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.VALUES("is_deleted", "#{isDeleted,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(RegistrationExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("case_no");
        sql.SELECT("patient_name");
        sql.SELECT("sex");
        sql.SELECT("personal_id");
        sql.SELECT("birthday");
        sql.SELECT("age");
        sql.SELECT("age_type");
        sql.SELECT("address");
        sql.SELECT("see_date");
        sql.SELECT("noon");
        sql.SELECT("dept_id");
        sql.SELECT("doctor_id");
        sql.SELECT("reg_level_id");
        sql.SELECT("settlement_type");
        sql.SELECT("need_case_book");
        sql.SELECT("reg_time");
        sql.SELECT("operator");
        sql.SELECT("inspection_status");
        sql.SELECT("is_deleted");
        sql.FROM("registration");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Registration record = (Registration) parameter.get("record");
        RegistrationExample example = (RegistrationExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("registration");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getCaseNo() != null) {
            sql.SET("case_no = #{record.caseNo,jdbcType=INTEGER}");
        }
        
        if (record.getPatientName() != null) {
            sql.SET("patient_name = #{record.patientName,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{record.sex,jdbcType=SMALLINT}");
        }
        
        if (record.getPersonalId() != null) {
            sql.SET("personal_id = #{record.personalId,jdbcType=VARCHAR}");
        }
        
        if (record.getBirthday() != null) {
            sql.SET("birthday = #{record.birthday,jdbcType=DATE}");
        }
        
        if (record.getAge() != null) {
            sql.SET("age = #{record.age,jdbcType=INTEGER}");
        }
        
        if (record.getAgeType() != null) {
            sql.SET("age_type = #{record.ageType,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getSeeDate() != null) {
            sql.SET("see_date = #{record.seeDate,jdbcType=DATE}");
        }
        
        if (record.getNoon() != null) {
            sql.SET("noon = #{record.noon,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptId() != null) {
            sql.SET("dept_id = #{record.deptId,jdbcType=INTEGER}");
        }
        
        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{record.doctorId,jdbcType=INTEGER}");
        }
        
        if (record.getRegLevelId() != null) {
            sql.SET("reg_level_id = #{record.regLevelId,jdbcType=INTEGER}");
        }
        
        if (record.getSettlementType() != null) {
            sql.SET("settlement_type = #{record.settlementType,jdbcType=VARCHAR}");
        }
        
        if (record.getNeedCaseBook() != null) {
            sql.SET("need_case_book = #{record.needCaseBook,jdbcType=BIT}");
        }
        
        if (record.getRegTime() != null) {
            sql.SET("reg_time = #{record.regTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperator() != null) {
            sql.SET("operator = #{record.operator,jdbcType=INTEGER}");
        }
        
        if (record.getInspectionStatus() != null) {
            sql.SET("inspection_status = #{record.inspectionStatus,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("registration");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("case_no = #{record.caseNo,jdbcType=INTEGER}");
        sql.SET("patient_name = #{record.patientName,jdbcType=VARCHAR}");
        sql.SET("sex = #{record.sex,jdbcType=SMALLINT}");
        sql.SET("personal_id = #{record.personalId,jdbcType=VARCHAR}");
        sql.SET("birthday = #{record.birthday,jdbcType=DATE}");
        sql.SET("age = #{record.age,jdbcType=INTEGER}");
        sql.SET("age_type = #{record.ageType,jdbcType=VARCHAR}");
        sql.SET("address = #{record.address,jdbcType=VARCHAR}");
        sql.SET("see_date = #{record.seeDate,jdbcType=DATE}");
        sql.SET("noon = #{record.noon,jdbcType=VARCHAR}");
        sql.SET("dept_id = #{record.deptId,jdbcType=INTEGER}");
        sql.SET("doctor_id = #{record.doctorId,jdbcType=INTEGER}");
        sql.SET("reg_level_id = #{record.regLevelId,jdbcType=INTEGER}");
        sql.SET("settlement_type = #{record.settlementType,jdbcType=VARCHAR}");
        sql.SET("need_case_book = #{record.needCaseBook,jdbcType=BIT}");
        sql.SET("reg_time = #{record.regTime,jdbcType=TIMESTAMP}");
        sql.SET("operator = #{record.operator,jdbcType=INTEGER}");
        sql.SET("inspection_status = #{record.inspectionStatus,jdbcType=INTEGER}");
        sql.SET("is_deleted = #{record.isDeleted,jdbcType=BIT}");
        
        RegistrationExample example = (RegistrationExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Registration record) {
        SQL sql = new SQL();
        sql.UPDATE("registration");
        
        if (record.getCaseNo() != null) {
            sql.SET("case_no = #{caseNo,jdbcType=INTEGER}");
        }
        
        if (record.getPatientName() != null) {
            sql.SET("patient_name = #{patientName,jdbcType=VARCHAR}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{sex,jdbcType=SMALLINT}");
        }
        
        if (record.getPersonalId() != null) {
            sql.SET("personal_id = #{personalId,jdbcType=VARCHAR}");
        }
        
        if (record.getBirthday() != null) {
            sql.SET("birthday = #{birthday,jdbcType=DATE}");
        }
        
        if (record.getAge() != null) {
            sql.SET("age = #{age,jdbcType=INTEGER}");
        }
        
        if (record.getAgeType() != null) {
            sql.SET("age_type = #{ageType,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getSeeDate() != null) {
            sql.SET("see_date = #{seeDate,jdbcType=DATE}");
        }
        
        if (record.getNoon() != null) {
            sql.SET("noon = #{noon,jdbcType=VARCHAR}");
        }
        
        if (record.getDeptId() != null) {
            sql.SET("dept_id = #{deptId,jdbcType=INTEGER}");
        }
        
        if (record.getDoctorId() != null) {
            sql.SET("doctor_id = #{doctorId,jdbcType=INTEGER}");
        }
        
        if (record.getRegLevelId() != null) {
            sql.SET("reg_level_id = #{regLevelId,jdbcType=INTEGER}");
        }
        
        if (record.getSettlementType() != null) {
            sql.SET("settlement_type = #{settlementType,jdbcType=VARCHAR}");
        }
        
        if (record.getNeedCaseBook() != null) {
            sql.SET("need_case_book = #{needCaseBook,jdbcType=BIT}");
        }
        
        if (record.getRegTime() != null) {
            sql.SET("reg_time = #{regTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOperator() != null) {
            sql.SET("operator = #{operator,jdbcType=INTEGER}");
        }
        
        if (record.getInspectionStatus() != null) {
            sql.SET("inspection_status = #{inspectionStatus,jdbcType=INTEGER}");
        }
        
        if (record.getIsDeleted() != null) {
            sql.SET("is_deleted = #{isDeleted,jdbcType=BIT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, RegistrationExample example, boolean includeExamplePhrase) {
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
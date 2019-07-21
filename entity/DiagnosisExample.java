package com.neu.his.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiagnosisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiagnosisExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNull() {
            addCriterion("case_id is null");
            return (Criteria) this;
        }

        public Criteria andCaseIdIsNotNull() {
            addCriterion("case_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaseIdEqualTo(Integer value) {
            addCriterion("case_id =", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotEqualTo(Integer value) {
            addCriterion("case_id <>", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThan(Integer value) {
            addCriterion("case_id >", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_id >=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThan(Integer value) {
            addCriterion("case_id <", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("case_id <=", value, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdIn(List<Integer> values) {
            addCriterion("case_id in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotIn(List<Integer> values) {
            addCriterion("case_id not in", values, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdBetween(Integer value1, Integer value2) {
            addCriterion("case_id between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andCaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("case_id not between", value1, value2, "caseId");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNull() {
            addCriterion("reg_id is null");
            return (Criteria) this;
        }

        public Criteria andRegIdIsNotNull() {
            addCriterion("reg_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegIdEqualTo(Integer value) {
            addCriterion("reg_id =", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotEqualTo(Integer value) {
            addCriterion("reg_id <>", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThan(Integer value) {
            addCriterion("reg_id >", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_id >=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThan(Integer value) {
            addCriterion("reg_id <", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdLessThanOrEqualTo(Integer value) {
            addCriterion("reg_id <=", value, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdIn(List<Integer> values) {
            addCriterion("reg_id in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotIn(List<Integer> values) {
            addCriterion("reg_id not in", values, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdBetween(Integer value1, Integer value2) {
            addCriterion("reg_id between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andRegIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_id not between", value1, value2, "regId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIsNull() {
            addCriterion("disease_id is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIsNotNull() {
            addCriterion("disease_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdEqualTo(Integer value) {
            addCriterion("disease_id =", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotEqualTo(Integer value) {
            addCriterion("disease_id <>", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdGreaterThan(Integer value) {
            addCriterion("disease_id >", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("disease_id >=", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdLessThan(Integer value) {
            addCriterion("disease_id <", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("disease_id <=", value, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdIn(List<Integer> values) {
            addCriterion("disease_id in", values, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotIn(List<Integer> values) {
            addCriterion("disease_id not in", values, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdBetween(Integer value1, Integer value2) {
            addCriterion("disease_id between", value1, value2, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiseaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("disease_id not between", value1, value2, "diseaseId");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTypeIsNull() {
            addCriterion("diagnosis_type is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTypeIsNotNull() {
            addCriterion("diagnosis_type is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTypeEqualTo(Boolean value) {
            addCriterion("diagnosis_type =", value, "diagnosisType");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTypeNotEqualTo(Boolean value) {
            addCriterion("diagnosis_type <>", value, "diagnosisType");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTypeGreaterThan(Boolean value) {
            addCriterion("diagnosis_type >", value, "diagnosisType");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("diagnosis_type >=", value, "diagnosisType");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTypeLessThan(Boolean value) {
            addCriterion("diagnosis_type <", value, "diagnosisType");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("diagnosis_type <=", value, "diagnosisType");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTypeIn(List<Boolean> values) {
            addCriterion("diagnosis_type in", values, "diagnosisType");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTypeNotIn(List<Boolean> values) {
            addCriterion("diagnosis_type not in", values, "diagnosisType");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("diagnosis_type between", value1, value2, "diagnosisType");
            return (Criteria) this;
        }

        public Criteria andDiagnosisTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("diagnosis_type not between", value1, value2, "diagnosisType");
            return (Criteria) this;
        }

        public Criteria andOnsetTimeIsNull() {
            addCriterion("onset_time is null");
            return (Criteria) this;
        }

        public Criteria andOnsetTimeIsNotNull() {
            addCriterion("onset_time is not null");
            return (Criteria) this;
        }

        public Criteria andOnsetTimeEqualTo(Date value) {
            addCriterion("onset_time =", value, "onsetTime");
            return (Criteria) this;
        }

        public Criteria andOnsetTimeNotEqualTo(Date value) {
            addCriterion("onset_time <>", value, "onsetTime");
            return (Criteria) this;
        }

        public Criteria andOnsetTimeGreaterThan(Date value) {
            addCriterion("onset_time >", value, "onsetTime");
            return (Criteria) this;
        }

        public Criteria andOnsetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("onset_time >=", value, "onsetTime");
            return (Criteria) this;
        }

        public Criteria andOnsetTimeLessThan(Date value) {
            addCriterion("onset_time <", value, "onsetTime");
            return (Criteria) this;
        }

        public Criteria andOnsetTimeLessThanOrEqualTo(Date value) {
            addCriterion("onset_time <=", value, "onsetTime");
            return (Criteria) this;
        }

        public Criteria andOnsetTimeIn(List<Date> values) {
            addCriterion("onset_time in", values, "onsetTime");
            return (Criteria) this;
        }

        public Criteria andOnsetTimeNotIn(List<Date> values) {
            addCriterion("onset_time not in", values, "onsetTime");
            return (Criteria) this;
        }

        public Criteria andOnsetTimeBetween(Date value1, Date value2) {
            addCriterion("onset_time between", value1, value2, "onsetTime");
            return (Criteria) this;
        }

        public Criteria andOnsetTimeNotBetween(Date value1, Date value2) {
            addCriterion("onset_time not between", value1, value2, "onsetTime");
            return (Criteria) this;
        }

        public Criteria andDiagnosisClassIsNull() {
            addCriterion("diagnosis_class is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisClassIsNotNull() {
            addCriterion("diagnosis_class is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisClassEqualTo(Boolean value) {
            addCriterion("diagnosis_class =", value, "diagnosisClass");
            return (Criteria) this;
        }

        public Criteria andDiagnosisClassNotEqualTo(Boolean value) {
            addCriterion("diagnosis_class <>", value, "diagnosisClass");
            return (Criteria) this;
        }

        public Criteria andDiagnosisClassGreaterThan(Boolean value) {
            addCriterion("diagnosis_class >", value, "diagnosisClass");
            return (Criteria) this;
        }

        public Criteria andDiagnosisClassGreaterThanOrEqualTo(Boolean value) {
            addCriterion("diagnosis_class >=", value, "diagnosisClass");
            return (Criteria) this;
        }

        public Criteria andDiagnosisClassLessThan(Boolean value) {
            addCriterion("diagnosis_class <", value, "diagnosisClass");
            return (Criteria) this;
        }

        public Criteria andDiagnosisClassLessThanOrEqualTo(Boolean value) {
            addCriterion("diagnosis_class <=", value, "diagnosisClass");
            return (Criteria) this;
        }

        public Criteria andDiagnosisClassIn(List<Boolean> values) {
            addCriterion("diagnosis_class in", values, "diagnosisClass");
            return (Criteria) this;
        }

        public Criteria andDiagnosisClassNotIn(List<Boolean> values) {
            addCriterion("diagnosis_class not in", values, "diagnosisClass");
            return (Criteria) this;
        }

        public Criteria andDiagnosisClassBetween(Boolean value1, Boolean value2) {
            addCriterion("diagnosis_class between", value1, value2, "diagnosisClass");
            return (Criteria) this;
        }

        public Criteria andDiagnosisClassNotBetween(Boolean value1, Boolean value2) {
            addCriterion("diagnosis_class not between", value1, value2, "diagnosisClass");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table diagnosis
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andIsDeletedEqualTo(Diagnosis.DELETED) : andIsDeletedNotEqualTo(Diagnosis.DELETED);
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
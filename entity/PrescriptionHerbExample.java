package com.neu.his.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PrescriptionHerbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrescriptionHerbExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Integer value) {
            addCriterion("doctor_id =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Integer value) {
            addCriterion("doctor_id <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Integer value) {
            addCriterion("doctor_id >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_id >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Integer value) {
            addCriterion("doctor_id <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_id <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Integer> values) {
            addCriterion("doctor_id in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Integer> values) {
            addCriterion("doctor_id not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNameIsNull() {
            addCriterion("prescription_name is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNameIsNotNull() {
            addCriterion("prescription_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNameEqualTo(String value) {
            addCriterion("prescription_name =", value, "prescriptionName");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNameNotEqualTo(String value) {
            addCriterion("prescription_name <>", value, "prescriptionName");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNameGreaterThan(String value) {
            addCriterion("prescription_name >", value, "prescriptionName");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNameGreaterThanOrEqualTo(String value) {
            addCriterion("prescription_name >=", value, "prescriptionName");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNameLessThan(String value) {
            addCriterion("prescription_name <", value, "prescriptionName");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNameLessThanOrEqualTo(String value) {
            addCriterion("prescription_name <=", value, "prescriptionName");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNameLike(String value) {
            addCriterion("prescription_name like", value, "prescriptionName");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNameNotLike(String value) {
            addCriterion("prescription_name not like", value, "prescriptionName");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNameIn(List<String> values) {
            addCriterion("prescription_name in", values, "prescriptionName");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNameNotIn(List<String> values) {
            addCriterion("prescription_name not in", values, "prescriptionName");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNameBetween(String value1, String value2) {
            addCriterion("prescription_name between", value1, value2, "prescriptionName");
            return (Criteria) this;
        }

        public Criteria andPrescriptionNameNotBetween(String value1, String value2) {
            addCriterion("prescription_name not between", value1, value2, "prescriptionName");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeIsNull() {
            addCriterion("generate_time is null");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeIsNotNull() {
            addCriterion("generate_time is not null");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("generate_time =", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("generate_time <>", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("generate_time >", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("generate_time >=", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeLessThan(Date value) {
            addCriterionForJDBCDate("generate_time <", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("generate_time <=", value, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("generate_time in", values, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("generate_time not in", values, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("generate_time between", value1, value2, "generateTime");
            return (Criteria) this;
        }

        public Criteria andGenerateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("generate_time not between", value1, value2, "generateTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIsNull() {
            addCriterion("prescription_type is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIsNotNull() {
            addCriterion("prescription_type is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeEqualTo(String value) {
            addCriterion("prescription_type =", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeNotEqualTo(String value) {
            addCriterion("prescription_type <>", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeGreaterThan(String value) {
            addCriterion("prescription_type >", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("prescription_type >=", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeLessThan(String value) {
            addCriterion("prescription_type <", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeLessThanOrEqualTo(String value) {
            addCriterion("prescription_type <=", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeLike(String value) {
            addCriterion("prescription_type like", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeNotLike(String value) {
            addCriterion("prescription_type not like", value, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeIn(List<String> values) {
            addCriterion("prescription_type in", values, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeNotIn(List<String> values) {
            addCriterion("prescription_type not in", values, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeBetween(String value1, String value2) {
            addCriterion("prescription_type between", value1, value2, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeNotBetween(String value1, String value2) {
            addCriterion("prescription_type not between", value1, value2, "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(String value) {
            addCriterion("frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(String value) {
            addCriterion("frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(String value) {
            addCriterion("frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(String value) {
            addCriterion("frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(String value) {
            addCriterion("frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLike(String value) {
            addCriterion("frequency like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotLike(String value) {
            addCriterion("frequency not like", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<String> values) {
            addCriterion("frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<String> values) {
            addCriterion("frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(String value1, String value2) {
            addCriterion("frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(String value1, String value2) {
            addCriterion("frequency not between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("method not between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andTreatmentIsNull() {
            addCriterion("treatment is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentIsNotNull() {
            addCriterion("treatment is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentEqualTo(String value) {
            addCriterion("treatment =", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotEqualTo(String value) {
            addCriterion("treatment <>", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentGreaterThan(String value) {
            addCriterion("treatment >", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentGreaterThanOrEqualTo(String value) {
            addCriterion("treatment >=", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLessThan(String value) {
            addCriterion("treatment <", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLessThanOrEqualTo(String value) {
            addCriterion("treatment <=", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentLike(String value) {
            addCriterion("treatment like", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotLike(String value) {
            addCriterion("treatment not like", value, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentIn(List<String> values) {
            addCriterion("treatment in", values, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotIn(List<String> values) {
            addCriterion("treatment not in", values, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentBetween(String value1, String value2) {
            addCriterion("treatment between", value1, value2, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentNotBetween(String value1, String value2) {
            addCriterion("treatment not between", value1, value2, "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentDetailIsNull() {
            addCriterion("treatment_detail is null");
            return (Criteria) this;
        }

        public Criteria andTreatmentDetailIsNotNull() {
            addCriterion("treatment_detail is not null");
            return (Criteria) this;
        }

        public Criteria andTreatmentDetailEqualTo(String value) {
            addCriterion("treatment_detail =", value, "treatmentDetail");
            return (Criteria) this;
        }

        public Criteria andTreatmentDetailNotEqualTo(String value) {
            addCriterion("treatment_detail <>", value, "treatmentDetail");
            return (Criteria) this;
        }

        public Criteria andTreatmentDetailGreaterThan(String value) {
            addCriterion("treatment_detail >", value, "treatmentDetail");
            return (Criteria) this;
        }

        public Criteria andTreatmentDetailGreaterThanOrEqualTo(String value) {
            addCriterion("treatment_detail >=", value, "treatmentDetail");
            return (Criteria) this;
        }

        public Criteria andTreatmentDetailLessThan(String value) {
            addCriterion("treatment_detail <", value, "treatmentDetail");
            return (Criteria) this;
        }

        public Criteria andTreatmentDetailLessThanOrEqualTo(String value) {
            addCriterion("treatment_detail <=", value, "treatmentDetail");
            return (Criteria) this;
        }

        public Criteria andTreatmentDetailLike(String value) {
            addCriterion("treatment_detail like", value, "treatmentDetail");
            return (Criteria) this;
        }

        public Criteria andTreatmentDetailNotLike(String value) {
            addCriterion("treatment_detail not like", value, "treatmentDetail");
            return (Criteria) this;
        }

        public Criteria andTreatmentDetailIn(List<String> values) {
            addCriterion("treatment_detail in", values, "treatmentDetail");
            return (Criteria) this;
        }

        public Criteria andTreatmentDetailNotIn(List<String> values) {
            addCriterion("treatment_detail not in", values, "treatmentDetail");
            return (Criteria) this;
        }

        public Criteria andTreatmentDetailBetween(String value1, String value2) {
            addCriterion("treatment_detail between", value1, value2, "treatmentDetail");
            return (Criteria) this;
        }

        public Criteria andTreatmentDetailNotBetween(String value1, String value2) {
            addCriterion("treatment_detail not between", value1, value2, "treatmentDetail");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceIsNull() {
            addCriterion("doctor_advice is null");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceIsNotNull() {
            addCriterion("doctor_advice is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceEqualTo(String value) {
            addCriterion("doctor_advice =", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotEqualTo(String value) {
            addCriterion("doctor_advice <>", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceGreaterThan(String value) {
            addCriterion("doctor_advice >", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_advice >=", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceLessThan(String value) {
            addCriterion("doctor_advice <", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceLessThanOrEqualTo(String value) {
            addCriterion("doctor_advice <=", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceLike(String value) {
            addCriterion("doctor_advice like", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotLike(String value) {
            addCriterion("doctor_advice not like", value, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceIn(List<String> values) {
            addCriterion("doctor_advice in", values, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotIn(List<String> values) {
            addCriterion("doctor_advice not in", values, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceBetween(String value1, String value2) {
            addCriterion("doctor_advice between", value1, value2, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceNotBetween(String value1, String value2) {
            addCriterion("doctor_advice not between", value1, value2, "doctorAdvice");
            return (Criteria) this;
        }

        public Criteria andPrescriptionStatusIsNull() {
            addCriterion("prescription_status is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionStatusIsNotNull() {
            addCriterion("prescription_status is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionStatusEqualTo(Integer value) {
            addCriterion("prescription_status =", value, "prescriptionStatus");
            return (Criteria) this;
        }

        public Criteria andPrescriptionStatusNotEqualTo(Integer value) {
            addCriterion("prescription_status <>", value, "prescriptionStatus");
            return (Criteria) this;
        }

        public Criteria andPrescriptionStatusGreaterThan(Integer value) {
            addCriterion("prescription_status >", value, "prescriptionStatus");
            return (Criteria) this;
        }

        public Criteria andPrescriptionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("prescription_status >=", value, "prescriptionStatus");
            return (Criteria) this;
        }

        public Criteria andPrescriptionStatusLessThan(Integer value) {
            addCriterion("prescription_status <", value, "prescriptionStatus");
            return (Criteria) this;
        }

        public Criteria andPrescriptionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("prescription_status <=", value, "prescriptionStatus");
            return (Criteria) this;
        }

        public Criteria andPrescriptionStatusIn(List<Integer> values) {
            addCriterion("prescription_status in", values, "prescriptionStatus");
            return (Criteria) this;
        }

        public Criteria andPrescriptionStatusNotIn(List<Integer> values) {
            addCriterion("prescription_status not in", values, "prescriptionStatus");
            return (Criteria) this;
        }

        public Criteria andPrescriptionStatusBetween(Integer value1, Integer value2) {
            addCriterion("prescription_status between", value1, value2, "prescriptionStatus");
            return (Criteria) this;
        }

        public Criteria andPrescriptionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("prescription_status not between", value1, value2, "prescriptionStatus");
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

        public Criteria andPrescriptionNameLikeInsensitive(String value) {
            addCriterion("upper(prescription_name) like", value.toUpperCase(), "prescriptionName");
            return (Criteria) this;
        }

        public Criteria andPrescriptionTypeLikeInsensitive(String value) {
            addCriterion("upper(prescription_type) like", value.toUpperCase(), "prescriptionType");
            return (Criteria) this;
        }

        public Criteria andFrequencyLikeInsensitive(String value) {
            addCriterion("upper(frequency) like", value.toUpperCase(), "frequency");
            return (Criteria) this;
        }

        public Criteria andMethodLikeInsensitive(String value) {
            addCriterion("upper(method) like", value.toUpperCase(), "method");
            return (Criteria) this;
        }

        public Criteria andTreatmentLikeInsensitive(String value) {
            addCriterion("upper(treatment) like", value.toUpperCase(), "treatment");
            return (Criteria) this;
        }

        public Criteria andTreatmentDetailLikeInsensitive(String value) {
            addCriterion("upper(treatment_detail) like", value.toUpperCase(), "treatmentDetail");
            return (Criteria) this;
        }

        public Criteria andDoctorAdviceLikeInsensitive(String value) {
            addCriterion("upper(doctor_advice) like", value.toUpperCase(), "doctorAdvice");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table prescription_herb
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andIsDeletedEqualTo(PrescriptionHerb.DELETED) : andIsDeletedNotEqualTo(PrescriptionHerb.DELETED);
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
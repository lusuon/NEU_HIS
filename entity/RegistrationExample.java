package com.neu.his.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RegistrationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegistrationExample() {
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

        public Criteria andCaseNoIsNull() {
            addCriterion("case_no is null");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNotNull() {
            addCriterion("case_no is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNoEqualTo(Integer value) {
            addCriterion("case_no =", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotEqualTo(Integer value) {
            addCriterion("case_no <>", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThan(Integer value) {
            addCriterion("case_no >", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_no >=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThan(Integer value) {
            addCriterion("case_no <", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThanOrEqualTo(Integer value) {
            addCriterion("case_no <=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoIn(List<Integer> values) {
            addCriterion("case_no in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotIn(List<Integer> values) {
            addCriterion("case_no not in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoBetween(Integer value1, Integer value2) {
            addCriterion("case_no between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotBetween(Integer value1, Integer value2) {
            addCriterion("case_no not between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("patient_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("patient_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("patient_name =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("patient_name <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("patient_name >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_name >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("patient_name <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("patient_name <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("patient_name like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("patient_name not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("patient_name in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("patient_name not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("patient_name between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("patient_name not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Short value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Short value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Short value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Short value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Short value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Short value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Short> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Short> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Short value1, Short value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Short value1, Short value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPersonalIdIsNull() {
            addCriterion("personal_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonalIdIsNotNull() {
            addCriterion("personal_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalIdEqualTo(String value) {
            addCriterion("personal_id =", value, "personalId");
            return (Criteria) this;
        }

        public Criteria andPersonalIdNotEqualTo(String value) {
            addCriterion("personal_id <>", value, "personalId");
            return (Criteria) this;
        }

        public Criteria andPersonalIdGreaterThan(String value) {
            addCriterion("personal_id >", value, "personalId");
            return (Criteria) this;
        }

        public Criteria andPersonalIdGreaterThanOrEqualTo(String value) {
            addCriterion("personal_id >=", value, "personalId");
            return (Criteria) this;
        }

        public Criteria andPersonalIdLessThan(String value) {
            addCriterion("personal_id <", value, "personalId");
            return (Criteria) this;
        }

        public Criteria andPersonalIdLessThanOrEqualTo(String value) {
            addCriterion("personal_id <=", value, "personalId");
            return (Criteria) this;
        }

        public Criteria andPersonalIdLike(String value) {
            addCriterion("personal_id like", value, "personalId");
            return (Criteria) this;
        }

        public Criteria andPersonalIdNotLike(String value) {
            addCriterion("personal_id not like", value, "personalId");
            return (Criteria) this;
        }

        public Criteria andPersonalIdIn(List<String> values) {
            addCriterion("personal_id in", values, "personalId");
            return (Criteria) this;
        }

        public Criteria andPersonalIdNotIn(List<String> values) {
            addCriterion("personal_id not in", values, "personalId");
            return (Criteria) this;
        }

        public Criteria andPersonalIdBetween(String value1, String value2) {
            addCriterion("personal_id between", value1, value2, "personalId");
            return (Criteria) this;
        }

        public Criteria andPersonalIdNotBetween(String value1, String value2) {
            addCriterion("personal_id not between", value1, value2, "personalId");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeTypeIsNull() {
            addCriterion("age_type is null");
            return (Criteria) this;
        }

        public Criteria andAgeTypeIsNotNull() {
            addCriterion("age_type is not null");
            return (Criteria) this;
        }

        public Criteria andAgeTypeEqualTo(String value) {
            addCriterion("age_type =", value, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeNotEqualTo(String value) {
            addCriterion("age_type <>", value, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeGreaterThan(String value) {
            addCriterion("age_type >", value, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("age_type >=", value, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeLessThan(String value) {
            addCriterion("age_type <", value, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeLessThanOrEqualTo(String value) {
            addCriterion("age_type <=", value, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeLike(String value) {
            addCriterion("age_type like", value, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeNotLike(String value) {
            addCriterion("age_type not like", value, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeIn(List<String> values) {
            addCriterion("age_type in", values, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeNotIn(List<String> values) {
            addCriterion("age_type not in", values, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeBetween(String value1, String value2) {
            addCriterion("age_type between", value1, value2, "ageType");
            return (Criteria) this;
        }

        public Criteria andAgeTypeNotBetween(String value1, String value2) {
            addCriterion("age_type not between", value1, value2, "ageType");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andSeeDateIsNull() {
            addCriterion("see_date is null");
            return (Criteria) this;
        }

        public Criteria andSeeDateIsNotNull() {
            addCriterion("see_date is not null");
            return (Criteria) this;
        }

        public Criteria andSeeDateEqualTo(Date value) {
            addCriterionForJDBCDate("see_date =", value, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("see_date <>", value, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("see_date >", value, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("see_date >=", value, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateLessThan(Date value) {
            addCriterionForJDBCDate("see_date <", value, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("see_date <=", value, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateIn(List<Date> values) {
            addCriterionForJDBCDate("see_date in", values, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("see_date not in", values, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("see_date between", value1, value2, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("see_date not between", value1, value2, "seeDate");
            return (Criteria) this;
        }

        public Criteria andNoonIsNull() {
            addCriterion("noon is null");
            return (Criteria) this;
        }

        public Criteria andNoonIsNotNull() {
            addCriterion("noon is not null");
            return (Criteria) this;
        }

        public Criteria andNoonEqualTo(String value) {
            addCriterion("noon =", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotEqualTo(String value) {
            addCriterion("noon <>", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonGreaterThan(String value) {
            addCriterion("noon >", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonGreaterThanOrEqualTo(String value) {
            addCriterion("noon >=", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLessThan(String value) {
            addCriterion("noon <", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLessThanOrEqualTo(String value) {
            addCriterion("noon <=", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLike(String value) {
            addCriterion("noon like", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotLike(String value) {
            addCriterion("noon not like", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonIn(List<String> values) {
            addCriterion("noon in", values, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotIn(List<String> values) {
            addCriterion("noon not in", values, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonBetween(String value1, String value2) {
            addCriterion("noon between", value1, value2, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotBetween(String value1, String value2) {
            addCriterion("noon not between", value1, value2, "noon");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("dept_id =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("dept_id <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("dept_id in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "deptId");
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

        public Criteria andRegLevelIdIsNull() {
            addCriterion("reg_level_id is null");
            return (Criteria) this;
        }

        public Criteria andRegLevelIdIsNotNull() {
            addCriterion("reg_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegLevelIdEqualTo(Integer value) {
            addCriterion("reg_level_id =", value, "regLevelId");
            return (Criteria) this;
        }

        public Criteria andRegLevelIdNotEqualTo(Integer value) {
            addCriterion("reg_level_id <>", value, "regLevelId");
            return (Criteria) this;
        }

        public Criteria andRegLevelIdGreaterThan(Integer value) {
            addCriterion("reg_level_id >", value, "regLevelId");
            return (Criteria) this;
        }

        public Criteria andRegLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_level_id >=", value, "regLevelId");
            return (Criteria) this;
        }

        public Criteria andRegLevelIdLessThan(Integer value) {
            addCriterion("reg_level_id <", value, "regLevelId");
            return (Criteria) this;
        }

        public Criteria andRegLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("reg_level_id <=", value, "regLevelId");
            return (Criteria) this;
        }

        public Criteria andRegLevelIdIn(List<Integer> values) {
            addCriterion("reg_level_id in", values, "regLevelId");
            return (Criteria) this;
        }

        public Criteria andRegLevelIdNotIn(List<Integer> values) {
            addCriterion("reg_level_id not in", values, "regLevelId");
            return (Criteria) this;
        }

        public Criteria andRegLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("reg_level_id between", value1, value2, "regLevelId");
            return (Criteria) this;
        }

        public Criteria andRegLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_level_id not between", value1, value2, "regLevelId");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIsNull() {
            addCriterion("settlement_type is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIsNotNull() {
            addCriterion("settlement_type is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeEqualTo(String value) {
            addCriterion("settlement_type =", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotEqualTo(String value) {
            addCriterion("settlement_type <>", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeGreaterThan(String value) {
            addCriterion("settlement_type >", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_type >=", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLessThan(String value) {
            addCriterion("settlement_type <", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLessThanOrEqualTo(String value) {
            addCriterion("settlement_type <=", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLike(String value) {
            addCriterion("settlement_type like", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotLike(String value) {
            addCriterion("settlement_type not like", value, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeIn(List<String> values) {
            addCriterion("settlement_type in", values, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotIn(List<String> values) {
            addCriterion("settlement_type not in", values, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeBetween(String value1, String value2) {
            addCriterion("settlement_type between", value1, value2, "settlementType");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeNotBetween(String value1, String value2) {
            addCriterion("settlement_type not between", value1, value2, "settlementType");
            return (Criteria) this;
        }

        public Criteria andNeedCaseBookIsNull() {
            addCriterion("need_case_book is null");
            return (Criteria) this;
        }

        public Criteria andNeedCaseBookIsNotNull() {
            addCriterion("need_case_book is not null");
            return (Criteria) this;
        }

        public Criteria andNeedCaseBookEqualTo(Boolean value) {
            addCriterion("need_case_book =", value, "needCaseBook");
            return (Criteria) this;
        }

        public Criteria andNeedCaseBookNotEqualTo(Boolean value) {
            addCriterion("need_case_book <>", value, "needCaseBook");
            return (Criteria) this;
        }

        public Criteria andNeedCaseBookGreaterThan(Boolean value) {
            addCriterion("need_case_book >", value, "needCaseBook");
            return (Criteria) this;
        }

        public Criteria andNeedCaseBookGreaterThanOrEqualTo(Boolean value) {
            addCriterion("need_case_book >=", value, "needCaseBook");
            return (Criteria) this;
        }

        public Criteria andNeedCaseBookLessThan(Boolean value) {
            addCriterion("need_case_book <", value, "needCaseBook");
            return (Criteria) this;
        }

        public Criteria andNeedCaseBookLessThanOrEqualTo(Boolean value) {
            addCriterion("need_case_book <=", value, "needCaseBook");
            return (Criteria) this;
        }

        public Criteria andNeedCaseBookIn(List<Boolean> values) {
            addCriterion("need_case_book in", values, "needCaseBook");
            return (Criteria) this;
        }

        public Criteria andNeedCaseBookNotIn(List<Boolean> values) {
            addCriterion("need_case_book not in", values, "needCaseBook");
            return (Criteria) this;
        }

        public Criteria andNeedCaseBookBetween(Boolean value1, Boolean value2) {
            addCriterion("need_case_book between", value1, value2, "needCaseBook");
            return (Criteria) this;
        }

        public Criteria andNeedCaseBookNotBetween(Boolean value1, Boolean value2) {
            addCriterion("need_case_book not between", value1, value2, "needCaseBook");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNull() {
            addCriterion("reg_time is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Date value) {
            addCriterion("reg_time =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Date value) {
            addCriterion("reg_time <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Date value) {
            addCriterion("reg_time >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_time >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Date value) {
            addCriterion("reg_time <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Date value) {
            addCriterion("reg_time <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Date> values) {
            addCriterion("reg_time in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Date> values) {
            addCriterion("reg_time not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Date value1, Date value2) {
            addCriterion("reg_time between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Date value1, Date value2) {
            addCriterion("reg_time not between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(Integer value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(Integer value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(Integer value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(Integer value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<Integer> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<Integer> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(Integer value1, Integer value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusIsNull() {
            addCriterion("inspection_status is null");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusIsNotNull() {
            addCriterion("inspection_status is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusEqualTo(Integer value) {
            addCriterion("inspection_status =", value, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusNotEqualTo(Integer value) {
            addCriterion("inspection_status <>", value, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusGreaterThan(Integer value) {
            addCriterion("inspection_status >", value, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspection_status >=", value, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusLessThan(Integer value) {
            addCriterion("inspection_status <", value, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("inspection_status <=", value, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusIn(List<Integer> values) {
            addCriterion("inspection_status in", values, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusNotIn(List<Integer> values) {
            addCriterion("inspection_status not in", values, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusBetween(Integer value1, Integer value2) {
            addCriterion("inspection_status between", value1, value2, "inspectionStatus");
            return (Criteria) this;
        }

        public Criteria andInspectionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("inspection_status not between", value1, value2, "inspectionStatus");
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

        public Criteria andPatientNameLikeInsensitive(String value) {
            addCriterion("upper(patient_name) like", value.toUpperCase(), "patientName");
            return (Criteria) this;
        }

        public Criteria andPersonalIdLikeInsensitive(String value) {
            addCriterion("upper(personal_id) like", value.toUpperCase(), "personalId");
            return (Criteria) this;
        }

        public Criteria andAgeTypeLikeInsensitive(String value) {
            addCriterion("upper(age_type) like", value.toUpperCase(), "ageType");
            return (Criteria) this;
        }

        public Criteria andAddressLikeInsensitive(String value) {
            addCriterion("upper(address) like", value.toUpperCase(), "address");
            return (Criteria) this;
        }

        public Criteria andNoonLikeInsensitive(String value) {
            addCriterion("upper(noon) like", value.toUpperCase(), "noon");
            return (Criteria) this;
        }

        public Criteria andSettlementTypeLikeInsensitive(String value) {
            addCriterion("upper(settlement_type) like", value.toUpperCase(), "settlementType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table registration
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andIsDeletedEqualTo(Registration.DELETED) : andIsDeletedNotEqualTo(Registration.DELETED);
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
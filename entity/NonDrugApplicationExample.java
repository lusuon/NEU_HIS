package com.neu.his.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NonDrugApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NonDrugApplicationExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andRequirementIsNull() {
            addCriterion("requirement is null");
            return (Criteria) this;
        }

        public Criteria andRequirementIsNotNull() {
            addCriterion("requirement is not null");
            return (Criteria) this;
        }

        public Criteria andRequirementEqualTo(String value) {
            addCriterion("requirement =", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotEqualTo(String value) {
            addCriterion("requirement <>", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThan(String value) {
            addCriterion("requirement >", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("requirement >=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThan(String value) {
            addCriterion("requirement <", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLessThanOrEqualTo(String value) {
            addCriterion("requirement <=", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementLike(String value) {
            addCriterion("requirement like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotLike(String value) {
            addCriterion("requirement not like", value, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementIn(List<String> values) {
            addCriterion("requirement in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotIn(List<String> values) {
            addCriterion("requirement not in", values, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementBetween(String value1, String value2) {
            addCriterion("requirement between", value1, value2, "requirement");
            return (Criteria) this;
        }

        public Criteria andRequirementNotBetween(String value1, String value2) {
            addCriterion("requirement not between", value1, value2, "requirement");
            return (Criteria) this;
        }

        public Criteria andCheckPartIsNull() {
            addCriterion("check_part is null");
            return (Criteria) this;
        }

        public Criteria andCheckPartIsNotNull() {
            addCriterion("check_part is not null");
            return (Criteria) this;
        }

        public Criteria andCheckPartEqualTo(String value) {
            addCriterion("check_part =", value, "checkPart");
            return (Criteria) this;
        }

        public Criteria andCheckPartNotEqualTo(String value) {
            addCriterion("check_part <>", value, "checkPart");
            return (Criteria) this;
        }

        public Criteria andCheckPartGreaterThan(String value) {
            addCriterion("check_part >", value, "checkPart");
            return (Criteria) this;
        }

        public Criteria andCheckPartGreaterThanOrEqualTo(String value) {
            addCriterion("check_part >=", value, "checkPart");
            return (Criteria) this;
        }

        public Criteria andCheckPartLessThan(String value) {
            addCriterion("check_part <", value, "checkPart");
            return (Criteria) this;
        }

        public Criteria andCheckPartLessThanOrEqualTo(String value) {
            addCriterion("check_part <=", value, "checkPart");
            return (Criteria) this;
        }

        public Criteria andCheckPartLike(String value) {
            addCriterion("check_part like", value, "checkPart");
            return (Criteria) this;
        }

        public Criteria andCheckPartNotLike(String value) {
            addCriterion("check_part not like", value, "checkPart");
            return (Criteria) this;
        }

        public Criteria andCheckPartIn(List<String> values) {
            addCriterion("check_part in", values, "checkPart");
            return (Criteria) this;
        }

        public Criteria andCheckPartNotIn(List<String> values) {
            addCriterion("check_part not in", values, "checkPart");
            return (Criteria) this;
        }

        public Criteria andCheckPartBetween(String value1, String value2) {
            addCriterion("check_part between", value1, value2, "checkPart");
            return (Criteria) this;
        }

        public Criteria andCheckPartNotBetween(String value1, String value2) {
            addCriterion("check_part not between", value1, value2, "checkPart");
            return (Criteria) this;
        }

        public Criteria andIsUrgentIsNull() {
            addCriterion("is_urgent is null");
            return (Criteria) this;
        }

        public Criteria andIsUrgentIsNotNull() {
            addCriterion("is_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andIsUrgentEqualTo(Boolean value) {
            addCriterion("is_urgent =", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotEqualTo(Boolean value) {
            addCriterion("is_urgent <>", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentGreaterThan(Boolean value) {
            addCriterion("is_urgent >", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_urgent >=", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentLessThan(Boolean value) {
            addCriterion("is_urgent <", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentLessThanOrEqualTo(Boolean value) {
            addCriterion("is_urgent <=", value, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentIn(List<Boolean> values) {
            addCriterion("is_urgent in", values, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotIn(List<Boolean> values) {
            addCriterion("is_urgent not in", values, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentBetween(Boolean value1, Boolean value2) {
            addCriterion("is_urgent between", value1, value2, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andIsUrgentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_urgent not between", value1, value2, "isUrgent");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
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

        public Criteria andGenerateDoctorIdIsNull() {
            addCriterion("generate_doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andGenerateDoctorIdIsNotNull() {
            addCriterion("generate_doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andGenerateDoctorIdEqualTo(Integer value) {
            addCriterion("generate_doctor_id =", value, "generateDoctorId");
            return (Criteria) this;
        }

        public Criteria andGenerateDoctorIdNotEqualTo(Integer value) {
            addCriterion("generate_doctor_id <>", value, "generateDoctorId");
            return (Criteria) this;
        }

        public Criteria andGenerateDoctorIdGreaterThan(Integer value) {
            addCriterion("generate_doctor_id >", value, "generateDoctorId");
            return (Criteria) this;
        }

        public Criteria andGenerateDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("generate_doctor_id >=", value, "generateDoctorId");
            return (Criteria) this;
        }

        public Criteria andGenerateDoctorIdLessThan(Integer value) {
            addCriterion("generate_doctor_id <", value, "generateDoctorId");
            return (Criteria) this;
        }

        public Criteria andGenerateDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("generate_doctor_id <=", value, "generateDoctorId");
            return (Criteria) this;
        }

        public Criteria andGenerateDoctorIdIn(List<Integer> values) {
            addCriterion("generate_doctor_id in", values, "generateDoctorId");
            return (Criteria) this;
        }

        public Criteria andGenerateDoctorIdNotIn(List<Integer> values) {
            addCriterion("generate_doctor_id not in", values, "generateDoctorId");
            return (Criteria) this;
        }

        public Criteria andGenerateDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("generate_doctor_id between", value1, value2, "generateDoctorId");
            return (Criteria) this;
        }

        public Criteria andGenerateDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("generate_doctor_id not between", value1, value2, "generateDoctorId");
            return (Criteria) this;
        }

        public Criteria andCheckerIdIsNull() {
            addCriterion("checker_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIdIsNotNull() {
            addCriterion("checker_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerIdEqualTo(Integer value) {
            addCriterion("checker_id =", value, "checkerId");
            return (Criteria) this;
        }

        public Criteria andCheckerIdNotEqualTo(Integer value) {
            addCriterion("checker_id <>", value, "checkerId");
            return (Criteria) this;
        }

        public Criteria andCheckerIdGreaterThan(Integer value) {
            addCriterion("checker_id >", value, "checkerId");
            return (Criteria) this;
        }

        public Criteria andCheckerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("checker_id >=", value, "checkerId");
            return (Criteria) this;
        }

        public Criteria andCheckerIdLessThan(Integer value) {
            addCriterion("checker_id <", value, "checkerId");
            return (Criteria) this;
        }

        public Criteria andCheckerIdLessThanOrEqualTo(Integer value) {
            addCriterion("checker_id <=", value, "checkerId");
            return (Criteria) this;
        }

        public Criteria andCheckerIdIn(List<Integer> values) {
            addCriterion("checker_id in", values, "checkerId");
            return (Criteria) this;
        }

        public Criteria andCheckerIdNotIn(List<Integer> values) {
            addCriterion("checker_id not in", values, "checkerId");
            return (Criteria) this;
        }

        public Criteria andCheckerIdBetween(Integer value1, Integer value2) {
            addCriterion("checker_id between", value1, value2, "checkerId");
            return (Criteria) this;
        }

        public Criteria andCheckerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("checker_id not between", value1, value2, "checkerId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdIsNull() {
            addCriterion("recorder_id is null");
            return (Criteria) this;
        }

        public Criteria andRecorderIdIsNotNull() {
            addCriterion("recorder_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecorderIdEqualTo(Integer value) {
            addCriterion("recorder_id =", value, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdNotEqualTo(Integer value) {
            addCriterion("recorder_id <>", value, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdGreaterThan(Integer value) {
            addCriterion("recorder_id >", value, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recorder_id >=", value, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdLessThan(Integer value) {
            addCriterion("recorder_id <", value, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdLessThanOrEqualTo(Integer value) {
            addCriterion("recorder_id <=", value, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdIn(List<Integer> values) {
            addCriterion("recorder_id in", values, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdNotIn(List<Integer> values) {
            addCriterion("recorder_id not in", values, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdBetween(Integer value1, Integer value2) {
            addCriterion("recorder_id between", value1, value2, "recorderId");
            return (Criteria) this;
        }

        public Criteria andRecorderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recorder_id not between", value1, value2, "recorderId");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterionForJDBCDate("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterionForJDBCDate("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterionForJDBCDate("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckResultIsNull() {
            addCriterion("check_result is null");
            return (Criteria) this;
        }

        public Criteria andCheckResultIsNotNull() {
            addCriterion("check_result is not null");
            return (Criteria) this;
        }

        public Criteria andCheckResultEqualTo(String value) {
            addCriterion("check_result =", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotEqualTo(String value) {
            addCriterion("check_result <>", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThan(String value) {
            addCriterion("check_result >", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThanOrEqualTo(String value) {
            addCriterion("check_result >=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThan(String value) {
            addCriterion("check_result <", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThanOrEqualTo(String value) {
            addCriterion("check_result <=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLike(String value) {
            addCriterion("check_result like", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotLike(String value) {
            addCriterion("check_result not like", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultIn(List<String> values) {
            addCriterion("check_result in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotIn(List<String> values) {
            addCriterion("check_result not in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultBetween(String value1, String value2) {
            addCriterion("check_result between", value1, value2, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotBetween(String value1, String value2) {
            addCriterion("check_result not between", value1, value2, "checkResult");
            return (Criteria) this;
        }

        public Criteria andResultTimeIsNull() {
            addCriterion("result_time is null");
            return (Criteria) this;
        }

        public Criteria andResultTimeIsNotNull() {
            addCriterion("result_time is not null");
            return (Criteria) this;
        }

        public Criteria andResultTimeEqualTo(Date value) {
            addCriterionForJDBCDate("result_time =", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("result_time <>", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("result_time >", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("result_time >=", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeLessThan(Date value) {
            addCriterionForJDBCDate("result_time <", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("result_time <=", value, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeIn(List<Date> values) {
            addCriterionForJDBCDate("result_time in", values, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("result_time not in", values, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("result_time between", value1, value2, "resultTime");
            return (Criteria) this;
        }

        public Criteria andResultTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("result_time not between", value1, value2, "resultTime");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusIsNull() {
            addCriterion("application_status is null");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusIsNotNull() {
            addCriterion("application_status is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusEqualTo(Integer value) {
            addCriterion("application_status =", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotEqualTo(Integer value) {
            addCriterion("application_status <>", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusGreaterThan(Integer value) {
            addCriterion("application_status >", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("application_status >=", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusLessThan(Integer value) {
            addCriterion("application_status <", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusLessThanOrEqualTo(Integer value) {
            addCriterion("application_status <=", value, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusIn(List<Integer> values) {
            addCriterion("application_status in", values, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotIn(List<Integer> values) {
            addCriterion("application_status not in", values, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusBetween(Integer value1, Integer value2) {
            addCriterion("application_status between", value1, value2, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("application_status not between", value1, value2, "applicationStatus");
            return (Criteria) this;
        }

        public Criteria andRecordCategoryIsNull() {
            addCriterion("record_category is null");
            return (Criteria) this;
        }

        public Criteria andRecordCategoryIsNotNull() {
            addCriterion("record_category is not null");
            return (Criteria) this;
        }

        public Criteria andRecordCategoryEqualTo(Integer value) {
            addCriterion("record_category =", value, "recordCategory");
            return (Criteria) this;
        }

        public Criteria andRecordCategoryNotEqualTo(Integer value) {
            addCriterion("record_category <>", value, "recordCategory");
            return (Criteria) this;
        }

        public Criteria andRecordCategoryGreaterThan(Integer value) {
            addCriterion("record_category >", value, "recordCategory");
            return (Criteria) this;
        }

        public Criteria andRecordCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_category >=", value, "recordCategory");
            return (Criteria) this;
        }

        public Criteria andRecordCategoryLessThan(Integer value) {
            addCriterion("record_category <", value, "recordCategory");
            return (Criteria) this;
        }

        public Criteria andRecordCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("record_category <=", value, "recordCategory");
            return (Criteria) this;
        }

        public Criteria andRecordCategoryIn(List<Integer> values) {
            addCriterion("record_category in", values, "recordCategory");
            return (Criteria) this;
        }

        public Criteria andRecordCategoryNotIn(List<Integer> values) {
            addCriterion("record_category not in", values, "recordCategory");
            return (Criteria) this;
        }

        public Criteria andRecordCategoryBetween(Integer value1, Integer value2) {
            addCriterion("record_category between", value1, value2, "recordCategory");
            return (Criteria) this;
        }

        public Criteria andRecordCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("record_category not between", value1, value2, "recordCategory");
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

        public Criteria andItemNameLikeInsensitive(String value) {
            addCriterion("upper(item_name) like", value.toUpperCase(), "itemName");
            return (Criteria) this;
        }

        public Criteria andRequirementLikeInsensitive(String value) {
            addCriterion("upper(requirement) like", value.toUpperCase(), "requirement");
            return (Criteria) this;
        }

        public Criteria andCheckPartLikeInsensitive(String value) {
            addCriterion("upper(check_part) like", value.toUpperCase(), "checkPart");
            return (Criteria) this;
        }

        public Criteria andCheckResultLikeInsensitive(String value) {
            addCriterion("upper(check_result) like", value.toUpperCase(), "checkResult");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table non_drug_application
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andIsDeletedEqualTo(NonDrugApplication.DELETED) : andIsDeletedNotEqualTo(NonDrugApplication.DELETED);
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
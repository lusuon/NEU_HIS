package org.neu.his.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NonDrugApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setPageInfo(Integer currentPage, Integer pageSize) {
        if(pageSize<1) throw new IllegalArgumentException("页大小不能小于1！");
        this.limit=pageSize;
        if(currentPage<1) throw new IllegalArgumentException("页数不能小于1！");
        this.offset=(currentPage-1)*pageSize;
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

        public Criteria andCase_idIsNull() {
            addCriterion("case_id is null");
            return (Criteria) this;
        }

        public Criteria andCase_idIsNotNull() {
            addCriterion("case_id is not null");
            return (Criteria) this;
        }

        public Criteria andCase_idEqualTo(Integer value) {
            addCriterion("case_id =", value, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idNotEqualTo(Integer value) {
            addCriterion("case_id <>", value, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idGreaterThan(Integer value) {
            addCriterion("case_id >", value, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_id >=", value, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idLessThan(Integer value) {
            addCriterion("case_id <", value, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idLessThanOrEqualTo(Integer value) {
            addCriterion("case_id <=", value, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idIn(List<Integer> values) {
            addCriterion("case_id in", values, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idNotIn(List<Integer> values) {
            addCriterion("case_id not in", values, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idBetween(Integer value1, Integer value2) {
            addCriterion("case_id between", value1, value2, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idNotBetween(Integer value1, Integer value2) {
            addCriterion("case_id not between", value1, value2, "case_id");
            return (Criteria) this;
        }

        public Criteria andReg_idIsNull() {
            addCriterion("reg_id is null");
            return (Criteria) this;
        }

        public Criteria andReg_idIsNotNull() {
            addCriterion("reg_id is not null");
            return (Criteria) this;
        }

        public Criteria andReg_idEqualTo(Integer value) {
            addCriterion("reg_id =", value, "reg_id");
            return (Criteria) this;
        }

        public Criteria andReg_idNotEqualTo(Integer value) {
            addCriterion("reg_id <>", value, "reg_id");
            return (Criteria) this;
        }

        public Criteria andReg_idGreaterThan(Integer value) {
            addCriterion("reg_id >", value, "reg_id");
            return (Criteria) this;
        }

        public Criteria andReg_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_id >=", value, "reg_id");
            return (Criteria) this;
        }

        public Criteria andReg_idLessThan(Integer value) {
            addCriterion("reg_id <", value, "reg_id");
            return (Criteria) this;
        }

        public Criteria andReg_idLessThanOrEqualTo(Integer value) {
            addCriterion("reg_id <=", value, "reg_id");
            return (Criteria) this;
        }

        public Criteria andReg_idIn(List<Integer> values) {
            addCriterion("reg_id in", values, "reg_id");
            return (Criteria) this;
        }

        public Criteria andReg_idNotIn(List<Integer> values) {
            addCriterion("reg_id not in", values, "reg_id");
            return (Criteria) this;
        }

        public Criteria andReg_idBetween(Integer value1, Integer value2) {
            addCriterion("reg_id between", value1, value2, "reg_id");
            return (Criteria) this;
        }

        public Criteria andReg_idNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_id not between", value1, value2, "reg_id");
            return (Criteria) this;
        }

        public Criteria andItem_idIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItem_idIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItem_idEqualTo(Integer value) {
            addCriterion("item_id =", value, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idGreaterThan(Integer value) {
            addCriterion("item_id >", value, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idLessThan(Integer value) {
            addCriterion("item_id <", value, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idIn(List<Integer> values) {
            addCriterion("item_id in", values, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_idNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "item_id");
            return (Criteria) this;
        }

        public Criteria andItem_nameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItem_nameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItem_nameEqualTo(String value) {
            addCriterion("item_name =", value, "item_name");
            return (Criteria) this;
        }

        public Criteria andItem_nameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "item_name");
            return (Criteria) this;
        }

        public Criteria andItem_nameGreaterThan(String value) {
            addCriterion("item_name >", value, "item_name");
            return (Criteria) this;
        }

        public Criteria andItem_nameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "item_name");
            return (Criteria) this;
        }

        public Criteria andItem_nameLessThan(String value) {
            addCriterion("item_name <", value, "item_name");
            return (Criteria) this;
        }

        public Criteria andItem_nameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "item_name");
            return (Criteria) this;
        }

        public Criteria andItem_nameLike(String value) {
            addCriterion("item_name like", value, "item_name");
            return (Criteria) this;
        }

        public Criteria andItem_nameNotLike(String value) {
            addCriterion("item_name not like", value, "item_name");
            return (Criteria) this;
        }

        public Criteria andItem_nameIn(List<String> values) {
            addCriterion("item_name in", values, "item_name");
            return (Criteria) this;
        }

        public Criteria andItem_nameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "item_name");
            return (Criteria) this;
        }

        public Criteria andItem_nameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "item_name");
            return (Criteria) this;
        }

        public Criteria andItem_nameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "item_name");
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

        public Criteria andCheck_partIsNull() {
            addCriterion("check_part is null");
            return (Criteria) this;
        }

        public Criteria andCheck_partIsNotNull() {
            addCriterion("check_part is not null");
            return (Criteria) this;
        }

        public Criteria andCheck_partEqualTo(String value) {
            addCriterion("check_part =", value, "check_part");
            return (Criteria) this;
        }

        public Criteria andCheck_partNotEqualTo(String value) {
            addCriterion("check_part <>", value, "check_part");
            return (Criteria) this;
        }

        public Criteria andCheck_partGreaterThan(String value) {
            addCriterion("check_part >", value, "check_part");
            return (Criteria) this;
        }

        public Criteria andCheck_partGreaterThanOrEqualTo(String value) {
            addCriterion("check_part >=", value, "check_part");
            return (Criteria) this;
        }

        public Criteria andCheck_partLessThan(String value) {
            addCriterion("check_part <", value, "check_part");
            return (Criteria) this;
        }

        public Criteria andCheck_partLessThanOrEqualTo(String value) {
            addCriterion("check_part <=", value, "check_part");
            return (Criteria) this;
        }

        public Criteria andCheck_partLike(String value) {
            addCriterion("check_part like", value, "check_part");
            return (Criteria) this;
        }

        public Criteria andCheck_partNotLike(String value) {
            addCriterion("check_part not like", value, "check_part");
            return (Criteria) this;
        }

        public Criteria andCheck_partIn(List<String> values) {
            addCriterion("check_part in", values, "check_part");
            return (Criteria) this;
        }

        public Criteria andCheck_partNotIn(List<String> values) {
            addCriterion("check_part not in", values, "check_part");
            return (Criteria) this;
        }

        public Criteria andCheck_partBetween(String value1, String value2) {
            addCriterion("check_part between", value1, value2, "check_part");
            return (Criteria) this;
        }

        public Criteria andCheck_partNotBetween(String value1, String value2) {
            addCriterion("check_part not between", value1, value2, "check_part");
            return (Criteria) this;
        }

        public Criteria andIs_urgentIsNull() {
            addCriterion("is_urgent is null");
            return (Criteria) this;
        }

        public Criteria andIs_urgentIsNotNull() {
            addCriterion("is_urgent is not null");
            return (Criteria) this;
        }

        public Criteria andIs_urgentEqualTo(Boolean value) {
            addCriterion("is_urgent =", value, "is_urgent");
            return (Criteria) this;
        }

        public Criteria andIs_urgentNotEqualTo(Boolean value) {
            addCriterion("is_urgent <>", value, "is_urgent");
            return (Criteria) this;
        }

        public Criteria andIs_urgentGreaterThan(Boolean value) {
            addCriterion("is_urgent >", value, "is_urgent");
            return (Criteria) this;
        }

        public Criteria andIs_urgentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_urgent >=", value, "is_urgent");
            return (Criteria) this;
        }

        public Criteria andIs_urgentLessThan(Boolean value) {
            addCriterion("is_urgent <", value, "is_urgent");
            return (Criteria) this;
        }

        public Criteria andIs_urgentLessThanOrEqualTo(Boolean value) {
            addCriterion("is_urgent <=", value, "is_urgent");
            return (Criteria) this;
        }

        public Criteria andIs_urgentIn(List<Boolean> values) {
            addCriterion("is_urgent in", values, "is_urgent");
            return (Criteria) this;
        }

        public Criteria andIs_urgentNotIn(List<Boolean> values) {
            addCriterion("is_urgent not in", values, "is_urgent");
            return (Criteria) this;
        }

        public Criteria andIs_urgentBetween(Boolean value1, Boolean value2) {
            addCriterion("is_urgent between", value1, value2, "is_urgent");
            return (Criteria) this;
        }

        public Criteria andIs_urgentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_urgent not between", value1, value2, "is_urgent");
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

        public Criteria andGenerate_timeIsNull() {
            addCriterion("generate_time is null");
            return (Criteria) this;
        }

        public Criteria andGenerate_timeIsNotNull() {
            addCriterion("generate_time is not null");
            return (Criteria) this;
        }

        public Criteria andGenerate_timeEqualTo(Date value) {
            addCriterionForJDBCDate("generate_time =", value, "generate_time");
            return (Criteria) this;
        }

        public Criteria andGenerate_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("generate_time <>", value, "generate_time");
            return (Criteria) this;
        }

        public Criteria andGenerate_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("generate_time >", value, "generate_time");
            return (Criteria) this;
        }

        public Criteria andGenerate_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("generate_time >=", value, "generate_time");
            return (Criteria) this;
        }

        public Criteria andGenerate_timeLessThan(Date value) {
            addCriterionForJDBCDate("generate_time <", value, "generate_time");
            return (Criteria) this;
        }

        public Criteria andGenerate_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("generate_time <=", value, "generate_time");
            return (Criteria) this;
        }

        public Criteria andGenerate_timeIn(List<Date> values) {
            addCriterionForJDBCDate("generate_time in", values, "generate_time");
            return (Criteria) this;
        }

        public Criteria andGenerate_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("generate_time not in", values, "generate_time");
            return (Criteria) this;
        }

        public Criteria andGenerate_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("generate_time between", value1, value2, "generate_time");
            return (Criteria) this;
        }

        public Criteria andGenerate_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("generate_time not between", value1, value2, "generate_time");
            return (Criteria) this;
        }

        public Criteria andGenerate_doctor_idIsNull() {
            addCriterion("generate_doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andGenerate_doctor_idIsNotNull() {
            addCriterion("generate_doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andGenerate_doctor_idEqualTo(Integer value) {
            addCriterion("generate_doctor_id =", value, "generate_doctor_id");
            return (Criteria) this;
        }

        public Criteria andGenerate_doctor_idNotEqualTo(Integer value) {
            addCriterion("generate_doctor_id <>", value, "generate_doctor_id");
            return (Criteria) this;
        }

        public Criteria andGenerate_doctor_idGreaterThan(Integer value) {
            addCriterion("generate_doctor_id >", value, "generate_doctor_id");
            return (Criteria) this;
        }

        public Criteria andGenerate_doctor_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("generate_doctor_id >=", value, "generate_doctor_id");
            return (Criteria) this;
        }

        public Criteria andGenerate_doctor_idLessThan(Integer value) {
            addCriterion("generate_doctor_id <", value, "generate_doctor_id");
            return (Criteria) this;
        }

        public Criteria andGenerate_doctor_idLessThanOrEqualTo(Integer value) {
            addCriterion("generate_doctor_id <=", value, "generate_doctor_id");
            return (Criteria) this;
        }

        public Criteria andGenerate_doctor_idIn(List<Integer> values) {
            addCriterion("generate_doctor_id in", values, "generate_doctor_id");
            return (Criteria) this;
        }

        public Criteria andGenerate_doctor_idNotIn(List<Integer> values) {
            addCriterion("generate_doctor_id not in", values, "generate_doctor_id");
            return (Criteria) this;
        }

        public Criteria andGenerate_doctor_idBetween(Integer value1, Integer value2) {
            addCriterion("generate_doctor_id between", value1, value2, "generate_doctor_id");
            return (Criteria) this;
        }

        public Criteria andGenerate_doctor_idNotBetween(Integer value1, Integer value2) {
            addCriterion("generate_doctor_id not between", value1, value2, "generate_doctor_id");
            return (Criteria) this;
        }

        public Criteria andChecker_idIsNull() {
            addCriterion("checker_id is null");
            return (Criteria) this;
        }

        public Criteria andChecker_idIsNotNull() {
            addCriterion("checker_id is not null");
            return (Criteria) this;
        }

        public Criteria andChecker_idEqualTo(Integer value) {
            addCriterion("checker_id =", value, "checker_id");
            return (Criteria) this;
        }

        public Criteria andChecker_idNotEqualTo(Integer value) {
            addCriterion("checker_id <>", value, "checker_id");
            return (Criteria) this;
        }

        public Criteria andChecker_idGreaterThan(Integer value) {
            addCriterion("checker_id >", value, "checker_id");
            return (Criteria) this;
        }

        public Criteria andChecker_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("checker_id >=", value, "checker_id");
            return (Criteria) this;
        }

        public Criteria andChecker_idLessThan(Integer value) {
            addCriterion("checker_id <", value, "checker_id");
            return (Criteria) this;
        }

        public Criteria andChecker_idLessThanOrEqualTo(Integer value) {
            addCriterion("checker_id <=", value, "checker_id");
            return (Criteria) this;
        }

        public Criteria andChecker_idIn(List<Integer> values) {
            addCriterion("checker_id in", values, "checker_id");
            return (Criteria) this;
        }

        public Criteria andChecker_idNotIn(List<Integer> values) {
            addCriterion("checker_id not in", values, "checker_id");
            return (Criteria) this;
        }

        public Criteria andChecker_idBetween(Integer value1, Integer value2) {
            addCriterion("checker_id between", value1, value2, "checker_id");
            return (Criteria) this;
        }

        public Criteria andChecker_idNotBetween(Integer value1, Integer value2) {
            addCriterion("checker_id not between", value1, value2, "checker_id");
            return (Criteria) this;
        }

        public Criteria andRecorder_idIsNull() {
            addCriterion("recorder_id is null");
            return (Criteria) this;
        }

        public Criteria andRecorder_idIsNotNull() {
            addCriterion("recorder_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecorder_idEqualTo(Integer value) {
            addCriterion("recorder_id =", value, "recorder_id");
            return (Criteria) this;
        }

        public Criteria andRecorder_idNotEqualTo(Integer value) {
            addCriterion("recorder_id <>", value, "recorder_id");
            return (Criteria) this;
        }

        public Criteria andRecorder_idGreaterThan(Integer value) {
            addCriterion("recorder_id >", value, "recorder_id");
            return (Criteria) this;
        }

        public Criteria andRecorder_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("recorder_id >=", value, "recorder_id");
            return (Criteria) this;
        }

        public Criteria andRecorder_idLessThan(Integer value) {
            addCriterion("recorder_id <", value, "recorder_id");
            return (Criteria) this;
        }

        public Criteria andRecorder_idLessThanOrEqualTo(Integer value) {
            addCriterion("recorder_id <=", value, "recorder_id");
            return (Criteria) this;
        }

        public Criteria andRecorder_idIn(List<Integer> values) {
            addCriterion("recorder_id in", values, "recorder_id");
            return (Criteria) this;
        }

        public Criteria andRecorder_idNotIn(List<Integer> values) {
            addCriterion("recorder_id not in", values, "recorder_id");
            return (Criteria) this;
        }

        public Criteria andRecorder_idBetween(Integer value1, Integer value2) {
            addCriterion("recorder_id between", value1, value2, "recorder_id");
            return (Criteria) this;
        }

        public Criteria andRecorder_idNotBetween(Integer value1, Integer value2) {
            addCriterion("recorder_id not between", value1, value2, "recorder_id");
            return (Criteria) this;
        }

        public Criteria andCheck_timeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheck_timeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheck_timeEqualTo(Date value) {
            addCriterionForJDBCDate("check_time =", value, "check_time");
            return (Criteria) this;
        }

        public Criteria andCheck_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("check_time <>", value, "check_time");
            return (Criteria) this;
        }

        public Criteria andCheck_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("check_time >", value, "check_time");
            return (Criteria) this;
        }

        public Criteria andCheck_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_time >=", value, "check_time");
            return (Criteria) this;
        }

        public Criteria andCheck_timeLessThan(Date value) {
            addCriterionForJDBCDate("check_time <", value, "check_time");
            return (Criteria) this;
        }

        public Criteria andCheck_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_time <=", value, "check_time");
            return (Criteria) this;
        }

        public Criteria andCheck_timeIn(List<Date> values) {
            addCriterionForJDBCDate("check_time in", values, "check_time");
            return (Criteria) this;
        }

        public Criteria andCheck_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("check_time not in", values, "check_time");
            return (Criteria) this;
        }

        public Criteria andCheck_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_time between", value1, value2, "check_time");
            return (Criteria) this;
        }

        public Criteria andCheck_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_time not between", value1, value2, "check_time");
            return (Criteria) this;
        }

        public Criteria andCheck_resultIsNull() {
            addCriterion("check_result is null");
            return (Criteria) this;
        }

        public Criteria andCheck_resultIsNotNull() {
            addCriterion("check_result is not null");
            return (Criteria) this;
        }

        public Criteria andCheck_resultEqualTo(String value) {
            addCriterion("check_result =", value, "check_result");
            return (Criteria) this;
        }

        public Criteria andCheck_resultNotEqualTo(String value) {
            addCriterion("check_result <>", value, "check_result");
            return (Criteria) this;
        }

        public Criteria andCheck_resultGreaterThan(String value) {
            addCriterion("check_result >", value, "check_result");
            return (Criteria) this;
        }

        public Criteria andCheck_resultGreaterThanOrEqualTo(String value) {
            addCriterion("check_result >=", value, "check_result");
            return (Criteria) this;
        }

        public Criteria andCheck_resultLessThan(String value) {
            addCriterion("check_result <", value, "check_result");
            return (Criteria) this;
        }

        public Criteria andCheck_resultLessThanOrEqualTo(String value) {
            addCriterion("check_result <=", value, "check_result");
            return (Criteria) this;
        }

        public Criteria andCheck_resultLike(String value) {
            addCriterion("check_result like", value, "check_result");
            return (Criteria) this;
        }

        public Criteria andCheck_resultNotLike(String value) {
            addCriterion("check_result not like", value, "check_result");
            return (Criteria) this;
        }

        public Criteria andCheck_resultIn(List<String> values) {
            addCriterion("check_result in", values, "check_result");
            return (Criteria) this;
        }

        public Criteria andCheck_resultNotIn(List<String> values) {
            addCriterion("check_result not in", values, "check_result");
            return (Criteria) this;
        }

        public Criteria andCheck_resultBetween(String value1, String value2) {
            addCriterion("check_result between", value1, value2, "check_result");
            return (Criteria) this;
        }

        public Criteria andCheck_resultNotBetween(String value1, String value2) {
            addCriterion("check_result not between", value1, value2, "check_result");
            return (Criteria) this;
        }

        public Criteria andResult_timeIsNull() {
            addCriterion("result_time is null");
            return (Criteria) this;
        }

        public Criteria andResult_timeIsNotNull() {
            addCriterion("result_time is not null");
            return (Criteria) this;
        }

        public Criteria andResult_timeEqualTo(Date value) {
            addCriterionForJDBCDate("result_time =", value, "result_time");
            return (Criteria) this;
        }

        public Criteria andResult_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("result_time <>", value, "result_time");
            return (Criteria) this;
        }

        public Criteria andResult_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("result_time >", value, "result_time");
            return (Criteria) this;
        }

        public Criteria andResult_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("result_time >=", value, "result_time");
            return (Criteria) this;
        }

        public Criteria andResult_timeLessThan(Date value) {
            addCriterionForJDBCDate("result_time <", value, "result_time");
            return (Criteria) this;
        }

        public Criteria andResult_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("result_time <=", value, "result_time");
            return (Criteria) this;
        }

        public Criteria andResult_timeIn(List<Date> values) {
            addCriterionForJDBCDate("result_time in", values, "result_time");
            return (Criteria) this;
        }

        public Criteria andResult_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("result_time not in", values, "result_time");
            return (Criteria) this;
        }

        public Criteria andResult_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("result_time between", value1, value2, "result_time");
            return (Criteria) this;
        }

        public Criteria andResult_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("result_time not between", value1, value2, "result_time");
            return (Criteria) this;
        }

        public Criteria andApplication_statusIsNull() {
            addCriterion("application_status is null");
            return (Criteria) this;
        }

        public Criteria andApplication_statusIsNotNull() {
            addCriterion("application_status is not null");
            return (Criteria) this;
        }

        public Criteria andApplication_statusEqualTo(Integer value) {
            addCriterion("application_status =", value, "application_status");
            return (Criteria) this;
        }

        public Criteria andApplication_statusNotEqualTo(Integer value) {
            addCriterion("application_status <>", value, "application_status");
            return (Criteria) this;
        }

        public Criteria andApplication_statusGreaterThan(Integer value) {
            addCriterion("application_status >", value, "application_status");
            return (Criteria) this;
        }

        public Criteria andApplication_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("application_status >=", value, "application_status");
            return (Criteria) this;
        }

        public Criteria andApplication_statusLessThan(Integer value) {
            addCriterion("application_status <", value, "application_status");
            return (Criteria) this;
        }

        public Criteria andApplication_statusLessThanOrEqualTo(Integer value) {
            addCriterion("application_status <=", value, "application_status");
            return (Criteria) this;
        }

        public Criteria andApplication_statusIn(List<Integer> values) {
            addCriterion("application_status in", values, "application_status");
            return (Criteria) this;
        }

        public Criteria andApplication_statusNotIn(List<Integer> values) {
            addCriterion("application_status not in", values, "application_status");
            return (Criteria) this;
        }

        public Criteria andApplication_statusBetween(Integer value1, Integer value2) {
            addCriterion("application_status between", value1, value2, "application_status");
            return (Criteria) this;
        }

        public Criteria andApplication_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("application_status not between", value1, value2, "application_status");
            return (Criteria) this;
        }

        public Criteria andRecord_categoryIsNull() {
            addCriterion("record_category is null");
            return (Criteria) this;
        }

        public Criteria andRecord_categoryIsNotNull() {
            addCriterion("record_category is not null");
            return (Criteria) this;
        }

        public Criteria andRecord_categoryEqualTo(Integer value) {
            addCriterion("record_category =", value, "record_category");
            return (Criteria) this;
        }

        public Criteria andRecord_categoryNotEqualTo(Integer value) {
            addCriterion("record_category <>", value, "record_category");
            return (Criteria) this;
        }

        public Criteria andRecord_categoryGreaterThan(Integer value) {
            addCriterion("record_category >", value, "record_category");
            return (Criteria) this;
        }

        public Criteria andRecord_categoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_category >=", value, "record_category");
            return (Criteria) this;
        }

        public Criteria andRecord_categoryLessThan(Integer value) {
            addCriterion("record_category <", value, "record_category");
            return (Criteria) this;
        }

        public Criteria andRecord_categoryLessThanOrEqualTo(Integer value) {
            addCriterion("record_category <=", value, "record_category");
            return (Criteria) this;
        }

        public Criteria andRecord_categoryIn(List<Integer> values) {
            addCriterion("record_category in", values, "record_category");
            return (Criteria) this;
        }

        public Criteria andRecord_categoryNotIn(List<Integer> values) {
            addCriterion("record_category not in", values, "record_category");
            return (Criteria) this;
        }

        public Criteria andRecord_categoryBetween(Integer value1, Integer value2) {
            addCriterion("record_category between", value1, value2, "record_category");
            return (Criteria) this;
        }

        public Criteria andRecord_categoryNotBetween(Integer value1, Integer value2) {
            addCriterion("record_category not between", value1, value2, "record_category");
            return (Criteria) this;
        }

        public Criteria andIs_deletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIs_deletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIs_deletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andItem_nameLikeInsensitive(String value) {
            addCriterion("upper(item_name) like", value.toUpperCase(), "item_name");
            return (Criteria) this;
        }

        public Criteria andRequirementLikeInsensitive(String value) {
            addCriterion("upper(requirement) like", value.toUpperCase(), "requirement");
            return (Criteria) this;
        }

        public Criteria andCheck_partLikeInsensitive(String value) {
            addCriterion("upper(check_part) like", value.toUpperCase(), "check_part");
            return (Criteria) this;
        }

        public Criteria andCheck_resultLikeInsensitive(String value) {
            addCriterion("upper(check_result) like", value.toUpperCase(), "check_result");
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
            return deleted ? andIs_deletedEqualTo(NonDrugApplication.DELETED) : andIs_deletedNotEqualTo(NonDrugApplication.DELETED);
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
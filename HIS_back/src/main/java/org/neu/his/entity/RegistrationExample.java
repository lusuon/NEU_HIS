package org.neu.his.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RegistrationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

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

        public Criteria andCase_noIsNull() {
            addCriterion("case_no is null");
            return (Criteria) this;
        }

        public Criteria andCase_noIsNotNull() {
            addCriterion("case_no is not null");
            return (Criteria) this;
        }

        public Criteria andCase_noEqualTo(Integer value) {
            addCriterion("case_no =", value, "case_no");
            return (Criteria) this;
        }

        public Criteria andCase_noNotEqualTo(Integer value) {
            addCriterion("case_no <>", value, "case_no");
            return (Criteria) this;
        }

        public Criteria andCase_noGreaterThan(Integer value) {
            addCriterion("case_no >", value, "case_no");
            return (Criteria) this;
        }

        public Criteria andCase_noGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_no >=", value, "case_no");
            return (Criteria) this;
        }

        public Criteria andCase_noLessThan(Integer value) {
            addCriterion("case_no <", value, "case_no");
            return (Criteria) this;
        }

        public Criteria andCase_noLessThanOrEqualTo(Integer value) {
            addCriterion("case_no <=", value, "case_no");
            return (Criteria) this;
        }

        public Criteria andCase_noIn(List<Integer> values) {
            addCriterion("case_no in", values, "case_no");
            return (Criteria) this;
        }

        public Criteria andCase_noNotIn(List<Integer> values) {
            addCriterion("case_no not in", values, "case_no");
            return (Criteria) this;
        }

        public Criteria andCase_noBetween(Integer value1, Integer value2) {
            addCriterion("case_no between", value1, value2, "case_no");
            return (Criteria) this;
        }

        public Criteria andCase_noNotBetween(Integer value1, Integer value2) {
            addCriterion("case_no not between", value1, value2, "case_no");
            return (Criteria) this;
        }

        public Criteria andPatient_nameIsNull() {
            addCriterion("patient_name is null");
            return (Criteria) this;
        }

        public Criteria andPatient_nameIsNotNull() {
            addCriterion("patient_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatient_nameEqualTo(String value) {
            addCriterion("patient_name =", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameNotEqualTo(String value) {
            addCriterion("patient_name <>", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameGreaterThan(String value) {
            addCriterion("patient_name >", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_name >=", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameLessThan(String value) {
            addCriterion("patient_name <", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameLessThanOrEqualTo(String value) {
            addCriterion("patient_name <=", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameLike(String value) {
            addCriterion("patient_name like", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameNotLike(String value) {
            addCriterion("patient_name not like", value, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameIn(List<String> values) {
            addCriterion("patient_name in", values, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameNotIn(List<String> values) {
            addCriterion("patient_name not in", values, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameBetween(String value1, String value2) {
            addCriterion("patient_name between", value1, value2, "patient_name");
            return (Criteria) this;
        }

        public Criteria andPatient_nameNotBetween(String value1, String value2) {
            addCriterion("patient_name not between", value1, value2, "patient_name");
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

        public Criteria andPersonal_idIsNull() {
            addCriterion("personal_id is null");
            return (Criteria) this;
        }

        public Criteria andPersonal_idIsNotNull() {
            addCriterion("personal_id is not null");
            return (Criteria) this;
        }

        public Criteria andPersonal_idEqualTo(String value) {
            addCriterion("personal_id =", value, "personal_id");
            return (Criteria) this;
        }

        public Criteria andPersonal_idNotEqualTo(String value) {
            addCriterion("personal_id <>", value, "personal_id");
            return (Criteria) this;
        }

        public Criteria andPersonal_idGreaterThan(String value) {
            addCriterion("personal_id >", value, "personal_id");
            return (Criteria) this;
        }

        public Criteria andPersonal_idGreaterThanOrEqualTo(String value) {
            addCriterion("personal_id >=", value, "personal_id");
            return (Criteria) this;
        }

        public Criteria andPersonal_idLessThan(String value) {
            addCriterion("personal_id <", value, "personal_id");
            return (Criteria) this;
        }

        public Criteria andPersonal_idLessThanOrEqualTo(String value) {
            addCriterion("personal_id <=", value, "personal_id");
            return (Criteria) this;
        }

        public Criteria andPersonal_idLike(String value) {
            addCriterion("personal_id like", value, "personal_id");
            return (Criteria) this;
        }

        public Criteria andPersonal_idNotLike(String value) {
            addCriterion("personal_id not like", value, "personal_id");
            return (Criteria) this;
        }

        public Criteria andPersonal_idIn(List<String> values) {
            addCriterion("personal_id in", values, "personal_id");
            return (Criteria) this;
        }

        public Criteria andPersonal_idNotIn(List<String> values) {
            addCriterion("personal_id not in", values, "personal_id");
            return (Criteria) this;
        }

        public Criteria andPersonal_idBetween(String value1, String value2) {
            addCriterion("personal_id between", value1, value2, "personal_id");
            return (Criteria) this;
        }

        public Criteria andPersonal_idNotBetween(String value1, String value2) {
            addCriterion("personal_id not between", value1, value2, "personal_id");
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

        public Criteria andAge_typeIsNull() {
            addCriterion("age_type is null");
            return (Criteria) this;
        }

        public Criteria andAge_typeIsNotNull() {
            addCriterion("age_type is not null");
            return (Criteria) this;
        }

        public Criteria andAge_typeEqualTo(String value) {
            addCriterion("age_type =", value, "age_type");
            return (Criteria) this;
        }

        public Criteria andAge_typeNotEqualTo(String value) {
            addCriterion("age_type <>", value, "age_type");
            return (Criteria) this;
        }

        public Criteria andAge_typeGreaterThan(String value) {
            addCriterion("age_type >", value, "age_type");
            return (Criteria) this;
        }

        public Criteria andAge_typeGreaterThanOrEqualTo(String value) {
            addCriterion("age_type >=", value, "age_type");
            return (Criteria) this;
        }

        public Criteria andAge_typeLessThan(String value) {
            addCriterion("age_type <", value, "age_type");
            return (Criteria) this;
        }

        public Criteria andAge_typeLessThanOrEqualTo(String value) {
            addCriterion("age_type <=", value, "age_type");
            return (Criteria) this;
        }

        public Criteria andAge_typeLike(String value) {
            addCriterion("age_type like", value, "age_type");
            return (Criteria) this;
        }

        public Criteria andAge_typeNotLike(String value) {
            addCriterion("age_type not like", value, "age_type");
            return (Criteria) this;
        }

        public Criteria andAge_typeIn(List<String> values) {
            addCriterion("age_type in", values, "age_type");
            return (Criteria) this;
        }

        public Criteria andAge_typeNotIn(List<String> values) {
            addCriterion("age_type not in", values, "age_type");
            return (Criteria) this;
        }

        public Criteria andAge_typeBetween(String value1, String value2) {
            addCriterion("age_type between", value1, value2, "age_type");
            return (Criteria) this;
        }

        public Criteria andAge_typeNotBetween(String value1, String value2) {
            addCriterion("age_type not between", value1, value2, "age_type");
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

        public Criteria andSee_dateIsNull() {
            addCriterion("see_date is null");
            return (Criteria) this;
        }

        public Criteria andSee_dateIsNotNull() {
            addCriterion("see_date is not null");
            return (Criteria) this;
        }

        public Criteria andSee_dateEqualTo(Date value) {
            addCriterionForJDBCDate("see_date =", value, "see_date");
            return (Criteria) this;
        }

        public Criteria andSee_dateNotEqualTo(Date value) {
            addCriterionForJDBCDate("see_date <>", value, "see_date");
            return (Criteria) this;
        }

        public Criteria andSee_dateGreaterThan(Date value) {
            addCriterionForJDBCDate("see_date >", value, "see_date");
            return (Criteria) this;
        }

        public Criteria andSee_dateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("see_date >=", value, "see_date");
            return (Criteria) this;
        }

        public Criteria andSee_dateLessThan(Date value) {
            addCriterionForJDBCDate("see_date <", value, "see_date");
            return (Criteria) this;
        }

        public Criteria andSee_dateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("see_date <=", value, "see_date");
            return (Criteria) this;
        }

        public Criteria andSee_dateIn(List<Date> values) {
            addCriterionForJDBCDate("see_date in", values, "see_date");
            return (Criteria) this;
        }

        public Criteria andSee_dateNotIn(List<Date> values) {
            addCriterionForJDBCDate("see_date not in", values, "see_date");
            return (Criteria) this;
        }

        public Criteria andSee_dateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("see_date between", value1, value2, "see_date");
            return (Criteria) this;
        }

        public Criteria andSee_dateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("see_date not between", value1, value2, "see_date");
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

        public Criteria andDept_idIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDept_idIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDept_idEqualTo(Integer value) {
            addCriterion("dept_id =", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idLessThan(Integer value) {
            addCriterion("dept_id <", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idIn(List<Integer> values) {
            addCriterion("dept_id in", values, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idIsNull() {
            addCriterion("doctor_id is null");
            return (Criteria) this;
        }

        public Criteria andDoctor_idIsNotNull() {
            addCriterion("doctor_id is not null");
            return (Criteria) this;
        }

        public Criteria andDoctor_idEqualTo(Integer value) {
            addCriterion("doctor_id =", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idNotEqualTo(Integer value) {
            addCriterion("doctor_id <>", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idGreaterThan(Integer value) {
            addCriterion("doctor_id >", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctor_id >=", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idLessThan(Integer value) {
            addCriterion("doctor_id <", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idLessThanOrEqualTo(Integer value) {
            addCriterion("doctor_id <=", value, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idIn(List<Integer> values) {
            addCriterion("doctor_id in", values, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idNotIn(List<Integer> values) {
            addCriterion("doctor_id not in", values, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id between", value1, value2, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andDoctor_idNotBetween(Integer value1, Integer value2) {
            addCriterion("doctor_id not between", value1, value2, "doctor_id");
            return (Criteria) this;
        }

        public Criteria andReg_level_idIsNull() {
            addCriterion("reg_level_id is null");
            return (Criteria) this;
        }

        public Criteria andReg_level_idIsNotNull() {
            addCriterion("reg_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andReg_level_idEqualTo(Integer value) {
            addCriterion("reg_level_id =", value, "reg_level_id");
            return (Criteria) this;
        }

        public Criteria andReg_level_idNotEqualTo(Integer value) {
            addCriterion("reg_level_id <>", value, "reg_level_id");
            return (Criteria) this;
        }

        public Criteria andReg_level_idGreaterThan(Integer value) {
            addCriterion("reg_level_id >", value, "reg_level_id");
            return (Criteria) this;
        }

        public Criteria andReg_level_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_level_id >=", value, "reg_level_id");
            return (Criteria) this;
        }

        public Criteria andReg_level_idLessThan(Integer value) {
            addCriterion("reg_level_id <", value, "reg_level_id");
            return (Criteria) this;
        }

        public Criteria andReg_level_idLessThanOrEqualTo(Integer value) {
            addCriterion("reg_level_id <=", value, "reg_level_id");
            return (Criteria) this;
        }

        public Criteria andReg_level_idIn(List<Integer> values) {
            addCriterion("reg_level_id in", values, "reg_level_id");
            return (Criteria) this;
        }

        public Criteria andReg_level_idNotIn(List<Integer> values) {
            addCriterion("reg_level_id not in", values, "reg_level_id");
            return (Criteria) this;
        }

        public Criteria andReg_level_idBetween(Integer value1, Integer value2) {
            addCriterion("reg_level_id between", value1, value2, "reg_level_id");
            return (Criteria) this;
        }

        public Criteria andReg_level_idNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_level_id not between", value1, value2, "reg_level_id");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeIsNull() {
            addCriterion("settlement_type is null");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeIsNotNull() {
            addCriterion("settlement_type is not null");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeEqualTo(String value) {
            addCriterion("settlement_type =", value, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeNotEqualTo(String value) {
            addCriterion("settlement_type <>", value, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeGreaterThan(String value) {
            addCriterion("settlement_type >", value, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_type >=", value, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeLessThan(String value) {
            addCriterion("settlement_type <", value, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeLessThanOrEqualTo(String value) {
            addCriterion("settlement_type <=", value, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeLike(String value) {
            addCriterion("settlement_type like", value, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeNotLike(String value) {
            addCriterion("settlement_type not like", value, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeIn(List<String> values) {
            addCriterion("settlement_type in", values, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeNotIn(List<String> values) {
            addCriterion("settlement_type not in", values, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeBetween(String value1, String value2) {
            addCriterion("settlement_type between", value1, value2, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andSettlement_typeNotBetween(String value1, String value2) {
            addCriterion("settlement_type not between", value1, value2, "settlement_type");
            return (Criteria) this;
        }

        public Criteria andNeed_case_bookIsNull() {
            addCriterion("need_case_book is null");
            return (Criteria) this;
        }

        public Criteria andNeed_case_bookIsNotNull() {
            addCriterion("need_case_book is not null");
            return (Criteria) this;
        }

        public Criteria andNeed_case_bookEqualTo(Boolean value) {
            addCriterion("need_case_book =", value, "need_case_book");
            return (Criteria) this;
        }

        public Criteria andNeed_case_bookNotEqualTo(Boolean value) {
            addCriterion("need_case_book <>", value, "need_case_book");
            return (Criteria) this;
        }

        public Criteria andNeed_case_bookGreaterThan(Boolean value) {
            addCriterion("need_case_book >", value, "need_case_book");
            return (Criteria) this;
        }

        public Criteria andNeed_case_bookGreaterThanOrEqualTo(Boolean value) {
            addCriterion("need_case_book >=", value, "need_case_book");
            return (Criteria) this;
        }

        public Criteria andNeed_case_bookLessThan(Boolean value) {
            addCriterion("need_case_book <", value, "need_case_book");
            return (Criteria) this;
        }

        public Criteria andNeed_case_bookLessThanOrEqualTo(Boolean value) {
            addCriterion("need_case_book <=", value, "need_case_book");
            return (Criteria) this;
        }

        public Criteria andNeed_case_bookIn(List<Boolean> values) {
            addCriterion("need_case_book in", values, "need_case_book");
            return (Criteria) this;
        }

        public Criteria andNeed_case_bookNotIn(List<Boolean> values) {
            addCriterion("need_case_book not in", values, "need_case_book");
            return (Criteria) this;
        }

        public Criteria andNeed_case_bookBetween(Boolean value1, Boolean value2) {
            addCriterion("need_case_book between", value1, value2, "need_case_book");
            return (Criteria) this;
        }

        public Criteria andNeed_case_bookNotBetween(Boolean value1, Boolean value2) {
            addCriterion("need_case_book not between", value1, value2, "need_case_book");
            return (Criteria) this;
        }

        public Criteria andReg_timeIsNull() {
            addCriterion("reg_time is null");
            return (Criteria) this;
        }

        public Criteria andReg_timeIsNotNull() {
            addCriterion("reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andReg_timeEqualTo(Date value) {
            addCriterion("reg_time =", value, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeNotEqualTo(Date value) {
            addCriterion("reg_time <>", value, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeGreaterThan(Date value) {
            addCriterion("reg_time >", value, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_time >=", value, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeLessThan(Date value) {
            addCriterion("reg_time <", value, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeLessThanOrEqualTo(Date value) {
            addCriterion("reg_time <=", value, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeIn(List<Date> values) {
            addCriterion("reg_time in", values, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeNotIn(List<Date> values) {
            addCriterion("reg_time not in", values, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeBetween(Date value1, Date value2) {
            addCriterion("reg_time between", value1, value2, "reg_time");
            return (Criteria) this;
        }

        public Criteria andReg_timeNotBetween(Date value1, Date value2) {
            addCriterion("reg_time not between", value1, value2, "reg_time");
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

        public Criteria andInspection_statusIsNull() {
            addCriterion("inspection_status is null");
            return (Criteria) this;
        }

        public Criteria andInspection_statusIsNotNull() {
            addCriterion("inspection_status is not null");
            return (Criteria) this;
        }

        public Criteria andInspection_statusEqualTo(Integer value) {
            addCriterion("inspection_status =", value, "inspection_status");
            return (Criteria) this;
        }

        public Criteria andInspection_statusNotEqualTo(Integer value) {
            addCriterion("inspection_status <>", value, "inspection_status");
            return (Criteria) this;
        }

        public Criteria andInspection_statusGreaterThan(Integer value) {
            addCriterion("inspection_status >", value, "inspection_status");
            return (Criteria) this;
        }

        public Criteria andInspection_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspection_status >=", value, "inspection_status");
            return (Criteria) this;
        }

        public Criteria andInspection_statusLessThan(Integer value) {
            addCriterion("inspection_status <", value, "inspection_status");
            return (Criteria) this;
        }

        public Criteria andInspection_statusLessThanOrEqualTo(Integer value) {
            addCriterion("inspection_status <=", value, "inspection_status");
            return (Criteria) this;
        }

        public Criteria andInspection_statusIn(List<Integer> values) {
            addCriterion("inspection_status in", values, "inspection_status");
            return (Criteria) this;
        }

        public Criteria andInspection_statusNotIn(List<Integer> values) {
            addCriterion("inspection_status not in", values, "inspection_status");
            return (Criteria) this;
        }

        public Criteria andInspection_statusBetween(Integer value1, Integer value2) {
            addCriterion("inspection_status between", value1, value2, "inspection_status");
            return (Criteria) this;
        }

        public Criteria andInspection_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("inspection_status not between", value1, value2, "inspection_status");
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

        public Criteria andPatient_nameLikeInsensitive(String value) {
            addCriterion("upper(patient_name) like", value.toUpperCase(), "patient_name");
            return (Criteria) this;
        }

        public Criteria andPersonal_idLikeInsensitive(String value) {
            addCriterion("upper(personal_id) like", value.toUpperCase(), "personal_id");
            return (Criteria) this;
        }

        public Criteria andAge_typeLikeInsensitive(String value) {
            addCriterion("upper(age_type) like", value.toUpperCase(), "age_type");
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

        public Criteria andSettlement_typeLikeInsensitive(String value) {
            addCriterion("upper(settlement_type) like", value.toUpperCase(), "settlement_type");
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
            return deleted ? andIs_deletedEqualTo(Registration.DELETED) : andIs_deletedNotEqualTo(Registration.DELETED);
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
package org.neu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NonDrugExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public NonDrugExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNon_drug_nameIsNull() {
            addCriterion("non_drug_name is null");
            return (Criteria) this;
        }

        public Criteria andNon_drug_nameIsNotNull() {
            addCriterion("non_drug_name is not null");
            return (Criteria) this;
        }

        public Criteria andNon_drug_nameEqualTo(String value) {
            addCriterion("non_drug_name =", value, "non_drug_name");
            return (Criteria) this;
        }

        public Criteria andNon_drug_nameNotEqualTo(String value) {
            addCriterion("non_drug_name <>", value, "non_drug_name");
            return (Criteria) this;
        }

        public Criteria andNon_drug_nameGreaterThan(String value) {
            addCriterion("non_drug_name >", value, "non_drug_name");
            return (Criteria) this;
        }

        public Criteria andNon_drug_nameGreaterThanOrEqualTo(String value) {
            addCriterion("non_drug_name >=", value, "non_drug_name");
            return (Criteria) this;
        }

        public Criteria andNon_drug_nameLessThan(String value) {
            addCriterion("non_drug_name <", value, "non_drug_name");
            return (Criteria) this;
        }

        public Criteria andNon_drug_nameLessThanOrEqualTo(String value) {
            addCriterion("non_drug_name <=", value, "non_drug_name");
            return (Criteria) this;
        }

        public Criteria andNon_drug_nameLike(String value) {
            addCriterion("non_drug_name like", value, "non_drug_name");
            return (Criteria) this;
        }

        public Criteria andNon_drug_nameNotLike(String value) {
            addCriterion("non_drug_name not like", value, "non_drug_name");
            return (Criteria) this;
        }

        public Criteria andNon_drug_nameIn(List<String> values) {
            addCriterion("non_drug_name in", values, "non_drug_name");
            return (Criteria) this;
        }

        public Criteria andNon_drug_nameNotIn(List<String> values) {
            addCriterion("non_drug_name not in", values, "non_drug_name");
            return (Criteria) this;
        }

        public Criteria andNon_drug_nameBetween(String value1, String value2) {
            addCriterion("non_drug_name between", value1, value2, "non_drug_name");
            return (Criteria) this;
        }

        public Criteria andNon_drug_nameNotBetween(String value1, String value2) {
            addCriterion("non_drug_name not between", value1, value2, "non_drug_name");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andUnit_priceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnit_priceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnit_priceEqualTo(Double value) {
            addCriterion("unit_price =", value, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceNotEqualTo(Double value) {
            addCriterion("unit_price <>", value, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceGreaterThan(Double value) {
            addCriterion("unit_price >", value, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceGreaterThanOrEqualTo(Double value) {
            addCriterion("unit_price >=", value, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceLessThan(Double value) {
            addCriterion("unit_price <", value, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceLessThanOrEqualTo(Double value) {
            addCriterion("unit_price <=", value, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceIn(List<Double> values) {
            addCriterion("unit_price in", values, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceNotIn(List<Double> values) {
            addCriterion("unit_price not in", values, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceBetween(Double value1, Double value2) {
            addCriterion("unit_price between", value1, value2, "unit_price");
            return (Criteria) this;
        }

        public Criteria andUnit_priceNotBetween(Double value1, Double value2) {
            addCriterion("unit_price not between", value1, value2, "unit_price");
            return (Criteria) this;
        }

        public Criteria andCategory_payment_idIsNull() {
            addCriterion("category_payment_id is null");
            return (Criteria) this;
        }

        public Criteria andCategory_payment_idIsNotNull() {
            addCriterion("category_payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_payment_idEqualTo(Integer value) {
            addCriterion("category_payment_id =", value, "category_payment_id");
            return (Criteria) this;
        }

        public Criteria andCategory_payment_idNotEqualTo(Integer value) {
            addCriterion("category_payment_id <>", value, "category_payment_id");
            return (Criteria) this;
        }

        public Criteria andCategory_payment_idGreaterThan(Integer value) {
            addCriterion("category_payment_id >", value, "category_payment_id");
            return (Criteria) this;
        }

        public Criteria andCategory_payment_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_payment_id >=", value, "category_payment_id");
            return (Criteria) this;
        }

        public Criteria andCategory_payment_idLessThan(Integer value) {
            addCriterion("category_payment_id <", value, "category_payment_id");
            return (Criteria) this;
        }

        public Criteria andCategory_payment_idLessThanOrEqualTo(Integer value) {
            addCriterion("category_payment_id <=", value, "category_payment_id");
            return (Criteria) this;
        }

        public Criteria andCategory_payment_idIn(List<Integer> values) {
            addCriterion("category_payment_id in", values, "category_payment_id");
            return (Criteria) this;
        }

        public Criteria andCategory_payment_idNotIn(List<Integer> values) {
            addCriterion("category_payment_id not in", values, "category_payment_id");
            return (Criteria) this;
        }

        public Criteria andCategory_payment_idBetween(Integer value1, Integer value2) {
            addCriterion("category_payment_id between", value1, value2, "category_payment_id");
            return (Criteria) this;
        }

        public Criteria andCategory_payment_idNotBetween(Integer value1, Integer value2) {
            addCriterion("category_payment_id not between", value1, value2, "category_payment_id");
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

        public Criteria andPinyin_mnemonic_codeIsNull() {
            addCriterion("pinyin_mnemonic_code is null");
            return (Criteria) this;
        }

        public Criteria andPinyin_mnemonic_codeIsNotNull() {
            addCriterion("pinyin_mnemonic_code is not null");
            return (Criteria) this;
        }

        public Criteria andPinyin_mnemonic_codeEqualTo(String value) {
            addCriterion("pinyin_mnemonic_code =", value, "pinyin_mnemonic_code");
            return (Criteria) this;
        }

        public Criteria andPinyin_mnemonic_codeNotEqualTo(String value) {
            addCriterion("pinyin_mnemonic_code <>", value, "pinyin_mnemonic_code");
            return (Criteria) this;
        }

        public Criteria andPinyin_mnemonic_codeGreaterThan(String value) {
            addCriterion("pinyin_mnemonic_code >", value, "pinyin_mnemonic_code");
            return (Criteria) this;
        }

        public Criteria andPinyin_mnemonic_codeGreaterThanOrEqualTo(String value) {
            addCriterion("pinyin_mnemonic_code >=", value, "pinyin_mnemonic_code");
            return (Criteria) this;
        }

        public Criteria andPinyin_mnemonic_codeLessThan(String value) {
            addCriterion("pinyin_mnemonic_code <", value, "pinyin_mnemonic_code");
            return (Criteria) this;
        }

        public Criteria andPinyin_mnemonic_codeLessThanOrEqualTo(String value) {
            addCriterion("pinyin_mnemonic_code <=", value, "pinyin_mnemonic_code");
            return (Criteria) this;
        }

        public Criteria andPinyin_mnemonic_codeLike(String value) {
            addCriterion("pinyin_mnemonic_code like", value, "pinyin_mnemonic_code");
            return (Criteria) this;
        }

        public Criteria andPinyin_mnemonic_codeNotLike(String value) {
            addCriterion("pinyin_mnemonic_code not like", value, "pinyin_mnemonic_code");
            return (Criteria) this;
        }

        public Criteria andPinyin_mnemonic_codeIn(List<String> values) {
            addCriterion("pinyin_mnemonic_code in", values, "pinyin_mnemonic_code");
            return (Criteria) this;
        }

        public Criteria andPinyin_mnemonic_codeNotIn(List<String> values) {
            addCriterion("pinyin_mnemonic_code not in", values, "pinyin_mnemonic_code");
            return (Criteria) this;
        }

        public Criteria andPinyin_mnemonic_codeBetween(String value1, String value2) {
            addCriterion("pinyin_mnemonic_code between", value1, value2, "pinyin_mnemonic_code");
            return (Criteria) this;
        }

        public Criteria andPinyin_mnemonic_codeNotBetween(String value1, String value2) {
            addCriterion("pinyin_mnemonic_code not between", value1, value2, "pinyin_mnemonic_code");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andLast_edit_timeIsNull() {
            addCriterion("last_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andLast_edit_timeIsNotNull() {
            addCriterion("last_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLast_edit_timeEqualTo(Date value) {
            addCriterionForJDBCDate("last_edit_time =", value, "last_edit_time");
            return (Criteria) this;
        }

        public Criteria andLast_edit_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_edit_time <>", value, "last_edit_time");
            return (Criteria) this;
        }

        public Criteria andLast_edit_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("last_edit_time >", value, "last_edit_time");
            return (Criteria) this;
        }

        public Criteria andLast_edit_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_edit_time >=", value, "last_edit_time");
            return (Criteria) this;
        }

        public Criteria andLast_edit_timeLessThan(Date value) {
            addCriterionForJDBCDate("last_edit_time <", value, "last_edit_time");
            return (Criteria) this;
        }

        public Criteria andLast_edit_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_edit_time <=", value, "last_edit_time");
            return (Criteria) this;
        }

        public Criteria andLast_edit_timeIn(List<Date> values) {
            addCriterionForJDBCDate("last_edit_time in", values, "last_edit_time");
            return (Criteria) this;
        }

        public Criteria andLast_edit_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_edit_time not in", values, "last_edit_time");
            return (Criteria) this;
        }

        public Criteria andLast_edit_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_edit_time between", value1, value2, "last_edit_time");
            return (Criteria) this;
        }

        public Criteria andLast_edit_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_edit_time not between", value1, value2, "last_edit_time");
            return (Criteria) this;
        }

        public Criteria andItem_typeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItem_typeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItem_typeEqualTo(Short value) {
            addCriterion("item_type =", value, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeNotEqualTo(Short value) {
            addCriterion("item_type <>", value, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeGreaterThan(Short value) {
            addCriterion("item_type >", value, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeGreaterThanOrEqualTo(Short value) {
            addCriterion("item_type >=", value, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeLessThan(Short value) {
            addCriterion("item_type <", value, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeLessThanOrEqualTo(Short value) {
            addCriterion("item_type <=", value, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeIn(List<Short> values) {
            addCriterion("item_type in", values, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeNotIn(List<Short> values) {
            addCriterion("item_type not in", values, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeBetween(Short value1, Short value2) {
            addCriterion("item_type between", value1, value2, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeNotBetween(Short value1, Short value2) {
            addCriterion("item_type not between", value1, value2, "item_type");
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

        public Criteria andCodeLikeInsensitive(String value) {
            addCriterion("upper(code) like", value.toUpperCase(), "code");
            return (Criteria) this;
        }

        public Criteria andNon_drug_nameLikeInsensitive(String value) {
            addCriterion("upper(non_drug_name) like", value.toUpperCase(), "non_drug_name");
            return (Criteria) this;
        }

        public Criteria andStandardLikeInsensitive(String value) {
            addCriterion("upper(standard) like", value.toUpperCase(), "standard");
            return (Criteria) this;
        }

        public Criteria andPinyin_mnemonic_codeLikeInsensitive(String value) {
            addCriterion("upper(pinyin_mnemonic_code) like", value.toUpperCase(), "pinyin_mnemonic_code");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table non_drug
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andIs_deletedEqualTo(NonDrug.DELETED) : andIs_deletedNotEqualTo(NonDrug.DELETED);
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
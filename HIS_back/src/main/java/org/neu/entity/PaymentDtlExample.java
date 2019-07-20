package org.neu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentDtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PaymentDtlExample() {
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

        public Criteria andInvoice_noIsNull() {
            addCriterion("invoice_no is null");
            return (Criteria) this;
        }

        public Criteria andInvoice_noIsNotNull() {
            addCriterion("invoice_no is not null");
            return (Criteria) this;
        }

        public Criteria andInvoice_noEqualTo(Integer value) {
            addCriterion("invoice_no =", value, "invoice_no");
            return (Criteria) this;
        }

        public Criteria andInvoice_noNotEqualTo(Integer value) {
            addCriterion("invoice_no <>", value, "invoice_no");
            return (Criteria) this;
        }

        public Criteria andInvoice_noGreaterThan(Integer value) {
            addCriterion("invoice_no >", value, "invoice_no");
            return (Criteria) this;
        }

        public Criteria andInvoice_noGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice_no >=", value, "invoice_no");
            return (Criteria) this;
        }

        public Criteria andInvoice_noLessThan(Integer value) {
            addCriterion("invoice_no <", value, "invoice_no");
            return (Criteria) this;
        }

        public Criteria andInvoice_noLessThanOrEqualTo(Integer value) {
            addCriterion("invoice_no <=", value, "invoice_no");
            return (Criteria) this;
        }

        public Criteria andInvoice_noIn(List<Integer> values) {
            addCriterion("invoice_no in", values, "invoice_no");
            return (Criteria) this;
        }

        public Criteria andInvoice_noNotIn(List<Integer> values) {
            addCriterion("invoice_no not in", values, "invoice_no");
            return (Criteria) this;
        }

        public Criteria andInvoice_noBetween(Integer value1, Integer value2) {
            addCriterion("invoice_no between", value1, value2, "invoice_no");
            return (Criteria) this;
        }

        public Criteria andInvoice_noNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice_no not between", value1, value2, "invoice_no");
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

        public Criteria andItem_typeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItem_typeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItem_typeEqualTo(Boolean value) {
            addCriterion("item_type =", value, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeNotEqualTo(Boolean value) {
            addCriterion("item_type <>", value, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeGreaterThan(Boolean value) {
            addCriterion("item_type >", value, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("item_type >=", value, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeLessThan(Boolean value) {
            addCriterion("item_type <", value, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeLessThanOrEqualTo(Boolean value) {
            addCriterion("item_type <=", value, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeIn(List<Boolean> values) {
            addCriterion("item_type in", values, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeNotIn(List<Boolean> values) {
            addCriterion("item_type not in", values, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeBetween(Boolean value1, Boolean value2) {
            addCriterion("item_type between", value1, value2, "item_type");
            return (Criteria) this;
        }

        public Criteria andItem_typeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("item_type not between", value1, value2, "item_type");
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

        public Criteria andItem_unit_priceIsNull() {
            addCriterion("item_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andItem_unit_priceIsNotNull() {
            addCriterion("item_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andItem_unit_priceEqualTo(Double value) {
            addCriterion("item_unit_price =", value, "item_unit_price");
            return (Criteria) this;
        }

        public Criteria andItem_unit_priceNotEqualTo(Double value) {
            addCriterion("item_unit_price <>", value, "item_unit_price");
            return (Criteria) this;
        }

        public Criteria andItem_unit_priceGreaterThan(Double value) {
            addCriterion("item_unit_price >", value, "item_unit_price");
            return (Criteria) this;
        }

        public Criteria andItem_unit_priceGreaterThanOrEqualTo(Double value) {
            addCriterion("item_unit_price >=", value, "item_unit_price");
            return (Criteria) this;
        }

        public Criteria andItem_unit_priceLessThan(Double value) {
            addCriterion("item_unit_price <", value, "item_unit_price");
            return (Criteria) this;
        }

        public Criteria andItem_unit_priceLessThanOrEqualTo(Double value) {
            addCriterion("item_unit_price <=", value, "item_unit_price");
            return (Criteria) this;
        }

        public Criteria andItem_unit_priceIn(List<Double> values) {
            addCriterion("item_unit_price in", values, "item_unit_price");
            return (Criteria) this;
        }

        public Criteria andItem_unit_priceNotIn(List<Double> values) {
            addCriterion("item_unit_price not in", values, "item_unit_price");
            return (Criteria) this;
        }

        public Criteria andItem_unit_priceBetween(Double value1, Double value2) {
            addCriterion("item_unit_price between", value1, value2, "item_unit_price");
            return (Criteria) this;
        }

        public Criteria andItem_unit_priceNotBetween(Double value1, Double value2) {
            addCriterion("item_unit_price not between", value1, value2, "item_unit_price");
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

        public Criteria andPrescription_generation_timeIsNull() {
            addCriterion("prescription_generation_time is null");
            return (Criteria) this;
        }

        public Criteria andPrescription_generation_timeIsNotNull() {
            addCriterion("prescription_generation_time is not null");
            return (Criteria) this;
        }

        public Criteria andPrescription_generation_timeEqualTo(Date value) {
            addCriterion("prescription_generation_time =", value, "prescription_generation_time");
            return (Criteria) this;
        }

        public Criteria andPrescription_generation_timeNotEqualTo(Date value) {
            addCriterion("prescription_generation_time <>", value, "prescription_generation_time");
            return (Criteria) this;
        }

        public Criteria andPrescription_generation_timeGreaterThan(Date value) {
            addCriterion("prescription_generation_time >", value, "prescription_generation_time");
            return (Criteria) this;
        }

        public Criteria andPrescription_generation_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("prescription_generation_time >=", value, "prescription_generation_time");
            return (Criteria) this;
        }

        public Criteria andPrescription_generation_timeLessThan(Date value) {
            addCriterion("prescription_generation_time <", value, "prescription_generation_time");
            return (Criteria) this;
        }

        public Criteria andPrescription_generation_timeLessThanOrEqualTo(Date value) {
            addCriterion("prescription_generation_time <=", value, "prescription_generation_time");
            return (Criteria) this;
        }

        public Criteria andPrescription_generation_timeIn(List<Date> values) {
            addCriterion("prescription_generation_time in", values, "prescription_generation_time");
            return (Criteria) this;
        }

        public Criteria andPrescription_generation_timeNotIn(List<Date> values) {
            addCriterion("prescription_generation_time not in", values, "prescription_generation_time");
            return (Criteria) this;
        }

        public Criteria andPrescription_generation_timeBetween(Date value1, Date value2) {
            addCriterion("prescription_generation_time between", value1, value2, "prescription_generation_time");
            return (Criteria) this;
        }

        public Criteria andPrescription_generation_timeNotBetween(Date value1, Date value2) {
            addCriterion("prescription_generation_time not between", value1, value2, "prescription_generation_time");
            return (Criteria) this;
        }

        public Criteria andGenerator_idIsNull() {
            addCriterion("generator_id is null");
            return (Criteria) this;
        }

        public Criteria andGenerator_idIsNotNull() {
            addCriterion("generator_id is not null");
            return (Criteria) this;
        }

        public Criteria andGenerator_idEqualTo(Integer value) {
            addCriterion("generator_id =", value, "generator_id");
            return (Criteria) this;
        }

        public Criteria andGenerator_idNotEqualTo(Integer value) {
            addCriterion("generator_id <>", value, "generator_id");
            return (Criteria) this;
        }

        public Criteria andGenerator_idGreaterThan(Integer value) {
            addCriterion("generator_id >", value, "generator_id");
            return (Criteria) this;
        }

        public Criteria andGenerator_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("generator_id >=", value, "generator_id");
            return (Criteria) this;
        }

        public Criteria andGenerator_idLessThan(Integer value) {
            addCriterion("generator_id <", value, "generator_id");
            return (Criteria) this;
        }

        public Criteria andGenerator_idLessThanOrEqualTo(Integer value) {
            addCriterion("generator_id <=", value, "generator_id");
            return (Criteria) this;
        }

        public Criteria andGenerator_idIn(List<Integer> values) {
            addCriterion("generator_id in", values, "generator_id");
            return (Criteria) this;
        }

        public Criteria andGenerator_idNotIn(List<Integer> values) {
            addCriterion("generator_id not in", values, "generator_id");
            return (Criteria) this;
        }

        public Criteria andGenerator_idBetween(Integer value1, Integer value2) {
            addCriterion("generator_id between", value1, value2, "generator_id");
            return (Criteria) this;
        }

        public Criteria andGenerator_idNotBetween(Integer value1, Integer value2) {
            addCriterion("generator_id not between", value1, value2, "generator_id");
            return (Criteria) this;
        }

        public Criteria andPayment_operation_timeIsNull() {
            addCriterion("payment_operation_time is null");
            return (Criteria) this;
        }

        public Criteria andPayment_operation_timeIsNotNull() {
            addCriterion("payment_operation_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayment_operation_timeEqualTo(Date value) {
            addCriterion("payment_operation_time =", value, "payment_operation_time");
            return (Criteria) this;
        }

        public Criteria andPayment_operation_timeNotEqualTo(Date value) {
            addCriterion("payment_operation_time <>", value, "payment_operation_time");
            return (Criteria) this;
        }

        public Criteria andPayment_operation_timeGreaterThan(Date value) {
            addCriterion("payment_operation_time >", value, "payment_operation_time");
            return (Criteria) this;
        }

        public Criteria andPayment_operation_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_operation_time >=", value, "payment_operation_time");
            return (Criteria) this;
        }

        public Criteria andPayment_operation_timeLessThan(Date value) {
            addCriterion("payment_operation_time <", value, "payment_operation_time");
            return (Criteria) this;
        }

        public Criteria andPayment_operation_timeLessThanOrEqualTo(Date value) {
            addCriterion("payment_operation_time <=", value, "payment_operation_time");
            return (Criteria) this;
        }

        public Criteria andPayment_operation_timeIn(List<Date> values) {
            addCriterion("payment_operation_time in", values, "payment_operation_time");
            return (Criteria) this;
        }

        public Criteria andPayment_operation_timeNotIn(List<Date> values) {
            addCriterion("payment_operation_time not in", values, "payment_operation_time");
            return (Criteria) this;
        }

        public Criteria andPayment_operation_timeBetween(Date value1, Date value2) {
            addCriterion("payment_operation_time between", value1, value2, "payment_operation_time");
            return (Criteria) this;
        }

        public Criteria andPayment_operation_timeNotBetween(Date value1, Date value2) {
            addCriterion("payment_operation_time not between", value1, value2, "payment_operation_time");
            return (Criteria) this;
        }

        public Criteria andOperator_idIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperator_idIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperator_idEqualTo(Integer value) {
            addCriterion("operator_id =", value, "operator_id");
            return (Criteria) this;
        }

        public Criteria andOperator_idNotEqualTo(Integer value) {
            addCriterion("operator_id <>", value, "operator_id");
            return (Criteria) this;
        }

        public Criteria andOperator_idGreaterThan(Integer value) {
            addCriterion("operator_id >", value, "operator_id");
            return (Criteria) this;
        }

        public Criteria andOperator_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator_id >=", value, "operator_id");
            return (Criteria) this;
        }

        public Criteria andOperator_idLessThan(Integer value) {
            addCriterion("operator_id <", value, "operator_id");
            return (Criteria) this;
        }

        public Criteria andOperator_idLessThanOrEqualTo(Integer value) {
            addCriterion("operator_id <=", value, "operator_id");
            return (Criteria) this;
        }

        public Criteria andOperator_idIn(List<Integer> values) {
            addCriterion("operator_id in", values, "operator_id");
            return (Criteria) this;
        }

        public Criteria andOperator_idNotIn(List<Integer> values) {
            addCriterion("operator_id not in", values, "operator_id");
            return (Criteria) this;
        }

        public Criteria andOperator_idBetween(Integer value1, Integer value2) {
            addCriterion("operator_id between", value1, value2, "operator_id");
            return (Criteria) this;
        }

        public Criteria andOperator_idNotBetween(Integer value1, Integer value2) {
            addCriterion("operator_id not between", value1, value2, "operator_id");
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

        public Criteria andRelated_refund_idIsNull() {
            addCriterion("related_refund_id is null");
            return (Criteria) this;
        }

        public Criteria andRelated_refund_idIsNotNull() {
            addCriterion("related_refund_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelated_refund_idEqualTo(Integer value) {
            addCriterion("related_refund_id =", value, "related_refund_id");
            return (Criteria) this;
        }

        public Criteria andRelated_refund_idNotEqualTo(Integer value) {
            addCriterion("related_refund_id <>", value, "related_refund_id");
            return (Criteria) this;
        }

        public Criteria andRelated_refund_idGreaterThan(Integer value) {
            addCriterion("related_refund_id >", value, "related_refund_id");
            return (Criteria) this;
        }

        public Criteria andRelated_refund_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("related_refund_id >=", value, "related_refund_id");
            return (Criteria) this;
        }

        public Criteria andRelated_refund_idLessThan(Integer value) {
            addCriterion("related_refund_id <", value, "related_refund_id");
            return (Criteria) this;
        }

        public Criteria andRelated_refund_idLessThanOrEqualTo(Integer value) {
            addCriterion("related_refund_id <=", value, "related_refund_id");
            return (Criteria) this;
        }

        public Criteria andRelated_refund_idIn(List<Integer> values) {
            addCriterion("related_refund_id in", values, "related_refund_id");
            return (Criteria) this;
        }

        public Criteria andRelated_refund_idNotIn(List<Integer> values) {
            addCriterion("related_refund_id not in", values, "related_refund_id");
            return (Criteria) this;
        }

        public Criteria andRelated_refund_idBetween(Integer value1, Integer value2) {
            addCriterion("related_refund_id between", value1, value2, "related_refund_id");
            return (Criteria) this;
        }

        public Criteria andRelated_refund_idNotBetween(Integer value1, Integer value2) {
            addCriterion("related_refund_id not between", value1, value2, "related_refund_id");
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

        public Criteria andMethodLikeInsensitive(String value) {
            addCriterion("upper(method) like", value.toUpperCase(), "method");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table payment_dtl
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andIs_deletedEqualTo(PaymentDtl.DELETED) : andIs_deletedNotEqualTo(PaymentDtl.DELETED);
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
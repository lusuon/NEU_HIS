package com.neu.his.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentDtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

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

        public Criteria andInvoiceNoIsNull() {
            addCriterion("invoice_no is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("invoice_no is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(Integer value) {
            addCriterion("invoice_no =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(Integer value) {
            addCriterion("invoice_no <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(Integer value) {
            addCriterion("invoice_no >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice_no >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(Integer value) {
            addCriterion("invoice_no <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(Integer value) {
            addCriterion("invoice_no <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<Integer> values) {
            addCriterion("invoice_no in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<Integer> values) {
            addCriterion("invoice_no not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(Integer value1, Integer value2) {
            addCriterion("invoice_no between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice_no not between", value1, value2, "invoiceNo");
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

        public Criteria andItemTypeIsNull() {
            addCriterion("item_type is null");
            return (Criteria) this;
        }

        public Criteria andItemTypeIsNotNull() {
            addCriterion("item_type is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypeEqualTo(Boolean value) {
            addCriterion("item_type =", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotEqualTo(Boolean value) {
            addCriterion("item_type <>", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThan(Boolean value) {
            addCriterion("item_type >", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("item_type >=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThan(Boolean value) {
            addCriterion("item_type <", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("item_type <=", value, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeIn(List<Boolean> values) {
            addCriterion("item_type in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotIn(List<Boolean> values) {
            addCriterion("item_type not in", values, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("item_type between", value1, value2, "itemType");
            return (Criteria) this;
        }

        public Criteria andItemTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("item_type not between", value1, value2, "itemType");
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

        public Criteria andItemUnitPriceIsNull() {
            addCriterion("item_unit_price is null");
            return (Criteria) this;
        }

        public Criteria andItemUnitPriceIsNotNull() {
            addCriterion("item_unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andItemUnitPriceEqualTo(Double value) {
            addCriterion("item_unit_price =", value, "itemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andItemUnitPriceNotEqualTo(Double value) {
            addCriterion("item_unit_price <>", value, "itemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andItemUnitPriceGreaterThan(Double value) {
            addCriterion("item_unit_price >", value, "itemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andItemUnitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("item_unit_price >=", value, "itemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andItemUnitPriceLessThan(Double value) {
            addCriterion("item_unit_price <", value, "itemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andItemUnitPriceLessThanOrEqualTo(Double value) {
            addCriterion("item_unit_price <=", value, "itemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andItemUnitPriceIn(List<Double> values) {
            addCriterion("item_unit_price in", values, "itemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andItemUnitPriceNotIn(List<Double> values) {
            addCriterion("item_unit_price not in", values, "itemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andItemUnitPriceBetween(Double value1, Double value2) {
            addCriterion("item_unit_price between", value1, value2, "itemUnitPrice");
            return (Criteria) this;
        }

        public Criteria andItemUnitPriceNotBetween(Double value1, Double value2) {
            addCriterion("item_unit_price not between", value1, value2, "itemUnitPrice");
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

        public Criteria andPrescriptionGenerationTimeIsNull() {
            addCriterion("prescription_generation_time is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGenerationTimeIsNotNull() {
            addCriterion("prescription_generation_time is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGenerationTimeEqualTo(Date value) {
            addCriterion("prescription_generation_time =", value, "prescriptionGenerationTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGenerationTimeNotEqualTo(Date value) {
            addCriterion("prescription_generation_time <>", value, "prescriptionGenerationTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGenerationTimeGreaterThan(Date value) {
            addCriterion("prescription_generation_time >", value, "prescriptionGenerationTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGenerationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("prescription_generation_time >=", value, "prescriptionGenerationTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGenerationTimeLessThan(Date value) {
            addCriterion("prescription_generation_time <", value, "prescriptionGenerationTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGenerationTimeLessThanOrEqualTo(Date value) {
            addCriterion("prescription_generation_time <=", value, "prescriptionGenerationTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGenerationTimeIn(List<Date> values) {
            addCriterion("prescription_generation_time in", values, "prescriptionGenerationTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGenerationTimeNotIn(List<Date> values) {
            addCriterion("prescription_generation_time not in", values, "prescriptionGenerationTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGenerationTimeBetween(Date value1, Date value2) {
            addCriterion("prescription_generation_time between", value1, value2, "prescriptionGenerationTime");
            return (Criteria) this;
        }

        public Criteria andPrescriptionGenerationTimeNotBetween(Date value1, Date value2) {
            addCriterion("prescription_generation_time not between", value1, value2, "prescriptionGenerationTime");
            return (Criteria) this;
        }

        public Criteria andGeneratorIdIsNull() {
            addCriterion("generator_id is null");
            return (Criteria) this;
        }

        public Criteria andGeneratorIdIsNotNull() {
            addCriterion("generator_id is not null");
            return (Criteria) this;
        }

        public Criteria andGeneratorIdEqualTo(Integer value) {
            addCriterion("generator_id =", value, "generatorId");
            return (Criteria) this;
        }

        public Criteria andGeneratorIdNotEqualTo(Integer value) {
            addCriterion("generator_id <>", value, "generatorId");
            return (Criteria) this;
        }

        public Criteria andGeneratorIdGreaterThan(Integer value) {
            addCriterion("generator_id >", value, "generatorId");
            return (Criteria) this;
        }

        public Criteria andGeneratorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("generator_id >=", value, "generatorId");
            return (Criteria) this;
        }

        public Criteria andGeneratorIdLessThan(Integer value) {
            addCriterion("generator_id <", value, "generatorId");
            return (Criteria) this;
        }

        public Criteria andGeneratorIdLessThanOrEqualTo(Integer value) {
            addCriterion("generator_id <=", value, "generatorId");
            return (Criteria) this;
        }

        public Criteria andGeneratorIdIn(List<Integer> values) {
            addCriterion("generator_id in", values, "generatorId");
            return (Criteria) this;
        }

        public Criteria andGeneratorIdNotIn(List<Integer> values) {
            addCriterion("generator_id not in", values, "generatorId");
            return (Criteria) this;
        }

        public Criteria andGeneratorIdBetween(Integer value1, Integer value2) {
            addCriterion("generator_id between", value1, value2, "generatorId");
            return (Criteria) this;
        }

        public Criteria andGeneratorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("generator_id not between", value1, value2, "generatorId");
            return (Criteria) this;
        }

        public Criteria andPaymentOperationTimeIsNull() {
            addCriterion("payment_operation_time is null");
            return (Criteria) this;
        }

        public Criteria andPaymentOperationTimeIsNotNull() {
            addCriterion("payment_operation_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentOperationTimeEqualTo(Date value) {
            addCriterion("payment_operation_time =", value, "paymentOperationTime");
            return (Criteria) this;
        }

        public Criteria andPaymentOperationTimeNotEqualTo(Date value) {
            addCriterion("payment_operation_time <>", value, "paymentOperationTime");
            return (Criteria) this;
        }

        public Criteria andPaymentOperationTimeGreaterThan(Date value) {
            addCriterion("payment_operation_time >", value, "paymentOperationTime");
            return (Criteria) this;
        }

        public Criteria andPaymentOperationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_operation_time >=", value, "paymentOperationTime");
            return (Criteria) this;
        }

        public Criteria andPaymentOperationTimeLessThan(Date value) {
            addCriterion("payment_operation_time <", value, "paymentOperationTime");
            return (Criteria) this;
        }

        public Criteria andPaymentOperationTimeLessThanOrEqualTo(Date value) {
            addCriterion("payment_operation_time <=", value, "paymentOperationTime");
            return (Criteria) this;
        }

        public Criteria andPaymentOperationTimeIn(List<Date> values) {
            addCriterion("payment_operation_time in", values, "paymentOperationTime");
            return (Criteria) this;
        }

        public Criteria andPaymentOperationTimeNotIn(List<Date> values) {
            addCriterion("payment_operation_time not in", values, "paymentOperationTime");
            return (Criteria) this;
        }

        public Criteria andPaymentOperationTimeBetween(Date value1, Date value2) {
            addCriterion("payment_operation_time between", value1, value2, "paymentOperationTime");
            return (Criteria) this;
        }

        public Criteria andPaymentOperationTimeNotBetween(Date value1, Date value2) {
            addCriterion("payment_operation_time not between", value1, value2, "paymentOperationTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Integer value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Integer value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Integer value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Integer value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Integer value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Integer> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Integer> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Integer value1, Integer value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
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

        public Criteria andRelatedRefundIdIsNull() {
            addCriterion("related_refund_id is null");
            return (Criteria) this;
        }

        public Criteria andRelatedRefundIdIsNotNull() {
            addCriterion("related_refund_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedRefundIdEqualTo(Integer value) {
            addCriterion("related_refund_id =", value, "relatedRefundId");
            return (Criteria) this;
        }

        public Criteria andRelatedRefundIdNotEqualTo(Integer value) {
            addCriterion("related_refund_id <>", value, "relatedRefundId");
            return (Criteria) this;
        }

        public Criteria andRelatedRefundIdGreaterThan(Integer value) {
            addCriterion("related_refund_id >", value, "relatedRefundId");
            return (Criteria) this;
        }

        public Criteria andRelatedRefundIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("related_refund_id >=", value, "relatedRefundId");
            return (Criteria) this;
        }

        public Criteria andRelatedRefundIdLessThan(Integer value) {
            addCriterion("related_refund_id <", value, "relatedRefundId");
            return (Criteria) this;
        }

        public Criteria andRelatedRefundIdLessThanOrEqualTo(Integer value) {
            addCriterion("related_refund_id <=", value, "relatedRefundId");
            return (Criteria) this;
        }

        public Criteria andRelatedRefundIdIn(List<Integer> values) {
            addCriterion("related_refund_id in", values, "relatedRefundId");
            return (Criteria) this;
        }

        public Criteria andRelatedRefundIdNotIn(List<Integer> values) {
            addCriterion("related_refund_id not in", values, "relatedRefundId");
            return (Criteria) this;
        }

        public Criteria andRelatedRefundIdBetween(Integer value1, Integer value2) {
            addCriterion("related_refund_id between", value1, value2, "relatedRefundId");
            return (Criteria) this;
        }

        public Criteria andRelatedRefundIdNotBetween(Integer value1, Integer value2) {
            addCriterion("related_refund_id not between", value1, value2, "relatedRefundId");
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
            return deleted ? andIsDeletedEqualTo(PaymentDtl.DELETED) : andIsDeletedNotEqualTo(PaymentDtl.DELETED);
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
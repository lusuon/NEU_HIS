package org.neu.his.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public InvoiceExample() {
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andOperate_timeIsNull() {
            addCriterion("operate_time is null");
            return (Criteria) this;
        }

        public Criteria andOperate_timeIsNotNull() {
            addCriterion("operate_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperate_timeEqualTo(Date value) {
            addCriterion("operate_time =", value, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeNotEqualTo(Date value) {
            addCriterion("operate_time <>", value, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeGreaterThan(Date value) {
            addCriterion("operate_time >", value, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("operate_time >=", value, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeLessThan(Date value) {
            addCriterion("operate_time <", value, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeLessThanOrEqualTo(Date value) {
            addCriterion("operate_time <=", value, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeIn(List<Date> values) {
            addCriterion("operate_time in", values, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeNotIn(List<Date> values) {
            addCriterion("operate_time not in", values, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeBetween(Date value1, Date value2) {
            addCriterion("operate_time between", value1, value2, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeNotBetween(Date value1, Date value2) {
            addCriterion("operate_time not between", value1, value2, "operate_time");
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

        public Criteria andPay_methodIsNull() {
            addCriterion("pay_method is null");
            return (Criteria) this;
        }

        public Criteria andPay_methodIsNotNull() {
            addCriterion("pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andPay_methodEqualTo(Integer value) {
            addCriterion("pay_method =", value, "pay_method");
            return (Criteria) this;
        }

        public Criteria andPay_methodNotEqualTo(Integer value) {
            addCriterion("pay_method <>", value, "pay_method");
            return (Criteria) this;
        }

        public Criteria andPay_methodGreaterThan(Integer value) {
            addCriterion("pay_method >", value, "pay_method");
            return (Criteria) this;
        }

        public Criteria andPay_methodGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_method >=", value, "pay_method");
            return (Criteria) this;
        }

        public Criteria andPay_methodLessThan(Integer value) {
            addCriterion("pay_method <", value, "pay_method");
            return (Criteria) this;
        }

        public Criteria andPay_methodLessThanOrEqualTo(Integer value) {
            addCriterion("pay_method <=", value, "pay_method");
            return (Criteria) this;
        }

        public Criteria andPay_methodIn(List<Integer> values) {
            addCriterion("pay_method in", values, "pay_method");
            return (Criteria) this;
        }

        public Criteria andPay_methodNotIn(List<Integer> values) {
            addCriterion("pay_method not in", values, "pay_method");
            return (Criteria) this;
        }

        public Criteria andPay_methodBetween(Integer value1, Integer value2) {
            addCriterion("pay_method between", value1, value2, "pay_method");
            return (Criteria) this;
        }

        public Criteria andPay_methodNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_method not between", value1, value2, "pay_method");
            return (Criteria) this;
        }

        public Criteria andRed_invoice_noIsNull() {
            addCriterion("red_invoice_no is null");
            return (Criteria) this;
        }

        public Criteria andRed_invoice_noIsNotNull() {
            addCriterion("red_invoice_no is not null");
            return (Criteria) this;
        }

        public Criteria andRed_invoice_noEqualTo(Integer value) {
            addCriterion("red_invoice_no =", value, "red_invoice_no");
            return (Criteria) this;
        }

        public Criteria andRed_invoice_noNotEqualTo(Integer value) {
            addCriterion("red_invoice_no <>", value, "red_invoice_no");
            return (Criteria) this;
        }

        public Criteria andRed_invoice_noGreaterThan(Integer value) {
            addCriterion("red_invoice_no >", value, "red_invoice_no");
            return (Criteria) this;
        }

        public Criteria andRed_invoice_noGreaterThanOrEqualTo(Integer value) {
            addCriterion("red_invoice_no >=", value, "red_invoice_no");
            return (Criteria) this;
        }

        public Criteria andRed_invoice_noLessThan(Integer value) {
            addCriterion("red_invoice_no <", value, "red_invoice_no");
            return (Criteria) this;
        }

        public Criteria andRed_invoice_noLessThanOrEqualTo(Integer value) {
            addCriterion("red_invoice_no <=", value, "red_invoice_no");
            return (Criteria) this;
        }

        public Criteria andRed_invoice_noIn(List<Integer> values) {
            addCriterion("red_invoice_no in", values, "red_invoice_no");
            return (Criteria) this;
        }

        public Criteria andRed_invoice_noNotIn(List<Integer> values) {
            addCriterion("red_invoice_no not in", values, "red_invoice_no");
            return (Criteria) this;
        }

        public Criteria andRed_invoice_noBetween(Integer value1, Integer value2) {
            addCriterion("red_invoice_no between", value1, value2, "red_invoice_no");
            return (Criteria) this;
        }

        public Criteria andRed_invoice_noNotBetween(Integer value1, Integer value2) {
            addCriterion("red_invoice_no not between", value1, value2, "red_invoice_no");
            return (Criteria) this;
        }

        public Criteria andInvoice_statusIsNull() {
            addCriterion("invoice_status is null");
            return (Criteria) this;
        }

        public Criteria andInvoice_statusIsNotNull() {
            addCriterion("invoice_status is not null");
            return (Criteria) this;
        }

        public Criteria andInvoice_statusEqualTo(Integer value) {
            addCriterion("invoice_status =", value, "invoice_status");
            return (Criteria) this;
        }

        public Criteria andInvoice_statusNotEqualTo(Integer value) {
            addCriterion("invoice_status <>", value, "invoice_status");
            return (Criteria) this;
        }

        public Criteria andInvoice_statusGreaterThan(Integer value) {
            addCriterion("invoice_status >", value, "invoice_status");
            return (Criteria) this;
        }

        public Criteria andInvoice_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice_status >=", value, "invoice_status");
            return (Criteria) this;
        }

        public Criteria andInvoice_statusLessThan(Integer value) {
            addCriterion("invoice_status <", value, "invoice_status");
            return (Criteria) this;
        }

        public Criteria andInvoice_statusLessThanOrEqualTo(Integer value) {
            addCriterion("invoice_status <=", value, "invoice_status");
            return (Criteria) this;
        }

        public Criteria andInvoice_statusIn(List<Integer> values) {
            addCriterion("invoice_status in", values, "invoice_status");
            return (Criteria) this;
        }

        public Criteria andInvoice_statusNotIn(List<Integer> values) {
            addCriterion("invoice_status not in", values, "invoice_status");
            return (Criteria) this;
        }

        public Criteria andInvoice_statusBetween(Integer value1, Integer value2) {
            addCriterion("invoice_status between", value1, value2, "invoice_status");
            return (Criteria) this;
        }

        public Criteria andInvoice_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice_status not between", value1, value2, "invoice_status");
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
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table invoice
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andIs_deletedEqualTo(Invoice.DELETED) : andIs_deletedNotEqualTo(Invoice.DELETED);
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
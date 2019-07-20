package org.neu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PrescriptionMedicineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PrescriptionMedicineExample() {
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

        public Criteria andPrescription_nameIsNull() {
            addCriterion("prescription_name is null");
            return (Criteria) this;
        }

        public Criteria andPrescription_nameIsNotNull() {
            addCriterion("prescription_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrescription_nameEqualTo(String value) {
            addCriterion("prescription_name =", value, "prescription_name");
            return (Criteria) this;
        }

        public Criteria andPrescription_nameNotEqualTo(String value) {
            addCriterion("prescription_name <>", value, "prescription_name");
            return (Criteria) this;
        }

        public Criteria andPrescription_nameGreaterThan(String value) {
            addCriterion("prescription_name >", value, "prescription_name");
            return (Criteria) this;
        }

        public Criteria andPrescription_nameGreaterThanOrEqualTo(String value) {
            addCriterion("prescription_name >=", value, "prescription_name");
            return (Criteria) this;
        }

        public Criteria andPrescription_nameLessThan(String value) {
            addCriterion("prescription_name <", value, "prescription_name");
            return (Criteria) this;
        }

        public Criteria andPrescription_nameLessThanOrEqualTo(String value) {
            addCriterion("prescription_name <=", value, "prescription_name");
            return (Criteria) this;
        }

        public Criteria andPrescription_nameLike(String value) {
            addCriterion("prescription_name like", value, "prescription_name");
            return (Criteria) this;
        }

        public Criteria andPrescription_nameNotLike(String value) {
            addCriterion("prescription_name not like", value, "prescription_name");
            return (Criteria) this;
        }

        public Criteria andPrescription_nameIn(List<String> values) {
            addCriterion("prescription_name in", values, "prescription_name");
            return (Criteria) this;
        }

        public Criteria andPrescription_nameNotIn(List<String> values) {
            addCriterion("prescription_name not in", values, "prescription_name");
            return (Criteria) this;
        }

        public Criteria andPrescription_nameBetween(String value1, String value2) {
            addCriterion("prescription_name between", value1, value2, "prescription_name");
            return (Criteria) this;
        }

        public Criteria andPrescription_nameNotBetween(String value1, String value2) {
            addCriterion("prescription_name not between", value1, value2, "prescription_name");
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

        public Criteria andPrescription_statusIsNull() {
            addCriterion("prescription_status is null");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusIsNotNull() {
            addCriterion("prescription_status is not null");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusEqualTo(String value) {
            addCriterion("prescription_status =", value, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusNotEqualTo(String value) {
            addCriterion("prescription_status <>", value, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusGreaterThan(String value) {
            addCriterion("prescription_status >", value, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusGreaterThanOrEqualTo(String value) {
            addCriterion("prescription_status >=", value, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusLessThan(String value) {
            addCriterion("prescription_status <", value, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusLessThanOrEqualTo(String value) {
            addCriterion("prescription_status <=", value, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusLike(String value) {
            addCriterion("prescription_status like", value, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusNotLike(String value) {
            addCriterion("prescription_status not like", value, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusIn(List<String> values) {
            addCriterion("prescription_status in", values, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusNotIn(List<String> values) {
            addCriterion("prescription_status not in", values, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusBetween(String value1, String value2) {
            addCriterion("prescription_status between", value1, value2, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusNotBetween(String value1, String value2) {
            addCriterion("prescription_status not between", value1, value2, "prescription_status");
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

        public Criteria andPrescription_nameLikeInsensitive(String value) {
            addCriterion("upper(prescription_name) like", value.toUpperCase(), "prescription_name");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusLikeInsensitive(String value) {
            addCriterion("upper(prescription_status) like", value.toUpperCase(), "prescription_status");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table prescription_medicine
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andIs_deletedEqualTo(PrescriptionMedicine.DELETED) : andIs_deletedNotEqualTo(PrescriptionMedicine.DELETED);
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
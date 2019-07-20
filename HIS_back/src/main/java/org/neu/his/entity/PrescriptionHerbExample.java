package org.neu.his.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PrescriptionHerbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

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

        public Criteria andPrescription_typeIsNull() {
            addCriterion("prescription_type is null");
            return (Criteria) this;
        }

        public Criteria andPrescription_typeIsNotNull() {
            addCriterion("prescription_type is not null");
            return (Criteria) this;
        }

        public Criteria andPrescription_typeEqualTo(String value) {
            addCriterion("prescription_type =", value, "prescription_type");
            return (Criteria) this;
        }

        public Criteria andPrescription_typeNotEqualTo(String value) {
            addCriterion("prescription_type <>", value, "prescription_type");
            return (Criteria) this;
        }

        public Criteria andPrescription_typeGreaterThan(String value) {
            addCriterion("prescription_type >", value, "prescription_type");
            return (Criteria) this;
        }

        public Criteria andPrescription_typeGreaterThanOrEqualTo(String value) {
            addCriterion("prescription_type >=", value, "prescription_type");
            return (Criteria) this;
        }

        public Criteria andPrescription_typeLessThan(String value) {
            addCriterion("prescription_type <", value, "prescription_type");
            return (Criteria) this;
        }

        public Criteria andPrescription_typeLessThanOrEqualTo(String value) {
            addCriterion("prescription_type <=", value, "prescription_type");
            return (Criteria) this;
        }

        public Criteria andPrescription_typeLike(String value) {
            addCriterion("prescription_type like", value, "prescription_type");
            return (Criteria) this;
        }

        public Criteria andPrescription_typeNotLike(String value) {
            addCriterion("prescription_type not like", value, "prescription_type");
            return (Criteria) this;
        }

        public Criteria andPrescription_typeIn(List<String> values) {
            addCriterion("prescription_type in", values, "prescription_type");
            return (Criteria) this;
        }

        public Criteria andPrescription_typeNotIn(List<String> values) {
            addCriterion("prescription_type not in", values, "prescription_type");
            return (Criteria) this;
        }

        public Criteria andPrescription_typeBetween(String value1, String value2) {
            addCriterion("prescription_type between", value1, value2, "prescription_type");
            return (Criteria) this;
        }

        public Criteria andPrescription_typeNotBetween(String value1, String value2) {
            addCriterion("prescription_type not between", value1, value2, "prescription_type");
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

        public Criteria andTreatment_detailIsNull() {
            addCriterion("treatment_detail is null");
            return (Criteria) this;
        }

        public Criteria andTreatment_detailIsNotNull() {
            addCriterion("treatment_detail is not null");
            return (Criteria) this;
        }

        public Criteria andTreatment_detailEqualTo(String value) {
            addCriterion("treatment_detail =", value, "treatment_detail");
            return (Criteria) this;
        }

        public Criteria andTreatment_detailNotEqualTo(String value) {
            addCriterion("treatment_detail <>", value, "treatment_detail");
            return (Criteria) this;
        }

        public Criteria andTreatment_detailGreaterThan(String value) {
            addCriterion("treatment_detail >", value, "treatment_detail");
            return (Criteria) this;
        }

        public Criteria andTreatment_detailGreaterThanOrEqualTo(String value) {
            addCriterion("treatment_detail >=", value, "treatment_detail");
            return (Criteria) this;
        }

        public Criteria andTreatment_detailLessThan(String value) {
            addCriterion("treatment_detail <", value, "treatment_detail");
            return (Criteria) this;
        }

        public Criteria andTreatment_detailLessThanOrEqualTo(String value) {
            addCriterion("treatment_detail <=", value, "treatment_detail");
            return (Criteria) this;
        }

        public Criteria andTreatment_detailLike(String value) {
            addCriterion("treatment_detail like", value, "treatment_detail");
            return (Criteria) this;
        }

        public Criteria andTreatment_detailNotLike(String value) {
            addCriterion("treatment_detail not like", value, "treatment_detail");
            return (Criteria) this;
        }

        public Criteria andTreatment_detailIn(List<String> values) {
            addCriterion("treatment_detail in", values, "treatment_detail");
            return (Criteria) this;
        }

        public Criteria andTreatment_detailNotIn(List<String> values) {
            addCriterion("treatment_detail not in", values, "treatment_detail");
            return (Criteria) this;
        }

        public Criteria andTreatment_detailBetween(String value1, String value2) {
            addCriterion("treatment_detail between", value1, value2, "treatment_detail");
            return (Criteria) this;
        }

        public Criteria andTreatment_detailNotBetween(String value1, String value2) {
            addCriterion("treatment_detail not between", value1, value2, "treatment_detail");
            return (Criteria) this;
        }

        public Criteria andDoctor_adviceIsNull() {
            addCriterion("doctor_advice is null");
            return (Criteria) this;
        }

        public Criteria andDoctor_adviceIsNotNull() {
            addCriterion("doctor_advice is not null");
            return (Criteria) this;
        }

        public Criteria andDoctor_adviceEqualTo(String value) {
            addCriterion("doctor_advice =", value, "doctor_advice");
            return (Criteria) this;
        }

        public Criteria andDoctor_adviceNotEqualTo(String value) {
            addCriterion("doctor_advice <>", value, "doctor_advice");
            return (Criteria) this;
        }

        public Criteria andDoctor_adviceGreaterThan(String value) {
            addCriterion("doctor_advice >", value, "doctor_advice");
            return (Criteria) this;
        }

        public Criteria andDoctor_adviceGreaterThanOrEqualTo(String value) {
            addCriterion("doctor_advice >=", value, "doctor_advice");
            return (Criteria) this;
        }

        public Criteria andDoctor_adviceLessThan(String value) {
            addCriterion("doctor_advice <", value, "doctor_advice");
            return (Criteria) this;
        }

        public Criteria andDoctor_adviceLessThanOrEqualTo(String value) {
            addCriterion("doctor_advice <=", value, "doctor_advice");
            return (Criteria) this;
        }

        public Criteria andDoctor_adviceLike(String value) {
            addCriterion("doctor_advice like", value, "doctor_advice");
            return (Criteria) this;
        }

        public Criteria andDoctor_adviceNotLike(String value) {
            addCriterion("doctor_advice not like", value, "doctor_advice");
            return (Criteria) this;
        }

        public Criteria andDoctor_adviceIn(List<String> values) {
            addCriterion("doctor_advice in", values, "doctor_advice");
            return (Criteria) this;
        }

        public Criteria andDoctor_adviceNotIn(List<String> values) {
            addCriterion("doctor_advice not in", values, "doctor_advice");
            return (Criteria) this;
        }

        public Criteria andDoctor_adviceBetween(String value1, String value2) {
            addCriterion("doctor_advice between", value1, value2, "doctor_advice");
            return (Criteria) this;
        }

        public Criteria andDoctor_adviceNotBetween(String value1, String value2) {
            addCriterion("doctor_advice not between", value1, value2, "doctor_advice");
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

        public Criteria andPrescription_statusEqualTo(Integer value) {
            addCriterion("prescription_status =", value, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusNotEqualTo(Integer value) {
            addCriterion("prescription_status <>", value, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusGreaterThan(Integer value) {
            addCriterion("prescription_status >", value, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("prescription_status >=", value, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusLessThan(Integer value) {
            addCriterion("prescription_status <", value, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusLessThanOrEqualTo(Integer value) {
            addCriterion("prescription_status <=", value, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusIn(List<Integer> values) {
            addCriterion("prescription_status in", values, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusNotIn(List<Integer> values) {
            addCriterion("prescription_status not in", values, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusBetween(Integer value1, Integer value2) {
            addCriterion("prescription_status between", value1, value2, "prescription_status");
            return (Criteria) this;
        }

        public Criteria andPrescription_statusNotBetween(Integer value1, Integer value2) {
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

        public Criteria andPrescription_typeLikeInsensitive(String value) {
            addCriterion("upper(prescription_type) like", value.toUpperCase(), "prescription_type");
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

        public Criteria andTreatment_detailLikeInsensitive(String value) {
            addCriterion("upper(treatment_detail) like", value.toUpperCase(), "treatment_detail");
            return (Criteria) this;
        }

        public Criteria andDoctor_adviceLikeInsensitive(String value) {
            addCriterion("upper(doctor_advice) like", value.toUpperCase(), "doctor_advice");
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
            return deleted ? andIs_deletedEqualTo(PrescriptionHerb.DELETED) : andIs_deletedNotEqualTo(PrescriptionHerb.DELETED);
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
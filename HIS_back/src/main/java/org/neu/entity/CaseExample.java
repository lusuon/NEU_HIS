package org.neu.entity;

import java.util.ArrayList;
import java.util.List;

public class CaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CaseExample() {
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

        public Criteria andSymptomIsNull() {
            addCriterion("symptom is null");
            return (Criteria) this;
        }

        public Criteria andSymptomIsNotNull() {
            addCriterion("symptom is not null");
            return (Criteria) this;
        }

        public Criteria andSymptomEqualTo(String value) {
            addCriterion("symptom =", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotEqualTo(String value) {
            addCriterion("symptom <>", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomGreaterThan(String value) {
            addCriterion("symptom >", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomGreaterThanOrEqualTo(String value) {
            addCriterion("symptom >=", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLessThan(String value) {
            addCriterion("symptom <", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLessThanOrEqualTo(String value) {
            addCriterion("symptom <=", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomLike(String value) {
            addCriterion("symptom like", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotLike(String value) {
            addCriterion("symptom not like", value, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomIn(List<String> values) {
            addCriterion("symptom in", values, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotIn(List<String> values) {
            addCriterion("symptom not in", values, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomBetween(String value1, String value2) {
            addCriterion("symptom between", value1, value2, "symptom");
            return (Criteria) this;
        }

        public Criteria andSymptomNotBetween(String value1, String value2) {
            addCriterion("symptom not between", value1, value2, "symptom");
            return (Criteria) this;
        }

        public Criteria andCurrent_medi_historyIsNull() {
            addCriterion("current_medi_history is null");
            return (Criteria) this;
        }

        public Criteria andCurrent_medi_historyIsNotNull() {
            addCriterion("current_medi_history is not null");
            return (Criteria) this;
        }

        public Criteria andCurrent_medi_historyEqualTo(String value) {
            addCriterion("current_medi_history =", value, "current_medi_history");
            return (Criteria) this;
        }

        public Criteria andCurrent_medi_historyNotEqualTo(String value) {
            addCriterion("current_medi_history <>", value, "current_medi_history");
            return (Criteria) this;
        }

        public Criteria andCurrent_medi_historyGreaterThan(String value) {
            addCriterion("current_medi_history >", value, "current_medi_history");
            return (Criteria) this;
        }

        public Criteria andCurrent_medi_historyGreaterThanOrEqualTo(String value) {
            addCriterion("current_medi_history >=", value, "current_medi_history");
            return (Criteria) this;
        }

        public Criteria andCurrent_medi_historyLessThan(String value) {
            addCriterion("current_medi_history <", value, "current_medi_history");
            return (Criteria) this;
        }

        public Criteria andCurrent_medi_historyLessThanOrEqualTo(String value) {
            addCriterion("current_medi_history <=", value, "current_medi_history");
            return (Criteria) this;
        }

        public Criteria andCurrent_medi_historyLike(String value) {
            addCriterion("current_medi_history like", value, "current_medi_history");
            return (Criteria) this;
        }

        public Criteria andCurrent_medi_historyNotLike(String value) {
            addCriterion("current_medi_history not like", value, "current_medi_history");
            return (Criteria) this;
        }

        public Criteria andCurrent_medi_historyIn(List<String> values) {
            addCriterion("current_medi_history in", values, "current_medi_history");
            return (Criteria) this;
        }

        public Criteria andCurrent_medi_historyNotIn(List<String> values) {
            addCriterion("current_medi_history not in", values, "current_medi_history");
            return (Criteria) this;
        }

        public Criteria andCurrent_medi_historyBetween(String value1, String value2) {
            addCriterion("current_medi_history between", value1, value2, "current_medi_history");
            return (Criteria) this;
        }

        public Criteria andCurrent_medi_historyNotBetween(String value1, String value2) {
            addCriterion("current_medi_history not between", value1, value2, "current_medi_history");
            return (Criteria) this;
        }

        public Criteria andCurrent_disease_treatmentIsNull() {
            addCriterion("current_disease_treatment is null");
            return (Criteria) this;
        }

        public Criteria andCurrent_disease_treatmentIsNotNull() {
            addCriterion("current_disease_treatment is not null");
            return (Criteria) this;
        }

        public Criteria andCurrent_disease_treatmentEqualTo(String value) {
            addCriterion("current_disease_treatment =", value, "current_disease_treatment");
            return (Criteria) this;
        }

        public Criteria andCurrent_disease_treatmentNotEqualTo(String value) {
            addCriterion("current_disease_treatment <>", value, "current_disease_treatment");
            return (Criteria) this;
        }

        public Criteria andCurrent_disease_treatmentGreaterThan(String value) {
            addCriterion("current_disease_treatment >", value, "current_disease_treatment");
            return (Criteria) this;
        }

        public Criteria andCurrent_disease_treatmentGreaterThanOrEqualTo(String value) {
            addCriterion("current_disease_treatment >=", value, "current_disease_treatment");
            return (Criteria) this;
        }

        public Criteria andCurrent_disease_treatmentLessThan(String value) {
            addCriterion("current_disease_treatment <", value, "current_disease_treatment");
            return (Criteria) this;
        }

        public Criteria andCurrent_disease_treatmentLessThanOrEqualTo(String value) {
            addCriterion("current_disease_treatment <=", value, "current_disease_treatment");
            return (Criteria) this;
        }

        public Criteria andCurrent_disease_treatmentLike(String value) {
            addCriterion("current_disease_treatment like", value, "current_disease_treatment");
            return (Criteria) this;
        }

        public Criteria andCurrent_disease_treatmentNotLike(String value) {
            addCriterion("current_disease_treatment not like", value, "current_disease_treatment");
            return (Criteria) this;
        }

        public Criteria andCurrent_disease_treatmentIn(List<String> values) {
            addCriterion("current_disease_treatment in", values, "current_disease_treatment");
            return (Criteria) this;
        }

        public Criteria andCurrent_disease_treatmentNotIn(List<String> values) {
            addCriterion("current_disease_treatment not in", values, "current_disease_treatment");
            return (Criteria) this;
        }

        public Criteria andCurrent_disease_treatmentBetween(String value1, String value2) {
            addCriterion("current_disease_treatment between", value1, value2, "current_disease_treatment");
            return (Criteria) this;
        }

        public Criteria andCurrent_disease_treatmentNotBetween(String value1, String value2) {
            addCriterion("current_disease_treatment not between", value1, value2, "current_disease_treatment");
            return (Criteria) this;
        }

        public Criteria andMedi_historyIsNull() {
            addCriterion("medi_history is null");
            return (Criteria) this;
        }

        public Criteria andMedi_historyIsNotNull() {
            addCriterion("medi_history is not null");
            return (Criteria) this;
        }

        public Criteria andMedi_historyEqualTo(String value) {
            addCriterion("medi_history =", value, "medi_history");
            return (Criteria) this;
        }

        public Criteria andMedi_historyNotEqualTo(String value) {
            addCriterion("medi_history <>", value, "medi_history");
            return (Criteria) this;
        }

        public Criteria andMedi_historyGreaterThan(String value) {
            addCriterion("medi_history >", value, "medi_history");
            return (Criteria) this;
        }

        public Criteria andMedi_historyGreaterThanOrEqualTo(String value) {
            addCriterion("medi_history >=", value, "medi_history");
            return (Criteria) this;
        }

        public Criteria andMedi_historyLessThan(String value) {
            addCriterion("medi_history <", value, "medi_history");
            return (Criteria) this;
        }

        public Criteria andMedi_historyLessThanOrEqualTo(String value) {
            addCriterion("medi_history <=", value, "medi_history");
            return (Criteria) this;
        }

        public Criteria andMedi_historyLike(String value) {
            addCriterion("medi_history like", value, "medi_history");
            return (Criteria) this;
        }

        public Criteria andMedi_historyNotLike(String value) {
            addCriterion("medi_history not like", value, "medi_history");
            return (Criteria) this;
        }

        public Criteria andMedi_historyIn(List<String> values) {
            addCriterion("medi_history in", values, "medi_history");
            return (Criteria) this;
        }

        public Criteria andMedi_historyNotIn(List<String> values) {
            addCriterion("medi_history not in", values, "medi_history");
            return (Criteria) this;
        }

        public Criteria andMedi_historyBetween(String value1, String value2) {
            addCriterion("medi_history between", value1, value2, "medi_history");
            return (Criteria) this;
        }

        public Criteria andMedi_historyNotBetween(String value1, String value2) {
            addCriterion("medi_history not between", value1, value2, "medi_history");
            return (Criteria) this;
        }

        public Criteria andAllergyIsNull() {
            addCriterion("allergy is null");
            return (Criteria) this;
        }

        public Criteria andAllergyIsNotNull() {
            addCriterion("allergy is not null");
            return (Criteria) this;
        }

        public Criteria andAllergyEqualTo(String value) {
            addCriterion("allergy =", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotEqualTo(String value) {
            addCriterion("allergy <>", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyGreaterThan(String value) {
            addCriterion("allergy >", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyGreaterThanOrEqualTo(String value) {
            addCriterion("allergy >=", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyLessThan(String value) {
            addCriterion("allergy <", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyLessThanOrEqualTo(String value) {
            addCriterion("allergy <=", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyLike(String value) {
            addCriterion("allergy like", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotLike(String value) {
            addCriterion("allergy not like", value, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyIn(List<String> values) {
            addCriterion("allergy in", values, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotIn(List<String> values) {
            addCriterion("allergy not in", values, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyBetween(String value1, String value2) {
            addCriterion("allergy between", value1, value2, "allergy");
            return (Criteria) this;
        }

        public Criteria andAllergyNotBetween(String value1, String value2) {
            addCriterion("allergy not between", value1, value2, "allergy");
            return (Criteria) this;
        }

        public Criteria andBody_inspectionIsNull() {
            addCriterion("body_inspection is null");
            return (Criteria) this;
        }

        public Criteria andBody_inspectionIsNotNull() {
            addCriterion("body_inspection is not null");
            return (Criteria) this;
        }

        public Criteria andBody_inspectionEqualTo(String value) {
            addCriterion("body_inspection =", value, "body_inspection");
            return (Criteria) this;
        }

        public Criteria andBody_inspectionNotEqualTo(String value) {
            addCriterion("body_inspection <>", value, "body_inspection");
            return (Criteria) this;
        }

        public Criteria andBody_inspectionGreaterThan(String value) {
            addCriterion("body_inspection >", value, "body_inspection");
            return (Criteria) this;
        }

        public Criteria andBody_inspectionGreaterThanOrEqualTo(String value) {
            addCriterion("body_inspection >=", value, "body_inspection");
            return (Criteria) this;
        }

        public Criteria andBody_inspectionLessThan(String value) {
            addCriterion("body_inspection <", value, "body_inspection");
            return (Criteria) this;
        }

        public Criteria andBody_inspectionLessThanOrEqualTo(String value) {
            addCriterion("body_inspection <=", value, "body_inspection");
            return (Criteria) this;
        }

        public Criteria andBody_inspectionLike(String value) {
            addCriterion("body_inspection like", value, "body_inspection");
            return (Criteria) this;
        }

        public Criteria andBody_inspectionNotLike(String value) {
            addCriterion("body_inspection not like", value, "body_inspection");
            return (Criteria) this;
        }

        public Criteria andBody_inspectionIn(List<String> values) {
            addCriterion("body_inspection in", values, "body_inspection");
            return (Criteria) this;
        }

        public Criteria andBody_inspectionNotIn(List<String> values) {
            addCriterion("body_inspection not in", values, "body_inspection");
            return (Criteria) this;
        }

        public Criteria andBody_inspectionBetween(String value1, String value2) {
            addCriterion("body_inspection between", value1, value2, "body_inspection");
            return (Criteria) this;
        }

        public Criteria andBody_inspectionNotBetween(String value1, String value2) {
            addCriterion("body_inspection not between", value1, value2, "body_inspection");
            return (Criteria) this;
        }

        public Criteria andSuggestionIsNull() {
            addCriterion("suggestion is null");
            return (Criteria) this;
        }

        public Criteria andSuggestionIsNotNull() {
            addCriterion("suggestion is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestionEqualTo(String value) {
            addCriterion("suggestion =", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotEqualTo(String value) {
            addCriterion("suggestion <>", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionGreaterThan(String value) {
            addCriterion("suggestion >", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("suggestion >=", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionLessThan(String value) {
            addCriterion("suggestion <", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionLessThanOrEqualTo(String value) {
            addCriterion("suggestion <=", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionLike(String value) {
            addCriterion("suggestion like", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotLike(String value) {
            addCriterion("suggestion not like", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionIn(List<String> values) {
            addCriterion("suggestion in", values, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotIn(List<String> values) {
            addCriterion("suggestion not in", values, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionBetween(String value1, String value2) {
            addCriterion("suggestion between", value1, value2, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotBetween(String value1, String value2) {
            addCriterion("suggestion not between", value1, value2, "suggestion");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNull() {
            addCriterion("attention is null");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNotNull() {
            addCriterion("attention is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionEqualTo(String value) {
            addCriterion("attention =", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotEqualTo(String value) {
            addCriterion("attention <>", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThan(String value) {
            addCriterion("attention >", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("attention >=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThan(String value) {
            addCriterion("attention <", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThanOrEqualTo(String value) {
            addCriterion("attention <=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLike(String value) {
            addCriterion("attention like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotLike(String value) {
            addCriterion("attention not like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionIn(List<String> values) {
            addCriterion("attention in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotIn(List<String> values) {
            addCriterion("attention not in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionBetween(String value1, String value2) {
            addCriterion("attention between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotBetween(String value1, String value2) {
            addCriterion("attention not between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andInspection_resultIsNull() {
            addCriterion("inspection_result is null");
            return (Criteria) this;
        }

        public Criteria andInspection_resultIsNotNull() {
            addCriterion("inspection_result is not null");
            return (Criteria) this;
        }

        public Criteria andInspection_resultEqualTo(String value) {
            addCriterion("inspection_result =", value, "inspection_result");
            return (Criteria) this;
        }

        public Criteria andInspection_resultNotEqualTo(String value) {
            addCriterion("inspection_result <>", value, "inspection_result");
            return (Criteria) this;
        }

        public Criteria andInspection_resultGreaterThan(String value) {
            addCriterion("inspection_result >", value, "inspection_result");
            return (Criteria) this;
        }

        public Criteria andInspection_resultGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_result >=", value, "inspection_result");
            return (Criteria) this;
        }

        public Criteria andInspection_resultLessThan(String value) {
            addCriterion("inspection_result <", value, "inspection_result");
            return (Criteria) this;
        }

        public Criteria andInspection_resultLessThanOrEqualTo(String value) {
            addCriterion("inspection_result <=", value, "inspection_result");
            return (Criteria) this;
        }

        public Criteria andInspection_resultLike(String value) {
            addCriterion("inspection_result like", value, "inspection_result");
            return (Criteria) this;
        }

        public Criteria andInspection_resultNotLike(String value) {
            addCriterion("inspection_result not like", value, "inspection_result");
            return (Criteria) this;
        }

        public Criteria andInspection_resultIn(List<String> values) {
            addCriterion("inspection_result in", values, "inspection_result");
            return (Criteria) this;
        }

        public Criteria andInspection_resultNotIn(List<String> values) {
            addCriterion("inspection_result not in", values, "inspection_result");
            return (Criteria) this;
        }

        public Criteria andInspection_resultBetween(String value1, String value2) {
            addCriterion("inspection_result between", value1, value2, "inspection_result");
            return (Criteria) this;
        }

        public Criteria andInspection_resultNotBetween(String value1, String value2) {
            addCriterion("inspection_result not between", value1, value2, "inspection_result");
            return (Criteria) this;
        }

        public Criteria andDiagnose_resultIsNull() {
            addCriterion("diagnose_result is null");
            return (Criteria) this;
        }

        public Criteria andDiagnose_resultIsNotNull() {
            addCriterion("diagnose_result is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnose_resultEqualTo(String value) {
            addCriterion("diagnose_result =", value, "diagnose_result");
            return (Criteria) this;
        }

        public Criteria andDiagnose_resultNotEqualTo(String value) {
            addCriterion("diagnose_result <>", value, "diagnose_result");
            return (Criteria) this;
        }

        public Criteria andDiagnose_resultGreaterThan(String value) {
            addCriterion("diagnose_result >", value, "diagnose_result");
            return (Criteria) this;
        }

        public Criteria andDiagnose_resultGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_result >=", value, "diagnose_result");
            return (Criteria) this;
        }

        public Criteria andDiagnose_resultLessThan(String value) {
            addCriterion("diagnose_result <", value, "diagnose_result");
            return (Criteria) this;
        }

        public Criteria andDiagnose_resultLessThanOrEqualTo(String value) {
            addCriterion("diagnose_result <=", value, "diagnose_result");
            return (Criteria) this;
        }

        public Criteria andDiagnose_resultLike(String value) {
            addCriterion("diagnose_result like", value, "diagnose_result");
            return (Criteria) this;
        }

        public Criteria andDiagnose_resultNotLike(String value) {
            addCriterion("diagnose_result not like", value, "diagnose_result");
            return (Criteria) this;
        }

        public Criteria andDiagnose_resultIn(List<String> values) {
            addCriterion("diagnose_result in", values, "diagnose_result");
            return (Criteria) this;
        }

        public Criteria andDiagnose_resultNotIn(List<String> values) {
            addCriterion("diagnose_result not in", values, "diagnose_result");
            return (Criteria) this;
        }

        public Criteria andDiagnose_resultBetween(String value1, String value2) {
            addCriterion("diagnose_result between", value1, value2, "diagnose_result");
            return (Criteria) this;
        }

        public Criteria andDiagnose_resultNotBetween(String value1, String value2) {
            addCriterion("diagnose_result not between", value1, value2, "diagnose_result");
            return (Criteria) this;
        }

        public Criteria andAdviseIsNull() {
            addCriterion("advise is null");
            return (Criteria) this;
        }

        public Criteria andAdviseIsNotNull() {
            addCriterion("advise is not null");
            return (Criteria) this;
        }

        public Criteria andAdviseEqualTo(String value) {
            addCriterion("advise =", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseNotEqualTo(String value) {
            addCriterion("advise <>", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseGreaterThan(String value) {
            addCriterion("advise >", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseGreaterThanOrEqualTo(String value) {
            addCriterion("advise >=", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseLessThan(String value) {
            addCriterion("advise <", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseLessThanOrEqualTo(String value) {
            addCriterion("advise <=", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseLike(String value) {
            addCriterion("advise like", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseNotLike(String value) {
            addCriterion("advise not like", value, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseIn(List<String> values) {
            addCriterion("advise in", values, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseNotIn(List<String> values) {
            addCriterion("advise not in", values, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseBetween(String value1, String value2) {
            addCriterion("advise between", value1, value2, "advise");
            return (Criteria) this;
        }

        public Criteria andAdviseNotBetween(String value1, String value2) {
            addCriterion("advise not between", value1, value2, "advise");
            return (Criteria) this;
        }

        public Criteria andCase_statusIsNull() {
            addCriterion("case_status is null");
            return (Criteria) this;
        }

        public Criteria andCase_statusIsNotNull() {
            addCriterion("case_status is not null");
            return (Criteria) this;
        }

        public Criteria andCase_statusEqualTo(Integer value) {
            addCriterion("case_status =", value, "case_status");
            return (Criteria) this;
        }

        public Criteria andCase_statusNotEqualTo(Integer value) {
            addCriterion("case_status <>", value, "case_status");
            return (Criteria) this;
        }

        public Criteria andCase_statusGreaterThan(Integer value) {
            addCriterion("case_status >", value, "case_status");
            return (Criteria) this;
        }

        public Criteria andCase_statusGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_status >=", value, "case_status");
            return (Criteria) this;
        }

        public Criteria andCase_statusLessThan(Integer value) {
            addCriterion("case_status <", value, "case_status");
            return (Criteria) this;
        }

        public Criteria andCase_statusLessThanOrEqualTo(Integer value) {
            addCriterion("case_status <=", value, "case_status");
            return (Criteria) this;
        }

        public Criteria andCase_statusIn(List<Integer> values) {
            addCriterion("case_status in", values, "case_status");
            return (Criteria) this;
        }

        public Criteria andCase_statusNotIn(List<Integer> values) {
            addCriterion("case_status not in", values, "case_status");
            return (Criteria) this;
        }

        public Criteria andCase_statusBetween(Integer value1, Integer value2) {
            addCriterion("case_status between", value1, value2, "case_status");
            return (Criteria) this;
        }

        public Criteria andCase_statusNotBetween(Integer value1, Integer value2) {
            addCriterion("case_status not between", value1, value2, "case_status");
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

        public Criteria andSymptomLikeInsensitive(String value) {
            addCriterion("upper(symptom) like", value.toUpperCase(), "symptom");
            return (Criteria) this;
        }

        public Criteria andCurrent_medi_historyLikeInsensitive(String value) {
            addCriterion("upper(current_medi_history) like", value.toUpperCase(), "current_medi_history");
            return (Criteria) this;
        }

        public Criteria andCurrent_disease_treatmentLikeInsensitive(String value) {
            addCriterion("upper(current_disease_treatment) like", value.toUpperCase(), "current_disease_treatment");
            return (Criteria) this;
        }

        public Criteria andMedi_historyLikeInsensitive(String value) {
            addCriterion("upper(medi_history) like", value.toUpperCase(), "medi_history");
            return (Criteria) this;
        }

        public Criteria andAllergyLikeInsensitive(String value) {
            addCriterion("upper(allergy) like", value.toUpperCase(), "allergy");
            return (Criteria) this;
        }

        public Criteria andBody_inspectionLikeInsensitive(String value) {
            addCriterion("upper(body_inspection) like", value.toUpperCase(), "body_inspection");
            return (Criteria) this;
        }

        public Criteria andSuggestionLikeInsensitive(String value) {
            addCriterion("upper(suggestion) like", value.toUpperCase(), "suggestion");
            return (Criteria) this;
        }

        public Criteria andAttentionLikeInsensitive(String value) {
            addCriterion("upper(attention) like", value.toUpperCase(), "attention");
            return (Criteria) this;
        }

        public Criteria andInspection_resultLikeInsensitive(String value) {
            addCriterion("upper(inspection_result) like", value.toUpperCase(), "inspection_result");
            return (Criteria) this;
        }

        public Criteria andDiagnose_resultLikeInsensitive(String value) {
            addCriterion("upper(diagnose_result) like", value.toUpperCase(), "diagnose_result");
            return (Criteria) this;
        }

        public Criteria andAdviseLikeInsensitive(String value) {
            addCriterion("upper(advise) like", value.toUpperCase(), "advise");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table case
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Criteria andLogicalDeleted(boolean deleted) {
            return deleted ? andIs_deletedEqualTo(Case.DELETED) : andIs_deletedNotEqualTo(Case.DELETED);
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
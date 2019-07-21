package com.neu.his.entity;

import java.util.ArrayList;
import java.util.List;

public class CaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

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

        public Criteria andCaseNoIsNull() {
            addCriterion("case_no is null");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNotNull() {
            addCriterion("case_no is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNoEqualTo(Integer value) {
            addCriterion("case_no =", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotEqualTo(Integer value) {
            addCriterion("case_no <>", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThan(Integer value) {
            addCriterion("case_no >", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_no >=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThan(Integer value) {
            addCriterion("case_no <", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThanOrEqualTo(Integer value) {
            addCriterion("case_no <=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoIn(List<Integer> values) {
            addCriterion("case_no in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotIn(List<Integer> values) {
            addCriterion("case_no not in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoBetween(Integer value1, Integer value2) {
            addCriterion("case_no between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotBetween(Integer value1, Integer value2) {
            addCriterion("case_no not between", value1, value2, "caseNo");
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

        public Criteria andCurrentMediHistoryIsNull() {
            addCriterion("current_medi_history is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMediHistoryIsNotNull() {
            addCriterion("current_medi_history is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMediHistoryEqualTo(String value) {
            addCriterion("current_medi_history =", value, "currentMediHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMediHistoryNotEqualTo(String value) {
            addCriterion("current_medi_history <>", value, "currentMediHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMediHistoryGreaterThan(String value) {
            addCriterion("current_medi_history >", value, "currentMediHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMediHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("current_medi_history >=", value, "currentMediHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMediHistoryLessThan(String value) {
            addCriterion("current_medi_history <", value, "currentMediHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMediHistoryLessThanOrEqualTo(String value) {
            addCriterion("current_medi_history <=", value, "currentMediHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMediHistoryLike(String value) {
            addCriterion("current_medi_history like", value, "currentMediHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMediHistoryNotLike(String value) {
            addCriterion("current_medi_history not like", value, "currentMediHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMediHistoryIn(List<String> values) {
            addCriterion("current_medi_history in", values, "currentMediHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMediHistoryNotIn(List<String> values) {
            addCriterion("current_medi_history not in", values, "currentMediHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMediHistoryBetween(String value1, String value2) {
            addCriterion("current_medi_history between", value1, value2, "currentMediHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMediHistoryNotBetween(String value1, String value2) {
            addCriterion("current_medi_history not between", value1, value2, "currentMediHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentDiseaseTreatmentIsNull() {
            addCriterion("current_disease_treatment is null");
            return (Criteria) this;
        }

        public Criteria andCurrentDiseaseTreatmentIsNotNull() {
            addCriterion("current_disease_treatment is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentDiseaseTreatmentEqualTo(String value) {
            addCriterion("current_disease_treatment =", value, "currentDiseaseTreatment");
            return (Criteria) this;
        }

        public Criteria andCurrentDiseaseTreatmentNotEqualTo(String value) {
            addCriterion("current_disease_treatment <>", value, "currentDiseaseTreatment");
            return (Criteria) this;
        }

        public Criteria andCurrentDiseaseTreatmentGreaterThan(String value) {
            addCriterion("current_disease_treatment >", value, "currentDiseaseTreatment");
            return (Criteria) this;
        }

        public Criteria andCurrentDiseaseTreatmentGreaterThanOrEqualTo(String value) {
            addCriterion("current_disease_treatment >=", value, "currentDiseaseTreatment");
            return (Criteria) this;
        }

        public Criteria andCurrentDiseaseTreatmentLessThan(String value) {
            addCriterion("current_disease_treatment <", value, "currentDiseaseTreatment");
            return (Criteria) this;
        }

        public Criteria andCurrentDiseaseTreatmentLessThanOrEqualTo(String value) {
            addCriterion("current_disease_treatment <=", value, "currentDiseaseTreatment");
            return (Criteria) this;
        }

        public Criteria andCurrentDiseaseTreatmentLike(String value) {
            addCriterion("current_disease_treatment like", value, "currentDiseaseTreatment");
            return (Criteria) this;
        }

        public Criteria andCurrentDiseaseTreatmentNotLike(String value) {
            addCriterion("current_disease_treatment not like", value, "currentDiseaseTreatment");
            return (Criteria) this;
        }

        public Criteria andCurrentDiseaseTreatmentIn(List<String> values) {
            addCriterion("current_disease_treatment in", values, "currentDiseaseTreatment");
            return (Criteria) this;
        }

        public Criteria andCurrentDiseaseTreatmentNotIn(List<String> values) {
            addCriterion("current_disease_treatment not in", values, "currentDiseaseTreatment");
            return (Criteria) this;
        }

        public Criteria andCurrentDiseaseTreatmentBetween(String value1, String value2) {
            addCriterion("current_disease_treatment between", value1, value2, "currentDiseaseTreatment");
            return (Criteria) this;
        }

        public Criteria andCurrentDiseaseTreatmentNotBetween(String value1, String value2) {
            addCriterion("current_disease_treatment not between", value1, value2, "currentDiseaseTreatment");
            return (Criteria) this;
        }

        public Criteria andMediHistoryIsNull() {
            addCriterion("medi_history is null");
            return (Criteria) this;
        }

        public Criteria andMediHistoryIsNotNull() {
            addCriterion("medi_history is not null");
            return (Criteria) this;
        }

        public Criteria andMediHistoryEqualTo(String value) {
            addCriterion("medi_history =", value, "mediHistory");
            return (Criteria) this;
        }

        public Criteria andMediHistoryNotEqualTo(String value) {
            addCriterion("medi_history <>", value, "mediHistory");
            return (Criteria) this;
        }

        public Criteria andMediHistoryGreaterThan(String value) {
            addCriterion("medi_history >", value, "mediHistory");
            return (Criteria) this;
        }

        public Criteria andMediHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("medi_history >=", value, "mediHistory");
            return (Criteria) this;
        }

        public Criteria andMediHistoryLessThan(String value) {
            addCriterion("medi_history <", value, "mediHistory");
            return (Criteria) this;
        }

        public Criteria andMediHistoryLessThanOrEqualTo(String value) {
            addCriterion("medi_history <=", value, "mediHistory");
            return (Criteria) this;
        }

        public Criteria andMediHistoryLike(String value) {
            addCriterion("medi_history like", value, "mediHistory");
            return (Criteria) this;
        }

        public Criteria andMediHistoryNotLike(String value) {
            addCriterion("medi_history not like", value, "mediHistory");
            return (Criteria) this;
        }

        public Criteria andMediHistoryIn(List<String> values) {
            addCriterion("medi_history in", values, "mediHistory");
            return (Criteria) this;
        }

        public Criteria andMediHistoryNotIn(List<String> values) {
            addCriterion("medi_history not in", values, "mediHistory");
            return (Criteria) this;
        }

        public Criteria andMediHistoryBetween(String value1, String value2) {
            addCriterion("medi_history between", value1, value2, "mediHistory");
            return (Criteria) this;
        }

        public Criteria andMediHistoryNotBetween(String value1, String value2) {
            addCriterion("medi_history not between", value1, value2, "mediHistory");
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

        public Criteria andBodyInspectionIsNull() {
            addCriterion("body_inspection is null");
            return (Criteria) this;
        }

        public Criteria andBodyInspectionIsNotNull() {
            addCriterion("body_inspection is not null");
            return (Criteria) this;
        }

        public Criteria andBodyInspectionEqualTo(String value) {
            addCriterion("body_inspection =", value, "bodyInspection");
            return (Criteria) this;
        }

        public Criteria andBodyInspectionNotEqualTo(String value) {
            addCriterion("body_inspection <>", value, "bodyInspection");
            return (Criteria) this;
        }

        public Criteria andBodyInspectionGreaterThan(String value) {
            addCriterion("body_inspection >", value, "bodyInspection");
            return (Criteria) this;
        }

        public Criteria andBodyInspectionGreaterThanOrEqualTo(String value) {
            addCriterion("body_inspection >=", value, "bodyInspection");
            return (Criteria) this;
        }

        public Criteria andBodyInspectionLessThan(String value) {
            addCriterion("body_inspection <", value, "bodyInspection");
            return (Criteria) this;
        }

        public Criteria andBodyInspectionLessThanOrEqualTo(String value) {
            addCriterion("body_inspection <=", value, "bodyInspection");
            return (Criteria) this;
        }

        public Criteria andBodyInspectionLike(String value) {
            addCriterion("body_inspection like", value, "bodyInspection");
            return (Criteria) this;
        }

        public Criteria andBodyInspectionNotLike(String value) {
            addCriterion("body_inspection not like", value, "bodyInspection");
            return (Criteria) this;
        }

        public Criteria andBodyInspectionIn(List<String> values) {
            addCriterion("body_inspection in", values, "bodyInspection");
            return (Criteria) this;
        }

        public Criteria andBodyInspectionNotIn(List<String> values) {
            addCriterion("body_inspection not in", values, "bodyInspection");
            return (Criteria) this;
        }

        public Criteria andBodyInspectionBetween(String value1, String value2) {
            addCriterion("body_inspection between", value1, value2, "bodyInspection");
            return (Criteria) this;
        }

        public Criteria andBodyInspectionNotBetween(String value1, String value2) {
            addCriterion("body_inspection not between", value1, value2, "bodyInspection");
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

        public Criteria andInspectionResultIsNull() {
            addCriterion("inspection_result is null");
            return (Criteria) this;
        }

        public Criteria andInspectionResultIsNotNull() {
            addCriterion("inspection_result is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionResultEqualTo(String value) {
            addCriterion("inspection_result =", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultNotEqualTo(String value) {
            addCriterion("inspection_result <>", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultGreaterThan(String value) {
            addCriterion("inspection_result >", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultGreaterThanOrEqualTo(String value) {
            addCriterion("inspection_result >=", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultLessThan(String value) {
            addCriterion("inspection_result <", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultLessThanOrEqualTo(String value) {
            addCriterion("inspection_result <=", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultLike(String value) {
            addCriterion("inspection_result like", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultNotLike(String value) {
            addCriterion("inspection_result not like", value, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultIn(List<String> values) {
            addCriterion("inspection_result in", values, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultNotIn(List<String> values) {
            addCriterion("inspection_result not in", values, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultBetween(String value1, String value2) {
            addCriterion("inspection_result between", value1, value2, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andInspectionResultNotBetween(String value1, String value2) {
            addCriterion("inspection_result not between", value1, value2, "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseResultIsNull() {
            addCriterion("diagnose_result is null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseResultIsNotNull() {
            addCriterion("diagnose_result is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnoseResultEqualTo(String value) {
            addCriterion("diagnose_result =", value, "diagnoseResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseResultNotEqualTo(String value) {
            addCriterion("diagnose_result <>", value, "diagnoseResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseResultGreaterThan(String value) {
            addCriterion("diagnose_result >", value, "diagnoseResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseResultGreaterThanOrEqualTo(String value) {
            addCriterion("diagnose_result >=", value, "diagnoseResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseResultLessThan(String value) {
            addCriterion("diagnose_result <", value, "diagnoseResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseResultLessThanOrEqualTo(String value) {
            addCriterion("diagnose_result <=", value, "diagnoseResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseResultLike(String value) {
            addCriterion("diagnose_result like", value, "diagnoseResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseResultNotLike(String value) {
            addCriterion("diagnose_result not like", value, "diagnoseResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseResultIn(List<String> values) {
            addCriterion("diagnose_result in", values, "diagnoseResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseResultNotIn(List<String> values) {
            addCriterion("diagnose_result not in", values, "diagnoseResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseResultBetween(String value1, String value2) {
            addCriterion("diagnose_result between", value1, value2, "diagnoseResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseResultNotBetween(String value1, String value2) {
            addCriterion("diagnose_result not between", value1, value2, "diagnoseResult");
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

        public Criteria andCaseStatusIsNull() {
            addCriterion("case_status is null");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIsNotNull() {
            addCriterion("case_status is not null");
            return (Criteria) this;
        }

        public Criteria andCaseStatusEqualTo(Integer value) {
            addCriterion("case_status =", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotEqualTo(Integer value) {
            addCriterion("case_status <>", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusGreaterThan(Integer value) {
            addCriterion("case_status >", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_status >=", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLessThan(Integer value) {
            addCriterion("case_status <", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("case_status <=", value, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusIn(List<Integer> values) {
            addCriterion("case_status in", values, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotIn(List<Integer> values) {
            addCriterion("case_status not in", values, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusBetween(Integer value1, Integer value2) {
            addCriterion("case_status between", value1, value2, "caseStatus");
            return (Criteria) this;
        }

        public Criteria andCaseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("case_status not between", value1, value2, "caseStatus");
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

        public Criteria andSymptomLikeInsensitive(String value) {
            addCriterion("upper(symptom) like", value.toUpperCase(), "symptom");
            return (Criteria) this;
        }

        public Criteria andCurrentMediHistoryLikeInsensitive(String value) {
            addCriterion("upper(current_medi_history) like", value.toUpperCase(), "currentMediHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentDiseaseTreatmentLikeInsensitive(String value) {
            addCriterion("upper(current_disease_treatment) like", value.toUpperCase(), "currentDiseaseTreatment");
            return (Criteria) this;
        }

        public Criteria andMediHistoryLikeInsensitive(String value) {
            addCriterion("upper(medi_history) like", value.toUpperCase(), "mediHistory");
            return (Criteria) this;
        }

        public Criteria andAllergyLikeInsensitive(String value) {
            addCriterion("upper(allergy) like", value.toUpperCase(), "allergy");
            return (Criteria) this;
        }

        public Criteria andBodyInspectionLikeInsensitive(String value) {
            addCriterion("upper(body_inspection) like", value.toUpperCase(), "bodyInspection");
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

        public Criteria andInspectionResultLikeInsensitive(String value) {
            addCriterion("upper(inspection_result) like", value.toUpperCase(), "inspectionResult");
            return (Criteria) this;
        }

        public Criteria andDiagnoseResultLikeInsensitive(String value) {
            addCriterion("upper(diagnose_result) like", value.toUpperCase(), "diagnoseResult");
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
            return deleted ? andIsDeletedEqualTo(Case.DELETED) : andIsDeletedNotEqualTo(Case.DELETED);
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
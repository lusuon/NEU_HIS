package com.neu.his.entity;

import javax.persistence.*;

@Entity
@Table(name = "case", schema = "neu_his", catalog = "")
public class CaseEntity {
    private int id;
    private int caseNo;
    private int regId;
    private String symptom;
    private String currentMediHistory;
    private String currentDiseaseTreatment;
    private String mediHistory;
    private String allergy;
    private String bodyInspection;
    private String suggestion;
    private String attention;
    private String inspectionResult;
    private String diagnoseResult;
    private String advise;
    private int caseStatus;
    private byte isDeleted;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "case_no")
    public int getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(int caseNo) {
        this.caseNo = caseNo;
    }

    @Basic
    @Column(name = "reg_id")
    public int getRegId() {
        return regId;
    }

    public void setRegId(int regId) {
        this.regId = regId;
    }

    @Basic
    @Column(name = "symptom")
    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    @Basic
    @Column(name = "current_medi_history")
    public String getCurrentMediHistory() {
        return currentMediHistory;
    }

    public void setCurrentMediHistory(String currentMediHistory) {
        this.currentMediHistory = currentMediHistory;
    }

    @Basic
    @Column(name = "current_disease_treatment")
    public String getCurrentDiseaseTreatment() {
        return currentDiseaseTreatment;
    }

    public void setCurrentDiseaseTreatment(String currentDiseaseTreatment) {
        this.currentDiseaseTreatment = currentDiseaseTreatment;
    }

    @Basic
    @Column(name = "medi_history")
    public String getMediHistory() {
        return mediHistory;
    }

    public void setMediHistory(String mediHistory) {
        this.mediHistory = mediHistory;
    }

    @Basic
    @Column(name = "allergy")
    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    @Basic
    @Column(name = "body_inspection")
    public String getBodyInspection() {
        return bodyInspection;
    }

    public void setBodyInspection(String bodyInspection) {
        this.bodyInspection = bodyInspection;
    }

    @Basic
    @Column(name = "suggestion")
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    @Basic
    @Column(name = "attention")
    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    @Basic
    @Column(name = "inspection_result")
    public String getInspectionResult() {
        return inspectionResult;
    }

    public void setInspectionResult(String inspectionResult) {
        this.inspectionResult = inspectionResult;
    }

    @Basic
    @Column(name = "diagnose_result")
    public String getDiagnoseResult() {
        return diagnoseResult;
    }

    public void setDiagnoseResult(String diagnoseResult) {
        this.diagnoseResult = diagnoseResult;
    }

    @Basic
    @Column(name = "advise")
    public String getAdvise() {
        return advise;
    }

    public void setAdvise(String advise) {
        this.advise = advise;
    }

    @Basic
    @Column(name = "case_status")
    public int getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(int caseStatus) {
        this.caseStatus = caseStatus;
    }

    @Basic
    @Column(name = "is_deleted")
    public byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CaseEntity that = (CaseEntity) o;

        if (id != that.id) return false;
        if (caseNo != that.caseNo) return false;
        if (regId != that.regId) return false;
        if (caseStatus != that.caseStatus) return false;
        if (isDeleted != that.isDeleted) return false;
        if (symptom != null ? !symptom.equals(that.symptom) : that.symptom != null) return false;
        if (currentMediHistory != null ? !currentMediHistory.equals(that.currentMediHistory) : that.currentMediHistory != null)
            return false;
        if (currentDiseaseTreatment != null ? !currentDiseaseTreatment.equals(that.currentDiseaseTreatment) : that.currentDiseaseTreatment != null)
            return false;
        if (mediHistory != null ? !mediHistory.equals(that.mediHistory) : that.mediHistory != null) return false;
        if (allergy != null ? !allergy.equals(that.allergy) : that.allergy != null) return false;
        if (bodyInspection != null ? !bodyInspection.equals(that.bodyInspection) : that.bodyInspection != null)
            return false;
        if (suggestion != null ? !suggestion.equals(that.suggestion) : that.suggestion != null) return false;
        if (attention != null ? !attention.equals(that.attention) : that.attention != null) return false;
        if (inspectionResult != null ? !inspectionResult.equals(that.inspectionResult) : that.inspectionResult != null)
            return false;
        if (diagnoseResult != null ? !diagnoseResult.equals(that.diagnoseResult) : that.diagnoseResult != null)
            return false;
        if (advise != null ? !advise.equals(that.advise) : that.advise != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + caseNo;
        result = 31 * result + regId;
        result = 31 * result + (symptom != null ? symptom.hashCode() : 0);
        result = 31 * result + (currentMediHistory != null ? currentMediHistory.hashCode() : 0);
        result = 31 * result + (currentDiseaseTreatment != null ? currentDiseaseTreatment.hashCode() : 0);
        result = 31 * result + (mediHistory != null ? mediHistory.hashCode() : 0);
        result = 31 * result + (allergy != null ? allergy.hashCode() : 0);
        result = 31 * result + (bodyInspection != null ? bodyInspection.hashCode() : 0);
        result = 31 * result + (suggestion != null ? suggestion.hashCode() : 0);
        result = 31 * result + (attention != null ? attention.hashCode() : 0);
        result = 31 * result + (inspectionResult != null ? inspectionResult.hashCode() : 0);
        result = 31 * result + (diagnoseResult != null ? diagnoseResult.hashCode() : 0);
        result = 31 * result + (advise != null ? advise.hashCode() : 0);
        result = 31 * result + caseStatus;
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

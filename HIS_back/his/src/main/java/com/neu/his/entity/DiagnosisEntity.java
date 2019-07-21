package com.neu.his.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "diagnosis", schema = "neu_his", catalog = "")
public class DiagnosisEntity {
    private int id;
    private int caseId;
    private int regId;
    private int diseaseId;
    private byte diagnosisType;
    private Timestamp onsetTime;
    private byte diagnosisClass;
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
    @Column(name = "case_id")
    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
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
    @Column(name = "disease_id")
    public int getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(int diseaseId) {
        this.diseaseId = diseaseId;
    }

    @Basic
    @Column(name = "diagnosis_type")
    public byte getDiagnosisType() {
        return diagnosisType;
    }

    public void setDiagnosisType(byte diagnosisType) {
        this.diagnosisType = diagnosisType;
    }

    @Basic
    @Column(name = "onset_time")
    public Timestamp getOnsetTime() {
        return onsetTime;
    }

    public void setOnsetTime(Timestamp onsetTime) {
        this.onsetTime = onsetTime;
    }

    @Basic
    @Column(name = "diagnosis_class")
    public byte getDiagnosisClass() {
        return diagnosisClass;
    }

    public void setDiagnosisClass(byte diagnosisClass) {
        this.diagnosisClass = diagnosisClass;
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

        DiagnosisEntity that = (DiagnosisEntity) o;

        if (id != that.id) return false;
        if (caseId != that.caseId) return false;
        if (regId != that.regId) return false;
        if (diseaseId != that.diseaseId) return false;
        if (diagnosisType != that.diagnosisType) return false;
        if (diagnosisClass != that.diagnosisClass) return false;
        if (isDeleted != that.isDeleted) return false;
        if (onsetTime != null ? !onsetTime.equals(that.onsetTime) : that.onsetTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + caseId;
        result = 31 * result + regId;
        result = 31 * result + diseaseId;
        result = 31 * result + (int) diagnosisType;
        result = 31 * result + (onsetTime != null ? onsetTime.hashCode() : 0);
        result = 31 * result + (int) diagnosisClass;
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

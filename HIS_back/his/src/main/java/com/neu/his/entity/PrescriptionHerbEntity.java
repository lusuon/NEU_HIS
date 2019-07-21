package com.neu.his.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "prescription_herb", schema = "neu_his", catalog = "")
public class PrescriptionHerbEntity {
    private int id;
    private int caseId;
    private int regId;
    private int doctorId;
    private String prescriptionName;
    private Date generateTime;
    private String prescriptionType;
    private int quantity;
    private String frequency;
    private String method;
    private String treatment;
    private String treatmentDetail;
    private String doctorAdvice;
    private int prescriptionStatus;
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
    @Column(name = "doctor_id")
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    @Basic
    @Column(name = "prescription_name")
    public String getPrescriptionName() {
        return prescriptionName;
    }

    public void setPrescriptionName(String prescriptionName) {
        this.prescriptionName = prescriptionName;
    }

    @Basic
    @Column(name = "generate_time")
    public Date getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(Date generateTime) {
        this.generateTime = generateTime;
    }

    @Basic
    @Column(name = "prescription_type")
    public String getPrescriptionType() {
        return prescriptionType;
    }

    public void setPrescriptionType(String prescriptionType) {
        this.prescriptionType = prescriptionType;
    }

    @Basic
    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "frequency")
    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @Basic
    @Column(name = "method")
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Basic
    @Column(name = "treatment")
    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    @Basic
    @Column(name = "treatment_detail")
    public String getTreatmentDetail() {
        return treatmentDetail;
    }

    public void setTreatmentDetail(String treatmentDetail) {
        this.treatmentDetail = treatmentDetail;
    }

    @Basic
    @Column(name = "doctor_advice")
    public String getDoctorAdvice() {
        return doctorAdvice;
    }

    public void setDoctorAdvice(String doctorAdvice) {
        this.doctorAdvice = doctorAdvice;
    }

    @Basic
    @Column(name = "prescription_status")
    public int getPrescriptionStatus() {
        return prescriptionStatus;
    }

    public void setPrescriptionStatus(int prescriptionStatus) {
        this.prescriptionStatus = prescriptionStatus;
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

        PrescriptionHerbEntity that = (PrescriptionHerbEntity) o;

        if (id != that.id) return false;
        if (caseId != that.caseId) return false;
        if (regId != that.regId) return false;
        if (doctorId != that.doctorId) return false;
        if (quantity != that.quantity) return false;
        if (prescriptionStatus != that.prescriptionStatus) return false;
        if (isDeleted != that.isDeleted) return false;
        if (prescriptionName != null ? !prescriptionName.equals(that.prescriptionName) : that.prescriptionName != null)
            return false;
        if (generateTime != null ? !generateTime.equals(that.generateTime) : that.generateTime != null) return false;
        if (prescriptionType != null ? !prescriptionType.equals(that.prescriptionType) : that.prescriptionType != null)
            return false;
        if (frequency != null ? !frequency.equals(that.frequency) : that.frequency != null) return false;
        if (method != null ? !method.equals(that.method) : that.method != null) return false;
        if (treatment != null ? !treatment.equals(that.treatment) : that.treatment != null) return false;
        if (treatmentDetail != null ? !treatmentDetail.equals(that.treatmentDetail) : that.treatmentDetail != null)
            return false;
        if (doctorAdvice != null ? !doctorAdvice.equals(that.doctorAdvice) : that.doctorAdvice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + caseId;
        result = 31 * result + regId;
        result = 31 * result + doctorId;
        result = 31 * result + (prescriptionName != null ? prescriptionName.hashCode() : 0);
        result = 31 * result + (generateTime != null ? generateTime.hashCode() : 0);
        result = 31 * result + (prescriptionType != null ? prescriptionType.hashCode() : 0);
        result = 31 * result + quantity;
        result = 31 * result + (frequency != null ? frequency.hashCode() : 0);
        result = 31 * result + (method != null ? method.hashCode() : 0);
        result = 31 * result + (treatment != null ? treatment.hashCode() : 0);
        result = 31 * result + (treatmentDetail != null ? treatmentDetail.hashCode() : 0);
        result = 31 * result + (doctorAdvice != null ? doctorAdvice.hashCode() : 0);
        result = 31 * result + prescriptionStatus;
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

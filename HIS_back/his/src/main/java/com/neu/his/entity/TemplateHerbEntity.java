package com.neu.his.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "template_herb", schema = "neu_his", catalog = "")
public class TemplateHerbEntity {
    private int id;
    private String name;
    private int doctorId;
    private Timestamp createTime;
    private String prescriptionType;
    private int number;
    private String method;
    private String treatment;
    private String treatmentDetail;
    private String doctorAdvice;
    private int range;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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
    @Column(name = "number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
    @Column(name = "range")
    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
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

        TemplateHerbEntity that = (TemplateHerbEntity) o;

        if (id != that.id) return false;
        if (doctorId != that.doctorId) return false;
        if (number != that.number) return false;
        if (isDeleted != that.isDeleted) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (prescriptionType != null ? !prescriptionType.equals(that.prescriptionType) : that.prescriptionType != null)
            return false;
        if (method != null ? !method.equals(that.method) : that.method != null) return false;
        if (treatment != null ? !treatment.equals(that.treatment) : that.treatment != null) return false;
        if (treatmentDetail != null ? !treatmentDetail.equals(that.treatmentDetail) : that.treatmentDetail != null)
            return false;
        if (doctorAdvice != null ? !doctorAdvice.equals(that.doctorAdvice) : that.doctorAdvice != null) return false;
        if (range != that.range) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + doctorId;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (prescriptionType != null ? prescriptionType.hashCode() : 0);
        result = 31 * result + number;
        result = 31 * result + (method != null ? method.hashCode() : 0);
        result = 31 * result + (treatment != null ? treatment.hashCode() : 0);
        result = 31 * result + (treatmentDetail != null ? treatmentDetail.hashCode() : 0);
        result = 31 * result + (doctorAdvice != null ? doctorAdvice.hashCode() : 0);
        result = 31 * result + range;
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

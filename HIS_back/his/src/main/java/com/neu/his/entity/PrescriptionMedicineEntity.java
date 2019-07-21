package com.neu.his.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "prescription_medicine", schema = "neu_his", catalog = "")
public class PrescriptionMedicineEntity {
    private int id;
    private int caseId;
    private int regId;
    private int doctorId;
    private String prescriptionName;
    private Date generateTime;
    private String prescriptionStatus;
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
    @Column(name = "prescription_status")
    public String getPrescriptionStatus() {
        return prescriptionStatus;
    }

    public void setPrescriptionStatus(String prescriptionStatus) {
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

        PrescriptionMedicineEntity that = (PrescriptionMedicineEntity) o;

        if (id != that.id) return false;
        if (caseId != that.caseId) return false;
        if (regId != that.regId) return false;
        if (doctorId != that.doctorId) return false;
        if (isDeleted != that.isDeleted) return false;
        if (prescriptionName != null ? !prescriptionName.equals(that.prescriptionName) : that.prescriptionName != null)
            return false;
        if (generateTime != null ? !generateTime.equals(that.generateTime) : that.generateTime != null) return false;
        if (prescriptionStatus != null ? !prescriptionStatus.equals(that.prescriptionStatus) : that.prescriptionStatus != null)
            return false;

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
        result = 31 * result + (prescriptionStatus != null ? prescriptionStatus.hashCode() : 0);
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

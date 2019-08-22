package com.neu.his.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "prescription_medicine_dtl", schema = "neu_his", catalog = "")
public class PrescriptionMedicineDtlEntity {
    private int id;
    private int prescriptionId;
    private int medicineId;
    private String method;
    private String dosage;
    private String frequency;
    private int quantity;
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
    @Column(name = "prescription_id")
    public int getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(int prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    @Basic
    @Column(name = "medicine_id")
    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
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
    @Column(name = "dosage")
    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
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
    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

        PrescriptionMedicineDtlEntity that = (PrescriptionMedicineDtlEntity) o;

        if (id != that.id) return false;
        if (prescriptionId != that.prescriptionId) return false;
        if (medicineId != that.medicineId) return false;
        if (quantity != that.quantity) return false;
        if (prescriptionStatus != that.prescriptionStatus) return false;
        if (isDeleted != that.isDeleted) return false;
        if (method != null ? !method.equals(that.method) : that.method != null) return false;
        if (dosage != null ? !dosage.equals(that.dosage) : that.dosage != null) return false;
        if (frequency != null ? !frequency.equals(that.frequency) : that.frequency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + prescriptionId;
        result = 31 * result + medicineId;
        result = 31 * result + (method != null ? method.hashCode() : 0);
        result = 31 * result + (dosage != null ? dosage.hashCode() : 0);
        result = 31 * result + (frequency != null ? frequency.hashCode() : 0);
        result = 31 * result + quantity;
        result = 31 * result + prescriptionStatus;
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

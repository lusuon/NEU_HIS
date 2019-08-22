package com.neu.his.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "template_dtl_medi", schema = "neu_his", catalog = "")
public class TemplateDtlMediEntity {
    private int id;
    private int templateId;
    private int medicineId;
    private String method;
    private String consumption;
    private String frequency;
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
    @Column(name = "template_id")
    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
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
    @Column(name = "consumption")
    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
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

        TemplateDtlMediEntity that = (TemplateDtlMediEntity) o;

        if (id != that.id) return false;
        if (templateId != that.templateId) return false;
        if (medicineId != that.medicineId) return false;
        if (isDeleted != that.isDeleted) return false;
        if (method != null ? !method.equals(that.method) : that.method != null) return false;
        if (consumption != null ? !consumption.equals(that.consumption) : that.consumption != null) return false;
        if (frequency != null ? !frequency.equals(that.frequency) : that.frequency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + templateId;
        result = 31 * result + medicineId;
        result = 31 * result + (method != null ? method.hashCode() : 0);
        result = 31 * result + (consumption != null ? consumption.hashCode() : 0);
        result = 31 * result + (frequency != null ? frequency.hashCode() : 0);
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

package com.neu.his.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "prescription_herb_dtl", schema = "neu_his", catalog = "")
public class PrescriptionHerbDtlEntity {
    private int id;
    private int prescriptionId;
    private int herbId;
    private String consumption;
    private double unitPrice;
    private String description;
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
    @Column(name = "herb_id")
    public int getHerbId() {
        return herbId;
    }

    public void setHerbId(int herbId) {
        this.herbId = herbId;
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
    @Column(name = "unit_price")
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

        PrescriptionHerbDtlEntity that = (PrescriptionHerbDtlEntity) o;

        if (id != that.id) return false;
        if (prescriptionId != that.prescriptionId) return false;
        if (herbId != that.herbId) return false;
        if (Double.compare(that.unitPrice, unitPrice) != 0) return false;
        if (isDeleted != that.isDeleted) return false;
        if (consumption != null ? !consumption.equals(that.consumption) : that.consumption != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + prescriptionId;
        result = 31 * result + herbId;
        result = 31 * result + (consumption != null ? consumption.hashCode() : 0);
        temp = Double.doubleToLongBits(unitPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

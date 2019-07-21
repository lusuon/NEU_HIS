package com.neu.his.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "drug", schema = "neu_his", catalog = "")
public class DrugEntity {
    private int id;
    private String code;
    private String drugName;
    private String standard;
    private String unit;
    private String factory;
    private int dosage;
    private int typeId;
    private double unitPrice;
    private String pinyinMnemonicCode;
    private Date createTime;
    private Date lastEditTime;
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
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "drug_name")
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    @Basic
    @Column(name = "standard")
    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    @Basic
    @Column(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "factory")
    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    @Basic
    @Column(name = "dosage")
    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    @Basic
    @Column(name = "type_id")
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
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
    @Column(name = "pinyin_mnemonic_code")
    public String getPinyinMnemonicCode() {
        return pinyinMnemonicCode;
    }

    public void setPinyinMnemonicCode(String pinyinMnemonicCode) {
        this.pinyinMnemonicCode = pinyinMnemonicCode;
    }

    @Basic
    @Column(name = "create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "last_edit_time")
    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
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

        DrugEntity that = (DrugEntity) o;

        if (id != that.id) return false;
        if (dosage != that.dosage) return false;
        if (typeId != that.typeId) return false;
        if (Double.compare(that.unitPrice, unitPrice) != 0) return false;
        if (isDeleted != that.isDeleted) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (drugName != null ? !drugName.equals(that.drugName) : that.drugName != null) return false;
        if (standard != null ? !standard.equals(that.standard) : that.standard != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (factory != null ? !factory.equals(that.factory) : that.factory != null) return false;
        if (pinyinMnemonicCode != null ? !pinyinMnemonicCode.equals(that.pinyinMnemonicCode) : that.pinyinMnemonicCode != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (lastEditTime != null ? !lastEditTime.equals(that.lastEditTime) : that.lastEditTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (drugName != null ? drugName.hashCode() : 0);
        result = 31 * result + (standard != null ? standard.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (factory != null ? factory.hashCode() : 0);
        result = 31 * result + dosage;
        result = 31 * result + typeId;
        temp = Double.doubleToLongBits(unitPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (pinyinMnemonicCode != null ? pinyinMnemonicCode.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (lastEditTime != null ? lastEditTime.hashCode() : 0);
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

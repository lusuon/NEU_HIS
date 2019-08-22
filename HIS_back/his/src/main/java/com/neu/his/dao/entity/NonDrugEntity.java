package com.neu.his.dao.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "non_drug", schema = "neu_his", catalog = "")
public class NonDrugEntity {
    private int id;
    private String code;
    private String nonDrugName;
    private String standard;
    private double unitPrice;
    private int categoryPaymentId;
    private int deptId;
    private String pinyinMnemonicCode;
    private Date createTime;
    private Date lastEditTime;
    private short itemType;
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
    @Column(name = "non_drug_name")
    public String getNonDrugName() {
        return nonDrugName;
    }

    public void setNonDrugName(String nonDrugName) {
        this.nonDrugName = nonDrugName;
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
    @Column(name = "unit_price")
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "category_payment_id")
    public int getCategoryPaymentId() {
        return categoryPaymentId;
    }

    public void setCategoryPaymentId(int categoryPaymentId) {
        this.categoryPaymentId = categoryPaymentId;
    }

    @Basic
    @Column(name = "dept_id")
    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
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
    @Column(name = "item_type")
    public short getItemType() {
        return itemType;
    }

    public void setItemType(short itemType) {
        this.itemType = itemType;
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

        NonDrugEntity that = (NonDrugEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.unitPrice, unitPrice) != 0) return false;
        if (categoryPaymentId != that.categoryPaymentId) return false;
        if (deptId != that.deptId) return false;
        if (itemType != that.itemType) return false;
        if (isDeleted != that.isDeleted) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (nonDrugName != null ? !nonDrugName.equals(that.nonDrugName) : that.nonDrugName != null) return false;
        if (standard != null ? !standard.equals(that.standard) : that.standard != null) return false;
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
        result = 31 * result + (nonDrugName != null ? nonDrugName.hashCode() : 0);
        result = 31 * result + (standard != null ? standard.hashCode() : 0);
        temp = Double.doubleToLongBits(unitPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + categoryPaymentId;
        result = 31 * result + deptId;
        result = 31 * result + (pinyinMnemonicCode != null ? pinyinMnemonicCode.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (lastEditTime != null ? lastEditTime.hashCode() : 0);
        result = 31 * result + (int) itemType;
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

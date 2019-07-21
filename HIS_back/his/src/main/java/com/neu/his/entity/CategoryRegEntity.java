package com.neu.his.entity;

import javax.persistence.*;

@Entity
@Table(name = "category_reg", schema = "neu_his", catalog = "")
public class CategoryRegEntity {
    private int id;
    private String code;
    private String categoryName;
    private String sequence;
    private double regAmount;
    private int regLimit;
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
    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Basic
    @Column(name = "sequence")
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Basic
    @Column(name = "reg_amount")
    public double getRegAmount() {
        return regAmount;
    }

    public void setRegAmount(double regAmount) {
        this.regAmount = regAmount;
    }

    @Basic
    @Column(name = "reg_limit")
    public int getRegLimit() {
        return regLimit;
    }

    public void setRegLimit(int regLimit) {
        this.regLimit = regLimit;
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

        CategoryRegEntity that = (CategoryRegEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.regAmount, regAmount) != 0) return false;
        if (regLimit != that.regLimit) return false;
        if (isDeleted != that.isDeleted) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;
        if (sequence != null ? !sequence.equals(that.sequence) : that.sequence != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (sequence != null ? sequence.hashCode() : 0);
        temp = Double.doubleToLongBits(regAmount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + regLimit;
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

package com.neu.his.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "constant", schema = "neu_his", catalog = "")
public class ConstantEntity {
    private int id;
    private int categoryId;
    private String code;
    private String constantName;
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
    @Column(name = "category_id")
    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
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
    @Column(name = "constant_name")
    public String getConstantName() {
        return constantName;
    }

    public void setConstantName(String constantName) {
        this.constantName = constantName;
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

        ConstantEntity that = (ConstantEntity) o;

        if (id != that.id) return false;
        if (categoryId != that.categoryId) return false;
        if (isDeleted != that.isDeleted) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (constantName != null ? !constantName.equals(that.constantName) : that.constantName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + categoryId;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (constantName != null ? constantName.hashCode() : 0);
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

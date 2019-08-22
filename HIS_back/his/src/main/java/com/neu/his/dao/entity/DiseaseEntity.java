package com.neu.his.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "disease", schema = "neu_his", catalog = "")
public class DiseaseEntity {
    private int id;
    private String code;
    private String deseaseName;
    private String icd;
    private int categoryId;
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
    @Column(name = "desease_name")
    public String getDeseaseName() {
        return deseaseName;
    }

    public void setDeseaseName(String deseaseName) {
        this.deseaseName = deseaseName;
    }

    @Basic
    @Column(name = "ICD")
    public String getIcd() {
        return icd;
    }

    public void setIcd(String icd) {
        this.icd = icd;
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

        DiseaseEntity that = (DiseaseEntity) o;

        if (id != that.id) return false;
        if (categoryId != that.categoryId) return false;
        if (isDeleted != that.isDeleted) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (deseaseName != null ? !deseaseName.equals(that.deseaseName) : that.deseaseName != null) return false;
        if (icd != null ? !icd.equals(that.icd) : that.icd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (deseaseName != null ? deseaseName.hashCode() : 0);
        result = 31 * result + (icd != null ? icd.hashCode() : 0);
        result = 31 * result + categoryId;
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

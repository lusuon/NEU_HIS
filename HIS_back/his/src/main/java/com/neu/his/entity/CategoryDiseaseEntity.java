package com.neu.his.entity;

import javax.persistence.*;

@Entity
@Table(name = "category_disease", schema = "neu_his", catalog = "")
public class CategoryDiseaseEntity {
    private int id;
    private String code;
    private String categoryName;
    private String sequence;
    private int diseaseFlag;
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
    @Column(name = "disease_flag")
    public int getDiseaseFlag() {
        return diseaseFlag;
    }

    public void setDiseaseFlag(int diseaseFlag) {
        this.diseaseFlag = diseaseFlag;
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

        CategoryDiseaseEntity that = (CategoryDiseaseEntity) o;

        if (id != that.id) return false;
        if (diseaseFlag != that.diseaseFlag) return false;
        if (isDeleted != that.isDeleted) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;
        if (sequence != null ? !sequence.equals(that.sequence) : that.sequence != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (sequence != null ? sequence.hashCode() : 0);
        result = 31 * result + diseaseFlag;
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

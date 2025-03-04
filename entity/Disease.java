package com.neu.his.entity;

import java.io.Serializable;

public class Disease implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table disease
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table disease
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean DELETED = true;

    private Integer id;

    private String code;

    private String deseaseName;

    private String icd;

    private Integer categoryId;

    private Boolean isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public Disease withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public Disease withCode(String code) {
        this.setCode(code);
        return this;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDeseaseName() {
        return deseaseName;
    }

    public Disease withDeseaseName(String deseaseName) {
        this.setDeseaseName(deseaseName);
        return this;
    }

    public void setDeseaseName(String deseaseName) {
        this.deseaseName = deseaseName;
    }

    public String getIcd() {
        return icd;
    }

    public Disease withIcd(String icd) {
        this.setIcd(icd);
        return this;
    }

    public void setIcd(String icd) {
        this.icd = icd;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public Disease withCategoryId(Integer categoryId) {
        this.setCategoryId(categoryId);
        return this;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public Disease withIsDeleted(Boolean isDeleted) {
        this.setIsDeleted(isDeleted);
        return this;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", deseaseName=").append(deseaseName);
        sb.append(", icd=").append(icd);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table disease
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setIsDeleted(deleted ? DELETED : NOT_DELETED);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Disease other = (Disease) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getDeseaseName() == null ? other.getDeseaseName() == null : this.getDeseaseName().equals(other.getDeseaseName()))
            && (this.getIcd() == null ? other.getIcd() == null : this.getIcd().equals(other.getIcd()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getDeseaseName() == null) ? 0 : getDeseaseName().hashCode());
        result = prime * result + ((getIcd() == null) ? 0 : getIcd().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }
}
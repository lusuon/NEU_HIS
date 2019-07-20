package org.neu.entity;

import java.io.Serializable;

public class Dept implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dept
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dept
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean DELETED = true;

    private Integer id;

    private String code_id;

    private String dept_name;

    private Integer category;

    private Integer type_id;

    private Boolean is_deleted;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public Dept withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode_id() {
        return code_id;
    }

    public Dept withCode_id(String code_id) {
        this.setCode_id(code_id);
        return this;
    }

    public void setCode_id(String code_id) {
        this.code_id = code_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public Dept withDept_name(String dept_name) {
        this.setDept_name(dept_name);
        return this;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Integer getCategory() {
        return category;
    }

    public Dept withCategory(Integer category) {
        this.setCategory(category);
        return this;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getType_id() {
        return type_id;
    }

    public Dept withType_id(Integer type_id) {
        this.setType_id(type_id);
        return this;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Boolean getIs_deleted() {
        return is_deleted;
    }

    public Dept withIs_deleted(Boolean is_deleted) {
        this.setIs_deleted(is_deleted);
        return this;
    }

    public void setIs_deleted(Boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code_id=").append(code_id);
        sb.append(", dept_name=").append(dept_name);
        sb.append(", category=").append(category);
        sb.append(", type_id=").append(type_id);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public void andLogicalDeleted(boolean deleted) {
        setIs_deleted(deleted ? DELETED : NOT_DELETED);
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
        Dept other = (Dept) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode_id() == null ? other.getCode_id() == null : this.getCode_id().equals(other.getCode_id()))
            && (this.getDept_name() == null ? other.getDept_name() == null : this.getDept_name().equals(other.getDept_name()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getType_id() == null ? other.getType_id() == null : this.getType_id().equals(other.getType_id()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode_id() == null) ? 0 : getCode_id().hashCode());
        result = prime * result + ((getDept_name() == null) ? 0 : getDept_name().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getType_id() == null) ? 0 : getType_id().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        return result;
    }
}
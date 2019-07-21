package com.neu.his.entity;

import javax.persistence.*;

@Entity
@Table(name = "template_dtl_herb", schema = "neu_his", catalog = "")
public class TemplateDtlHerbEntity {
    private int id;
    private int templateId;
    private int herbId;
    private String consumption;
    private String unit;
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
    @Column(name = "template_id")
    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
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
    @Column(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

        TemplateDtlHerbEntity that = (TemplateDtlHerbEntity) o;

        if (id != that.id) return false;
        if (templateId != that.templateId) return false;
        if (herbId != that.herbId) return false;
        if (isDeleted != that.isDeleted) return false;
        if (consumption != null ? !consumption.equals(that.consumption) : that.consumption != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + templateId;
        result = 31 * result + herbId;
        result = 31 * result + (consumption != null ? consumption.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

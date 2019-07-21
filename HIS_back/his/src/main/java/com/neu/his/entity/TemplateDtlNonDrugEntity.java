package com.neu.his.entity;

import javax.persistence.*;

@Entity
@Table(name = "template_dtl_non_drug", schema = "neu_his", catalog = "")
public class TemplateDtlNonDrugEntity {
    private int id;
    private int itemId;
    private int templateId;
    private String checkPart;
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
    @Column(name = "item_id")
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
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
    @Column(name = "check_part")
    public String getCheckPart() {
        return checkPart;
    }

    public void setCheckPart(String checkPart) {
        this.checkPart = checkPart;
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

        TemplateDtlNonDrugEntity that = (TemplateDtlNonDrugEntity) o;

        if (id != that.id) return false;
        if (itemId != that.itemId) return false;
        if (templateId != that.templateId) return false;
        if (isDeleted != that.isDeleted) return false;
        if (checkPart != null ? !checkPart.equals(that.checkPart) : that.checkPart != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + itemId;
        result = 31 * result + templateId;
        result = 31 * result + (checkPart != null ? checkPart.hashCode() : 0);
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

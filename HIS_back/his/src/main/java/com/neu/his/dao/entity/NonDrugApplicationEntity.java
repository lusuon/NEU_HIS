package com.neu.his.dao.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "non_drug_application", schema = "neu_his", catalog = "")
public class NonDrugApplicationEntity {
    private int id;
    private int caseId;
    private int regId;
    private int itemId;
    private String itemName;
    private String requirement;
    private String checkPart;
    private byte isUrgent;
    private int num;
    private Date generateTime;
    private int generateDoctorId;
    private int checkerId;
    private int recorderId;
    private Date checkTime;
    private String checkResult;
    private Date resultTime;
    private int applicationStatus;
    private int recordCategory;
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
    @Column(name = "case_id")
    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    @Basic
    @Column(name = "reg_id")
    public int getRegId() {
        return regId;
    }

    public void setRegId(int regId) {
        this.regId = regId;
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
    @Column(name = "item_name")
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Basic
    @Column(name = "requirement")
    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
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
    @Column(name = "is_urgent")
    public byte getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(byte isUrgent) {
        this.isUrgent = isUrgent;
    }

    @Basic
    @Column(name = "num")
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Basic
    @Column(name = "generate_time")
    public Date getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(Date generateTime) {
        this.generateTime = generateTime;
    }

    @Basic
    @Column(name = "generate_doctor_id")
    public int getGenerateDoctorId() {
        return generateDoctorId;
    }

    public void setGenerateDoctorId(int generateDoctorId) {
        this.generateDoctorId = generateDoctorId;
    }

    @Basic
    @Column(name = "checker_id")
    public int getCheckerId() {
        return checkerId;
    }

    public void setCheckerId(int checkerId) {
        this.checkerId = checkerId;
    }

    @Basic
    @Column(name = "recorder_id")
    public int getRecorderId() {
        return recorderId;
    }

    public void setRecorderId(int recorderId) {
        this.recorderId = recorderId;
    }

    @Basic
    @Column(name = "check_time")
    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    @Basic
    @Column(name = "check_result")
    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult;
    }

    @Basic
    @Column(name = "result_time")
    public Date getResultTime() {
        return resultTime;
    }

    public void setResultTime(Date resultTime) {
        this.resultTime = resultTime;
    }

    @Basic
    @Column(name = "application_status")
    public int getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(int applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    @Basic
    @Column(name = "record_category")
    public int getRecordCategory() {
        return recordCategory;
    }

    public void setRecordCategory(int recordCategory) {
        this.recordCategory = recordCategory;
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

        NonDrugApplicationEntity that = (NonDrugApplicationEntity) o;

        if (id != that.id) return false;
        if (caseId != that.caseId) return false;
        if (regId != that.regId) return false;
        if (itemId != that.itemId) return false;
        if (isUrgent != that.isUrgent) return false;
        if (num != that.num) return false;
        if (generateDoctorId != that.generateDoctorId) return false;
        if (checkerId != that.checkerId) return false;
        if (recorderId != that.recorderId) return false;
        if (applicationStatus != that.applicationStatus) return false;
        if (recordCategory != that.recordCategory) return false;
        if (isDeleted != that.isDeleted) return false;
        if (itemName != null ? !itemName.equals(that.itemName) : that.itemName != null) return false;
        if (requirement != null ? !requirement.equals(that.requirement) : that.requirement != null) return false;
        if (checkPart != null ? !checkPart.equals(that.checkPart) : that.checkPart != null) return false;
        if (generateTime != null ? !generateTime.equals(that.generateTime) : that.generateTime != null) return false;
        if (checkTime != null ? !checkTime.equals(that.checkTime) : that.checkTime != null) return false;
        if (checkResult != null ? !checkResult.equals(that.checkResult) : that.checkResult != null) return false;
        if (resultTime != null ? !resultTime.equals(that.resultTime) : that.resultTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + caseId;
        result = 31 * result + regId;
        result = 31 * result + itemId;
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        result = 31 * result + (requirement != null ? requirement.hashCode() : 0);
        result = 31 * result + (checkPart != null ? checkPart.hashCode() : 0);
        result = 31 * result + (int) isUrgent;
        result = 31 * result + num;
        result = 31 * result + (generateTime != null ? generateTime.hashCode() : 0);
        result = 31 * result + generateDoctorId;
        result = 31 * result + checkerId;
        result = 31 * result + recorderId;
        result = 31 * result + (checkTime != null ? checkTime.hashCode() : 0);
        result = 31 * result + (checkResult != null ? checkResult.hashCode() : 0);
        result = 31 * result + (resultTime != null ? resultTime.hashCode() : 0);
        result = 31 * result + applicationStatus;
        result = 31 * result + recordCategory;
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

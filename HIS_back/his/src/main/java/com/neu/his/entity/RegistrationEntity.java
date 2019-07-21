package com.neu.his.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "registration", schema = "neu_his", catalog = "")
public class RegistrationEntity {
    private int id;
    private int caseNo;
    private String patientName;
    private short sex;
    private String personalId;
    private Date birthday;
    private Integer age;
    private String ageType;
    private String address;
    private Date seeDate;
    private String noon;
    private int deptId;
    private int doctorId;
    private int regLevelId;
    private String settlementType;
    private byte needCaseBook;
    private Timestamp regTime;
    private int operator;
    private int inspectionStatus;
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
    @Column(name = "case_no")
    public int getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(int caseNo) {
        this.caseNo = caseNo;
    }

    @Basic
    @Column(name = "patient_name")
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    @Basic
    @Column(name = "sex")
    public short getSex() {
        return sex;
    }

    public void setSex(short sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "personal_id")
    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    @Basic
    @Column(name = "birthday")
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "age_type")
    public String getAgeType() {
        return ageType;
    }

    public void setAgeType(String ageType) {
        this.ageType = ageType;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "see_date")
    public Date getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(Date seeDate) {
        this.seeDate = seeDate;
    }

    @Basic
    @Column(name = "noon")
    public String getNoon() {
        return noon;
    }

    public void setNoon(String noon) {
        this.noon = noon;
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
    @Column(name = "doctor_id")
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    @Basic
    @Column(name = "reg_level_id")
    public int getRegLevelId() {
        return regLevelId;
    }

    public void setRegLevelId(int regLevelId) {
        this.regLevelId = regLevelId;
    }

    @Basic
    @Column(name = "settlement_type")
    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType;
    }

    @Basic
    @Column(name = "need_case_book")
    public byte getNeedCaseBook() {
        return needCaseBook;
    }

    public void setNeedCaseBook(byte needCaseBook) {
        this.needCaseBook = needCaseBook;
    }

    @Basic
    @Column(name = "reg_time")
    public Timestamp getRegTime() {
        return regTime;
    }

    public void setRegTime(Timestamp regTime) {
        this.regTime = regTime;
    }

    @Basic
    @Column(name = "operator")
    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "inspection_status")
    public int getInspectionStatus() {
        return inspectionStatus;
    }

    public void setInspectionStatus(int inspectionStatus) {
        this.inspectionStatus = inspectionStatus;
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

        RegistrationEntity that = (RegistrationEntity) o;

        if (id != that.id) return false;
        if (caseNo != that.caseNo) return false;
        if (sex != that.sex) return false;
        if (deptId != that.deptId) return false;
        if (doctorId != that.doctorId) return false;
        if (regLevelId != that.regLevelId) return false;
        if (needCaseBook != that.needCaseBook) return false;
        if (operator != that.operator) return false;
        if (inspectionStatus != that.inspectionStatus) return false;
        if (isDeleted != that.isDeleted) return false;
        if (patientName != null ? !patientName.equals(that.patientName) : that.patientName != null) return false;
        if (personalId != null ? !personalId.equals(that.personalId) : that.personalId != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (ageType != null ? !ageType.equals(that.ageType) : that.ageType != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (seeDate != null ? !seeDate.equals(that.seeDate) : that.seeDate != null) return false;
        if (noon != null ? !noon.equals(that.noon) : that.noon != null) return false;
        if (settlementType != null ? !settlementType.equals(that.settlementType) : that.settlementType != null)
            return false;
        if (regTime != null ? !regTime.equals(that.regTime) : that.regTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + caseNo;
        result = 31 * result + (patientName != null ? patientName.hashCode() : 0);
        result = 31 * result + (int) sex;
        result = 31 * result + (personalId != null ? personalId.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (ageType != null ? ageType.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (seeDate != null ? seeDate.hashCode() : 0);
        result = 31 * result + (noon != null ? noon.hashCode() : 0);
        result = 31 * result + deptId;
        result = 31 * result + doctorId;
        result = 31 * result + regLevelId;
        result = 31 * result + (settlementType != null ? settlementType.hashCode() : 0);
        result = 31 * result + (int) needCaseBook;
        result = 31 * result + (regTime != null ? regTime.hashCode() : 0);
        result = 31 * result + operator;
        result = 31 * result + inspectionStatus;
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

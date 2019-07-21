package com.neu.his.entity;

import javax.persistence.*;

@Entity
@Table(name = "schedule_rule", schema = "neu_his", catalog = "")
public class ScheduleRuleEntity {
    private int id;
    private String ruleName;
    private int deptId;
    private int doctorId;
    private String days;
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
    @Column(name = "rule_name")
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
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
    @Column(name = "days")
    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
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

        ScheduleRuleEntity that = (ScheduleRuleEntity) o;

        if (id != that.id) return false;
        if (deptId != that.deptId) return false;
        if (doctorId != that.doctorId) return false;
        if (isDeleted != that.isDeleted) return false;
        if (ruleName != null ? !ruleName.equals(that.ruleName) : that.ruleName != null) return false;
        if (days != null ? !days.equals(that.days) : that.days != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (ruleName != null ? ruleName.hashCode() : 0);
        result = 31 * result + deptId;
        result = 31 * result + doctorId;
        result = 31 * result + (days != null ? days.hashCode() : 0);
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

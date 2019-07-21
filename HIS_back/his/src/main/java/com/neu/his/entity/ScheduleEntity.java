package com.neu.his.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "schedule", schema = "neu_his", catalog = "")
public class ScheduleEntity {
    private int id;
    private Date arrangeTime;
    private int deptId;
    private int doctorId;
    private String noon;
    private int scheduleRuleId;
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
    @Column(name = "arrange_time")
    public Date getArrangeTime() {
        return arrangeTime;
    }

    public void setArrangeTime(Date arrangeTime) {
        this.arrangeTime = arrangeTime;
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
    @Column(name = "noon")
    public String getNoon() {
        return noon;
    }

    public void setNoon(String noon) {
        this.noon = noon;
    }

    @Basic
    @Column(name = "schedule_rule_id")
    public int getScheduleRuleId() {
        return scheduleRuleId;
    }

    public void setScheduleRuleId(int scheduleRuleId) {
        this.scheduleRuleId = scheduleRuleId;
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

        ScheduleEntity that = (ScheduleEntity) o;

        if (id != that.id) return false;
        if (deptId != that.deptId) return false;
        if (doctorId != that.doctorId) return false;
        if (scheduleRuleId != that.scheduleRuleId) return false;
        if (isDeleted != that.isDeleted) return false;
        if (arrangeTime != null ? !arrangeTime.equals(that.arrangeTime) : that.arrangeTime != null) return false;
        if (noon != null ? !noon.equals(that.noon) : that.noon != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (arrangeTime != null ? arrangeTime.hashCode() : 0);
        result = 31 * result + deptId;
        result = 31 * result + doctorId;
        result = 31 * result + (noon != null ? noon.hashCode() : 0);
        result = 31 * result + scheduleRuleId;
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

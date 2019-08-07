package com.neu.his.entity;

import javax.persistence.*;

@Entity
@Table(name = "all_user", schema = "neu_his", catalog = "")
public class AllUserEntity {
    private int id;
    private String username;
    private String password;
    private String realName;
    private String userType;
    private String titleId;
    private String permission;
    private Byte scheduleParticipation;
    private int deptId;
    private int regLevelId;
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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "real_name")
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Basic
    @Column(name = "user_type")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "title_id")
    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }


    @Basic
    @Column(name = "permission")
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Basic
    @Column(name = "schedule_participation")
    public Byte getScheduleParticipation() {
        return scheduleParticipation;
    }

    public void setScheduleParticipation(Byte scheduleParticipation) {
        this.scheduleParticipation = scheduleParticipation;
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
    @Column(name = "reg_level_id")
    public int getRegLevelId() {
        return regLevelId;
    }

    public void setRegLevelId(int regLevelId) {
        this.regLevelId = regLevelId;
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

        AllUserEntity that = (AllUserEntity) o;

        if (id != that.id) return false;
        if (deptId != that.deptId) return false;
        if (regLevelId != that.regLevelId) return false;
        if (isDeleted != that.isDeleted) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (realName != null ? !realName.equals(that.realName) : that.realName != null) return false;
        if (userType != null ? !userType.equals(that.userType) : that.userType != null) return false;
        if (titleId != null ? !titleId.equals(that.titleId) : that.titleId != null) return false;
        if (scheduleParticipation != null ? !scheduleParticipation.equals(that.scheduleParticipation) : that.scheduleParticipation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        result = 31 * result + (titleId != null ? titleId.hashCode() : 0);
        result = 31 * result + (scheduleParticipation != null ? scheduleParticipation.hashCode() : 0);
        result = 31 * result + deptId;
        result = 31 * result + regLevelId;
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

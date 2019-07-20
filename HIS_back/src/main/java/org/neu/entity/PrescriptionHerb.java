package org.neu.entity;

import java.io.Serializable;
import java.util.Date;

public class PrescriptionHerb implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table prescription_herb
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean NOT_DELETED = false;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table prescription_herb
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static final Boolean DELETED = true;

    private Integer id;

    private Integer case_id;

    private Integer reg_id;

    private Integer doctor_id;

    private String prescription_name;

    private Date generate_time;

    private String prescription_type;

    private Integer quantity;

    private String frequency;

    private String method;

    private String treatment;

    private String treatment_detail;

    private String doctor_advice;

    private Integer prescription_status;

    private Boolean is_deleted;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public PrescriptionHerb withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCase_id() {
        return case_id;
    }

    public PrescriptionHerb withCase_id(Integer case_id) {
        this.setCase_id(case_id);
        return this;
    }

    public void setCase_id(Integer case_id) {
        this.case_id = case_id;
    }

    public Integer getReg_id() {
        return reg_id;
    }

    public PrescriptionHerb withReg_id(Integer reg_id) {
        this.setReg_id(reg_id);
        return this;
    }

    public void setReg_id(Integer reg_id) {
        this.reg_id = reg_id;
    }

    public Integer getDoctor_id() {
        return doctor_id;
    }

    public PrescriptionHerb withDoctor_id(Integer doctor_id) {
        this.setDoctor_id(doctor_id);
        return this;
    }

    public void setDoctor_id(Integer doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getPrescription_name() {
        return prescription_name;
    }

    public PrescriptionHerb withPrescription_name(String prescription_name) {
        this.setPrescription_name(prescription_name);
        return this;
    }

    public void setPrescription_name(String prescription_name) {
        this.prescription_name = prescription_name;
    }

    public Date getGenerate_time() {
        return generate_time;
    }

    public PrescriptionHerb withGenerate_time(Date generate_time) {
        this.setGenerate_time(generate_time);
        return this;
    }

    public void setGenerate_time(Date generate_time) {
        this.generate_time = generate_time;
    }

    public String getPrescription_type() {
        return prescription_type;
    }

    public PrescriptionHerb withPrescription_type(String prescription_type) {
        this.setPrescription_type(prescription_type);
        return this;
    }

    public void setPrescription_type(String prescription_type) {
        this.prescription_type = prescription_type;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public PrescriptionHerb withQuantity(Integer quantity) {
        this.setQuantity(quantity);
        return this;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getFrequency() {
        return frequency;
    }

    public PrescriptionHerb withFrequency(String frequency) {
        this.setFrequency(frequency);
        return this;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getMethod() {
        return method;
    }

    public PrescriptionHerb withMethod(String method) {
        this.setMethod(method);
        return this;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTreatment() {
        return treatment;
    }

    public PrescriptionHerb withTreatment(String treatment) {
        this.setTreatment(treatment);
        return this;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getTreatment_detail() {
        return treatment_detail;
    }

    public PrescriptionHerb withTreatment_detail(String treatment_detail) {
        this.setTreatment_detail(treatment_detail);
        return this;
    }

    public void setTreatment_detail(String treatment_detail) {
        this.treatment_detail = treatment_detail;
    }

    public String getDoctor_advice() {
        return doctor_advice;
    }

    public PrescriptionHerb withDoctor_advice(String doctor_advice) {
        this.setDoctor_advice(doctor_advice);
        return this;
    }

    public void setDoctor_advice(String doctor_advice) {
        this.doctor_advice = doctor_advice;
    }

    public Integer getPrescription_status() {
        return prescription_status;
    }

    public PrescriptionHerb withPrescription_status(Integer prescription_status) {
        this.setPrescription_status(prescription_status);
        return this;
    }

    public void setPrescription_status(Integer prescription_status) {
        this.prescription_status = prescription_status;
    }

    public Boolean getIs_deleted() {
        return is_deleted;
    }

    public PrescriptionHerb withIs_deleted(Boolean is_deleted) {
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
        sb.append(", case_id=").append(case_id);
        sb.append(", reg_id=").append(reg_id);
        sb.append(", doctor_id=").append(doctor_id);
        sb.append(", prescription_name=").append(prescription_name);
        sb.append(", generate_time=").append(generate_time);
        sb.append(", prescription_type=").append(prescription_type);
        sb.append(", quantity=").append(quantity);
        sb.append(", frequency=").append(frequency);
        sb.append(", method=").append(method);
        sb.append(", treatment=").append(treatment);
        sb.append(", treatment_detail=").append(treatment_detail);
        sb.append(", doctor_advice=").append(doctor_advice);
        sb.append(", prescription_status=").append(prescription_status);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table prescription_herb
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
        PrescriptionHerb other = (PrescriptionHerb) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCase_id() == null ? other.getCase_id() == null : this.getCase_id().equals(other.getCase_id()))
            && (this.getReg_id() == null ? other.getReg_id() == null : this.getReg_id().equals(other.getReg_id()))
            && (this.getDoctor_id() == null ? other.getDoctor_id() == null : this.getDoctor_id().equals(other.getDoctor_id()))
            && (this.getPrescription_name() == null ? other.getPrescription_name() == null : this.getPrescription_name().equals(other.getPrescription_name()))
            && (this.getGenerate_time() == null ? other.getGenerate_time() == null : this.getGenerate_time().equals(other.getGenerate_time()))
            && (this.getPrescription_type() == null ? other.getPrescription_type() == null : this.getPrescription_type().equals(other.getPrescription_type()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getFrequency() == null ? other.getFrequency() == null : this.getFrequency().equals(other.getFrequency()))
            && (this.getMethod() == null ? other.getMethod() == null : this.getMethod().equals(other.getMethod()))
            && (this.getTreatment() == null ? other.getTreatment() == null : this.getTreatment().equals(other.getTreatment()))
            && (this.getTreatment_detail() == null ? other.getTreatment_detail() == null : this.getTreatment_detail().equals(other.getTreatment_detail()))
            && (this.getDoctor_advice() == null ? other.getDoctor_advice() == null : this.getDoctor_advice().equals(other.getDoctor_advice()))
            && (this.getPrescription_status() == null ? other.getPrescription_status() == null : this.getPrescription_status().equals(other.getPrescription_status()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCase_id() == null) ? 0 : getCase_id().hashCode());
        result = prime * result + ((getReg_id() == null) ? 0 : getReg_id().hashCode());
        result = prime * result + ((getDoctor_id() == null) ? 0 : getDoctor_id().hashCode());
        result = prime * result + ((getPrescription_name() == null) ? 0 : getPrescription_name().hashCode());
        result = prime * result + ((getGenerate_time() == null) ? 0 : getGenerate_time().hashCode());
        result = prime * result + ((getPrescription_type() == null) ? 0 : getPrescription_type().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        result = prime * result + ((getMethod() == null) ? 0 : getMethod().hashCode());
        result = prime * result + ((getTreatment() == null) ? 0 : getTreatment().hashCode());
        result = prime * result + ((getTreatment_detail() == null) ? 0 : getTreatment_detail().hashCode());
        result = prime * result + ((getDoctor_advice() == null) ? 0 : getDoctor_advice().hashCode());
        result = prime * result + ((getPrescription_status() == null) ? 0 : getPrescription_status().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        return result;
    }
}
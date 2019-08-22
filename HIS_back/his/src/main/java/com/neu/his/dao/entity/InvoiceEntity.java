package com.neu.his.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "invoice", schema = "neu_his", catalog = "")
public class InvoiceEntity {
    private int id;
    private int invoiceNo;
    private double amount;
    private int type;
    private Timestamp operateTime;
    private int operatorId;
    private int regId;
    private int payMethod;
    private Integer redInvoiceNo;
    private int invoiceStatus;
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
    @Column(name = "invoice_no")
    public int getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    @Basic
    @Column(name = "amount")
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "operate_time")
    public Timestamp getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Timestamp operateTime) {
        this.operateTime = operateTime;
    }

    @Basic
    @Column(name = "operator_id")
    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
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
    @Column(name = "pay_method")
    public int getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(int payMethod) {
        this.payMethod = payMethod;
    }

    @Basic
    @Column(name = "red_invoice_no")
    public Integer getRedInvoiceNo() {
        return redInvoiceNo;
    }

    public void setRedInvoiceNo(Integer redInvoiceNo) {
        this.redInvoiceNo = redInvoiceNo;
    }

    @Basic
    @Column(name = "invoice_status")
    public int getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(int invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
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

        InvoiceEntity that = (InvoiceEntity) o;

        if (id != that.id) return false;
        if (invoiceNo != that.invoiceNo) return false;
        if (Double.compare(that.amount, amount) != 0) return false;
        if (type != that.type) return false;
        if (operatorId != that.operatorId) return false;
        if (regId != that.regId) return false;
        if (payMethod != that.payMethod) return false;
        if (invoiceStatus != that.invoiceStatus) return false;
        if (isDeleted != that.isDeleted) return false;
        if (operateTime != null ? !operateTime.equals(that.operateTime) : that.operateTime != null) return false;
        if (redInvoiceNo != null ? !redInvoiceNo.equals(that.redInvoiceNo) : that.redInvoiceNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + invoiceNo;
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + type;
        result = 31 * result + (operateTime != null ? operateTime.hashCode() : 0);
        result = 31 * result + operatorId;
        result = 31 * result + regId;
        result = 31 * result + payMethod;
        result = 31 * result + (redInvoiceNo != null ? redInvoiceNo.hashCode() : 0);
        result = 31 * result + invoiceStatus;
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

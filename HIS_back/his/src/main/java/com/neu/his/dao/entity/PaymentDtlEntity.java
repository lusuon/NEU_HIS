package com.neu.his.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "payment_dtl", schema = "neu_his", catalog = "")
public class PaymentDtlEntity {
    private int id;
    private int regId;
    private int invoiceNo;
    private int itemId;
    private byte itemType;
    private String itemName;
    private double itemUnitPrice;
    private int quantity;
    private int deptId;
    private Timestamp prescriptionGenerationTime;
    private int generatorId;
    private Timestamp paymentOperationTime;
    private int operatorId;
    private String method;
    private int relatedRefundId;
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
    @Column(name = "reg_id")
    public int getRegId() {
        return regId;
    }

    public void setRegId(int regId) {
        this.regId = regId;
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
    @Column(name = "item_id")
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "item_type")
    public byte getItemType() {
        return itemType;
    }

    public void setItemType(byte itemType) {
        this.itemType = itemType;
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
    @Column(name = "item_unit_price")
    public double getItemUnitPrice() {
        return itemUnitPrice;
    }

    public void setItemUnitPrice(double itemUnitPrice) {
        this.itemUnitPrice = itemUnitPrice;
    }

    @Basic
    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
    @Column(name = "prescription_generation_time")
    public Timestamp getPrescriptionGenerationTime() {
        return prescriptionGenerationTime;
    }

    public void setPrescriptionGenerationTime(Timestamp prescriptionGenerationTime) {
        this.prescriptionGenerationTime = prescriptionGenerationTime;
    }

    @Basic
    @Column(name = "generator_id")
    public int getGeneratorId() {
        return generatorId;
    }

    public void setGeneratorId(int generatorId) {
        this.generatorId = generatorId;
    }

    @Basic
    @Column(name = "payment_operation_time")
    public Timestamp getPaymentOperationTime() {
        return paymentOperationTime;
    }

    public void setPaymentOperationTime(Timestamp paymentOperationTime) {
        this.paymentOperationTime = paymentOperationTime;
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
    @Column(name = "method")
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Basic
    @Column(name = "related_refund_id")
    public int getRelatedRefundId() {
        return relatedRefundId;
    }

    public void setRelatedRefundId(int relatedRefundId) {
        this.relatedRefundId = relatedRefundId;
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

        PaymentDtlEntity that = (PaymentDtlEntity) o;

        if (id != that.id) return false;
        if (regId != that.regId) return false;
        if (invoiceNo != that.invoiceNo) return false;
        if (itemId != that.itemId) return false;
        if (itemType != that.itemType) return false;
        if (Double.compare(that.itemUnitPrice, itemUnitPrice) != 0) return false;
        if (quantity != that.quantity) return false;
        if (deptId != that.deptId) return false;
        if (generatorId != that.generatorId) return false;
        if (operatorId != that.operatorId) return false;
        if (relatedRefundId != that.relatedRefundId) return false;
        if (isDeleted != that.isDeleted) return false;
        if (itemName != null ? !itemName.equals(that.itemName) : that.itemName != null) return false;
        if (prescriptionGenerationTime != null ? !prescriptionGenerationTime.equals(that.prescriptionGenerationTime) : that.prescriptionGenerationTime != null)
            return false;
        if (paymentOperationTime != null ? !paymentOperationTime.equals(that.paymentOperationTime) : that.paymentOperationTime != null)
            return false;
        if (method != null ? !method.equals(that.method) : that.method != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + regId;
        result = 31 * result + invoiceNo;
        result = 31 * result + itemId;
        result = 31 * result + (int) itemType;
        result = 31 * result + (itemName != null ? itemName.hashCode() : 0);
        temp = Double.doubleToLongBits(itemUnitPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + quantity;
        result = 31 * result + deptId;
        result = 31 * result + (prescriptionGenerationTime != null ? prescriptionGenerationTime.hashCode() : 0);
        result = 31 * result + generatorId;
        result = 31 * result + (paymentOperationTime != null ? paymentOperationTime.hashCode() : 0);
        result = 31 * result + operatorId;
        result = 31 * result + (method != null ? method.hashCode() : 0);
        result = 31 * result + relatedRefundId;
        result = 31 * result + (int) isDeleted;
        return result;
    }
}

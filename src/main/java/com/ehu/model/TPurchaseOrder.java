package com.ehu.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "t_purchase_order")
public class TPurchaseOrder {
    /**
     * 采购订单id
     */
    @Id
    @Column(name = "purchase_order_id")
    private Integer purchaseOrderId;

    /**
     * 供应商id
     */
    @Column(name = "supplier_id")
    private Integer supplierId;

    /**
     * 负责人
     */
    @Column(name = "person_in_charge")
    private String personInCharge;

    /**
     * 订单总价
     */
    @Column(name = "order_total")
    private BigDecimal orderTotal;

    /**
     * 订单实收金额
     */
    @Column(name = "order_actual")
    private BigDecimal orderActual;

    /**
     * 备注
     */
    private String remark;

    /**
     * 订单状态(0:订单成功 1:订单取消，2:异常)
     */
    @Column(name = "order_status")
    private Integer orderStatus;

    /**
     * 付款状态(0:未付款，1:已付款)
     */
    @Column(name = "pay_status")
    private Integer payStatus;

    /**
     * 审核状态(0:未审核，1:审核通过，2:驳回)
     */
    @Column(name = "verify_status")
    private Integer verifyStatus;

    /**
     * 删除标识(0:正常， 1:已删除)
     */
    @Column(name = "del_flag")
    private Integer delFlag;

    /**
     * 获取采购订单id
     *
     * @return purchase_order_id - 采购订单id
     */
    public Integer getPurchaseOrderId() {
        return purchaseOrderId;
    }

    /**
     * 设置采购订单id
     *
     * @param purchaseOrderId 采购订单id
     */
    public void setPurchaseOrderId(Integer purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    /**
     * 获取供应商id
     *
     * @return supplier_id - 供应商id
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * 设置供应商id
     *
     * @param supplierId 供应商id
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 获取负责人
     *
     * @return person_in_charge - 负责人
     */
    public String getPersonInCharge() {
        return personInCharge;
    }

    /**
     * 设置负责人
     *
     * @param personInCharge 负责人
     */
    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    /**
     * 获取订单总价
     *
     * @return order_total - 订单总价
     */
    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    /**
     * 设置订单总价
     *
     * @param orderTotal 订单总价
     */
    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    /**
     * 获取订单实收金额
     *
     * @return order_actual - 订单实收金额
     */
    public BigDecimal getOrderActual() {
        return orderActual;
    }

    /**
     * 设置订单实收金额
     *
     * @param orderActual 订单实收金额
     */
    public void setOrderActual(BigDecimal orderActual) {
        this.orderActual = orderActual;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取订单状态(0:订单成功 1:订单取消，2:异常)
     *
     * @return order_status - 订单状态(0:订单成功 1:订单取消，2:异常)
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态(0:订单成功 1:订单取消，2:异常)
     *
     * @param orderStatus 订单状态(0:订单成功 1:订单取消，2:异常)
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取付款状态(0:未付款，1:已付款)
     *
     * @return pay_status - 付款状态(0:未付款，1:已付款)
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * 设置付款状态(0:未付款，1:已付款)
     *
     * @param payStatus 付款状态(0:未付款，1:已付款)
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * 获取审核状态(0:未审核，1:审核通过，2:驳回)
     *
     * @return verify_status - 审核状态(0:未审核，1:审核通过，2:驳回)
     */
    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    /**
     * 设置审核状态(0:未审核，1:审核通过，2:驳回)
     *
     * @param verifyStatus 审核状态(0:未审核，1:审核通过，2:驳回)
     */
    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    /**
     * 获取删除标识(0:正常， 1:已删除)
     *
     * @return del_flag - 删除标识(0:正常， 1:已删除)
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标识(0:正常， 1:已删除)
     *
     * @param delFlag 删除标识(0:正常， 1:已删除)
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}
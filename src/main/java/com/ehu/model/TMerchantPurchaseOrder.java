package com.ehu.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_merchant_purchase_order")
public class TMerchantPurchaseOrder {
    /**
     * 商家采购订单Id
     */
    @Id
    @Column(name = "purchase_order_id")
    private Integer purchaseOrderId;

    /**
     * 商家id
     */
    @Column(name = "merchant_id")
    private Integer merchantId;

    /**
     * 负责人
     */
    @Column(name = "`person_in charge`")
    private String personInCharge;

    /**
     * 订单总价
     */
    @Column(name = "order_total_price")
    private BigDecimal orderTotalPrice;

    /**
     * 订单实收金额
     */
    @Column(name = "order_actual_price")
    private BigDecimal orderActualPrice;

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
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 修改人
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 获取商家采购订单Id
     *
     * @return purchase_order_id - 商家采购订单Id
     */
    public Integer getPurchaseOrderId() {
        return purchaseOrderId;
    }

    /**
     * 设置商家采购订单Id
     *
     * @param purchaseOrderId 商家采购订单Id
     */
    public void setPurchaseOrderId(Integer purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    /**
     * 获取商家id
     *
     * @return merchant_id - 商家id
     */
    public Integer getMerchantId() {
        return merchantId;
    }

    /**
     * 设置商家id
     *
     * @param merchantId 商家id
     */
    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * 获取负责人
     *
     * @return person_in charge - 负责人
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
     * @return order_total_price - 订单总价
     */
    public BigDecimal getOrderTotalPrice() {
        return orderTotalPrice;
    }

    /**
     * 设置订单总价
     *
     * @param orderTotalPrice 订单总价
     */
    public void setOrderTotalPrice(BigDecimal orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    /**
     * 获取订单实收金额
     *
     * @return order_actual_price - 订单实收金额
     */
    public BigDecimal getOrderActualPrice() {
        return orderActualPrice;
    }

    /**
     * 设置订单实收金额
     *
     * @param orderActualPrice 订单实收金额
     */
    public void setOrderActualPrice(BigDecimal orderActualPrice) {
        this.orderActualPrice = orderActualPrice;
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
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建人
     *
     * @return create_by - 创建人
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人
     *
     * @param createBy 创建人
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取修改人
     *
     * @return update_by - 修改人
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置修改人
     *
     * @param updateBy 修改人
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}
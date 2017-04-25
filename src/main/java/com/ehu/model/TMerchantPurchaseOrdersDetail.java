package com.ehu.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "t_merchant_purchase_orders_detail")
public class TMerchantPurchaseOrdersDetail {
    /**
     * 商家采购订单详情id
     */
    @Id
    @Column(name = "purchase_order_detail_id")
    private Integer purchaseOrderDetailId;

    /**
     * 商家采购订单id
     */
    @Column(name = "purchase_order_id")
    private Integer purchaseOrderId;

    /**
     * 商品id
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 商品名称
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 订单数量
     */
    @Column(name = "order_quantity")
    private Integer orderQuantity;

    /**
     * 实收数量
     */
    @Column(name = "actual_quantity")
    private Integer actualQuantity;

    /**
     * 预计单价
     */
    @Column(name = "order_price")
    private BigDecimal orderPrice;

    /**
     * 实际单价
     */
    @Column(name = "actual_price")
    private BigDecimal actualPrice;

    /**
     * 备注
     */
    private String remark;

    /**
     * 订单详情状态(0:申请，1:缺货，2:完成)
     */
    @Column(name = "order_detail_status")
    private Integer orderDetailStatus;

    /**
     * 箱规
     */
    private String standard;

    /**
     * 删除标识(0:正常， 1:已删除)
     */
    @Column(name = "del_flag")
    private Integer delFlag;

    /**
     * 获取商家采购订单详情id
     *
     * @return purchase_order_detail_id - 商家采购订单详情id
     */
    public Integer getPurchaseOrderDetailId() {
        return purchaseOrderDetailId;
    }

    /**
     * 设置商家采购订单详情id
     *
     * @param purchaseOrderDetailId 商家采购订单详情id
     */
    public void setPurchaseOrderDetailId(Integer purchaseOrderDetailId) {
        this.purchaseOrderDetailId = purchaseOrderDetailId;
    }

    /**
     * 获取商家采购订单id
     *
     * @return purchase_order_id - 商家采购订单id
     */
    public Integer getPurchaseOrderId() {
        return purchaseOrderId;
    }

    /**
     * 设置商家采购订单id
     *
     * @param purchaseOrderId 商家采购订单id
     */
    public void setPurchaseOrderId(Integer purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    /**
     * 获取商品id
     *
     * @return goods_id - 商品id
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品id
     *
     * @param goodsId 商品id
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取商品名称
     *
     * @return goods_name - 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置商品名称
     *
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * 获取订单数量
     *
     * @return order_quantity - 订单数量
     */
    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * 设置订单数量
     *
     * @param orderQuantity 订单数量
     */
    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    /**
     * 获取实收数量
     *
     * @return actual_quantity - 实收数量
     */
    public Integer getActualQuantity() {
        return actualQuantity;
    }

    /**
     * 设置实收数量
     *
     * @param actualQuantity 实收数量
     */
    public void setActualQuantity(Integer actualQuantity) {
        this.actualQuantity = actualQuantity;
    }

    /**
     * 获取预计单价
     *
     * @return order_price - 预计单价
     */
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    /**
     * 设置预计单价
     *
     * @param orderPrice 预计单价
     */
    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * 获取实际单价
     *
     * @return actual_price - 实际单价
     */
    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    /**
     * 设置实际单价
     *
     * @param actualPrice 实际单价
     */
    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
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
     * 获取订单详情状态(0:申请，1:缺货，2:完成)
     *
     * @return order_detail_status - 订单详情状态(0:申请，1:缺货，2:完成)
     */
    public Integer getOrderDetailStatus() {
        return orderDetailStatus;
    }

    /**
     * 设置订单详情状态(0:申请，1:缺货，2:完成)
     *
     * @param orderDetailStatus 订单详情状态(0:申请，1:缺货，2:完成)
     */
    public void setOrderDetailStatus(Integer orderDetailStatus) {
        this.orderDetailStatus = orderDetailStatus;
    }

    /**
     * 获取箱规
     *
     * @return standard - 箱规
     */
    public String getStandard() {
        return standard;
    }

    /**
     * 设置箱规
     *
     * @param standard 箱规
     */
    public void setStandard(String standard) {
        this.standard = standard;
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
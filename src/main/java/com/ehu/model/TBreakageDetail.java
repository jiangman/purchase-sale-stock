package com.ehu.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_breakage_detail")
public class TBreakageDetail {
    @Id
    @Column(name = "breakage_detail_id")
    private Integer breakageDetailId;

    /**
     * 报损单id
     */
    @Column(name = "breakage_id")
    private Integer breakageId;

    /**
     * 采购单id
     */
    @Column(name = "purchase_order_id")
    private Integer purchaseOrderId;

    /**
     * 商品名称
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 报损数量
     */
    private Integer quantity;

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
     * @return breakage_detail_id
     */
    public Integer getBreakageDetailId() {
        return breakageDetailId;
    }

    /**
     * @param breakageDetailId
     */
    public void setBreakageDetailId(Integer breakageDetailId) {
        this.breakageDetailId = breakageDetailId;
    }

    /**
     * 获取报损单id
     *
     * @return breakage_id - 报损单id
     */
    public Integer getBreakageId() {
        return breakageId;
    }

    /**
     * 设置报损单id
     *
     * @param breakageId 报损单id
     */
    public void setBreakageId(Integer breakageId) {
        this.breakageId = breakageId;
    }

    /**
     * 获取采购单id
     *
     * @return purchase_order_id - 采购单id
     */
    public Integer getPurchaseOrderId() {
        return purchaseOrderId;
    }

    /**
     * 设置采购单id
     *
     * @param purchaseOrderId 采购单id
     */
    public void setPurchaseOrderId(Integer purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
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
     * 获取报损数量
     *
     * @return quantity - 报损数量
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 设置报损数量
     *
     * @param quantity 报损数量
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
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
}
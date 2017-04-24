package com.ehu.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_out_stock_record")
public class TOutStockRecord {
    /**
     * 出库单编号
     */
    @Id
    @Column(name = "out_record_id")
    private Integer outRecordId;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 商品编号
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 出库数量
     */
    @Column(name = "out_quantity")
    private Integer outQuantity;

    /**
     * 出库时间
     */
    @Column(name = "out_time")
    private Date outTime;

    /**
     * 商品类型(0:商品，1:赠品)
     */
    @Column(name = "goods_type")
    private Integer goodsType;

    /**
     * 批次
     */
    private String batch;

    /**
     * 生产日期
     */
    @Column(name = "production_time")
    private Date productionTime;

    /**
     * 库存编号
     */
    @Column(name = "stock_id")
    private Integer stockId;

    /**
     * 采购订单编号
     */
    @Column(name = "purchase_order_id")
    private Integer purchaseOrderId;

    /**
     * 出库类型(0:订单出库，1:报损出库，2:其它)
     */
    @Column(name = "out_type")
    private Integer outType;

    /**
     * 商家id
     */
    @Column(name = "merchant_id")
    private Integer merchantId;

    /**
     * 配货人
     */
    private String picker;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取出库单编号
     *
     * @return out_record_id - 出库单编号
     */
    public Integer getOutRecordId() {
        return outRecordId;
    }

    /**
     * 设置出库单编号
     *
     * @param outRecordId 出库单编号
     */
    public void setOutRecordId(Integer outRecordId) {
        this.outRecordId = outRecordId;
    }

    /**
     * 获取操作人
     *
     * @return operator - 操作人
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作人
     *
     * @param operator 操作人
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 获取商品编号
     *
     * @return goods_id - 商品编号
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品编号
     *
     * @param goodsId 商品编号
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取出库数量
     *
     * @return out_quantity - 出库数量
     */
    public Integer getOutQuantity() {
        return outQuantity;
    }

    /**
     * 设置出库数量
     *
     * @param outQuantity 出库数量
     */
    public void setOutQuantity(Integer outQuantity) {
        this.outQuantity = outQuantity;
    }

    /**
     * 获取出库时间
     *
     * @return out_time - 出库时间
     */
    public Date getOutTime() {
        return outTime;
    }

    /**
     * 设置出库时间
     *
     * @param outTime 出库时间
     */
    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    /**
     * 获取商品类型(0:商品，1:赠品)
     *
     * @return goods_type - 商品类型(0:商品，1:赠品)
     */
    public Integer getGoodsType() {
        return goodsType;
    }

    /**
     * 设置商品类型(0:商品，1:赠品)
     *
     * @param goodsType 商品类型(0:商品，1:赠品)
     */
    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * 获取批次
     *
     * @return batch - 批次
     */
    public String getBatch() {
        return batch;
    }

    /**
     * 设置批次
     *
     * @param batch 批次
     */
    public void setBatch(String batch) {
        this.batch = batch;
    }

    /**
     * 获取生产日期
     *
     * @return production_time - 生产日期
     */
    public Date getProductionTime() {
        return productionTime;
    }

    /**
     * 设置生产日期
     *
     * @param productionTime 生产日期
     */
    public void setProductionTime(Date productionTime) {
        this.productionTime = productionTime;
    }

    /**
     * 获取库存编号
     *
     * @return stock_id - 库存编号
     */
    public Integer getStockId() {
        return stockId;
    }

    /**
     * 设置库存编号
     *
     * @param stockId 库存编号
     */
    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    /**
     * 获取采购订单编号
     *
     * @return purchase_order_id - 采购订单编号
     */
    public Integer getPurchaseOrderId() {
        return purchaseOrderId;
    }

    /**
     * 设置采购订单编号
     *
     * @param purchaseOrderId 采购订单编号
     */
    public void setPurchaseOrderId(Integer purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    /**
     * 获取出库类型(0:订单出库，1:报损出库，2:其它)
     *
     * @return out_type - 出库类型(0:订单出库，1:报损出库，2:其它)
     */
    public Integer getOutType() {
        return outType;
    }

    /**
     * 设置出库类型(0:订单出库，1:报损出库，2:其它)
     *
     * @param outType 出库类型(0:订单出库，1:报损出库，2:其它)
     */
    public void setOutType(Integer outType) {
        this.outType = outType;
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
     * 获取配货人
     *
     * @return picker - 配货人
     */
    public String getPicker() {
        return picker;
    }

    /**
     * 设置配货人
     *
     * @param picker 配货人
     */
    public void setPicker(String picker) {
        this.picker = picker;
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
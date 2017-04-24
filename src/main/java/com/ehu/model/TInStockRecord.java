package com.ehu.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_in_stock_record")
public class TInStockRecord {
    /**
     * 入库单编号
     */
    @Id
    @Column(name = "in_record_id")
    private Integer inRecordId;

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
     * 入库数量
     */
    @Column(name = "out_quantity")
    private Integer outQuantity;

    /**
     * 入库时间
     */
    @Column(name = "in_time")
    private Date inTime;

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
     * 库位号
     */
    @Column(name = "stock_num")
    private String stockNum;

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
     * 规格
     */
    private String standard;

    /**
     * 收货人
     */
    private String receiver;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取入库单编号
     *
     * @return in_record_id - 入库单编号
     */
    public Integer getInRecordId() {
        return inRecordId;
    }

    /**
     * 设置入库单编号
     *
     * @param inRecordId 入库单编号
     */
    public void setInRecordId(Integer inRecordId) {
        this.inRecordId = inRecordId;
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
     * 获取入库数量
     *
     * @return out_quantity - 入库数量
     */
    public Integer getOutQuantity() {
        return outQuantity;
    }

    /**
     * 设置入库数量
     *
     * @param outQuantity 入库数量
     */
    public void setOutQuantity(Integer outQuantity) {
        this.outQuantity = outQuantity;
    }

    /**
     * 获取入库时间
     *
     * @return in_time - 入库时间
     */
    public Date getInTime() {
        return inTime;
    }

    /**
     * 设置入库时间
     *
     * @param inTime 入库时间
     */
    public void setInTime(Date inTime) {
        this.inTime = inTime;
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
     * 获取库位号
     *
     * @return stock_num - 库位号
     */
    public String getStockNum() {
        return stockNum;
    }

    /**
     * 设置库位号
     *
     * @param stockNum 库位号
     */
    public void setStockNum(String stockNum) {
        this.stockNum = stockNum;
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
     * 获取规格
     *
     * @return standard - 规格
     */
    public String getStandard() {
        return standard;
    }

    /**
     * 设置规格
     *
     * @param standard 规格
     */
    public void setStandard(String standard) {
        this.standard = standard;
    }

    /**
     * 获取收货人
     *
     * @return receiver - 收货人
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * 设置收货人
     *
     * @param receiver 收货人
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
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
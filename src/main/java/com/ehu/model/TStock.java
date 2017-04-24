package com.ehu.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_stock")
public class TStock {
    /**
     * 库存编号
     */
    @Id
    @Column(name = "stock_id")
    private Integer stockId;

    /**
     * 商品编号
     */
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 商品第一次入库时间
     */
    @Column(name = "first_in_time")
    private Date firstInTime;

    /**
     * 商品最后一次出库时间
     */
    @Column(name = "last_out_time")
    private Date lastOutTime;

    /**
     * 库存数
     */
    @Column(name = "stock_quantity")
    private Integer stockQuantity;

    /**
     * 赠品数
     */
    @Column(name = "send_quantity")
    private Integer sendQuantity;

    /**
     * 商家id
     */
    @Column(name = "merchant_id")
    private Integer merchantId;

    /**
     * 库位号
     */
    @Column(name = "stock_num")
    private String stockNum;

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
     * 获取商品第一次入库时间
     *
     * @return first_in_time - 商品第一次入库时间
     */
    public Date getFirstInTime() {
        return firstInTime;
    }

    /**
     * 设置商品第一次入库时间
     *
     * @param firstInTime 商品第一次入库时间
     */
    public void setFirstInTime(Date firstInTime) {
        this.firstInTime = firstInTime;
    }

    /**
     * 获取商品最后一次出库时间
     *
     * @return last_out_time - 商品最后一次出库时间
     */
    public Date getLastOutTime() {
        return lastOutTime;
    }

    /**
     * 设置商品最后一次出库时间
     *
     * @param lastOutTime 商品最后一次出库时间
     */
    public void setLastOutTime(Date lastOutTime) {
        this.lastOutTime = lastOutTime;
    }

    /**
     * 获取库存数
     *
     * @return stock_quantity - 库存数
     */
    public Integer getStockQuantity() {
        return stockQuantity;
    }

    /**
     * 设置库存数
     *
     * @param stockQuantity 库存数
     */
    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    /**
     * 获取赠品数
     *
     * @return send_quantity - 赠品数
     */
    public Integer getSendQuantity() {
        return sendQuantity;
    }

    /**
     * 设置赠品数
     *
     * @param sendQuantity 赠品数
     */
    public void setSendQuantity(Integer sendQuantity) {
        this.sendQuantity = sendQuantity;
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
}
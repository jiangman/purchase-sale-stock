package com.ehu.model;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "ehu.t_store_merchant_goods")
public class TStoreMerchantGoods {
    /**
     * 外键：商家信息id
     */
    private Integer smiid;

    /**
     * 外键：商品信息id
     */
    private Integer sgiid;

    /**
     * 商品描述
     */
    @Column(name = "smg_describe")
    private String smgDescribe;

    /**
     * 商品月售数量
     */
    @Column(name = "smg_sale_count")
    private Integer smgSaleCount;

    /**
     * 商品单价
     */
    @Column(name = "smg_price")
    private BigDecimal smgPrice;

    /**
     * 商品状态（-1：下架中，0：补货中，1：可购买）
     */
    @Column(name = "smg_status")
    private Integer smgStatus;

    /**
     * 平均成本
     */
    @Column(name = "avg_cost")
    private BigDecimal avgCost;

    /**
     * 赠品数
     */
    @Column(name = "send_quantity")
    private Integer sendQuantity;

    /**
     * 库存量
     */
    private BigDecimal inventory;

    /**
     * 成本价
     */
    @Column(name = "cost_price")
    private BigDecimal costPrice;

    /**
     * 低库存预警阀值
     */
    @Column(name = "amt_alarm_threshold")
    private BigDecimal amtAlarmThreshold;

    /**
     * 保质期
     */
    @Column(name = "shelf_life")
    private String shelfLife;

    /**
     * 优先级
     */
    private Float priority;

    /**
     * 商品第一次入库时间
     */
    @Column(name = "first_in_time")
    private Date firstInTime;

    /**
     * 最后一次出库时间
     */
    @Column(name = "last_out_time")
    private Date lastOutTime;

    /**
     * 获取外键：商家信息id
     *
     * @return smiid - 外键：商家信息id
     */
    public Integer getSmiid() {
        return smiid;
    }

    /**
     * 设置外键：商家信息id
     *
     * @param smiid 外键：商家信息id
     */
    public void setSmiid(Integer smiid) {
        this.smiid = smiid;
    }

    /**
     * 获取外键：商品信息id
     *
     * @return sgiid - 外键：商品信息id
     */
    public Integer getSgiid() {
        return sgiid;
    }

    /**
     * 设置外键：商品信息id
     *
     * @param sgiid 外键：商品信息id
     */
    public void setSgiid(Integer sgiid) {
        this.sgiid = sgiid;
    }

    /**
     * 获取商品描述
     *
     * @return smg_describe - 商品描述
     */
    public String getSmgDescribe() {
        return smgDescribe;
    }

    /**
     * 设置商品描述
     *
     * @param smgDescribe 商品描述
     */
    public void setSmgDescribe(String smgDescribe) {
        this.smgDescribe = smgDescribe;
    }

    /**
     * 获取商品月售数量
     *
     * @return smg_sale_count - 商品月售数量
     */
    public Integer getSmgSaleCount() {
        return smgSaleCount;
    }

    /**
     * 设置商品月售数量
     *
     * @param smgSaleCount 商品月售数量
     */
    public void setSmgSaleCount(Integer smgSaleCount) {
        this.smgSaleCount = smgSaleCount;
    }

    /**
     * 获取商品单价
     *
     * @return smg_price - 商品单价
     */
    public BigDecimal getSmgPrice() {
        return smgPrice;
    }

    /**
     * 设置商品单价
     *
     * @param smgPrice 商品单价
     */
    public void setSmgPrice(BigDecimal smgPrice) {
        this.smgPrice = smgPrice;
    }

    /**
     * 获取商品状态（-1：下架中，0：补货中，1：可购买）
     *
     * @return smg_status - 商品状态（-1：下架中，0：补货中，1：可购买）
     */
    public Integer getSmgStatus() {
        return smgStatus;
    }

    /**
     * 设置商品状态（-1：下架中，0：补货中，1：可购买）
     *
     * @param smgStatus 商品状态（-1：下架中，0：补货中，1：可购买）
     */
    public void setSmgStatus(Integer smgStatus) {
        this.smgStatus = smgStatus;
    }

    /**
     * 获取平均成本
     *
     * @return avg_cost - 平均成本
     */
    public BigDecimal getAvgCost() {
        return avgCost;
    }

    /**
     * 设置平均成本
     *
     * @param avgCost 平均成本
     */
    public void setAvgCost(BigDecimal avgCost) {
        this.avgCost = avgCost;
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
     * 获取库存量
     *
     * @return inventory - 库存量
     */
    public BigDecimal getInventory() {
        return inventory;
    }

    /**
     * 设置库存量
     *
     * @param inventory 库存量
     */
    public void setInventory(BigDecimal inventory) {
        this.inventory = inventory;
    }

    /**
     * 获取成本价
     *
     * @return cost_price - 成本价
     */
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    /**
     * 设置成本价
     *
     * @param costPrice 成本价
     */
    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    /**
     * 获取低库存预警阀值
     *
     * @return amt_alarm_threshold - 低库存预警阀值
     */
    public BigDecimal getAmtAlarmThreshold() {
        return amtAlarmThreshold;
    }

    /**
     * 设置低库存预警阀值
     *
     * @param amtAlarmThreshold 低库存预警阀值
     */
    public void setAmtAlarmThreshold(BigDecimal amtAlarmThreshold) {
        this.amtAlarmThreshold = amtAlarmThreshold;
    }

    /**
     * 获取保质期
     *
     * @return shelf_life - 保质期
     */
    public String getShelfLife() {
        return shelfLife;
    }

    /**
     * 设置保质期
     *
     * @param shelfLife 保质期
     */
    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    /**
     * 获取优先级
     *
     * @return priority - 优先级
     */
    public Float getPriority() {
        return priority;
    }

    /**
     * 设置优先级
     *
     * @param priority 优先级
     */
    public void setPriority(Float priority) {
        this.priority = priority;
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
     * 获取最后一次出库时间
     *
     * @return last_out_time - 最后一次出库时间
     */
    public Date getLastOutTime() {
        return lastOutTime;
    }

    /**
     * 设置最后一次出库时间
     *
     * @param lastOutTime 最后一次出库时间
     */
    public void setLastOutTime(Date lastOutTime) {
        this.lastOutTime = lastOutTime;
    }
}
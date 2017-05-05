package com.ehu.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "t_supplier_goods")
public class TSupplierGoods {
    /**
     * 商家商品id
     */
    @Id
    @Column(name = "goods_id")
    private Integer goodsId;

    /**
     * 供应商id
     */
    @Column(name = "supplier_id")
    private Integer supplierId;

    /**
     * 规格
     */
    private String standard;

    /**
     * 规格数量
     */
    @Column(name = "standard_value")
    private Integer standardValue;

    /**
     * 最小起订数量
     */
    @Column(name = "min_order_quantity")
    private Integer minOrderQuantity;

    /**
     * 成本价
     */
    @Column(name = "`cost_price`")
    private BigDecimal costPrice;

    /**
     * 商品库商品id
     */
    private Integer sgiid;

    /**
     * 删除标识(0:正常， 1:已删除)
     */
    @Column(name = "del_flag")
    private Integer delFlag;

    /**
     * 获取商家商品id
     *
     * @return goods_id - 商家商品id
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商家商品id
     *
     * @param goodsId 商家商品id
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
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
     * 获取规格数量
     *
     * @return standard_value - 规格数量
     */
    public Integer getStandardValue() {
        return standardValue;
    }

    /**
     * 设置规格数量
     *
     * @param standardValue 规格数量
     */
    public void setStandardValue(Integer standardValue) {
        this.standardValue = standardValue;
    }

    /**
     * 获取最小起订数量
     *
     * @return min_order_quantity - 最小起订数量
     */
    public Integer getMinOrderQuantity() {
        return minOrderQuantity;
    }

    /**
     * 设置最小起订数量
     *
     * @param minOrderQuantity 最小起订数量
     */
    public void setMinOrderQuantity(Integer minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
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
     * 获取商品库商品id
     *
     * @return sgiid - 商品库商品id
     */
    public Integer getSgiid() {
        return sgiid;
    }

    /**
     * 设置商品库商品id
     *
     * @param sgiid 商品库商品id
     */
    public void setSgiid(Integer sgiid) {
        this.sgiid = sgiid;
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
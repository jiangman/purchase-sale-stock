package com.ehu.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "ehu.t_store_goods_info")
public class TStoreGoodsInfo {
    /**
     * 商品信息id
     */
    @Id
    private Integer sgiid;

    /**
     * 商品名称
     */
    @Column(name = "sgi_name")
    private String sgiName;

    /**
     * 商品规格
     */
    @Column(name = "sgi_standard")
    private String sgiStandard;

    /**
     * 商品品牌
     */
    @Column(name = "sgi_brand")
    private String sgiBrand;

    /**
     * 商品图标(展示商品列表时显示)
     */
    @Column(name = "sgi_icon")
    private String sgiIcon;

    /**
     * 商品图片（点击商品详情时显示）
     */
    @Column(name = "sgi_img")
    private String sgiImg;

    /**
     * 外键：商品菜单二级分类id
     */
    private Integer sgmsid;

    /**
     * 创建时间
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 更新时间
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 更新者
     */
    @Column(name = "update_by")
    private String updateBy;

    /**
     * 是否启用（1：启用0：未启用）
     */
    @Column(name = "valid_flag")
    private Integer validFlag;

    /**
     * 条形码编码
     */
    @Column(name = "bar_code")
    private String barCode;

    /**
     * 获取商品信息id
     *
     * @return sgiid - 商品信息id
     */
    public Integer getSgiid() {
        return sgiid;
    }

    /**
     * 设置商品信息id
     *
     * @param sgiid 商品信息id
     */
    public void setSgiid(Integer sgiid) {
        this.sgiid = sgiid;
    }

    /**
     * 获取商品名称
     *
     * @return sgi_name - 商品名称
     */
    public String getSgiName() {
        return sgiName;
    }

    /**
     * 设置商品名称
     *
     * @param sgiName 商品名称
     */
    public void setSgiName(String sgiName) {
        this.sgiName = sgiName;
    }

    /**
     * 获取商品规格
     *
     * @return sgi_standard - 商品规格
     */
    public String getSgiStandard() {
        return sgiStandard;
    }

    /**
     * 设置商品规格
     *
     * @param sgiStandard 商品规格
     */
    public void setSgiStandard(String sgiStandard) {
        this.sgiStandard = sgiStandard;
    }

    /**
     * 获取商品品牌
     *
     * @return sgi_brand - 商品品牌
     */
    public String getSgiBrand() {
        return sgiBrand;
    }

    /**
     * 设置商品品牌
     *
     * @param sgiBrand 商品品牌
     */
    public void setSgiBrand(String sgiBrand) {
        this.sgiBrand = sgiBrand;
    }

    /**
     * 获取商品图标(展示商品列表时显示)
     *
     * @return sgi_icon - 商品图标(展示商品列表时显示)
     */
    public String getSgiIcon() {
        return sgiIcon;
    }

    /**
     * 设置商品图标(展示商品列表时显示)
     *
     * @param sgiIcon 商品图标(展示商品列表时显示)
     */
    public void setSgiIcon(String sgiIcon) {
        this.sgiIcon = sgiIcon;
    }

    /**
     * 获取商品图片（点击商品详情时显示）
     *
     * @return sgi_img - 商品图片（点击商品详情时显示）
     */
    public String getSgiImg() {
        return sgiImg;
    }

    /**
     * 设置商品图片（点击商品详情时显示）
     *
     * @param sgiImg 商品图片（点击商品详情时显示）
     */
    public void setSgiImg(String sgiImg) {
        this.sgiImg = sgiImg;
    }

    /**
     * 获取外键：商品菜单二级分类id
     *
     * @return sgmsid - 外键：商品菜单二级分类id
     */
    public Integer getSgmsid() {
        return sgmsid;
    }

    /**
     * 设置外键：商品菜单二级分类id
     *
     * @param sgmsid 外键：商品菜单二级分类id
     */
    public void setSgmsid(Integer sgmsid) {
        this.sgmsid = sgmsid;
    }

    /**
     * 获取创建时间
     *
     * @return create_date - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
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
     * 获取更新时间
     *
     * @return update_date - 更新时间
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * 设置更新时间
     *
     * @param updateDate 更新时间
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * 获取更新者
     *
     * @return update_by - 更新者
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新者
     *
     * @param updateBy 更新者
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取是否启用（1：启用0：未启用）
     *
     * @return valid_flag - 是否启用（1：启用0：未启用）
     */
    public Integer getValidFlag() {
        return validFlag;
    }

    /**
     * 设置是否启用（1：启用0：未启用）
     *
     * @param validFlag 是否启用（1：启用0：未启用）
     */
    public void setValidFlag(Integer validFlag) {
        this.validFlag = validFlag;
    }

    /**
     * 获取条形码编码
     *
     * @return bar_code - 条形码编码
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * 设置条形码编码
     *
     * @param barCode 条形码编码
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
}
package com.ehu.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "ehu.t_store_merchant_info")
public class TStoreMerchantInfo {
    /**
     * 商家信息id
     */
    @Id
    private Integer smiid;

    /**
     * 商家名称
     */
    @Column(name = "smi_name")
    private String smiName;

    /**
     * 商家头像路径
     */
    @Column(name = "smi_avatar")
    private String smiAvatar;

    /**
     * 商品种类数量
     */
    @Column(name = "smi_goods_count")
    private Integer smiGoodsCount;

    /**
     * 起送价，单元：元
     */
    @Column(name = "smi_send_up")
    private BigDecimal smiSendUp;

    /**
     * 配送费，单元：元
     */
    @Column(name = "smi_distribution")
    private BigDecimal smiDistribution;

    /**
     * 满免配送费金额，单元：元
     */
    @Column(name = "smi_with_free")
    private BigDecimal smiWithFree;

    /**
     * 商家接单后送达时间
     */
    @Column(name = "smi_shipping_time")
    private String smiShippingTime;

    /**
     * 外键：商品信息id1
     */
    @Column(name = "smi_show_goods_id1")
    private Integer smiShowGoodsId1;

    /**
     * 外键：商品信息id2
     */
    @Column(name = "smi_show_goods_id2")
    private Integer smiShowGoodsId2;

    /**
     * 外键：商品信息id3
     */
    @Column(name = "smi_show_goods_id3")
    private Integer smiShowGoodsId3;

    /**
     * 商家地址
     */
    @Column(name = "smi_address")
    private String smiAddress;

    /**
     * 商家联系电话
     */
    @Column(name = "smi_phone")
    private String smiPhone;

    /**
     * 商家公告
     */
    @Column(name = "smi_notice")
    private String smiNotice;

    /**
     * 商家经度
     */
    @Column(name = "smi_longitude")
    private Double smiLongitude;

    /**
     * 商家纬度
     */
    @Column(name = "smi_latitude")
    private Double smiLatitude;

    /**
     * 商家状态（0：休息中，1：营业中）
     */
    @Column(name = "smi_status")
    private Integer smiStatus;

    /**
     * 支付宝账号（email或电话必须是绑定的）
     */
    @Column(name = "alipay_account")
    private String alipayAccount;

    /**
     * 微信openid
     */
    @Column(name = "wechat_openid")
    private String wechatOpenid;

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
     * 订单月售量
     */
    @Column(name = "sgo_sale_count")
    private Integer sgoSaleCount;

    /**
     * 外键：商户id
     */
    @Column(name = "mct_guid")
    private Integer mctGuid;

    /**
     * 邀请码
     */
    @Column(name = "invite_code")
    private Integer inviteCode;

    /**
     * 是否沿街(A是，B 否)
     */
    @Column(name = "isAlongStreet")
    private String isalongstreet;

    /**
     * 行业编码
     */
    @Column(name = "industry_code")
    private String industryCode;

    /**
     * 商店编码
     */
    @Column(name = "smi_code")
    private String smiCode;

    /**
     * 区县编码
     */
    @Column(name = "county_code")
    private String countyCode;

    /**
     * 地区编码
     */
    @Column(name = "area_code")
    private String areaCode;

    /**
     * 完整编码
     */
    @Column(name = "merchant_code")
    private String merchantCode;

    /**
     * 奖励方案
     */
    private Integer planid;

    /**
     * 1.自营店，2.第三方店
     */
    @Column(name = "mct_type")
    private Integer mctType;

    /**
     * 获取商家信息id
     *
     * @return smiid - 商家信息id
     */
    public Integer getSmiid() {
        return smiid;
    }

    /**
     * 设置商家信息id
     *
     * @param smiid 商家信息id
     */
    public void setSmiid(Integer smiid) {
        this.smiid = smiid;
    }

    /**
     * 获取商家名称
     *
     * @return smi_name - 商家名称
     */
    public String getSmiName() {
        return smiName;
    }

    /**
     * 设置商家名称
     *
     * @param smiName 商家名称
     */
    public void setSmiName(String smiName) {
        this.smiName = smiName;
    }

    /**
     * 获取商家头像路径
     *
     * @return smi_avatar - 商家头像路径
     */
    public String getSmiAvatar() {
        return smiAvatar;
    }

    /**
     * 设置商家头像路径
     *
     * @param smiAvatar 商家头像路径
     */
    public void setSmiAvatar(String smiAvatar) {
        this.smiAvatar = smiAvatar;
    }

    /**
     * 获取商品种类数量
     *
     * @return smi_goods_count - 商品种类数量
     */
    public Integer getSmiGoodsCount() {
        return smiGoodsCount;
    }

    /**
     * 设置商品种类数量
     *
     * @param smiGoodsCount 商品种类数量
     */
    public void setSmiGoodsCount(Integer smiGoodsCount) {
        this.smiGoodsCount = smiGoodsCount;
    }

    /**
     * 获取起送价，单元：元
     *
     * @return smi_send_up - 起送价，单元：元
     */
    public BigDecimal getSmiSendUp() {
        return smiSendUp;
    }

    /**
     * 设置起送价，单元：元
     *
     * @param smiSendUp 起送价，单元：元
     */
    public void setSmiSendUp(BigDecimal smiSendUp) {
        this.smiSendUp = smiSendUp;
    }

    /**
     * 获取配送费，单元：元
     *
     * @return smi_distribution - 配送费，单元：元
     */
    public BigDecimal getSmiDistribution() {
        return smiDistribution;
    }

    /**
     * 设置配送费，单元：元
     *
     * @param smiDistribution 配送费，单元：元
     */
    public void setSmiDistribution(BigDecimal smiDistribution) {
        this.smiDistribution = smiDistribution;
    }

    /**
     * 获取满免配送费金额，单元：元
     *
     * @return smi_with_free - 满免配送费金额，单元：元
     */
    public BigDecimal getSmiWithFree() {
        return smiWithFree;
    }

    /**
     * 设置满免配送费金额，单元：元
     *
     * @param smiWithFree 满免配送费金额，单元：元
     */
    public void setSmiWithFree(BigDecimal smiWithFree) {
        this.smiWithFree = smiWithFree;
    }

    /**
     * 获取商家接单后送达时间
     *
     * @return smi_shipping_time - 商家接单后送达时间
     */
    public String getSmiShippingTime() {
        return smiShippingTime;
    }

    /**
     * 设置商家接单后送达时间
     *
     * @param smiShippingTime 商家接单后送达时间
     */
    public void setSmiShippingTime(String smiShippingTime) {
        this.smiShippingTime = smiShippingTime;
    }

    /**
     * 获取外键：商品信息id1
     *
     * @return smi_show_goods_id1 - 外键：商品信息id1
     */
    public Integer getSmiShowGoodsId1() {
        return smiShowGoodsId1;
    }

    /**
     * 设置外键：商品信息id1
     *
     * @param smiShowGoodsId1 外键：商品信息id1
     */
    public void setSmiShowGoodsId1(Integer smiShowGoodsId1) {
        this.smiShowGoodsId1 = smiShowGoodsId1;
    }

    /**
     * 获取外键：商品信息id2
     *
     * @return smi_show_goods_id2 - 外键：商品信息id2
     */
    public Integer getSmiShowGoodsId2() {
        return smiShowGoodsId2;
    }

    /**
     * 设置外键：商品信息id2
     *
     * @param smiShowGoodsId2 外键：商品信息id2
     */
    public void setSmiShowGoodsId2(Integer smiShowGoodsId2) {
        this.smiShowGoodsId2 = smiShowGoodsId2;
    }

    /**
     * 获取外键：商品信息id3
     *
     * @return smi_show_goods_id3 - 外键：商品信息id3
     */
    public Integer getSmiShowGoodsId3() {
        return smiShowGoodsId3;
    }

    /**
     * 设置外键：商品信息id3
     *
     * @param smiShowGoodsId3 外键：商品信息id3
     */
    public void setSmiShowGoodsId3(Integer smiShowGoodsId3) {
        this.smiShowGoodsId3 = smiShowGoodsId3;
    }

    /**
     * 获取商家地址
     *
     * @return smi_address - 商家地址
     */
    public String getSmiAddress() {
        return smiAddress;
    }

    /**
     * 设置商家地址
     *
     * @param smiAddress 商家地址
     */
    public void setSmiAddress(String smiAddress) {
        this.smiAddress = smiAddress;
    }

    /**
     * 获取商家联系电话
     *
     * @return smi_phone - 商家联系电话
     */
    public String getSmiPhone() {
        return smiPhone;
    }

    /**
     * 设置商家联系电话
     *
     * @param smiPhone 商家联系电话
     */
    public void setSmiPhone(String smiPhone) {
        this.smiPhone = smiPhone;
    }

    /**
     * 获取商家公告
     *
     * @return smi_notice - 商家公告
     */
    public String getSmiNotice() {
        return smiNotice;
    }

    /**
     * 设置商家公告
     *
     * @param smiNotice 商家公告
     */
    public void setSmiNotice(String smiNotice) {
        this.smiNotice = smiNotice;
    }

    /**
     * 获取商家经度
     *
     * @return smi_longitude - 商家经度
     */
    public Double getSmiLongitude() {
        return smiLongitude;
    }

    /**
     * 设置商家经度
     *
     * @param smiLongitude 商家经度
     */
    public void setSmiLongitude(Double smiLongitude) {
        this.smiLongitude = smiLongitude;
    }

    /**
     * 获取商家纬度
     *
     * @return smi_latitude - 商家纬度
     */
    public Double getSmiLatitude() {
        return smiLatitude;
    }

    /**
     * 设置商家纬度
     *
     * @param smiLatitude 商家纬度
     */
    public void setSmiLatitude(Double smiLatitude) {
        this.smiLatitude = smiLatitude;
    }

    /**
     * 获取商家状态（0：休息中，1：营业中）
     *
     * @return smi_status - 商家状态（0：休息中，1：营业中）
     */
    public Integer getSmiStatus() {
        return smiStatus;
    }

    /**
     * 设置商家状态（0：休息中，1：营业中）
     *
     * @param smiStatus 商家状态（0：休息中，1：营业中）
     */
    public void setSmiStatus(Integer smiStatus) {
        this.smiStatus = smiStatus;
    }

    /**
     * 获取支付宝账号（email或电话必须是绑定的）
     *
     * @return alipay_account - 支付宝账号（email或电话必须是绑定的）
     */
    public String getAlipayAccount() {
        return alipayAccount;
    }

    /**
     * 设置支付宝账号（email或电话必须是绑定的）
     *
     * @param alipayAccount 支付宝账号（email或电话必须是绑定的）
     */
    public void setAlipayAccount(String alipayAccount) {
        this.alipayAccount = alipayAccount;
    }

    /**
     * 获取微信openid
     *
     * @return wechat_openid - 微信openid
     */
    public String getWechatOpenid() {
        return wechatOpenid;
    }

    /**
     * 设置微信openid
     *
     * @param wechatOpenid 微信openid
     */
    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid;
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
     * 获取订单月售量
     *
     * @return sgo_sale_count - 订单月售量
     */
    public Integer getSgoSaleCount() {
        return sgoSaleCount;
    }

    /**
     * 设置订单月售量
     *
     * @param sgoSaleCount 订单月售量
     */
    public void setSgoSaleCount(Integer sgoSaleCount) {
        this.sgoSaleCount = sgoSaleCount;
    }

    /**
     * 获取外键：商户id
     *
     * @return mct_guid - 外键：商户id
     */
    public Integer getMctGuid() {
        return mctGuid;
    }

    /**
     * 设置外键：商户id
     *
     * @param mctGuid 外键：商户id
     */
    public void setMctGuid(Integer mctGuid) {
        this.mctGuid = mctGuid;
    }

    /**
     * 获取邀请码
     *
     * @return invite_code - 邀请码
     */
    public Integer getInviteCode() {
        return inviteCode;
    }

    /**
     * 设置邀请码
     *
     * @param inviteCode 邀请码
     */
    public void setInviteCode(Integer inviteCode) {
        this.inviteCode = inviteCode;
    }

    /**
     * 获取是否沿街(A是，B 否)
     *
     * @return isAlongStreet - 是否沿街(A是，B 否)
     */
    public String getIsalongstreet() {
        return isalongstreet;
    }

    /**
     * 设置是否沿街(A是，B 否)
     *
     * @param isalongstreet 是否沿街(A是，B 否)
     */
    public void setIsalongstreet(String isalongstreet) {
        this.isalongstreet = isalongstreet;
    }

    /**
     * 获取行业编码
     *
     * @return industry_code - 行业编码
     */
    public String getIndustryCode() {
        return industryCode;
    }

    /**
     * 设置行业编码
     *
     * @param industryCode 行业编码
     */
    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    /**
     * 获取商店编码
     *
     * @return smi_code - 商店编码
     */
    public String getSmiCode() {
        return smiCode;
    }

    /**
     * 设置商店编码
     *
     * @param smiCode 商店编码
     */
    public void setSmiCode(String smiCode) {
        this.smiCode = smiCode;
    }

    /**
     * 获取区县编码
     *
     * @return county_code - 区县编码
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * 设置区县编码
     *
     * @param countyCode 区县编码
     */
    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    /**
     * 获取地区编码
     *
     * @return area_code - 地区编码
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 设置地区编码
     *
     * @param areaCode 地区编码
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * 获取完整编码
     *
     * @return merchant_code - 完整编码
     */
    public String getMerchantCode() {
        return merchantCode;
    }

    /**
     * 设置完整编码
     *
     * @param merchantCode 完整编码
     */
    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    /**
     * 获取奖励方案
     *
     * @return planid - 奖励方案
     */
    public Integer getPlanid() {
        return planid;
    }

    /**
     * 设置奖励方案
     *
     * @param planid 奖励方案
     */
    public void setPlanid(Integer planid) {
        this.planid = planid;
    }

    /**
     * 获取1.自营店，2.第三方店
     *
     * @return mct_type - 1.自营店，2.第三方店
     */
    public Integer getMctType() {
        return mctType;
    }

    /**
     * 设置1.自营店，2.第三方店
     *
     * @param mctType 1.自营店，2.第三方店
     */
    public void setMctType(Integer mctType) {
        this.mctType = mctType;
    }
}
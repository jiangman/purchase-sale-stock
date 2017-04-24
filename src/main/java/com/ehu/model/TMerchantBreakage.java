package com.ehu.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_merchant_breakage")
public class TMerchantBreakage {
    /**
     * 报损单id
     */
    @Id
    @Column(name = "breakage_id")
    private Integer breakageId;

    /**
     * 商家id
     */
    @Column(name = "merchant_id")
    private Integer merchantId;

    /**
     * 供应商
     */
    @Column(name = "supplier_id")
    private Integer supplierId;

    /**
     * 负责人
     */
    @Column(name = "person_in_charge")
    private String personInCharge;

    /**
     * 报损总价
     */
    @Column(name = "breakage_price")
    private BigDecimal breakagePrice;

    /**
     * 订单状态(0:订单成功 1:订单取消，2:异常)
     */
    @Column(name = "breakage_status")
    private Integer breakageStatus;

    /**
     * 审核状态(0:未审核，1:审核通过，2:驳回)
     */
    @Column(name = "verify_status")
    private Integer verifyStatus;

    /**
     * 图片证据
     */
    @Column(name = "pic_evidence")
    private String picEvidence;

    /**
     * 备注
     */
    private String remark;

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
     * 获取供应商
     *
     * @return supplier_id - 供应商
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * 设置供应商
     *
     * @param supplierId 供应商
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 获取负责人
     *
     * @return person_in_charge - 负责人
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
     * 获取报损总价
     *
     * @return breakage_price - 报损总价
     */
    public BigDecimal getBreakagePrice() {
        return breakagePrice;
    }

    /**
     * 设置报损总价
     *
     * @param breakagePrice 报损总价
     */
    public void setBreakagePrice(BigDecimal breakagePrice) {
        this.breakagePrice = breakagePrice;
    }

    /**
     * 获取订单状态(0:订单成功 1:订单取消，2:异常)
     *
     * @return breakage_status - 订单状态(0:订单成功 1:订单取消，2:异常)
     */
    public Integer getBreakageStatus() {
        return breakageStatus;
    }

    /**
     * 设置订单状态(0:订单成功 1:订单取消，2:异常)
     *
     * @param breakageStatus 订单状态(0:订单成功 1:订单取消，2:异常)
     */
    public void setBreakageStatus(Integer breakageStatus) {
        this.breakageStatus = breakageStatus;
    }

    /**
     * 获取审核状态(0:未审核，1:审核通过，2:驳回)
     *
     * @return verify_status - 审核状态(0:未审核，1:审核通过，2:驳回)
     */
    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    /**
     * 设置审核状态(0:未审核，1:审核通过，2:驳回)
     *
     * @param verifyStatus 审核状态(0:未审核，1:审核通过，2:驳回)
     */
    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    /**
     * 获取图片证据
     *
     * @return pic_evidence - 图片证据
     */
    public String getPicEvidence() {
        return picEvidence;
    }

    /**
     * 设置图片证据
     *
     * @param picEvidence 图片证据
     */
    public void setPicEvidence(String picEvidence) {
        this.picEvidence = picEvidence;
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
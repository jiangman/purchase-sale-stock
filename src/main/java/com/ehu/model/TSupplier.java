package com.ehu.model;

import javax.persistence.*;

@Table(name = "t_supplier")
public class TSupplier {
    /**
     * 供应商id
     */
    @Id
    @Column(name = "supplier_id")
    private Integer supplierId;

    /**
     * 供应商名称
     */
    @Column(name = "supplier_name")
    private String supplierName;

    /**
     * 地址
     */
    private String address;

    /**
     * 电话
     */
    private String tel;

    /**
     * 邮箱
     */
    private String postcode;

    /**
     * 联系人
     */
    private String contacter;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 账期
     */
    @Column(name = "payment_days")
    private String paymentDays;

    /**
     * 结款方式
     */
    @Column(name = "payment_type")
    private String paymentType;

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
     * 获取供应商名称
     *
     * @return supplier_name - 供应商名称
     */
    public String getSupplierName() {
        return supplierName;
    }

    /**
     * 设置供应商名称
     *
     * @param supplierName 供应商名称
     */
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取电话
     *
     * @return tel - 电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话
     *
     * @param tel 电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取邮箱
     *
     * @return postcode - 邮箱
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 设置邮箱
     *
     * @param postcode 邮箱
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * 获取联系人
     *
     * @return contacter - 联系人
     */
    public String getContacter() {
        return contacter;
    }

    /**
     * 设置联系人
     *
     * @param contacter 联系人
     */
    public void setContacter(String contacter) {
        this.contacter = contacter;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取账期
     *
     * @return payment_days - 账期
     */
    public String getPaymentDays() {
        return paymentDays;
    }

    /**
     * 设置账期
     *
     * @param paymentDays 账期
     */
    public void setPaymentDays(String paymentDays) {
        this.paymentDays = paymentDays;
    }

    /**
     * 获取结款方式
     *
     * @return payment_type - 结款方式
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * 设置结款方式
     *
     * @param paymentType 结款方式
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
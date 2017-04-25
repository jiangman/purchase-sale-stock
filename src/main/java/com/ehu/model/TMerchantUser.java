package com.ehu.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_merchant_user")
public class TMerchantUser {
    /**
     * 商家端用户id
     */
    @Id
    private Integer guid;

    /**
     * 外键：商家店铺关联id
     */
    private Integer smiid;

    /**
     * 手机号（登录帐号）
     */
    private Long phone;

    /**
     * MD5加密后密码
     */
    @Column(name = "pass_word")
    private String passWord;

    /**
     * iphone消息推送的token
     */
    @Column(name = "push_token")
    private String pushToken;

    /**
     * 设备型号（1:ios,2:android）
     */
    private Integer termtyp;

    /**
     * 创建时间(10位时间戳)
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 密钥（ios未上传pushToken时生成，用于上传pushToken接口中使用）
     */
    @Column(name = "secret_key")
    private String secretKey;

    /**
     * 商户真实姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 环信id
     */
    @Column(name = "hx_username")
    private String hxUsername;

    /**
     * 环信密码
     */
    @Column(name = "hx_password")
    private String hxPassword;

    /**
     * 获取商家端用户id
     *
     * @return guid - 商家端用户id
     */
    public Integer getGuid() {
        return guid;
    }

    /**
     * 设置商家端用户id
     *
     * @param guid 商家端用户id
     */
    public void setGuid(Integer guid) {
        this.guid = guid;
    }

    /**
     * 获取外键：商家店铺关联id
     *
     * @return smiid - 外键：商家店铺关联id
     */
    public Integer getSmiid() {
        return smiid;
    }

    /**
     * 设置外键：商家店铺关联id
     *
     * @param smiid 外键：商家店铺关联id
     */
    public void setSmiid(Integer smiid) {
        this.smiid = smiid;
    }

    /**
     * 获取手机号（登录帐号）
     *
     * @return phone - 手机号（登录帐号）
     */
    public Long getPhone() {
        return phone;
    }

    /**
     * 设置手机号（登录帐号）
     *
     * @param phone 手机号（登录帐号）
     */
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    /**
     * 获取MD5加密后密码
     *
     * @return pass_word - MD5加密后密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置MD5加密后密码
     *
     * @param passWord MD5加密后密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取iphone消息推送的token
     *
     * @return push_token - iphone消息推送的token
     */
    public String getPushToken() {
        return pushToken;
    }

    /**
     * 设置iphone消息推送的token
     *
     * @param pushToken iphone消息推送的token
     */
    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    /**
     * 获取设备型号（1:ios,2:android）
     *
     * @return termtyp - 设备型号（1:ios,2:android）
     */
    public Integer getTermtyp() {
        return termtyp;
    }

    /**
     * 设置设备型号（1:ios,2:android）
     *
     * @param termtyp 设备型号（1:ios,2:android）
     */
    public void setTermtyp(Integer termtyp) {
        this.termtyp = termtyp;
    }

    /**
     * 获取创建时间(10位时间戳)
     *
     * @return create_time - 创建时间(10位时间戳)
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间(10位时间戳)
     *
     * @param createTime 创建时间(10位时间戳)
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取密钥（ios未上传pushToken时生成，用于上传pushToken接口中使用）
     *
     * @return secret_key - 密钥（ios未上传pushToken时生成，用于上传pushToken接口中使用）
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * 设置密钥（ios未上传pushToken时生成，用于上传pushToken接口中使用）
     *
     * @param secretKey 密钥（ios未上传pushToken时生成，用于上传pushToken接口中使用）
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * 获取商户真实姓名
     *
     * @return real_name - 商户真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置商户真实姓名
     *
     * @param realName 商户真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取环信id
     *
     * @return hx_username - 环信id
     */
    public String getHxUsername() {
        return hxUsername;
    }

    /**
     * 设置环信id
     *
     * @param hxUsername 环信id
     */
    public void setHxUsername(String hxUsername) {
        this.hxUsername = hxUsername;
    }

    /**
     * 获取环信密码
     *
     * @return hx_password - 环信密码
     */
    public String getHxPassword() {
        return hxPassword;
    }

    /**
     * 设置环信密码
     *
     * @param hxPassword 环信密码
     */
    public void setHxPassword(String hxPassword) {
        this.hxPassword = hxPassword;
    }
}
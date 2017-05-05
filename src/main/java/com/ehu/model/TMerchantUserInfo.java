package com.ehu.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ehu.t_merchant_user_info")
public class TMerchantUserInfo {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商家id
     */
    private Integer muid;

    /**
     * 商家店铺id
     */
    private Integer smiid;

    /**
     * 角色id
     */
    private Long roleid;

    /**
     * 父节点id
     */
    private Integer parentid;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商家id
     *
     * @return muid - 商家id
     */
    public Integer getMuid() {
        return muid;
    }

    /**
     * 设置商家id
     *
     * @param muid 商家id
     */
    public void setMuid(Integer muid) {
        this.muid = muid;
    }

    /**
     * 获取商家店铺id
     *
     * @return smiid - 商家店铺id
     */
    public Integer getSmiid() {
        return smiid;
    }

    /**
     * 设置商家店铺id
     *
     * @param smiid 商家店铺id
     */
    public void setSmiid(Integer smiid) {
        this.smiid = smiid;
    }

    /**
     * 获取角色id
     *
     * @return roleid - 角色id
     */
    public Long getRoleid() {
        return roleid;
    }

    /**
     * 设置角色id
     *
     * @param roleid 角色id
     */
    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取父节点id
     *
     * @return parentid - 父节点id
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父节点id
     *
     * @param parentid 父节点id
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}
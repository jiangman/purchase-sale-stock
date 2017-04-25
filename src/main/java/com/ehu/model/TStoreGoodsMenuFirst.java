package com.ehu.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_store_goods_menu_first")
public class TStoreGoodsMenuFirst {
    /**
     * 商品菜单一级分类id
     */
    @Id
    private Integer sgmfid;

    /**
     * 一级分类名称
     */
    @Column(name = "sgmf_name")
    private String sgmfName;

    /**
     * 一级菜单的排序
     */
    @Column(name = "sgmf_sort")
    private Integer sgmfSort;

    /**
     * 1：普通一级；2：特价之类的菜单
     */
    @Column(name = "sgmf_type")
    private Integer sgmfType;

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
     * 一级菜单图标
     */
    @Column(name = "sgmf_icon")
    private String sgmfIcon;

    /**
     * 该一级菜单是否可以使用红包功能：0：不可用；1：可用
     */
    @Column(name = "is_redpaper_usable")
    private Integer isRedpaperUsable;

    /**
     * 获取商品菜单一级分类id
     *
     * @return sgmfid - 商品菜单一级分类id
     */
    public Integer getSgmfid() {
        return sgmfid;
    }

    /**
     * 设置商品菜单一级分类id
     *
     * @param sgmfid 商品菜单一级分类id
     */
    public void setSgmfid(Integer sgmfid) {
        this.sgmfid = sgmfid;
    }

    /**
     * 获取一级分类名称
     *
     * @return sgmf_name - 一级分类名称
     */
    public String getSgmfName() {
        return sgmfName;
    }

    /**
     * 设置一级分类名称
     *
     * @param sgmfName 一级分类名称
     */
    public void setSgmfName(String sgmfName) {
        this.sgmfName = sgmfName;
    }

    /**
     * 获取一级菜单的排序
     *
     * @return sgmf_sort - 一级菜单的排序
     */
    public Integer getSgmfSort() {
        return sgmfSort;
    }

    /**
     * 设置一级菜单的排序
     *
     * @param sgmfSort 一级菜单的排序
     */
    public void setSgmfSort(Integer sgmfSort) {
        this.sgmfSort = sgmfSort;
    }

    /**
     * 获取1：普通一级；2：特价之类的菜单
     *
     * @return sgmf_type - 1：普通一级；2：特价之类的菜单
     */
    public Integer getSgmfType() {
        return sgmfType;
    }

    /**
     * 设置1：普通一级；2：特价之类的菜单
     *
     * @param sgmfType 1：普通一级；2：特价之类的菜单
     */
    public void setSgmfType(Integer sgmfType) {
        this.sgmfType = sgmfType;
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
     * 获取一级菜单图标
     *
     * @return sgmf_icon - 一级菜单图标
     */
    public String getSgmfIcon() {
        return sgmfIcon;
    }

    /**
     * 设置一级菜单图标
     *
     * @param sgmfIcon 一级菜单图标
     */
    public void setSgmfIcon(String sgmfIcon) {
        this.sgmfIcon = sgmfIcon;
    }

    /**
     * 获取该一级菜单是否可以使用红包功能：0：不可用；1：可用
     *
     * @return is_redpaper_usable - 该一级菜单是否可以使用红包功能：0：不可用；1：可用
     */
    public Integer getIsRedpaperUsable() {
        return isRedpaperUsable;
    }

    /**
     * 设置该一级菜单是否可以使用红包功能：0：不可用；1：可用
     *
     * @param isRedpaperUsable 该一级菜单是否可以使用红包功能：0：不可用；1：可用
     */
    public void setIsRedpaperUsable(Integer isRedpaperUsable) {
        this.isRedpaperUsable = isRedpaperUsable;
    }
}
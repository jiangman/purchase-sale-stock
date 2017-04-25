package com.ehu.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "t_store_goods_menu_second")
public class TStoreGoodsMenuSecond {
    /**
     * 商品菜单二级分类id
     */
    @Id
    private Integer sgmsid;

    /**
     * 菜单的二级分类名称
     */
    @Column(name = "sgms_name")
    private String sgmsName;

    /**
     * 二级菜单的排序
     */
    @Column(name = "sgms_sort")
    private Integer sgmsSort;

    /**
     * 外键：商品菜单一级分类id
     */
    private Integer sgmfid;

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
     * 获取商品菜单二级分类id
     *
     * @return sgmsid - 商品菜单二级分类id
     */
    public Integer getSgmsid() {
        return sgmsid;
    }

    /**
     * 设置商品菜单二级分类id
     *
     * @param sgmsid 商品菜单二级分类id
     */
    public void setSgmsid(Integer sgmsid) {
        this.sgmsid = sgmsid;
    }

    /**
     * 获取菜单的二级分类名称
     *
     * @return sgms_name - 菜单的二级分类名称
     */
    public String getSgmsName() {
        return sgmsName;
    }

    /**
     * 设置菜单的二级分类名称
     *
     * @param sgmsName 菜单的二级分类名称
     */
    public void setSgmsName(String sgmsName) {
        this.sgmsName = sgmsName;
    }

    /**
     * 获取二级菜单的排序
     *
     * @return sgms_sort - 二级菜单的排序
     */
    public Integer getSgmsSort() {
        return sgmsSort;
    }

    /**
     * 设置二级菜单的排序
     *
     * @param sgmsSort 二级菜单的排序
     */
    public void setSgmsSort(Integer sgmsSort) {
        this.sgmsSort = sgmsSort;
    }

    /**
     * 获取外键：商品菜单一级分类id
     *
     * @return sgmfid - 外键：商品菜单一级分类id
     */
    public Integer getSgmfid() {
        return sgmfid;
    }

    /**
     * 设置外键：商品菜单一级分类id
     *
     * @param sgmfid 外键：商品菜单一级分类id
     */
    public void setSgmfid(Integer sgmfid) {
        this.sgmfid = sgmfid;
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
}
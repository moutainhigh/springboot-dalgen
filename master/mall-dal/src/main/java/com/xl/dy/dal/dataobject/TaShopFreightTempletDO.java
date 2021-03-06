package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TA_SHOP_FREIGHT_TEMPLET
 */
public class TaShopFreightTempletDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * remark 公共-备注.
     */
    private String remark;
    /**
     * shopId 店铺信息ID（FK）.
     */
    private Long shopId;
    /**
     * alterEmpl 公共-修改人.
     */
    private Long alterEmpl;
    /**
     * alterTime 公共-修改时间.
     */
    private Date alterTime;
    /**
     * timestamp 公共-时间戳.
     */
    private Long timestamp;
    /**
     * createEmpl 公共-创建人.
     */
    private Long createEmpl;
    /**
     * createTime 公共-创建时间.
     */
    private Date createTime;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * isDefaultTemplet 是否是默认模板.
     */
    private Integer isDefaultTemplet;
    /**
     * freightTempletName 模板名称.
     */
    private String freightTempletName;
    /**
     * shopFreightTempletId 运费模板ID.
     */
    private Long shopFreightTempletId;

    /**
     * Set id ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
    }

    /**
     * Set remark 公共-备注.
     */
    public void setRemark(String remark){
        this.remark = remark;
    }

    /**
     * Get remark 公共-备注.
     *
     * @return the string
     */
    public String getRemark(){
        return remark;
    }

    /**
     * Set shopId 店铺信息ID（FK）.
     */
    public void setShopId(Long shopId){
        this.shopId = shopId;
    }

    /**
     * Get shopId 店铺信息ID（FK）.
     *
     * @return the string
     */
    public Long getShopId(){
        return shopId;
    }

    /**
     * Set alterEmpl 公共-修改人.
     */
    public void setAlterEmpl(Long alterEmpl){
        this.alterEmpl = alterEmpl;
    }

    /**
     * Get alterEmpl 公共-修改人.
     *
     * @return the string
     */
    public Long getAlterEmpl(){
        return alterEmpl;
    }

    /**
     * Set alterTime 公共-修改时间.
     */
    public void setAlterTime(Date alterTime){
        this.alterTime = alterTime;
    }

    /**
     * Get alterTime 公共-修改时间.
     *
     * @return the string
     */
    public Date getAlterTime(){
        return alterTime;
    }

    /**
     * Set timestamp 公共-时间戳.
     */
    public void setTimestamp(Long timestamp){
        this.timestamp = timestamp;
    }

    /**
     * Get timestamp 公共-时间戳.
     *
     * @return the string
     */
    public Long getTimestamp(){
        return timestamp;
    }

    /**
     * Set createEmpl 公共-创建人.
     */
    public void setCreateEmpl(Long createEmpl){
        this.createEmpl = createEmpl;
    }

    /**
     * Get createEmpl 公共-创建人.
     *
     * @return the string
     */
    public Long getCreateEmpl(){
        return createEmpl;
    }

    /**
     * Set createTime 公共-创建时间.
     */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    /**
     * Get createTime 公共-创建时间.
     *
     * @return the string
     */
    public Date getCreateTime(){
        return createTime;
    }

    /**
     * Set validStatus 公共-有效性状态.
     */
    public void setValidStatus(Integer validStatus){
        this.validStatus = validStatus;
    }

    /**
     * Get validStatus 公共-有效性状态.
     *
     * @return the string
     */
    public Integer getValidStatus(){
        return validStatus;
    }

    /**
     * Set isDefaultTemplet 是否是默认模板.
     */
    public void setIsDefaultTemplet(Integer isDefaultTemplet){
        this.isDefaultTemplet = isDefaultTemplet;
    }

    /**
     * Get isDefaultTemplet 是否是默认模板.
     *
     * @return the string
     */
    public Integer getIsDefaultTemplet(){
        return isDefaultTemplet;
    }

    /**
     * Set freightTempletName 模板名称.
     */
    public void setFreightTempletName(String freightTempletName){
        this.freightTempletName = freightTempletName;
    }

    /**
     * Get freightTempletName 模板名称.
     *
     * @return the string
     */
    public String getFreightTempletName(){
        return freightTempletName;
    }

    /**
     * Set shopFreightTempletId 运费模板ID.
     */
    public void setShopFreightTempletId(Long shopFreightTempletId){
        this.shopFreightTempletId = shopFreightTempletId;
    }

    /**
     * Get shopFreightTempletId 运费模板ID.
     *
     * @return the string
     */
    public Long getShopFreightTempletId(){
        return shopFreightTempletId;
    }
}

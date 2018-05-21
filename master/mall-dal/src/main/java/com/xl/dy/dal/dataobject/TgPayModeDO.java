package com.xl.dy.dal.dataobject;

import java.util.Date;

/**
 * The table TG_PAY_MODE
 */
public class TgPayModeDO{

    /**
     * id F_ID.
     */
    private Long id;
    /**
     * isDisc 是否优惠.
     */
    private Integer isDisc;
    /**
     * remark 公共-备注.
     */
    private String remark;
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
     * payModeName 支付方式名称.
     */
    private String payModeName;
    /**
     * validStatus 公共-有效性状态.
     */
    private Integer validStatus;
    /**
     * hipayCurrency HIPAY币种类型（DIC）.
     */
    private String hipayCurrency;

    /**
     * Set id F_ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id F_ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
    }

    /**
     * Set isDisc 是否优惠.
     */
    public void setIsDisc(Integer isDisc){
        this.isDisc = isDisc;
    }

    /**
     * Get isDisc 是否优惠.
     *
     * @return the string
     */
    public Integer getIsDisc(){
        return isDisc;
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
     * Set payModeName 支付方式名称.
     */
    public void setPayModeName(String payModeName){
        this.payModeName = payModeName;
    }

    /**
     * Get payModeName 支付方式名称.
     *
     * @return the string
     */
    public String getPayModeName(){
        return payModeName;
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
     * Set hipayCurrency HIPAY币种类型（DIC）.
     */
    public void setHipayCurrency(String hipayCurrency){
        this.hipayCurrency = hipayCurrency;
    }

    /**
     * Get hipayCurrency HIPAY币种类型（DIC）.
     *
     * @return the string
     */
    public String getHipayCurrency(){
        return hipayCurrency;
    }
}

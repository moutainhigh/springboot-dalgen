package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TgDsErrorIdDO;
import com.xl.dy.dal.mapper.TgDsErrorIdDOMapper;

/**
* The Table TG_DS_ERROR_ID.
* TG_DS_ERROR_ID
*/
@Repository
public class TgDsErrorIdDAO{

    @Autowired
    private TgDsErrorIdDOMapper tgDsErrorIdDOMapper;

    /**
     * desc:插入表:TG_DS_ERROR_ID.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TG_DS_ERROR_ID( ID ,PID ,ERR_ID ,ERR_EXP ,REMARK ,ALTER_EMPL ,ALTER_TIME ,CLASS_NAME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,VALID_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{pid,jdbcType=BIGINT} , #{errId,jdbcType=INTEGER} , #{errExp,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{className,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{validStatus,jdbcType=INTEGER} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TgDsErrorIdDO entity){
        return tgDsErrorIdDOMapper.insert(entity);
    }
    /**
     * desc:更新表:TG_DS_ERROR_ID.<br/>
     * descSql =  UPDATE TG_DS_ERROR_ID SET PID = #{pid,jdbcType=BIGINT} ,ERR_ID = #{errId,jdbcType=INTEGER} ,ERR_EXP = #{errExp,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,CLASS_NAME = #{className,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TgDsErrorIdDO entity){
        return tgDsErrorIdDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:TG_DS_ERROR_ID.<br/>
     * descSql =  DELETE FROM TG_DS_ERROR_ID WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return tgDsErrorIdDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:根据主键获取数据:TG_DS_ERROR_ID.<br/>
     * descSql =  SELECT * FROM TG_DS_ERROR_ID WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TgDsErrorIdDO
     */
    public TgDsErrorIdDO getByPrimary(Long id){
        return tgDsErrorIdDOMapper.getByPrimary(id);
    }
}

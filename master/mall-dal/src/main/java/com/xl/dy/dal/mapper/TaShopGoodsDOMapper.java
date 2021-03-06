package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaShopGoodsDO;
import java.util.List;
import java.math.BigDecimal;
import com.xl.dy.dal.resultmap.StoreInfo;
import com.xl.dy.dal.paging.QueryShopCouponGoodsPage;
import java.util.Map;
import com.xl.dy.dal.paging.QueryShopGoodsPage;
import com.xl.dy.dal.paging.QuerySeckillShopGoodsPage;
import com.xl.dy.dal.paging.QueryGoodsPage;
import com.xl.dy.dal.resultmap.GoodsInfo;
import com.xl.dy.dal.paging.QueryGoodsBySaleStatusPage;
import org.apache.ibatis.annotations.Param;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table TA_SHOP_GOODS.
 * TA_SHOP_GOODS
 */
public interface TaShopGoodsDOMapper{

    /**
     * desc:插入表:TA_SHOP_GOODS.<br/>
     * descSql =  INSERT INTO TA_SHOP_GOODS( ID ,SALES ,SKU_ID ,MALL_ID ,REMARK ,SHOP_ID ,GOODS_ID ,IS_ON_SALE ,MALL_NAME ,SHOP_NAME ,ALTER_EMPL ,ALTER_TIME ,COMPANY_ID ,GOODS_CODE ,GOODS_TYPE ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,ERP_GOODS_ID ,TOTAL_STORE ,COMPANY_NAME ,ERP_SALE_CODE ,EVALUATE_NUM ,VALID_STATUS ,SHOP_PHOTO_URL ,SHOP_GOODS_CODE )VALUES( #{id,jdbcType=BIGINT} , #{sales,jdbcType=DECIMAL} , #{skuId,jdbcType=BIGINT} , #{mallId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{isOnSale,jdbcType=INTEGER} , #{mallName,jdbcType=VARCHAR} , #{shopName,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{companyId,jdbcType=BIGINT} , #{goodsCode,jdbcType=VARCHAR} , #{goodsType,jdbcType=VARCHAR} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{erpGoodsId,jdbcType=VARCHAR} , #{totalStore,jdbcType=DECIMAL} , #{companyName,jdbcType=VARCHAR} , #{erpSaleCode,jdbcType=VARCHAR} , #{evaluateNum,jdbcType=INTEGER} , #{validStatus,jdbcType=INTEGER} , #{shopPhotoUrl,jdbcType=VARCHAR} , #{shopGoodsCode,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaShopGoodsDO entity);
    /**
     * desc:更新表:TA_SHOP_GOODS.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS SET SALES = #{sales,jdbcType=DECIMAL} ,SKU_ID = #{skuId,jdbcType=BIGINT} ,MALL_ID = #{mallId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,IS_ON_SALE = #{isOnSale,jdbcType=INTEGER} ,MALL_NAME = #{mallName,jdbcType=VARCHAR} ,SHOP_NAME = #{shopName,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,COMPANY_ID = #{companyId,jdbcType=BIGINT} ,GOODS_CODE = #{goodsCode,jdbcType=VARCHAR} ,GOODS_TYPE = #{goodsType,jdbcType=VARCHAR} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,ERP_GOODS_ID = #{erpGoodsId,jdbcType=VARCHAR} ,TOTAL_STORE = #{totalStore,jdbcType=DECIMAL} ,COMPANY_NAME = #{companyName,jdbcType=VARCHAR} ,ERP_SALE_CODE = #{erpSaleCode,jdbcType=VARCHAR} ,EVALUATE_NUM = #{evaluateNum,jdbcType=INTEGER} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,SHOP_PHOTO_URL = #{shopPhotoUrl,jdbcType=VARCHAR} ,SHOP_GOODS_CODE = #{shopGoodsCode,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaShopGoodsDO entity);
    /**
     * desc:根据主键删除数据:TA_SHOP_GOODS.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:根据主键获取数据:TA_SHOP_GOODS.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaShopGoodsDO
     */
    TaShopGoodsDO getByPrimary(Long id);
    /**
     * desc:根据goodsId和shopid获取数据:TA_SHOP_GOODS.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS VALID_STATUS = 1 
     * @param mallId mallId
     * @param shopId shopId
     * @param goodsId goodsId
     * @param companyId companyId
     * @return List<TaShopGoodsDO>
     */
    List<TaShopGoodsDO> getShopGoodsByGoodsIdAndShopIdAndCompanyId(@Param("mallId")Long mallId,@Param("shopId")Long shopId,@Param("goodsId")Long goodsId,@Param("companyId")Long companyId);
    /**
     * desc:根据专业公司ID和商品ID获取所有的sku信息:TA_SHOP_GOODS.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS WHERE COMPANY_ID = #{companyId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param goodsId goodsId
     * @param companyId companyId
     * @return List<TaShopGoodsDO>
     */
    List<TaShopGoodsDO> getShopGoodsInfoByCompanyIdAndGoodsId(@Param("goodsId")Long goodsId,@Param("companyId")Long companyId);
    /**
     * desc:获取某个专业公司下某个spu的总库存:TA_SHOP_GOODS.<br/>
     * descSql =  SELECT GOODS_ID,SUM(TOTAL_STORE) FROM TA_SHOP_GOODS WHERE COMPANY_ID = #{companyId,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param goodsId goodsId
     * @param companyId companyId
     * @return BigDecimal
     */
    BigDecimal getTotalStorageOfCompanyByCompanyIdAndGoodsId(@Param("goodsId")Long goodsId,@Param("companyId")Long companyId);
    /**
     * desc:修改有效性.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS SET VALID_STATUS = 0 WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT}
     * @param goodsId goodsId
     * @return Long
     */
    Long updateValidStatus(Long goodsId);
    /**
     * desc:根据所给信息修改表:TA_SHOP_GOODS.<br/>
     * descSql =  UPDATE TA_SHOP_GOODS VALID_STATUS = 1 
     * @param entity entity
     * @return Long
     */
    Long updateSelective(TaShopGoodsDO entity);
    /**
     * desc:根据店铺ID和产品ID获取某个店铺某类产品的总库存.<br/>
     * descSql =  SELECT shopId,totalStore FROM(SELECT SHOP_ID shopId,SUM(TOTAL_STORE) totalStore FROM ta_shop_goods WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} GROUP BY SHOP_ID) F WHERE F.shopId = #{shopId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param goodsId goodsId
     * @return StoreInfo
     */
    StoreInfo getTotalById(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:根据店铺ID和产品ID获取某个店铺某类产品的总库存.<br/>
     * descSql =  SELECT SUM(TOTAL_STORE) totalStore FROM TA_SHOP_GOODS WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} AND MALL_ID = #{mallId,jdbcType=BIGINT}
     * @param mallId mallId
     * @param shopId shopId
     * @param goodsId goodsId
     * @return BigDecimal
     */
    BigDecimal getTotalByMallIdAndShopIdAndGoodsId(@Param("mallId")Long mallId,@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:根据产品ID获取某类产品的总库存.<br/>
     * descSql =  SELECT SUM(TOTAL_STORE) totalStore FROM TA_SHOP_GOODS WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SKU_ID = #{skuId,jdbcType=BIGINT}
     * @param skuId skuId
     * @param goodsId goodsId
     * @return BigDecimal
     */
    BigDecimal getTotalByGoodsIdAndSkuId(@Param("skuId")Long skuId,@Param("goodsId")Long goodsId);
    /**
     * desc:根据条件获取信息.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS WHERE ID = #{id,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param id id
     * @return TaShopGoodsDO
     */
    TaShopGoodsDO getByPrimarySelective(Long id);
    /**
     * desc:根据条件获取不重复的信息.<br/>
     * descSql =  SELECT SHOP_NAME,MALL_NAME,COMPANY_NAME FROM TA_SHOP_GOODS VALID_STATUS = 1 GROUP BY SHOP_NAME
     * @param goodId goodId
     * @param mallId mallId
     * @param shopId shopId
     * @param companyId companyId
     * @return TaShopGoodsDO
     */
    TaShopGoodsDO getDistinctShopGoodsInfoByShopIdAndGoodsId(@Param("goodId")Long goodId,@Param("mallId")Long mallId,@Param("shopId")Long shopId,@Param("companyId")Long companyId);
    /**
     * desc:根据skuId获取信息.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param skuId skuId
     * @param shopId shopId
     * @return TaShopGoodsDO
     */
    TaShopGoodsDO getShopGoodsBySkuId(@Param("skuId")Long skuId,@Param("shopId")Long shopId);
    /**
     * desc:获取店铺优惠券商品:TA_SHOP_GOODS.<br/>
     * descSql =  SELECT d.id couponReviewId, a.GOODS_ID goodsId, a.SHOP_GOODS_NAME shopGoodsName, a.SHOP_PHOTO_URL shopGoodsUrl, (SELECT x.GOODS_PRICE FROM ta_shop_goods_price x WHERE x.GOODS_ID = a.GOODS_ID AND x.SHOP_ID = a.SHOP_ID AND x.SALE_TYPE = "NORMAL" AND x.PRICE_TYPE = "VIPRICE"ORDER BY x.GOODS_PRICE ASC LIMIT 1 ) price, (SELECT IFNULL(SUM(IFNULL(TOTAL_STORE,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) totalStore , (SELECT IFNULL(SUM(IFNULL(TOTAL_STORE,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) - (SELECT IFNULL(SUM(IFNULL(SALES,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) AS store FROM ta_coupon_review d LEFT JOIN ta_shop_goods_prop a ON a.GOODS_ID = a.GOODS_ID AND a.SHOP_ID=d.SHOP_ID LEFT JOIN ta_goods b on a.GOODS_ID = b.ID LEFT JOIN tg_mg_category c ON b.MG_CATEGORY_ID = c.ID WHERE a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND c.VALID_STATUS = 1 AND d.VALID_STATUS = 1 AND d.COUPON_ID = #{couponId,jdbcType=BIGINT} AND d.SHOP_ID = #{shopId,jdbcType=BIGINT}
     * @param queryShopCouponGoods queryShopCouponGoods
     * @return int
     */
    int getShopCouponGoodsPageCount(QueryShopCouponGoodsPage queryShopCouponGoods);
    /**
     * desc:获取店铺优惠券商品:TA_SHOP_GOODS.<br/>
     * descSql =  SELECT d.id couponReviewId, a.GOODS_ID goodsId, a.SHOP_GOODS_NAME shopGoodsName, a.SHOP_PHOTO_URL shopGoodsUrl, (SELECT x.GOODS_PRICE FROM ta_shop_goods_price x WHERE x.GOODS_ID = a.GOODS_ID AND x.SHOP_ID = a.SHOP_ID AND x.SALE_TYPE = "NORMAL" AND x.PRICE_TYPE = "VIPRICE"ORDER BY x.GOODS_PRICE ASC LIMIT 1 ) price, (SELECT IFNULL(SUM(IFNULL(TOTAL_STORE,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) totalStore , (SELECT IFNULL(SUM(IFNULL(TOTAL_STORE,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) - (SELECT IFNULL(SUM(IFNULL(SALES,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) AS store FROM ta_coupon_review d LEFT JOIN ta_shop_goods_prop a ON a.GOODS_ID = a.GOODS_ID AND a.SHOP_ID=d.SHOP_ID LEFT JOIN ta_goods b on a.GOODS_ID = b.ID LEFT JOIN tg_mg_category c ON b.MG_CATEGORY_ID = c.ID WHERE a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND c.VALID_STATUS = 1 AND d.VALID_STATUS = 1 AND d.COUPON_ID = #{couponId,jdbcType=BIGINT} AND d.SHOP_ID = #{shopId,jdbcType=BIGINT}
     * @param queryShopCouponGoods queryShopCouponGoods
     * @return List<Map>
     */
    List<Map> getShopCouponGoodsPageResult(QueryShopCouponGoodsPage queryShopCouponGoods);
    /**
     * desc:获取店铺所有商品:TA_SHOP_GOODS.<br/>
     * descSql =  SELECT a.GOODS_ID goodsId, a.SHOP_GOODS_NAME shopGoodsName, a.SHOP_PHOTO_URL shopGoodsUrl, (SELECT x.GOODS_PRICE FROM ta_shop_goods_price x WHERE x.GOODS_ID = a.GOODS_ID AND x.SHOP_ID = a.SHOP_ID AND x.SALE_TYPE = "NORMAL" AND x.PRICE_TYPE = "VIPRICE"ORDER BY x.GOODS_PRICE ASC LIMIT 1 ) price, (SELECT IFNULL(SUM(IFNULL(SALES,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) sales, (SELECT IFNULL(SUM(IFNULL(TOTAL_STORE,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) totalStore , (SELECT IFNULL(SUM(IFNULL(TOTAL_STORE,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) - (SELECT IFNULL(SUM(IFNULL(SALES,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) AS store FROM ta_shop_goods_prop a LEFT JOIN ta_goods b on a.GOODS_ID = b.ID LEFT JOIN tg_mg_category c ON b.MG_CATEGORY_ID = c.ID WHERE a.SHOP_ID = #{shopId,jdbcType=BIGINT} AND a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND c.VALID_STATUS = 1 AND c.PID in (SELECT ID FROM tg_mg_category WHERE PID = #{firstCategory,jdbcType=BIGINT}) AND c.PID = #{secondCategory,jdbcType=BIGINT} 
     * @param queryShopGoods queryShopGoods
     * @return int
     */
    int getShopGoodsPageBySaleCount(QueryShopGoodsPage queryShopGoods);
    /**
     * desc:获取店铺所有商品:TA_SHOP_GOODS.<br/>
     * descSql =  SELECT a.GOODS_ID goodsId, a.SHOP_GOODS_NAME shopGoodsName, a.SHOP_PHOTO_URL shopGoodsUrl, (SELECT x.GOODS_PRICE FROM ta_shop_goods_price x WHERE x.GOODS_ID = a.GOODS_ID AND x.SHOP_ID = a.SHOP_ID AND x.SALE_TYPE = "NORMAL" AND x.PRICE_TYPE = "VIPRICE"ORDER BY x.GOODS_PRICE ASC LIMIT 1 ) price, (SELECT IFNULL(SUM(IFNULL(SALES,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) sales, (SELECT IFNULL(SUM(IFNULL(TOTAL_STORE,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) totalStore , (SELECT IFNULL(SUM(IFNULL(TOTAL_STORE,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) - (SELECT IFNULL(SUM(IFNULL(SALES,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = a.GOODS_ID AND SHOP_ID = a.SHOP_ID AND VALID_STATUS = 1 ) AS store FROM ta_shop_goods_prop a LEFT JOIN ta_goods b on a.GOODS_ID = b.ID LEFT JOIN tg_mg_category c ON b.MG_CATEGORY_ID = c.ID WHERE a.SHOP_ID = #{shopId,jdbcType=BIGINT} AND a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND c.VALID_STATUS = 1 AND c.PID in (SELECT ID FROM tg_mg_category WHERE PID = #{firstCategory,jdbcType=BIGINT}) AND c.PID = #{secondCategory,jdbcType=BIGINT} 
     * @param queryShopGoods queryShopGoods
     * @return List<Map>
     */
    List<Map> getShopGoodsPageBySaleResult(QueryShopGoodsPage queryShopGoods);
    /**
     * desc:活动店铺商品spu级别:TA_SHOP_GOODS.<br/>
     * descSql =  SELECT a.SHOP_ID shopId, a.GOODS_ID goodsId, IFNULL(sum(a.SALES), 0) goodsSales, IFNULL(sum(a.EVALUATE_NUM), 0) evaluateNum, a.CREATE_TIME createTime, b.SHOP_PHOTO_URL shopPhotoUrl, b.SHOP_GOODS_NAME shopGoodsName, c.GOODS_PRICE goodsPrice, IFNULL(sum(a.TOTAL_STORE),0) store FROM ta_shop_goods a LEFT JOIN ta_shop_goods_prop b on a.GOODS_ID = b.GOODS_ID LEFT JOIN ta_shop_goods_price c on a.GOODS_ID = c.GOODS_ID WHERE a.SHOP_ID = #{shopId,jdbcType=BIGINT} AND c.SALE_TYPE = "NORMAL" AND c.PRICE_TYPE = "VIPRICE" AND b.SHOP_GOODS_SALE_STATUS = "SELLING" AND a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND c.VALID_STATUS = 1 AND b.SHOP_GOODS_NAME like #{searchStr,jdbcType=VARCHAR} GROUP BY a.GOODS_ID 
     * @param querySeckillShopGoods querySeckillShopGoods
     * @return int
     */
    int getSeckillShopGoodsCount(QuerySeckillShopGoodsPage querySeckillShopGoods);
    /**
     * desc:活动店铺商品spu级别:TA_SHOP_GOODS.<br/>
     * descSql =  SELECT a.SHOP_ID shopId, a.GOODS_ID goodsId, IFNULL(sum(a.SALES), 0) goodsSales, IFNULL(sum(a.EVALUATE_NUM), 0) evaluateNum, a.CREATE_TIME createTime, b.SHOP_PHOTO_URL shopPhotoUrl, b.SHOP_GOODS_NAME shopGoodsName, c.GOODS_PRICE goodsPrice, IFNULL(sum(a.TOTAL_STORE),0) store FROM ta_shop_goods a LEFT JOIN ta_shop_goods_prop b on a.GOODS_ID = b.GOODS_ID LEFT JOIN ta_shop_goods_price c on a.GOODS_ID = c.GOODS_ID WHERE a.SHOP_ID = #{shopId,jdbcType=BIGINT} AND c.SALE_TYPE = "NORMAL" AND c.PRICE_TYPE = "VIPRICE" AND b.SHOP_GOODS_SALE_STATUS = "SELLING" AND a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND c.VALID_STATUS = 1 AND b.SHOP_GOODS_NAME like #{searchStr,jdbcType=VARCHAR} GROUP BY a.GOODS_ID 
     * @param querySeckillShopGoods querySeckillShopGoods
     * @return List<Map>
     */
    List<Map> getSeckillShopGoodsResult(QuerySeckillShopGoodsPage querySeckillShopGoods);
    /**
     * desc:根据商品id获得商品sku级别:TA_SHOP_GOODS.<br/>
     * descSql =  SELECT a.ID shopGoodsId, a.SKU_ID skuId, b.SKU_TITLE skuTitle FROM ta_shop_goods a LEFT JOIN ta_sku b on a.SKU_ID = b.ID WHERE a.GOODS_ID = #{goodsId,jdbcType=BIGINT} AND a.SHOP_ID = #{shopId,jdbcType=BIGINT} AND a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 ORDER BY a.ID
     * @param shopId shopId
     * @param goodsId goodsId
     * @return List<Map>
     */
    List<Map> getSeckillShopGoodsSku(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:设置秒杀库存界面信息:TA_SHOP_GOODS.<br/>
     * descSql =  SELECT a.ID shopGoodsId, e.SHOP_GOODS_NAME shopGoodsName, e.SHOP_PHOTO_URL shopPhotoUrl, a.TOTAL_STORE totalStore, b.GOODS_PRICE goodsPrice, d.Id skuId, d.SKU_TITLE skuTitle, f.PHOTO_URL skuPhotoUrl FROM ta_shop_goods a LEFT JOIN ta_shop_goods_price b ON b.SHOP_GOODS_ID = a.ID LEFT JOIN TA_SHOP_GOODS_STORE c ON a.ID = c.SHOP_GOODS_ID LEFT JOIN ta_sku d ON a.SKU_ID = d.Id LEFT JOIN ta_shop_goods_prop e on a.GOODS_ID = e.GOODS_ID LEFT JOIN ta_goods_photo f ON f.SKU_ID = d.ID WHERE a.ID = #{shopGoodsId,jdbcType=BIGINT} AND b.SALE_TYPE = "NORMAL" AND b.PRICE_TYPE = "VIPRICE" AND a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND c.VALID_STATUS = 1 AND d.VALID_STATUS = 1 AND e.VALID_STATUS = 1 AND f.VALID_STATUS = 1
     * @param shopGoodsId shopGoodsId
     * @return List<Map>
     */
    List<Map> getMegForSetSeckill(Long shopGoodsId);
    /**
     * desc:删除店铺商品:TA_SHOP_GOODS.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param shopId shopId
     * @param goodsId goodsId
     * @return Long
     */
    Long deleteShopGoods(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:删除店铺商品:TA_SHOP_GOODS.<br/>
     * descSql =  DELETE FROM TA_SHOP_GOODS WHERE SKU_ID = #{skuId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} 
     * @param skuId skuId
     * @param shopId shopId
     * @return Long
     */
    Long deleteShopGoodsBySkuId(@Param("skuId")Long skuId,@Param("shopId")Long shopId);
    /**
     * desc:根据条件获取信息.<br/>
     * descSql =  SELECT * FROM TA_SHOP_GOODS ID = #{id,jdbcType=BIGINT} AND GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} AND MALL_ID = #{mallId,jdbcType=BIGINT} 
     * @param id id
     * @param mallId mallId
     * @param shopId shopId
     * @param goodsId goodsId
     * @return List<TaShopGoodsDO>
     */
    List<TaShopGoodsDO> getBySelective(@Param("id")Long id,@Param("mallId")Long mallId,@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
    /**
     * desc:getGoodsPageCount.<br/>
     * descSql =  SELECT shopName,companyName,mallName,goodsId,shopId,companyId,mallId ,goodsCode,goodsName,mgFrId,regCompanyName,regShopName ,alterTime,createEmpl,createTime ,claimTime,unshelveReason,unshelveTime,unshelveOperator FROM ( SELECT T.shopName,T.mallName,T.shopId,T.mallId ,CGP.GOODS_ID goodsId,CGP.COMPANY_ID companyId,CGP.COMPANY_NAME companyName ,G.GOODS_CODE goodsCode,G.GOODS_NAME goodsName,G.MG_FR_ID mgFrId ,G.REG_COMPANY_NAME regCompanyName,G.REG_SHOP_NAME regShopName,G.CREATE_TIME createTime ,G.ALTER_TIME alterTime,G.REG_EMPL_NAME createEmpl ,SGP.CLAIM_TIME claimTime,SGP.UNSHELVE_REASON unshelveReason,SGP.UNSHELVE_TIME unshelveTime,SGP.UNSHELVE_OPERATOR unshelveOperator FROM TA_COMPANY_GOODS_PROP CGP LEFT JOIN (SELECT SHOP_NAME shopName,COMPANY_NAME companyName,MALL_NAME mallName,GOODS_ID goodsId,SHOP_ID shopId ,COMPANY_ID companyId,MALL_ID mallId FROM(SELECT DISTINCT GOODS_ID,SHOP_ID,COMPANY_ID,MALL_ID,SHOP_NAME,COMPANY_NAME,MALL_NAME FROM ta_shop_goods )X )T ON CGP.GOODS_ID = T.goodsId LEFT JOIN TA_GOODS G ON G.ID = CGP.GOODS_ID LEFT JOIN TA_SHOP_GOODS_PROP SGP ON SGP.GOODS_ID = G.ID )F AND CONCAT(IFNULL(F.goodsCode,''),IFNULL(F.goodsName,'')) like #{searchStr,jdbcType=VARCHAR} 
     * @param queryGoods queryGoods
     * @return int
     */
    int getGoodsPageCount(QueryGoodsPage queryGoods);
    /**
     * desc:getGoodsPageResult.<br/>
     * descSql =  SELECT shopName,companyName,mallName,goodsId,shopId,companyId,mallId ,goodsCode,goodsName,mgFrId,regCompanyName,regShopName ,alterTime,createEmpl,createTime ,claimTime,unshelveReason,unshelveTime,unshelveOperator FROM ( SELECT T.shopName,T.mallName,T.shopId,T.mallId ,CGP.GOODS_ID goodsId,CGP.COMPANY_ID companyId,CGP.COMPANY_NAME companyName ,G.GOODS_CODE goodsCode,G.GOODS_NAME goodsName,G.MG_FR_ID mgFrId ,G.REG_COMPANY_NAME regCompanyName,G.REG_SHOP_NAME regShopName,G.CREATE_TIME createTime ,G.ALTER_TIME alterTime,G.REG_EMPL_NAME createEmpl ,SGP.CLAIM_TIME claimTime,SGP.UNSHELVE_REASON unshelveReason,SGP.UNSHELVE_TIME unshelveTime,SGP.UNSHELVE_OPERATOR unshelveOperator FROM TA_COMPANY_GOODS_PROP CGP LEFT JOIN (SELECT SHOP_NAME shopName,COMPANY_NAME companyName,MALL_NAME mallName,GOODS_ID goodsId,SHOP_ID shopId ,COMPANY_ID companyId,MALL_ID mallId FROM(SELECT DISTINCT GOODS_ID,SHOP_ID,COMPANY_ID,MALL_ID,SHOP_NAME,COMPANY_NAME,MALL_NAME FROM ta_shop_goods )X )T ON CGP.GOODS_ID = T.goodsId LEFT JOIN TA_GOODS G ON G.ID = CGP.GOODS_ID LEFT JOIN TA_SHOP_GOODS_PROP SGP ON SGP.GOODS_ID = G.ID )F AND CONCAT(IFNULL(F.goodsCode,''),IFNULL(F.goodsName,'')) like #{searchStr,jdbcType=VARCHAR} 
     * @param queryGoods queryGoods
     * @return List<GoodsInfo>
     */
    List<GoodsInfo> getGoodsPageResult(QueryGoodsPage queryGoods);
    /**
     * desc:售卖状态,活动店铺商品spu级别:TA_SHOP_GOODS.<br/>
     * descSql =  SELECT a.SHOP_ID shopId, a.GOODS_ID goodsId, IFNULL(sum(a.SALES), 0) goodsSales, IFNULL(sum(a.EVALUATE_NUM), 0) evaluateNum, a.CREATE_TIME createTime, b.SHOP_PHOTO_URL shopPhotoUrl, b.SHOP_GOODS_NAME shopGoodsName, c.GOODS_PRICE goodsPrice, IFNULL(sum(a.TOTAL_STORE),0) store FROM ta_shop_goods a LEFT JOIN ta_shop_goods_prop b on a.GOODS_ID = b.GOODS_ID LEFT JOIN ta_shop_goods_price c on a.GOODS_ID = c.GOODS_ID WHERE a.SHOP_ID = #{shopId,jdbcType=BIGINT} AND c.SALE_TYPE = "NORMAL" AND c.PRICE_TYPE = "VIPRICE" AND a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND c.VALID_STATUS = 1 AND b.SHOP_GOODS_SALE_STATUS = #{saleStatus,jdbcType=VARCHAR} AND b.SHOP_GOODS_NAME like #{searchStr,jdbcType=VARCHAR} GROUP BY a.GOODS_ID 
     * @param queryGoodsBySaleStatus queryGoodsBySaleStatus
     * @return int
     */
    int getShopGoodsBySaleStatusCount(QueryGoodsBySaleStatusPage queryGoodsBySaleStatus);
    /**
     * desc:售卖状态,活动店铺商品spu级别:TA_SHOP_GOODS.<br/>
     * descSql =  SELECT a.SHOP_ID shopId, a.GOODS_ID goodsId, IFNULL(sum(a.SALES), 0) goodsSales, IFNULL(sum(a.EVALUATE_NUM), 0) evaluateNum, a.CREATE_TIME createTime, b.SHOP_PHOTO_URL shopPhotoUrl, b.SHOP_GOODS_NAME shopGoodsName, c.GOODS_PRICE goodsPrice, IFNULL(sum(a.TOTAL_STORE),0) store FROM ta_shop_goods a LEFT JOIN ta_shop_goods_prop b on a.GOODS_ID = b.GOODS_ID LEFT JOIN ta_shop_goods_price c on a.GOODS_ID = c.GOODS_ID WHERE a.SHOP_ID = #{shopId,jdbcType=BIGINT} AND c.SALE_TYPE = "NORMAL" AND c.PRICE_TYPE = "VIPRICE" AND a.VALID_STATUS = 1 AND b.VALID_STATUS = 1 AND c.VALID_STATUS = 1 AND b.SHOP_GOODS_SALE_STATUS = #{saleStatus,jdbcType=VARCHAR} AND b.SHOP_GOODS_NAME like #{searchStr,jdbcType=VARCHAR} GROUP BY a.GOODS_ID 
     * @param queryGoodsBySaleStatus queryGoodsBySaleStatus
     * @return List<Map>
     */
    List<Map> getShopGoodsBySaleStatusResult(QueryGoodsBySaleStatusPage queryGoodsBySaleStatus);
    /**
     * desc:获取一个店铺的某个goodsId的销量:TA_SHOP_GOODS.<br/>
     * descSql =  SELECT IFNULL(SUM(IFNULL(SALES,0)),0) FROM TA_SHOP_GOODS WHERE GOODS_ID = #{goodsId,jdbcType=BIGINT} AND SHOP_ID = #{shopId,jdbcType=BIGINT} AND VALID_STATUS = 1
     * @param shopId shopId
     * @param goodsId goodsId
     * @return BigDecimal
     */
    BigDecimal getSalesByGoodsId(@Param("shopId")Long shopId,@Param("goodsId")Long goodsId);
}

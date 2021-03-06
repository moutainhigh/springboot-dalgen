package com.xl.dy.dal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.xl.dy.dal.dataobject.TaGroupReviewDO;
import java.lang.Long;
import com.xl.dy.dal.paging.QueryGoodsByGroupPage;
import com.xl.dy.dal.paging.QueryExamineGroupGoodsPage;
import com.xl.dy.dal.paging.QueryShowAllowGroupListPage;
import com.xl.dy.dal.paging.QueryRegisteredGroupListPage;
import java.lang.Integer;
import java.util.Map;
import java.util.List;
import com.xl.dy.dal.mapper.TaGroupReviewDOMapper;

/**
* The Table TA_GROUP_REVIEW.
* TA_GROUP_REVIEW
*/
@Repository
public class TaGroupReviewDAO{

    @Autowired
    private TaGroupReviewDOMapper taGroupReviewDOMapper;

    /**
     * desc:???�表:TA_GROUP_REVIEW.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_GROUP_REVIEW( ID ,INX ,SALES ,REASON ,REMARK ,SHOP_ID ,GROUP_ID ,DISCOUNT ,ALTER_EMPL ,ALTER_TIME ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,GROUP_PRICE ,SHOP_GOODS_ID ,VALID_STATUS ,ACTIVE_INVENTORY ,GROUP_REVIEW_STATUS )VALUES( #{id,jdbcType=BIGINT} , #{inx,jdbcType=INTEGER} , #{sales,jdbcType=DECIMAL} , #{reason,jdbcType=VARCHAR} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{groupId,jdbcType=BIGINT} , #{discount,jdbcType=DECIMAL} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{timestamp,jdbcType=BIGINT} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{groupPrice,jdbcType=DECIMAL} , #{shopGoodsId,jdbcType=BIGINT} , #{validStatus,jdbcType=INTEGER} , #{activeInventory,jdbcType=DECIMAL} , #{groupReviewStatus,jdbcType=VARCHAR} )
     * @param entity entity
     * @return Long
     */
    public Long insert(TaGroupReviewDO entity){
        return taGroupReviewDOMapper.insert(entity);
    }
    /**
     * desc:?��?�表:TA_GROUP_REVIEW.<br/>
     * descSql =  UPDATE TA_GROUP_REVIEW SET INX = #{inx,jdbcType=INTEGER} ,SALES = #{sales,jdbcType=DECIMAL} ,REASON = #{reason,jdbcType=VARCHAR} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,GROUP_ID = #{groupId,jdbcType=BIGINT} ,DISCOUNT = #{discount,jdbcType=DECIMAL} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,TIMESTAMP = #{timestamp,jdbcType=BIGINT} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,GROUP_PRICE = #{groupPrice,jdbcType=DECIMAL} ,SHOP_GOODS_ID = #{shopGoodsId,jdbcType=BIGINT} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,ACTIVE_INVENTORY = #{activeInventory,jdbcType=DECIMAL} ,GROUP_REVIEW_STATUS = #{groupReviewStatus,jdbcType=VARCHAR} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    public Long update(TaGroupReviewDO entity){
        return taGroupReviewDOMapper.update(entity);
    }
    /**
     * desc:?��??主�?????��?��??:TA_GROUP_REVIEW.<br/>
     * descSql =  DELETE FROM TA_GROUP_REVIEW WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    public Long deleteByPrimary(Long id){
        return taGroupReviewDOMapper.deleteByPrimary(id);
    }
    /**
     * desc:?��??主�???��???��??:TA_GROUP_REVIEW.<br/>
     * descSql =  SELECT * FROM TA_GROUP_REVIEW WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaGroupReviewDO
     */
    public TaGroupReviewDO getByPrimary(Long id){
        return taGroupReviewDOMapper.getByPrimary(id);
    }
    /**
     * desc:获取拼团报名数:TA_GROUP_REVIEW.<br/>
     * descSql =  SELECT count(*) FROM ta_group_review WHERE GROUP_ID = #{groupId,jdbcType=BIGINT}
     * @param groupId groupId
     * @return Long
     */
    public Long getCountByGroupId(Long groupId){
        return taGroupReviewDOMapper.getCountByGroupId(groupId);
    }
    /**
     * desc:获取拼团报名商品:TA_GROUP_REVIEW.<br/>
     * descSql =  SELECT a.ID groupReviewId, a.ACTIVE_INVENTORY activeInvenTory, a.SALES sals, b.SHOP_NAME shopName, c.MALL_NAME mallName, d.COMPANY_NAME companyName, h.PHOTO_URL skuPhotoUrl, f.SKU_TITLE skutitle, a.DISCOUNT discount, a.GROUP_PRICE groupPrice, g.GOODS_PRICE goodsPrice, a.INX inx FROM ta_group_review a LEFT JOIN ta_shop b ON b.ID = a.SHOP_ID LEFT JOIN ta_mall c ON c.ID = b.MALL_ID LEFT JOIN ta_company d ON d.ID = b.COMPANY_ID LEFT JOIN ta_shop_goods e ON e.ID = a.SHOP_GOODS_ID LEFT JOIN ta_sku f ON f.ID = e.SKU_ID LEFT JOIN ta_shop_goods_price g ON g.SHOP_GOODS_ID = a.SHOP_GOODS_ID LEFT JOIN ta_goods_photo h on h.SKU_ID = f.ID WHERE a.GROUP_ID = #{groupId,jdbcType=BIGINT} AND GROUP_REVIEW_STATUS = "PASS" AND g.SALE_TYPE = "NORMAL" AND g.PRICE_TYPE = "VIPRICE" ORDER BY a.INX ASC
     * @param queryGoodsByGroup queryGoodsByGroup
     * @return QueryGoodsByGroupPage
     */
    public QueryGoodsByGroupPage getGoodsByGroup(QueryGoodsByGroupPage queryGoodsByGroup){
        int total = taGroupReviewDOMapper.getGoodsByGroupCount(queryGoodsByGroup);
        if(total>0){
            queryGoodsByGroup.setDatas(taGroupReviewDOMapper.getGoodsByGroupResult(queryGoodsByGroup));
        }
        queryGoodsByGroup.setTotal(total);
        return queryGoodsByGroup;
    }
    /**
     * desc:获取拼团审核商品:TA_GROUP_REVIEW.<br/>
     * descSql =  SELECT z.ID groupId, z.`NAME` groupName, z.GROUPNUM groupNum, z.CATEGORY_SET categorySet, z.PER_REGISTE_LIMIT perRegisteLimit, z.NOTICE notice, y.`NAME` categoryName, a.ID groupReviewId, a.REASON reason, a.GROUP_REVIEW_STATUS groupReviewStatus, a.ACTIVE_INVENTORY activeInventory, a.SALES sales, b.SHOP_NAME shopName, c.MALL_NAME mallName, d.COMPANY_NAME companyName, x.PHOTO_URL skuPhotoUrl, f.SKU_TITLE skutitle, a.DISCOUNT discount, a.GROUP_PRICE groupPrice, g.GOODS_PRICE goodsPrice FROM ta_group z LEFT JOIN ta_group_review a ON z.ID = a.GROUP_ID LEFT JOIN ta_shop b ON b.ID = a.SHOP_ID LEFT JOIN ta_mall c ON c.ID = b.MALL_ID LEFT JOIN ta_company d ON d.ID = b.COMPANY_ID LEFT JOIN ta_shop_goods e ON e.ID = a.SHOP_GOODS_ID LEFT JOIN ta_sku f ON f.ID = e.SKU_ID LEFT JOIN ta_shop_goods_price g ON g.SHOP_GOODS_ID = a.SHOP_GOODS_ID LEFT JOIN tg_mg_category y ON y.id = z.CATEGORY_SET LEFT JOIN ta_goods_photo x ON x.SKU_ID = f.ID WHERE a.GROUP_ID = #{groupId,jdbcType=BIGINT} AND GROUP_REVIEW_STATUS = #{groupReviewStatus,jdbcType=VARCHAR} AND g.SALE_TYPE = "NORMAL" AND g.PRICE_TYPE = "VIPRICE" AND d.COMPANY_NAME LIKE #{companyName,jdbcType=VARCHAR} AND c.MALL_NAME LIKE #{mallName,jdbcType=VARCHAR} AND b.SHOP_NAME LIKE #{shopName,jdbcType=VARCHAR} AND f.SKU_TITLE LIKE #{skutitle,jdbcType=VARCHAR} ${sortColumn} ${sortType} 
     * @param queryExamineGroupGoods queryExamineGroupGoods
     * @return QueryExamineGroupGoodsPage
     */
    public QueryExamineGroupGoodsPage getExamineGroupGoods(QueryExamineGroupGoodsPage queryExamineGroupGoods){
        int total = taGroupReviewDOMapper.getExamineGroupGoodsCount(queryExamineGroupGoods);
        if(total>0){
            queryExamineGroupGoods.setDatas(taGroupReviewDOMapper.getExamineGroupGoodsResult(queryExamineGroupGoods));
        }
        queryExamineGroupGoods.setTotal(total);
        return queryExamineGroupGoods;
    }
    /**
     * desc:允许报名列表:TA_GROUP_REVIEW.<br/>
     * descSql =  SELECT a.id groupId, a.`NAME` groupName, a.GROUPNUM groupNum, a.PUTAWAY_TIME putawayTime, a.SOLDOUT_TIME soldoutTime, a.PER_REGISTE_LIMIT perRegisteLimit, a.PER_BUY_LIMIT perBuyLimit, a.NOTICE NOTICE FROM ta_group a WHERE a.`GROUP_STATUS` = 'ING' AND a.VALID_STATUS = 1 AND a.ID NOT IN ( SELECT GROUP_ID FROM ta_group_review WHERE SHOP_ID = #{shopId,jdbcType=BIGINT})
     * @param queryShowAllowGroupList queryShowAllowGroupList
     * @return QueryShowAllowGroupListPage
     */
    public QueryShowAllowGroupListPage showAllowGroupList(QueryShowAllowGroupListPage queryShowAllowGroupList){
        int total = taGroupReviewDOMapper.showAllowGroupListCount(queryShowAllowGroupList);
        if(total>0){
            queryShowAllowGroupList.setDatas(taGroupReviewDOMapper.showAllowGroupListResult(queryShowAllowGroupList));
        }
        queryShowAllowGroupList.setTotal(total);
        return queryShowAllowGroupList;
    }
    /**
     * desc:已报名列表:TA_GROUP_REVIEW.<br/>
     * descSql =  SELECT a.id groupId, a.`NAME` groupName, a.GROUPNUM groupNum, a.PUTAWAY_TIME putawayTime, a.SOLDOUT_TIME soldoutTime, a.PER_REGISTE_LIMIT perRegisteLimit, a.PER_BUY_LIMIT perBuyLimit, a.NOTICE NOTICE FROM ta_group a WHERE a.`GROUP_STATUS` = 'ING' AND a.VALID_STATUS = 1 AND a.ID IN (SELECT GROUP_ID FROM ta_group_review WHERE SHOP_ID = #{shopId,jdbcType=BIGINT})
     * @param queryRegisteredGroupList queryRegisteredGroupList
     * @return QueryRegisteredGroupListPage
     */
    public QueryRegisteredGroupListPage showRegisteredGroupList(QueryRegisteredGroupListPage queryRegisteredGroupList){
        int total = taGroupReviewDOMapper.showRegisteredGroupListCount(queryRegisteredGroupList);
        if(total>0){
            queryRegisteredGroupList.setDatas(taGroupReviewDOMapper.showRegisteredGroupListResult(queryRegisteredGroupList));
        }
        queryRegisteredGroupList.setTotal(total);
        return queryRegisteredGroupList;
    }
    /**
     * desc:获得店铺商品报名数:TA_GROUP_REVIEW.<br/>
     * descSql =  SELECT IFNULL(sum(ACTIVE_INVENTORY),0) FROM ta_group_review WHERE SHOP_GOODS_ID = #{shopGoodsId,jdbcType=BIGINT} AND GROUP_ID = #{groupId,jdbcType=BIGINT}
     * @param groupId groupId
     * @param shopGoodsId shopGoodsId
     * @return Integer
     */
    public Integer getSumByShopGoods(Long groupId,Long shopGoodsId){
        return taGroupReviewDOMapper.getSumByShopGoods(groupId, shopGoodsId);
    }
    /**
     * desc:获得店铺已报名的秒杀商品:TA_GROUP_REVIEW.<br/>
     * descSql =  SELECT d.SHOP_PHOTO_URL photoUrl, d.SHOP_GOODS_NAME goodsName, a.ID groupReviewId, a.GROUP_REVIEW_STATUS groupReviewStatus, a.REASON REASON, c.SKU_TITLE skuTitle FROM `ta_group_review` a LEFT JOIN ta_shop_goods b ON a.SHOP_GOODS_ID =b.ID LEFT JOIN ta_sku c ON b.SKU_ID = c.ID LEFT JOIN ta_shop_goods_prop d ON b.GOODS_ID = d.GOODS_ID WHERE a.GROUP_ID =#{groupId,jdbcType=BIGINT} AND a.SHOP_ID =#{shopId,jdbcType=BIGINT}
     * @param shopId shopId
     * @param groupId groupId
     * @return List<Map>
     */
    public List<Map> getRegistedShopGoods(Long shopId,Long groupId){
        return taGroupReviewDOMapper.getRegistedShopGoods(shopId, groupId);
    }
}

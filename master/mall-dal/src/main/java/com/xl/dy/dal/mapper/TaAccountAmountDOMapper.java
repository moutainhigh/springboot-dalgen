package com.xl.dy.dal.mapper;

import com.xl.dy.dal.dataobject.TaAccountAmountDO;
import org.apache.ibatis.annotations.Param;

/**
 * ?��???�?对�??页�????,请�?��?�使?��?��???DAO�?
 * The Table TA_ACCOUNT_AMOUNT.
 * TA_ACCOUNT_AMOUNT
 */
public interface TaAccountAmountDOMapper{

    /**
     * desc:???�表:TA_ACCOUNT_AMOUNT.<br/>
     * descSql =  SELECT LAST_INSERT_ID() INSERT INTO TA_ACCOUNT_AMOUNT( ID ,MALL_ID ,REMARK ,SHOP_ID ,GOODS_ID ,MALL_NAME ,SHOP_NAME ,ALTER_EMPL ,ALTER_TIME ,COMPANY_ID ,GOODS_NAME ,GOODS_TYPE ,ORDER_CODE ,SALE_UNION ,TIMESTAMP ,CREATE_EMPL ,CREATE_TIME ,ERP_ACC_NAME ,ORDER_DET_ID ,SALE_ALIPAY ,SALE_AMOUNT ,SALE_NUMBER ,SALE_WECHAT ,ACCOUNT_DATE ,COMPANY_NAME ,ERP_SALE_CODE ,ERP_SALE_DEPT ,SALE_FREIGJT ,SALE_PAYMENT ,VALID_STATUS ,ERP_TRADE_CODE ,ERP_WRITE_TIME ,SALE_HIPAYACC ,ACCOUNT_UNIT_ID ,ERP_WRITE_STATUS ,SALETOTAL_UNION ,ACCOUNT_UNIT_NAME ,SALETOTAL_ALIPAY ,SALETOTAL_AMOUNT ,SALETOTAL_NUMBER ,SALETOTAL_WECHAT ,RETURN_GOODS_UNION ,SALE_HIPAY_BALANCE ,SALE_XINGLONGCART ,SALETOTAL_FREIGHT ,SALETOTAL_PAYMENT ,RETURN_GOODS_ALIPAY ,RETURN_GOODS_AMOUNT ,RETURN_GOODS_NUMBER ,RETURN_GOODS_WECHAT ,SALETOTAL_HIPAIACC ,RETURN_GOODS_FREIGHT ,RETURN_GOODS_PAYMENT ,RETURN_GOODS_HIPAYACC ,SETTEMENT_TOTAL_UNION ,RETURN_GOODS_ORDER_CODE ,SALETOTAL_XINLONGCART ,SETTEMENT_TOTAL_ALIPAY ,SETTEMENT_TOTAL_AMOUNT ,SETTEMENT_TOTAL_NUMBER ,SETTEMENT_TOTAL_WECHAT ,SETTKEMENT_SALES_UNION ,SALETOTAL_HIPAY_BALANCE ,SETTEMENT_TOTAL_FREIGHT ,SETTEMENT_TOTAL_PAYMENT ,SETTKEMENT_SALES_ALIPAY ,SETTKEMENT_SALES_AMOUNT ,SETTKEMENT_SALES_NUMBER ,SETTKEMENT_SALES_WECHAT ,SETTEMENT_TOTAL_HIPAYACC ,SETTKEMENT_SALES_FREIGHT ,SETTKEMENT_SALES_PAYMENT ,RETURN_GOODS_ERP_TRADE_CODE ,RETURN_GOODS_ERP_WRITE_TIME ,RETURN_GOODS_HIPAY_BALANCE ,RETURN_GOODS_XINGLONGCART ,SETTKEMENT_SALES_HIPAYACC ,RETURN_GOODS_ERP_WRITE_STATUS ,SETTEMENT_RETURN_GOODS_AOUNT ,SETTEMENT_RETURN_GOODS_UNION ,SETTEMENT_RETURN_GOODS_ALIPAY ,SETTEMENT_RETURN_GOODS_NUMBER ,SETTEMENT_RETURN_GOODS_WECHAT ,SETTEMENT_TOTAL_HIPAY_BALANCE ,SETTEMENT_TOTAL_XINGLONGCART ,SETTEMENT_RETURN_GOODS_FREIGHT ,SETTEMENT_RETURN_GOODS_PAYMENT ,SETTKEMENT_SALES_HIPAY_BALANCE ,SETTKEMENT_SALES_XINGLONGCART ,SETTEMENT_RETURN_GOODS_HIPAYACC ,SETTEMENT_RETURN_GOODS_HIPAY_BALANCE ,SETTEMENT_RETURN_GOODS_XINGLONGCART )VALUES( #{id,jdbcType=BIGINT} , #{mallId,jdbcType=BIGINT} , #{remark,jdbcType=VARCHAR} , #{shopId,jdbcType=BIGINT} , #{goodsId,jdbcType=BIGINT} , #{mallName,jdbcType=VARCHAR} , #{shopName,jdbcType=VARCHAR} , #{alterEmpl,jdbcType=BIGINT} , #{alterTime,jdbcType=TIMESTAMP} , #{companyId,jdbcType=BIGINT} , #{goodsName,jdbcType=VARCHAR} , #{goodsType,jdbcType=VARCHAR} , #{orderCode,jdbcType=VARCHAR} , #{saleUnion,jdbcType=DECIMAL} , #{timestamp,jdbcType=TIMESTAMP} , #{createEmpl,jdbcType=BIGINT} , #{createTime,jdbcType=TIMESTAMP} , #{erpAccName,jdbcType=VARCHAR} , #{orderDetId,jdbcType=BIGINT} , #{saleAlipay,jdbcType=DECIMAL} , #{saleAmount,jdbcType=DECIMAL} , #{saleNumber,jdbcType=DECIMAL} , #{saleWechat,jdbcType=DECIMAL} , #{accountDate,jdbcType=DATE} , #{companyName,jdbcType=VARCHAR} , #{erpSaleCode,jdbcType=VARCHAR} , #{erpSaleDept,jdbcType=VARCHAR} , #{saleFreigjt,jdbcType=DECIMAL} , #{salePayment,jdbcType=DECIMAL} , #{validStatus,jdbcType=INTEGER} , #{erpTradeCode,jdbcType=VARCHAR} , #{erpWriteTime,jdbcType=TIMESTAMP} , #{saleHipayacc,jdbcType=DECIMAL} , #{accountUnitId,jdbcType=BIGINT} , #{erpWriteStatus,jdbcType=VARCHAR} , #{saletotalUnion,jdbcType=DECIMAL} , #{accountUnitName,jdbcType=VARCHAR} , #{saletotalAlipay,jdbcType=DECIMAL} , #{saletotalAmount,jdbcType=DECIMAL} , #{saletotalNumber,jdbcType=DECIMAL} , #{saletotalWechat,jdbcType=DECIMAL} , #{returnGoodsUnion,jdbcType=DECIMAL} , #{saleHipayBalance,jdbcType=DECIMAL} , #{saleXinglongcart,jdbcType=DECIMAL} , #{saletotalFreight,jdbcType=DECIMAL} , #{saletotalPayment,jdbcType=DECIMAL} , #{returnGoodsAlipay,jdbcType=DECIMAL} , #{returnGoodsAmount,jdbcType=DECIMAL} , #{returnGoodsNumber,jdbcType=DECIMAL} , #{returnGoodsWechat,jdbcType=DECIMAL} , #{saletotalHipaiacc,jdbcType=DECIMAL} , #{returnGoodsFreight,jdbcType=DECIMAL} , #{returnGoodsPayment,jdbcType=DECIMAL} , #{returnGoodsHipayacc,jdbcType=DECIMAL} , #{settementTotalUnion,jdbcType=DECIMAL} , #{returnGoodsOrderCode,jdbcType=VARCHAR} , #{saletotalXinlongcart,jdbcType=DECIMAL} , #{settementTotalAlipay,jdbcType=DECIMAL} , #{settementTotalAmount,jdbcType=DECIMAL} , #{settementTotalNumber,jdbcType=DECIMAL} , #{settementTotalWechat,jdbcType=DECIMAL} , #{settkementSalesUnion,jdbcType=DECIMAL} , #{saletotalHipayBalance,jdbcType=DECIMAL} , #{settementTotalFreight,jdbcType=DECIMAL} , #{settementTotalPayment,jdbcType=DECIMAL} , #{settkementSalesAlipay,jdbcType=DECIMAL} , #{settkementSalesAmount,jdbcType=DECIMAL} , #{settkementSalesNumber,jdbcType=DECIMAL} , #{settkementSalesWechat,jdbcType=DECIMAL} , #{settementTotalHipayacc,jdbcType=DECIMAL} , #{settkementSalesFreight,jdbcType=DECIMAL} , #{settkementSalesPayment,jdbcType=DECIMAL} , #{returnGoodsErpTradeCode,jdbcType=CHAR} , #{returnGoodsErpWriteTime,jdbcType=CHAR} , #{returnGoodsHipayBalance,jdbcType=DECIMAL} , #{returnGoodsXinglongcart,jdbcType=DECIMAL} , #{settkementSalesHipayacc,jdbcType=DECIMAL} , #{returnGoodsErpWriteStatus,jdbcType=CHAR} , #{settementReturnGoodsAount,jdbcType=DECIMAL} , #{settementReturnGoodsUnion,jdbcType=DECIMAL} , #{settementReturnGoodsAlipay,jdbcType=DECIMAL} , #{settementReturnGoodsNumber,jdbcType=DECIMAL} , #{settementReturnGoodsWechat,jdbcType=DECIMAL} , #{settementTotalHipayBalance,jdbcType=DECIMAL} , #{settementTotalXinglongcart,jdbcType=DECIMAL} , #{settementReturnGoodsFreight,jdbcType=DECIMAL} , #{settementReturnGoodsPayment,jdbcType=DECIMAL} , #{settkementSalesHipayBalance,jdbcType=DECIMAL} , #{settkementSalesXinglongcart,jdbcType=DECIMAL} , #{settementReturnGoodsHipayacc,jdbcType=DECIMAL} , #{settementReturnGoodsHipayBalance,jdbcType=DECIMAL} , #{settementReturnGoodsXinglongcart,jdbcType=DECIMAL} )
     * @param entity entity
     * @return Long
     */
    Long insert(TaAccountAmountDO entity);
    /**
     * desc:?��?�表:TA_ACCOUNT_AMOUNT.<br/>
     * descSql =  UPDATE TA_ACCOUNT_AMOUNT SET MALL_ID = #{mallId,jdbcType=BIGINT} ,REMARK = #{remark,jdbcType=VARCHAR} ,SHOP_ID = #{shopId,jdbcType=BIGINT} ,GOODS_ID = #{goodsId,jdbcType=BIGINT} ,MALL_NAME = #{mallName,jdbcType=VARCHAR} ,SHOP_NAME = #{shopName,jdbcType=VARCHAR} ,ALTER_EMPL = #{alterEmpl,jdbcType=BIGINT} ,ALTER_TIME = #{alterTime,jdbcType=TIMESTAMP} ,COMPANY_ID = #{companyId,jdbcType=BIGINT} ,GOODS_NAME = #{goodsName,jdbcType=VARCHAR} ,GOODS_TYPE = #{goodsType,jdbcType=VARCHAR} ,ORDER_CODE = #{orderCode,jdbcType=VARCHAR} ,SALE_UNION = #{saleUnion,jdbcType=DECIMAL} ,TIMESTAMP = #{timestamp,jdbcType=TIMESTAMP} ,CREATE_EMPL = #{createEmpl,jdbcType=BIGINT} ,CREATE_TIME = #{createTime,jdbcType=TIMESTAMP} ,ERP_ACC_NAME = #{erpAccName,jdbcType=VARCHAR} ,ORDER_DET_ID = #{orderDetId,jdbcType=BIGINT} ,SALE_ALIPAY = #{saleAlipay,jdbcType=DECIMAL} ,SALE_AMOUNT = #{saleAmount,jdbcType=DECIMAL} ,SALE_NUMBER = #{saleNumber,jdbcType=DECIMAL} ,SALE_WECHAT = #{saleWechat,jdbcType=DECIMAL} ,ACCOUNT_DATE = #{accountDate,jdbcType=DATE} ,COMPANY_NAME = #{companyName,jdbcType=VARCHAR} ,ERP_SALE_CODE = #{erpSaleCode,jdbcType=VARCHAR} ,ERP_SALE_DEPT = #{erpSaleDept,jdbcType=VARCHAR} ,SALE_FREIGJT = #{saleFreigjt,jdbcType=DECIMAL} ,SALE_PAYMENT = #{salePayment,jdbcType=DECIMAL} ,VALID_STATUS = #{validStatus,jdbcType=INTEGER} ,ERP_TRADE_CODE = #{erpTradeCode,jdbcType=VARCHAR} ,ERP_WRITE_TIME = #{erpWriteTime,jdbcType=TIMESTAMP} ,SALE_HIPAYACC = #{saleHipayacc,jdbcType=DECIMAL} ,ACCOUNT_UNIT_ID = #{accountUnitId,jdbcType=BIGINT} ,ERP_WRITE_STATUS = #{erpWriteStatus,jdbcType=VARCHAR} ,SALETOTAL_UNION = #{saletotalUnion,jdbcType=DECIMAL} ,ACCOUNT_UNIT_NAME = #{accountUnitName,jdbcType=VARCHAR} ,SALETOTAL_ALIPAY = #{saletotalAlipay,jdbcType=DECIMAL} ,SALETOTAL_AMOUNT = #{saletotalAmount,jdbcType=DECIMAL} ,SALETOTAL_NUMBER = #{saletotalNumber,jdbcType=DECIMAL} ,SALETOTAL_WECHAT = #{saletotalWechat,jdbcType=DECIMAL} ,RETURN_GOODS_UNION = #{returnGoodsUnion,jdbcType=DECIMAL} ,SALE_HIPAY_BALANCE = #{saleHipayBalance,jdbcType=DECIMAL} ,SALE_XINGLONGCART = #{saleXinglongcart,jdbcType=DECIMAL} ,SALETOTAL_FREIGHT = #{saletotalFreight,jdbcType=DECIMAL} ,SALETOTAL_PAYMENT = #{saletotalPayment,jdbcType=DECIMAL} ,RETURN_GOODS_ALIPAY = #{returnGoodsAlipay,jdbcType=DECIMAL} ,RETURN_GOODS_AMOUNT = #{returnGoodsAmount,jdbcType=DECIMAL} ,RETURN_GOODS_NUMBER = #{returnGoodsNumber,jdbcType=DECIMAL} ,RETURN_GOODS_WECHAT = #{returnGoodsWechat,jdbcType=DECIMAL} ,SALETOTAL_HIPAIACC = #{saletotalHipaiacc,jdbcType=DECIMAL} ,RETURN_GOODS_FREIGHT = #{returnGoodsFreight,jdbcType=DECIMAL} ,RETURN_GOODS_PAYMENT = #{returnGoodsPayment,jdbcType=DECIMAL} ,RETURN_GOODS_HIPAYACC = #{returnGoodsHipayacc,jdbcType=DECIMAL} ,SETTEMENT_TOTAL_UNION = #{settementTotalUnion,jdbcType=DECIMAL} ,RETURN_GOODS_ORDER_CODE = #{returnGoodsOrderCode,jdbcType=VARCHAR} ,SALETOTAL_XINLONGCART = #{saletotalXinlongcart,jdbcType=DECIMAL} ,SETTEMENT_TOTAL_ALIPAY = #{settementTotalAlipay,jdbcType=DECIMAL} ,SETTEMENT_TOTAL_AMOUNT = #{settementTotalAmount,jdbcType=DECIMAL} ,SETTEMENT_TOTAL_NUMBER = #{settementTotalNumber,jdbcType=DECIMAL} ,SETTEMENT_TOTAL_WECHAT = #{settementTotalWechat,jdbcType=DECIMAL} ,SETTKEMENT_SALES_UNION = #{settkementSalesUnion,jdbcType=DECIMAL} ,SALETOTAL_HIPAY_BALANCE = #{saletotalHipayBalance,jdbcType=DECIMAL} ,SETTEMENT_TOTAL_FREIGHT = #{settementTotalFreight,jdbcType=DECIMAL} ,SETTEMENT_TOTAL_PAYMENT = #{settementTotalPayment,jdbcType=DECIMAL} ,SETTKEMENT_SALES_ALIPAY = #{settkementSalesAlipay,jdbcType=DECIMAL} ,SETTKEMENT_SALES_AMOUNT = #{settkementSalesAmount,jdbcType=DECIMAL} ,SETTKEMENT_SALES_NUMBER = #{settkementSalesNumber,jdbcType=DECIMAL} ,SETTKEMENT_SALES_WECHAT = #{settkementSalesWechat,jdbcType=DECIMAL} ,SETTEMENT_TOTAL_HIPAYACC = #{settementTotalHipayacc,jdbcType=DECIMAL} ,SETTKEMENT_SALES_FREIGHT = #{settkementSalesFreight,jdbcType=DECIMAL} ,SETTKEMENT_SALES_PAYMENT = #{settkementSalesPayment,jdbcType=DECIMAL} ,RETURN_GOODS_ERP_TRADE_CODE = #{returnGoodsErpTradeCode,jdbcType=CHAR} ,RETURN_GOODS_ERP_WRITE_TIME = #{returnGoodsErpWriteTime,jdbcType=CHAR} ,RETURN_GOODS_HIPAY_BALANCE = #{returnGoodsHipayBalance,jdbcType=DECIMAL} ,RETURN_GOODS_XINGLONGCART = #{returnGoodsXinglongcart,jdbcType=DECIMAL} ,SETTKEMENT_SALES_HIPAYACC = #{settkementSalesHipayacc,jdbcType=DECIMAL} ,RETURN_GOODS_ERP_WRITE_STATUS = #{returnGoodsErpWriteStatus,jdbcType=CHAR} ,SETTEMENT_RETURN_GOODS_AOUNT = #{settementReturnGoodsAount,jdbcType=DECIMAL} ,SETTEMENT_RETURN_GOODS_UNION = #{settementReturnGoodsUnion,jdbcType=DECIMAL} ,SETTEMENT_RETURN_GOODS_ALIPAY = #{settementReturnGoodsAlipay,jdbcType=DECIMAL} ,SETTEMENT_RETURN_GOODS_NUMBER = #{settementReturnGoodsNumber,jdbcType=DECIMAL} ,SETTEMENT_RETURN_GOODS_WECHAT = #{settementReturnGoodsWechat,jdbcType=DECIMAL} ,SETTEMENT_TOTAL_HIPAY_BALANCE = #{settementTotalHipayBalance,jdbcType=DECIMAL} ,SETTEMENT_TOTAL_XINGLONGCART = #{settementTotalXinglongcart,jdbcType=DECIMAL} ,SETTEMENT_RETURN_GOODS_FREIGHT = #{settementReturnGoodsFreight,jdbcType=DECIMAL} ,SETTEMENT_RETURN_GOODS_PAYMENT = #{settementReturnGoodsPayment,jdbcType=DECIMAL} ,SETTKEMENT_SALES_HIPAY_BALANCE = #{settkementSalesHipayBalance,jdbcType=DECIMAL} ,SETTKEMENT_SALES_XINGLONGCART = #{settkementSalesXinglongcart,jdbcType=DECIMAL} ,SETTEMENT_RETURN_GOODS_HIPAYACC = #{settementReturnGoodsHipayacc,jdbcType=DECIMAL} ,SETTEMENT_RETURN_GOODS_HIPAY_BALANCE = #{settementReturnGoodsHipayBalance,jdbcType=DECIMAL} ,SETTEMENT_RETURN_GOODS_XINGLONGCART = #{settementReturnGoodsXinglongcart,jdbcType=DECIMAL} WHERE ID = #{id,jdbcType=BIGINT}
     * @param entity entity
     * @return Long
     */
    Long update(TaAccountAmountDO entity);
    /**
     * desc:?��??主�?????��?��??:TA_ACCOUNT_AMOUNT.<br/>
     * descSql =  DELETE FROM TA_ACCOUNT_AMOUNT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return Long
     */
    Long deleteByPrimary(Long id);
    /**
     * desc:?��??主�???��???��??:TA_ACCOUNT_AMOUNT.<br/>
     * descSql =  SELECT * FROM TA_ACCOUNT_AMOUNT WHERE ID = #{id,jdbcType=BIGINT}
     * @param id id
     * @return TaAccountAmountDO
     */
    TaAccountAmountDO getByPrimary(Long id);
}

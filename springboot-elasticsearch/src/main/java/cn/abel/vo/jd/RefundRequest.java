package cn.abel.vo.jd;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by zangliulu on 2019/3/14.
 *
 * @Description: 京东支付
 */
public class RefundRequest implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 客户端传入IP
     */
    private String clientIp;

    /**
     * 客户端传入port
     */
    private String clientPort;

    /**
     * 透传信息
     */
    private Map<String, String> reservedMap;

    /**
     * 申请退款类型
     */
    private String refundType;

    /**
     * 交易类型:T_GEN-收单交易、T_AGT:协议收款交易
     */
    private String tradeType;

    /**
     * 退款备注
     */
    private String tradeRemark;

    /**
     * 原外部订单号
     */
    private String outTradeNo;

    /**
     * 聚合订单
     */
    private String tradeNo;

    /**
     * 原聚合订单 退款时会有
     */
    private String originalTradeNo;

    /**
     * 聚合流水号
     */
    private String tradePayRequestNo;

    /**
     * 聚合原流水号 退款时会有
     */
    private String originalTradePayRequestNo;

    /**
     * 聚合支付单号
     */
    private String payRequestPiNo;

    /**
     * 聚合支付单号 退款时会有
     */
    private String originalPayRequestPiNo;

    /**
     * 商户号 一级
     */
    private String merchantNo;

    /**
     * 金额
     */
    private Long amount;

    /**
     * 连接类型：直连/中信
     */
    private String channelType;

    /**
     * 原样返回字段
     */
    private String returnParams;

    /**
     * 接口版本号
     */
    private String version;

    /**
     * 币种,RMB-人民币
     */
    private String currency;

    /**
     * 扩展字段1
     */
    private String ext1;

    /**
     * 扩展字段2
     */
    private String ext2;

    /**
     * 门店号
     */
    private String shopId;

    private String goodsInfoList;

    private String notifyUrl;

    /**
     * 二级商户号，会员码业务时需要必传
     */
    private String subMerchantNo;

    /**
     *  业务类型，用来区分会员码业务
     */
    private String businessCode;

    /**
     *  商户退款订单号
     */
    private String outRefundNo;

    private String operId;

    private String businessData;

    /**
     * 扩展字段Map
     */
    private String extMap;

    /**
     * 轮询ID
     */
    private String pollSequenceId;

    /**
     * 渠道商户appid
     */
    private String channelAppId;

    /**
     * 已退款金额
     */
    private Long refundedAmount = 0L;

    /**
     * 二级商户号
     */
    private String channelMerchantNo;

    /**
     * 支付方式
     */
    private String piTypeEnum;

    private String bizTradeNo;

    /**
     *  系统Id
     */
    private String systemId;

    /**
     *  微信公众号AppId
     */
    private String realChannelAppId;

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getBusinessData() {
        return businessData;
    }

    public void setBusinessData(String businessData) {
        this.businessData = businessData;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    public String getOutRefundNo() {
        return outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSubMerchantNo() {
        return subMerchantNo;
    }

    public void setSubMerchantNo(String subMerchantNo) {
        this.subMerchantNo = subMerchantNo;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    /**
     * @return the clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * @param clientIp
     *            the clientIp to set
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * @return the clientPort
     */
    public String getClientPort() {
        return clientPort;
    }

    /**
     * @param clientPort
     *            the clientPort to set
     */
    public void setClientPort(String clientPort) {
        this.clientPort = clientPort;
    }

    /**
     * @return the reservedMap
     */
    public Map<String, String> getReservedMap() {
        return reservedMap;
    }

    /**
     * @param reservedMap
     *            the reservedMap to set
     */
    public void setReservedMap(Map<String, String> reservedMap) {
        this.reservedMap = reservedMap;
    }

    /**
     * @return the tradeType
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * @param tradeType
     *            the tradeType to set
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * @return the tradeRemark
     */
    public String getTradeRemark() {
        return tradeRemark;
    }

    /**
     * @param tradeRemark
     *            the tradeRemark to set
     */
    public void setTradeRemark(String tradeRemark) {
        this.tradeRemark = tradeRemark;
    }

    /**
     * @return the outTradeNo
     */
    public String getOutTradeNo() {
        return outTradeNo;
    }

    /**
     * @param outTradeNo
     *            the outTradeNo to set
     */
    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    /**
     * @return the originalOutTradeNo
     */

    /**
     * @param originalOutTradeNo
     *            the originalOutTradeNo to set
     */

    /**
     * @return the tradeNo
     */
    public String getTradeNo() {
        return tradeNo;
    }

    /**
     * @param tradeNo
     *            the tradeNo to set
     */
    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    /**
     * @return the originalTradeNo
     */
    public String getOriginalTradeNo() {
        return originalTradeNo;
    }

    /**
     * @param originalTradeNo
     *            the originalTradeNo to set
     */
    public void setOriginalTradeNo(String originalTradeNo) {
        this.originalTradeNo = originalTradeNo;
    }

    /**
     * @return the tradePayRequestNo
     */
    public String getTradePayRequestNo() {
        return tradePayRequestNo;
    }

    /**
     * @param tradePayRequestNo
     *            the tradePayRequestNo to set
     */
    public void setTradePayRequestNo(String tradePayRequestNo) {
        this.tradePayRequestNo = tradePayRequestNo;
    }

    /**
     * @return the originalTradePayRequestNo
     */
    public String getOriginalTradePayRequestNo() {
        return originalTradePayRequestNo;
    }

    /**
     * @param originalTradePayRequestNo
     *            the originalTradePayRequestNo to set
     */
    public void setOriginalTradePayRequestNo(String originalTradePayRequestNo) {
        this.originalTradePayRequestNo = originalTradePayRequestNo;
    }

    /**
     * @return the payRequestPiNo
     */
    public String getPayRequestPiNo() {
        return payRequestPiNo;
    }

    /**
     * @param payRequestPiNo
     *            the payRequestPiNo to set
     */
    public void setPayRequestPiNo(String payRequestPiNo) {
        this.payRequestPiNo = payRequestPiNo;
    }

    /**
     * @return the originalPayRequestPiNo
     */
    public String getOriginalPayRequestPiNo() {
        return originalPayRequestPiNo;
    }

    /**
     * @param originalPayRequestPiNo
     *            the originalPayRequestPiNo to set
     */
    public void setOriginalPayRequestPiNo(String originalPayRequestPiNo) {
        this.originalPayRequestPiNo = originalPayRequestPiNo;
    }

    /**
     * @return the merchantNo
     */
    public String getMerchantNo() {
        return merchantNo;
    }

    /**
     * @param merchantNo
     *            the merchantNo to set
     */
    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    /**
     * @return the amount
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * @param amount
     *            the amount to set
     */
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    /**
     * @return the channelType
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * @param channelType
     *            the channelType to set
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    /**
     * @return the returnParams
     */
    public String getReturnParams() {
        return returnParams;
    }

    /**
     * @param returnParams
     *            the returnParams to set
     */
    public void setReturnParams(String returnParams) {
        this.returnParams = returnParams;
    }

    /**
     * @return the requestVersion
     */

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency
     *            the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the ext1
     */
    public String getExt1() {
        return ext1;
    }

    /**
     * @param ext1
     *            the ext1 to set
     */
    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    /**
     * @return the ext2
     */
    public String getExt2() {
        return ext2;
    }

    /**
     * @param ext2
     *            the ext2 to set
     */
    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    /**
     * @return the pollSequenceId
     */
    public String getPollSequenceId() {
        return pollSequenceId;
    }

    /**
     * @param pollSequenceId
     *            the pollSequenceId to set
     */
    public void setPollSequenceId(String pollSequenceId) {
        this.pollSequenceId = pollSequenceId;
    }

    /**
     * @return the channelAppId
     */
    public String getChannelAppId() {
        return channelAppId;
    }

    /**
     * @param channelAppId
     *            the channelAppId to set
     */
    public void setChannelAppId(String channelAppId) {
        this.channelAppId = channelAppId;
    }

    /**
     * @return the refundedAmount
     */
    public Long getRefundedAmount() {
        return refundedAmount;
    }

    /**
     * @param refundedAmount
     *            the refundedAmount to set
     */
    public void setRefundedAmount(Long refundedAmount) {
        this.refundedAmount = refundedAmount;
    }

    /**
     * @return the channelMerchantNo
     */
    public String getChannelMerchantNo() {
        return channelMerchantNo;
    }

    /**
     * @param channelMerchantNo
     *            the channelMerchantNo to set
     */
    public void setChannelMerchantNo(String channelMerchantNo) {
        this.channelMerchantNo = channelMerchantNo;
    }

    /**
     * @return the piTypeEnum
     */
    public String getPiTypeEnum() {
        return piTypeEnum;
    }

    /**
     * @param piTypeEnum
     *            the piTypeEnum to set
     */
    public void setPiTypeEnum(String piTypeEnum) {
        this.piTypeEnum = piTypeEnum;
    }

    /**
     * @return the bizTradeNo
     */
    public String getBizTradeNo() {
        return bizTradeNo;
    }

    /**
     * @param bizTradeNo
     *            the bizTradeNo to set
     */
    public void setBizTradeNo(String bizTradeNo) {
        this.bizTradeNo = bizTradeNo;
    }

    /**
     * @return the systemId
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * @param systemId
     *            the systemId to set
     */
    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    /**
     * @return the realChannelAppId
     */
    public String getRealChannelAppId() {
        return realChannelAppId;
    }

    /**
     * @param realChannelAppId
     *            the realChannelAppId to set
     */
    public void setRealChannelAppId(String realChannelAppId) {
        this.realChannelAppId = realChannelAppId;
    }

    /**
     * @return the refundType
     */
    public String getRefundType() {
        return refundType;
    }

    /**
     * @param refundType
     *            the refundType to set
     */
    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    /*
     * @Title: toString
     * @Description: TODO
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "RefundRequest [clientIp=" + clientIp + ", clientPort=" + clientPort + ", reservedMap=" + reservedMap + ", refundType=" + refundType
                + ", tradeType=" + tradeType + ", tradeRemark=" + tradeRemark + ", outTradeNo=" + outTradeNo + ", originalOutTradeNo=" + outTradeNo
                + ", tradeNo=" + tradeNo + ", originalTradeNo=" + originalTradeNo + ", tradePayRequestNo=" + tradePayRequestNo
                + ", originalTradePayRequestNo=" + originalTradePayRequestNo + ", payRequestPiNo=" + payRequestPiNo + ", originalPayRequestPiNo="
                + originalPayRequestPiNo + ", merchantNo=" + merchantNo + ", amount=" + amount + ", channelType=" + channelType + ", returnParams="
                + returnParams + ", version=" + version + ", currency=" + currency + ", ext1=" + ext1 + ", ext2=" + ext2 + ", extMap=" + extMap
                + ", pollSequenceId=" + pollSequenceId + ", channelAppId=" + channelAppId + ", refundedAmount=" + refundedAmount
                + ", channelMerchantNo=" + channelMerchantNo + ", piTypeEnum=" + piTypeEnum + ", bizTradeNo=" + bizTradeNo + ", systemId=" + systemId
                + ", realChannelAppId=" + realChannelAppId + "]";
    }

    public String getGoodsInfoList() {
        return goodsInfoList;
    }

    public void setGoodsInfoList(String goodsInfoList) {
        this.goodsInfoList = goodsInfoList;
    }

    public void setExtMap(String extMap) {
        this.extMap = extMap;
    }

    public String getExtMap() {
        return extMap;
    }
}

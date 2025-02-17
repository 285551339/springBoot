package cn.abel.vo.jd;

import java.io.Serializable;

/**
 * @ClassName ApiPayRequest
 * @Description  刷卡支付参数
 * @Author llzang
 * @Date 2019/3/13 16:11
 * @Version V1.0
 **/
public class ApiPayRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     *  系统名称,由聚合系统统一分配
     */
    private String systemId;

    /**
     * 商户号 一级
     */
    private String merchantNo;

    /**
     * 业务分类
     */
    private String businessCode;

    /**
     * 版本号
     */
    private String version;

    /**
     * 商户订单号
     */
    private String outTradeNo;

    /**
     * 支付金额
     */
    private Long amount;

    /**
     * 操作员 Id
     */
    private String operId;

    /**
     * 门店号
     */
    private String shopId;

    /**
     * 门店名称
     */
    private String shopName;

    /**
     * 门店类型
     */
    private String shopType;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 币种,RMB-人民币
     */
    private String currency;

    /**
     * 条形码付款码/签约扣款中的签约号
     */
    private String authCode;

    /**
     * 支付方式
     */
    private String piType;

    /**
     * 客户端传入IP
     */
    private String outTradeIp;

    /**
     * 订单类型,00-实物,01-虚拟
     */
    private String virtualType;

    /**
     * 交易日期: yyyyMMddHHmmss
     */
    private String tradeTime;

    /**
     * 交易截止时间: yyyyMMddHHmmss
     */
    private String deadlineTime;

    /**
     * 交易备注
     */
    private String remark;

    /**
     * 原样返回字段
     */
    private String returnParams;

    /**
     * 订单商品数量
     */
    private String orderGoodsNum;

    /**
     * 商品信息列表
     */
    private String goodsInfoList;

    /**
     * 终端信息
     */
    private String deviceInfo;

    /**
     * 异步回调地址
     */
    private String notifyUrl;


    /**
     * 业务数据:（会员码 品牌 ID brandId String(32) 是 商户品牌编号（京东提供） 品牌名称 brandName
     *   String(32) 是 商户品牌名称（京东提供）
     */
    private String businessData;

    /**
     * 扩展字段
     */
    private String extMap;

    // ////////////////////////以上是对外接口文档中字段/////////////////////////////////////

    /**
     * 交易扩展信息
     */
    private String outext;

    /**
     * 交易摘要
     */
    private String subject;

    /**
     * 客户端传入端口
     */
    private String outTradePort;

    /**
     * 远程访问IP
     */
    private String remoteIp;

    /**
     * 商户的用户Id
     */
    private String merchantUserId;

    /**
     * 页面回调地址
     */
    private String pageBackUrl;

    /**
     * 失败回调地址
     */
    private String pageBackFailUrl;

    /**
     * 用户标识:openId tradeType=JSAPI，此参数必传
     */
    private String openId;

    /**
     * 应付金额
     */
    private Long payableAmount;

    /**
     * 渠道商户appid
     */
    private String channelAppId;

    // 用户pin
    /**
     *
     */
    private String userId;

    /**
     * 交易类型
     */
    private String tradeType;

    /**
     * 连接类型
     */
    private String channelType;

    /**
     * 产品类型
     */
    private String gatewayPayMethod;

    /**
     * 真实的AppId
     */
    private String realChannelAppId;

    /**
     * 服务商商户号
     */
    private String agentMerchantNo;

    /**
     * 渠道服务商商户号
     */
    private String channelAgentMerchantNo;

    /**
     * 二级商户号
     */
    private String channelMerchantNo;

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getChannelMerchantNo() {
        return channelMerchantNo;
    }

    public void setChannelMerchantNo(String channelMerchantNo) {
        this.channelMerchantNo = channelMerchantNo;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getPiType() {
        return piType;
    }

    public void setPiType(String piType) {
        this.piType = piType;
    }

    public String getOutTradeIp() {
        return outTradeIp;
    }

    public void setOutTradeIp(String outTradeIp) {
        this.outTradeIp = outTradeIp;
    }

    public String getVirtualType() {
        return virtualType;
    }

    public void setVirtualType(String virtualType) {
        this.virtualType = virtualType;
    }

    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(String deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReturnParams() {
        return returnParams;
    }

    public void setReturnParams(String returnParams) {
        this.returnParams = returnParams;
    }

    public String getOrderGoodsNum() {
        return orderGoodsNum;
    }

    public void setOrderGoodsNum(String orderGoodsNum) {
        this.orderGoodsNum = orderGoodsNum;
    }

    public String getGoodsInfoList() {
        return goodsInfoList;
    }

    public void setGoodsInfoList(String goodsInfoList) {
        this.goodsInfoList = goodsInfoList;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getOutext() {
        return outext;
    }

    public void setOutext(String outext) {
        this.outext = outext;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getOutTradePort() {
        return outTradePort;
    }

    public void setOutTradePort(String outTradePort) {
        this.outTradePort = outTradePort;
    }

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    public String getMerchantUserId() {
        return merchantUserId;
    }

    public void setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
    }

    public String getPageBackUrl() {
        return pageBackUrl;
    }

    public void setPageBackUrl(String pageBackUrl) {
        this.pageBackUrl = pageBackUrl;
    }

    public String getPageBackFailUrl() {
        return pageBackFailUrl;
    }

    public void setPageBackFailUrl(String pageBackFailUrl) {
        this.pageBackFailUrl = pageBackFailUrl;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Long getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(Long payableAmount) {
        this.payableAmount = payableAmount;
    }

    public String getChannelAppId() {
        return channelAppId;
    }

    public void setChannelAppId(String channelAppId) {
        this.channelAppId = channelAppId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getGatewayPayMethod() {
        return gatewayPayMethod;
    }

    public void setGatewayPayMethod(String gatewayPayMethod) {
        this.gatewayPayMethod = gatewayPayMethod;
    }

    public String getRealChannelAppId() {
        return realChannelAppId;
    }

    public void setRealChannelAppId(String realChannelAppId) {
        this.realChannelAppId = realChannelAppId;
    }

    public String getAgentMerchantNo() {
        return agentMerchantNo;
    }

    public void setAgentMerchantNo(String agentMerchantNo) {
        this.agentMerchantNo = agentMerchantNo;
    }

    public String getChannelAgentMerchantNo() {
        return channelAgentMerchantNo;
    }

    public void setChannelAgentMerchantNo(String channelAgentMerchantNo) {
        this.channelAgentMerchantNo = channelAgentMerchantNo;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getBusinessData() {
        return businessData;
    }

    public void setBusinessData(String businessData) {
        this.businessData = businessData;
    }

    public String getExtMap() {
        return extMap;
    }

    public void setExtMap(String extMap) {
        this.extMap = extMap;
    }
}

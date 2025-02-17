package cn.abel.vo.jd;


import java.io.Serializable;

public class ApiPayResponse  implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;


    /**
     * 交易日期: yyyyMMddHHmmss
     */
    private String tradeTime;

    /**
     *  交易截止时间: yyyyMMddHHmmss
     */
    private String deadlineTime;

    /**
     *  业务类型
     */
    private String businessCode;

    /**
     *  版本
     */
    private String version;

    /**
     * 聚合商户号
     **/
    private String merchantNo;

    /**
     * 外部订单号
     **/
    private String outTradeNo;

    /**
     * 聚合订单号
     */
    private String tradeNo;

    /**
     *
     * 支付工具
     *  JDPAY("JDPAY", "京东支付"), WX("WX", "微信支付"), APPLEPAY("APPLEPAY",
     *    "applePay支付"), UNIPAY("UNIPAY", "银联在线支付"), ALIPAY("ALIPAY", "支付宝支付")
     *
     * **/
    private String piType;

    /**
     * 金额
     */
    private Long amount;

    /**
     * 完成时间
     */
    private String payFinishTime;

    /**
     * 原样返回参数
     */
    private String returnParams;

    /**
     *  扩展信息
     */
    private String extMapStr;

    /**
     *  商家优惠退款金额
     */
    private Long merchantCouponAmount;

    /**
     * 支付渠道退款金额
     */
    private Long piAmount;

    /**
     *  平台优惠退款 金额
     */
    private Long couponAmount;

    /** 币种 **/
    private String currency = "RMB";

    /**
     * 支付状态
     */
    private String payStatus;

    /**  **/

    private String resultCode = "FAIL";

    /**
     * 错误码
     */
    private String errCode;

    /**
     * 错误描述
     */
    private String errCodeDes;

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

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getPiType() {
        return piType;
    }

    public void setPiType(String piType) {
        this.piType = piType;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getPayFinishTime() {
        return payFinishTime;
    }

    public void setPayFinishTime(String payFinishTime) {
        this.payFinishTime = payFinishTime;
    }

    public String getReturnParams() {
        return returnParams;
    }

    public void setReturnParams(String returnParams) {
        this.returnParams = returnParams;
    }

    public String getExtMapStr() {
        return extMapStr;
    }

    public void setExtMapStr(String extMapStr) {
        this.extMapStr = extMapStr;
    }

    public Long getMerchantCouponAmount() {
        return merchantCouponAmount;
    }

    public void setMerchantCouponAmount(Long merchantCouponAmount) {
        this.merchantCouponAmount = merchantCouponAmount;
    }

    public Long getPiAmount() {
        return piAmount;
    }

    public void setPiAmount(Long piAmount) {
        this.piAmount = piAmount;
    }

    public Long getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Long couponAmount) {
        this.couponAmount = couponAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * @return the resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * @param resultCode
     *            the resultCode to set
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * @return the errCode
     */
    public String getErrCode() {
        return errCode;
    }

    /**
     * @param errCode
     *            the errCode to set
     */
    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    /**
     * @return the errCodeDes
     */
    public String getErrCodeDes() {
        return errCodeDes;
    }

    /**
     * @param errCodeDes
     *            the errCodeDes to set
     */
    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }

}

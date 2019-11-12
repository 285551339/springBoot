package cn.abel.vo.jd;



public class ApiQueryResponse extends JdBaseBean {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 区分子交易类型：消费/退款
     **/
    //private String subTradeTypeEnum;

    /**
     * 聚合支付单号
     */
    private String payRequestPiNo;

    // 聚合流水号
    private String tradePayRequestNo;

    /**
     * 支付状态
     */
    private String payStatus;

    /**
     * 轮询ID
     */
    private String pollSequenceId;

    /**
     * 连接类型
     */
    private String channelType;

    /**
     * 外部订单号
     */
    private String bizTradeNo;

    // 二级商户号
    private String channelMerchantNo;

    // 商户退款订单号
    private String outRefundNo;

    // 退款订单号
    private String TradeRefundNo;

    public String getOutRefundNo() {
        return outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo;
    }

    public String getTradeRefundNo() {
        return TradeRefundNo;
    }

    public void setTradeRefundNo(String tradeRefundNo) {
        TradeRefundNo = tradeRefundNo;
    }

//    /**
//     * @return the subTradeTypeEnum
//     */
//    public String getSubTradeTypeEnum() {
//        return subTradeTypeEnum;
//    }
//
//    /**
//     * @param subTradeTypeEnum
//     *            the subTradeTypeEnum to set
//     */
//    public void setSubTradeTypeEnum(String subTradeTypeEnum) {
//        this.subTradeTypeEnum = subTradeTypeEnum;
//    }

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
     * @return the payStatus
     */
    public String getPayStatus() {
        return payStatus;
    }

    /**
     * @param payStatus
     *            the payStatus to set
     */
    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
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

}

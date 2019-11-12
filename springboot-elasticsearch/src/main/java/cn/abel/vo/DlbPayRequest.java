package cn.abel.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DlbPayRequest implements Serializable {

    /**
     * 代理商模式必填 代理商号
     */
    private String agentNum;
    /**
     * 商户编号
     */
    private String customerNum;
    /**
     * 用户付款码
     */
    private String authCode;
    /**
     * 机具编号
     */
    private String machineNum;
    /**
     * 店铺编号
     */
    private String shopNum;
    /**
     * 流水号(用户系统内唯一)
     */
    private String requestNum;
    /**
     * 支付金额 单位：元，精确到分
     */
    private String amount;
    /**
     * 固定 API
     */
    private String source;

    /**
     * 支付类型
     */
    private String bankType;

    /**
     * 回调地址
     */
    private String callbackUrl;

    /**
     * 退款单号
     */
    private String refundRequestNum;
    /**
     * 订单号
     */
    private String orderNum;

}

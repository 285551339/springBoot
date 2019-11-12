package cn.abel.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DlbPayResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * success表示成功，fail表示失败，error表示异常
     */
    private String result;
    /**
     * 商户名称
     */
    private String customerName;
    /**
     * 流水号(用户系统内唯一)
     */
    private String requestNum;
    /**
     * 订单编号
     */
    private String orderNum;
    /**
     *
     */
    private String source;
    /**
     * QRCODE_TRAD(二维码交易)/CUSTOMER_RECHARGE(商户充值)
     */
    private String bussinessType;

    /**
     * 订单状态
     */
    private String status;
    /**
     * SALES(消费)
     *
     * RECHARGE(充值)
     */
    private String type;
    /**
     * 订单完成时间
     */
    private String completeTime;
    /**
     * 订单金额
     */
    private String orderAmount;
    /**
     * 退款时间
     */
    private String refundTime;
    /**
     * 微信openId
     */
    private String openId;
    /**
     * 正在支付时有此字段
     */
    private Boolean isPaying;
    /**
     *失败状态下有备注
     */
    private String remark;
    /**
     * 交易手续费
     */
    private String tradeFee;


}

package cn.abel.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DlbRefundResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单编号
     */
    private String orderNum;
    /**
     * 退款请求流水号
     */
    private String refundRequestNum;
    /**
     * 退款请求银行流水号
     */
    private String bankRequestNum;
    /**
     * 退款金额
     */
    private String refundAmount;
}

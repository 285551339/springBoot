package cn.abel.vo.jd;

import java.io.Serializable;

/**
 * @ClassName JDPayRequest
 * @Description
 * @Author
 * @Date 2019/3/13 14:25
 * @Version V1.0
 **/

public class JdPayRequest implements Serializable {
    /**
     * @fieldName: serialVersionUID
     * @fieldType: long
     * @Description: TODO
     */
    private static final long serialVersionUID = 1L;

    /**
     * 对接系统名称,统一分配
     */
    private String systemId;

    /**
     * 商户号
     */
    private String merchantNo;

    /**
     * 订单详情:PayRequestBean对象json格式化加密
     */
    private String cipherJson;

    /**
     * 签名
     */
    private String sign;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getCipherJson() {
        return cipherJson;
    }

    public void setCipherJson(String cipherJson) {
        this.cipherJson = cipherJson;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "JdPayRequest [merchantNo=" + merchantNo + ", cipherJson=" + cipherJson + ", sign=" + sign + "]";
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }
}

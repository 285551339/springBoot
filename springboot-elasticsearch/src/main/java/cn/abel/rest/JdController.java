package cn.abel.rest;

import cn.abel.util.DateUtil;
import cn.abel.vo.jd.*;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/jd")
public class JdController {

    private String desKey="L8HViVR89EYpPk8B91dUntAyMZcW5hDy";
    private String saltMd5Key="SRRctGYFh2HhUrHbGVxHiisqLLOPp46w";

    /**
     * 刷卡支付(被扫)
     */
    @PostMapping("/m/pay")
    private String getPay(@RequestBody JdPayRequest request){

        DecryptAndVerifyResBean des = this.decode(desKey, request, saltMd5Key);
        System.out.println(des.getPlain());
        ApiPayRequest rReq = JSONObject.parseObject(des.getPlain(), ApiPayRequest.class);
        ApiPayResponse apiPayResponse = new ApiPayResponse();
        apiPayResponse.setAmount(rReq.getAmount());
        apiPayResponse.setBusinessCode(rReq.getBusinessCode());
        apiPayResponse.setCouponAmount(0l);
        apiPayResponse.setCurrency("RMB");
        apiPayResponse.setDeadlineTime("20191108000016");
        apiPayResponse.setErrCode("000000");
        apiPayResponse.setErrCodeDes("成功");
        apiPayResponse.setMerchantCouponAmount(0L);
        apiPayResponse.setMerchantNo(rReq.getMerchantNo());
        apiPayResponse.setOutTradeNo(rReq.getOutTradeNo());
        apiPayResponse.setPayFinishTime(DateUtil.DateToStr(new Date()));
        apiPayResponse.setPayStatus("FINISH");
        apiPayResponse.setPiType("WX");
        apiPayResponse.setResultCode("SUCCESS");
        String json = JSONObject.toJSONString(apiPayResponse);
        EncryptAndSignResBean encrypt = this.encrypt(desKey, json, saltMd5Key);
        JdPayRequest request1 = new JdPayRequest();
        request1.setMerchantNo(rReq.getMerchantNo());
        request1.setSystemId("");
        request1.setCipherJson(encrypt.getEncrypt());
        request1.setSign(encrypt.getSign());
        return JSONObject.toJSONString(request1);
    }

    /**
     * 退款
     */
    @PostMapping("/m/refund")
    private String getRefund(){

        return null;
    }

    /**
     * 查询交易接口
     */
    @PostMapping("/m/querytrade")
    private String getQuerytrade(){

        return null;
    }

    /**
     * 退款查询
     */
    @PostMapping("/m/queryrefund")
    private String getQueryrefund(){

        return null;
    }


    /**
     * @param desKey
     * @param json
     * @param saltMd5Key
     * @Description: 参数加密
     * @return: EncryptAndSignResBean
     * @Author: zangliulu
     * @Date: 2019/3/15 19:56
     */
    private EncryptAndSignResBean encrypt(String desKey, String json, String saltMd5Key) {
        EncryptAndSignReqBean en = new EncryptAndSignReqBean();
        en.setTripleDESKey(desKey);
        en.setPlain(json);
        en.setMd5SaltKey(saltMd5Key);
        EncryptAndSignResBean ret = SecurityUtils.encryptAndSignAndURLEncoder(en);
        return ret;
    }

    /**
     * @param desKey
     * @param prs
     * @param saltMd5Key
     * @Description: 请求参数解密解密
     * @return: DecryptAndVerifyResBean
     * @Author: zangliulu
     * @Date: 2019/3/15 20:00
     */
    private DecryptAndVerifyResBean decode(String desKey, JdPayRequest prs, String saltMd5Key) {
        DecryptAndVerifyReqBean de = new DecryptAndVerifyReqBean();
        de.setEncrypt(prs.getCipherJson());
        de.setTripleDESKey(desKey);
        de.setMd5SaltKey(saltMd5Key);
        de.setSign(prs.getSign());
        DecryptAndVerifyResBean des = SecurityUtils.decryptAndVerifyAndURLDecoder(de);
        return des;
    }
}

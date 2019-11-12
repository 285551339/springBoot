package cn.abel.rest;


import cn.abel.util.RedisUtil;
import cn.abel.vo.DlbPayRequest;
import cn.abel.vo.DlbPayResponse;
import cn.abel.vo.DlbResult;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dlb")
public class DlbController {

    @Autowired
    private RedisUtil redisUtil;

    @PostMapping("/v1/agent/passive/create")
    public String create(@RequestBody DlbPayRequest dlbPayRequest) {
        DlbResult result = new DlbResult();
        DlbPayResponse dlbPayResponse = new DlbPayResponse();
        result.setResult("SUCCESS");
        result.setData(JSONObject.toJSONString(dlbPayResponse));
        redisUtil.set(dlbPayRequest.getRequestNum(),JSONObject.toJSONString(dlbPayRequest));
        String s = JSONObject.toJSONString(result);
        System.out.println(s);
        return s ;
    }


    @GetMapping("/v1/agent/order/refund/{agentNum}/{customerNum}/{shopNum}/{requestNum}")
    public Object refund(@PathVariable("agentNum") String agentNum, @PathVariable("customerNum") String customerNum,@PathVariable("shopNum") String shopNum, @PathVariable("requestNum") String requestNum) {
        System.out.println("测试。。。。。。");

        return null;
    }


    @PostMapping("/v1/agent/order/payresult/{agentNum}/{customerNum}/{shopNum}/{requestNum}")
    public Object payresult(@PathVariable("agentNum") String agentNum, @PathVariable("customerNum") String customerNum,@PathVariable("shopNum") String shopNum, @PathVariable("requestNum") String requestNum) {
        System.out.println("测试。。。。。。");

        return null;
    }

}

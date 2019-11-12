package cn.abel.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jd")
public class JdController {

    @PostMapping("/m/pay")
    private String getPay(){

        return null;
    }

    @PostMapping("/m/refund")
    private String getRefund(){

        return null;
    }

    @PostMapping("/m/querytrade")
    private String getQuerytrade(){

        return null;
    }

    @PostMapping("/m/queryrefund")
    private String getQueryrefund(){

        return null;
    }
}

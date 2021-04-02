package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TextController {
    @Value("${server.port}")
    String port;

    @Value("${spring.application.name}")
    String name;


    @RequestMapping("/test")
    public String test() {
        return  "上线测试:"+name+":"+port;
    }

}

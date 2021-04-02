package controller;

import feign.TestFeign;
import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RestController
public class TestController {
    @Autowired
    TestFeign testFeign;// 注入 Feign接口
    @Autowired
    TestFeign testByParam;// 注入 Feign接口
    @Autowired
    TestFeign testByMap;// 注入 Feign接口
    @Autowired
    TestFeign testByRequestBody;// 注入 Feign接口@Autowired

    @RequestMapping(value = "/test")
    public String test(){
        return testFeign.testByFeign();
    }
    @RequestMapping(value = "/testByParam")
    public String testByParam(){
        String feign = "feign";

        return testFeign.testByParam(feign);
    }
    @RequestMapping(value = "/testByMap")
    public String testByMap(){
        Map<String,Object> map = new HashMap<>();
        map.put("name","你猜");
        System.out.println(map.get("name"));
        return testFeign.testByMap(map);
    }
    @RequestMapping(value = "/testByFeign")
    public String testByFeign(){
        return testFeign.testByFeign();
    }

}

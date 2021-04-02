package feign;

import org.apache.catalina.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "springcloud-provider-1")
public interface TestFeign {
    @RequestMapping(value = "/test")
    String testByFeign();
     // 测试带普通参数
     @RequestMapping(value = "/testByParam")
     String testByParam(@RequestParam("from") String from);


     // 测试带多个普通参数Map
     @RequestMapping(value = "/testByMap")
     String testByMap(@RequestParam Map  map);


     // 测试参数是对象的情况  @RequestBody  User user
     @RequestMapping(value = "/testByRequestBody",method = RequestMethod.POST)
     String testByRequestBody(@RequestBody User user);

}

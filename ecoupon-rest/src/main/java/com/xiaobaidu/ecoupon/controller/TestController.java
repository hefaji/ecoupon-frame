package com.xiaobaidu.ecoupon.controller;

import com.xiaobaidu.ecoupon.entity.ECouponType;
import com.xiaobaidu.ecoupon.service.EcouponTypeService;
import com.xiaobaidu.ecoupon.service.TestService;
import com.xiaobaidu.ecoupon.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by dell on 2017/6/4.
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @Autowired
    private EcouponTypeService ecouponTypeService;
    @RequestMapping("/test/{name:\\S+}")
    public String test( @PathVariable("name") String  name){
        return testService.hello(name);
    }

        @RequestMapping("/ecouponType/list")
    public String test( ){
        List<ECouponType> list = ecouponTypeService.list();
        return JsonUtils.listToJson(list);
    }
}

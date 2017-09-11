package com.xiaobaidu.ecoupon.service.impl;

import com.xiaobaidu.ecoupon.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by dell on 2017/6/4.
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String hello(String name) {
        return "hello:"+ name;
    }
}

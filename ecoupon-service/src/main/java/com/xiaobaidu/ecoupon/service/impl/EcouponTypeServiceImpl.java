package com.xiaobaidu.ecoupon.service.impl;

import com.xiaobaidu.ecoupon.dao.ECouponTypeMapper;
import com.xiaobaidu.ecoupon.entity.ECouponType;
import com.xiaobaidu.ecoupon.service.EcouponTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dell on 2017/6/4.
 */
@Service
public class EcouponTypeServiceImpl implements EcouponTypeService{

    @Autowired
    private ECouponTypeMapper eCouponTypeMapper;

    @Override
    public List<ECouponType> list() {
        return eCouponTypeMapper.selectAll();
    }
}

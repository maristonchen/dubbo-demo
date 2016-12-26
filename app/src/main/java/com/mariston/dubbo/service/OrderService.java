package com.mariston.dubbo.service;

import com.mariston.dubbo.bean.Order;

/**
 * 订单业务接口
 *
 * @author mariston
 * @version V1.0
 * @since 2016/12/26
 */
public interface OrderService {

    /**
     * 保存订单
     *
     * @param order 订单信息
     * @return int
     */
    int save(Order order);
}

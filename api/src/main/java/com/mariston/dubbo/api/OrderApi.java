package com.mariston.dubbo.api;

import com.mariston.dubbo.bean.Order;

/**
 * 机票+旅店订单API
 *
 * @author mariston
 * @version V1.0
 * @since 2016/12/26
 */
public interface OrderApi {

    /**
     * 提交订单
     *
     * @param order 订单信息
     * @return string
     */
    String submit(Order order);
}

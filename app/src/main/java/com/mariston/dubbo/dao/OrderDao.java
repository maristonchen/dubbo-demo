package com.mariston.dubbo.dao;

import com.mariston.dubbo.bean.Order;

/**
 * 订单DAO接口
 *
 * @author mariston
 * @version V1.0
 * @since 2016/12/26
 */
public interface OrderDao {

    /**
     * 插入订单
     *
     * @param order 订单信息
     * @return int
     */
    int insert(Order order);
}

package com.mariston.dubbo.dao.impl;

import com.mariston.dubbo.bean.Order;
import com.mariston.dubbo.dao.OrderDao;
import org.springframework.stereotype.Repository;

/**
 * 订单DAO实现
 *
 * @author mariston
 * @version V1.0
 * @since 2016/12/26
 */
@Repository("orderDao")
public class OrderDaoImpl implements OrderDao {

    /**
     * 插入订单
     *
     * @param order 订单信息
     * @return int
     */
    @Override
    public int insert(Order order) {
        return 1;
    }
}

package com.mariston.dubbo.service.impl;

import com.mariston.dubbo.bean.Order;
import com.mariston.dubbo.dao.OrderDao;
import com.mariston.dubbo.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 订单业务实现
 *
 * @author mariston
 * @version V1.0
 * @since 2016/12/26
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    /**
     * 订单DAO接口
     */
    @Resource
    private OrderDao orderDao;

    /**
     * 保存订单
     *
     * @param order 订单信息
     * @return int
     */
    @Override
    @Transactional
    public int save(Order order) {
        logger.info("====保存订单信息：\n{}", order);
        return orderDao.insert(order);
    }
}

package com.mariston.dubbo.realize;

import com.mariston.dubbo.api.OrderApi;
import com.mariston.dubbo.bean.Order;
import com.mariston.dubbo.bean.Passenger;
import com.mariston.dubbo.service.OrderService;
import com.mariston.dubbo.service.PassengerService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;

/**
 * 机票+酒店订单API实现
 *
 * @author mariston
 * @version V1.0
 * @since 2016/12/26
 */
@Service("orderApi")
public class OrderApiImpl implements OrderApi {

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(OrderApiImpl.class);

    /**
     * 订单业务接口
     */
    @Resource
    private OrderService orderService;

    /**
     * 乘客业务接口
     */
    @Resource
    private PassengerService passengerService;
    /**
     * 提交订单
     *
     * @param order 订单信息
     * @return string
     */
    @Override
    @Transactional
    public String submit(Order order) {
        //1.参数校验
        Assert.notNull(order, "订单不能为NULL");
        Assert.hasText(order.getAmount(), "订单金额不能为空");
        Assert.isTrue(CollectionUtils.isNotEmpty(order.getPassengers()),"乘客信息不能为NULL");

        //2.保存订单信息
        int count = orderService.save(order);
        //3.保存乘客信息
        if (count == 1) {
            for (Passenger passenger : order.getPassengers()) {
                passengerService.save(passenger);
            }
        }
        return "success";
    }
}

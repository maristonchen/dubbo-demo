package com.mariston.dubbo.api;

import com.mariston.dubbo.bean.Order;
import com.mariston.dubbo.bean.Passenger;
import com.mariston.dubbo.enumtype.CardType;
import com.mariston.dubbo.enumtype.OrderStatus;
import com.mariston.dubbo.enumtype.PassType;
import com.mariston.dubbo.enumtype.Sex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 测试用例
 *
 * @author mariston
 * @version V1.0
 * @since 2016/12/26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-global.xml"})
public class OrderApiTest {

    @Resource
    private OrderApi orderApi;


    @Test
    public void submit() throws Exception {

        Order order = new Order();

        order.setInfo("昆明直飞丽江【邂逅.云淡风轻】2晚3天自由行 入驻爱心酒店");

        order.setAmount("1234.00");

        order.setStatus(OrderStatus.PENDING.ordinal());

        order.setLinkman("张三");

        order.setTelephone("13427873377");

        order.setEmail("747482274@qq.com");

        order.setCreateTime("2016-12-26 12:12:56");

        List<Passenger> passengers = new ArrayList<>();

        Passenger passenger = new Passenger();

        passenger.setName("张三");

        passenger.setSex(Sex.MALE.ordinal());

        passenger.setType(PassType.ADULT.ordinal());

        passenger.setCardType(CardType.ID.ordinal());

        passenger.setCardNo("430223199910033529");

        passengers.add(passenger);

        order.setPassengers(passengers);

        String result = orderApi.submit(order);

        System.out.println(result);

    }

}
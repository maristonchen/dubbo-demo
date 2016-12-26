package com.mariston.dubbo.dao;

import com.mariston.dubbo.bean.Passenger;

/**
 * 乘客DAO接口
 *
 * @author mariston
 * @version V1.0
 * @since 2016/12/26
 */
public interface PassengerDao {

    /**
     * 插入乘客
     *
     * @param passenger 乘客信息
     * @return int
     */
    int insert(Passenger passenger);
}

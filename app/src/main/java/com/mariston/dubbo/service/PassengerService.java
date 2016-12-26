package com.mariston.dubbo.service;

import com.mariston.dubbo.bean.Passenger;

/**
 * 乘客业务接口
 *
 * @author mariston
 * @version V1.0
 * @since 2016/12/26
 */
public interface PassengerService {

    /**
     * 保存乘客
     *
     * @param passenger 乘客信息
     * @return int
     */
    int save(Passenger passenger);
}

package com.mariston.dubbo.dao.impl;

import com.mariston.dubbo.bean.Passenger;
import com.mariston.dubbo.dao.PassengerDao;
import org.springframework.stereotype.Repository;

/**
 * 乘客DAO实现
 *
 * @author mariston
 * @version V1.0
 * @since 2016/12/26
 */
@Repository("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

    /**
     * 插入乘客
     *
     * @param passenger 乘客信息
     * @return int
     */
    @Override
    public int insert(Passenger passenger) {
        return 1;
    }
}

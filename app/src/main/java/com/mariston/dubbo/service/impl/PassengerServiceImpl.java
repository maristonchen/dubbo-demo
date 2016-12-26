package com.mariston.dubbo.service.impl;

import com.mariston.dubbo.bean.Passenger;
import com.mariston.dubbo.dao.PassengerDao;
import com.mariston.dubbo.service.PassengerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 乘客业务实现
 *
 * @author mariston
 * @version V1.0
 * @since 2016/12/26
 */
@Service("passengerService")
public class PassengerServiceImpl implements PassengerService {

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(PassengerServiceImpl.class);

    /**
     * 乘客DAO接口
     */
    @Resource
    private PassengerDao passengerDao;

    /**
     * 保存乘客
     *
     * @param passenger 乘客信息
     * @return int
     */
    @Override
    public int save(Passenger passenger) {
        logger.info("====保存乘客信息：\n{}", passenger);

        return passengerDao.insert(passenger);
    }
}

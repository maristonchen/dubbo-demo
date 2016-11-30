package com.mariston.dubbo.service;

import com.mariston.dubbo.bean.Insurance;

/**
 * 保险业务接口
 *
 * @author mariston
 * @version V1.0
 * @since 2016/11/30
 */
public interface InsuranceService {

    /**
     * 保存保险信息
     *
     * @param insurance 保险信息
     * @return string
     */
    String save(Insurance insurance);


    /**
     * 查询保险信息
     *
     * @param insuranceNo 保险编号
     * @return {@link Insurance}
     */
    Insurance queryByNo(String insuranceNo);
}

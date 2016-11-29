package com.mariston.dubbo.api;

import com.mariston.dubbo.bean.Insurance;

/**
 * 保险api
 *
 * @author mariston
 * @version V1.0
 * @since 2016/11/29
 */
public interface InsuranceApi {


    /**
     * 投保
     *
     * @param insurance 保险信息
     * @return string
     */
    String save(Insurance insurance);

    /**
     * 保险信息查询
     *
     * @param insuranceNo 保险编号
     * @return {@link Insurance}
     */
    Insurance queryByNo(String insuranceNo);
}

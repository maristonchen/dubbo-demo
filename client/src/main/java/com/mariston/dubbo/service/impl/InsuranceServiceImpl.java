package com.mariston.dubbo.service.impl;

import com.mariston.dubbo.api.InsuranceApi;
import com.mariston.dubbo.bean.Insurance;
import com.mariston.dubbo.service.InsuranceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *  保险业务实现
 *
 * @author mariston
 * @version V1.0
 * @since 2016/11/30
 */
@Service("insuranceService")
public class InsuranceServiceImpl implements InsuranceService {

    /**
     * 保险api
     */
    @Resource
    private InsuranceApi insuranceApi;


    /**
     * 保存保险信息
     *
     * @param insurance 保险信息
     * @return string
     */
    @Override
    public String save(Insurance insurance) {
        return insuranceApi.save(insurance);
    }

    /**
     * 查询保险信息
     *
     * @param insuranceNo 保险编号
     * @return {@link Insurance}
     */
    @Override
    public Insurance queryByNo(String insuranceNo) {
        return insuranceApi.queryByNo(insuranceNo);
    }
}

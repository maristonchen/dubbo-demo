package com.mariston.dubbo.realize;

import com.mariston.dubbo.api.InsuranceApi;
import com.mariston.dubbo.bean.Insurance;
import com.mariston.dubbo.cache.CacheApi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 保险业务实现
 *
 * @author mariston
 * @version V1.0
 * @since 2016/11/29
 */
@Service("insuranceApi")
public class InsuranceApiImpl implements InsuranceApi {

    /**
     * 容器API
     */
    @Resource
    private CacheApi cacheApi;

    /**
     * 投保
     *
     * @param insurance 保险信息
     * @return string
     */
    @Override
    public String save(Insurance insurance) {
        return cacheApi.put(insurance);
    }


    /**
     * 保险信息查询
     *
     * @param insuranceNo 保险编号
     * @return {@link Insurance}
     */
    @Override
    public Insurance queryByNo(String insuranceNo) {
        return cacheApi.get(insuranceNo);
    }
}

package com.mariston.dubbo.cache;

import com.mariston.dubbo.bean.Insurance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * (用一句话描述该文件做什么)
 *
 * @author mariston
 * @version V1.0
 * @since 2016/11/29
 */
@Service
public class CacheApi {

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(CacheApi.class);

    /**
     * 线程安全的容器
     */
    private final ThreadLocal<Map<String, Insurance>> insuranceMap = new ThreadLocal<Map<String, Insurance>>() {
        @Override
        protected Map<String, Insurance> initialValue() {
            return new HashMap<>();
        }
    };


    /**
     * 添加保险
     *
     * @param insurance 保险信息
     * @return string
     */
    public String put(Insurance insurance) {

        logger.info("===添加保险信息：\n{}", insurance);

        if (insurance != null) {
            this.insuranceMap.get().put(insurance.getInsuranceNo(), insurance);
        }
        return "操作成功";
    }

    /**
     * 查询保险
     *
     * @param insuranceNo 保险编号
     * @return {@link Insurance}
     */
    public Insurance get(String insuranceNo) {
        logger.info("===查询保险编号为：[{}]=====", insuranceNo);
        return this.insuranceMap.get().get(insuranceNo);
    }

    /**
     * 定时清理map
     * <p>Example patterns:
     * <ul>
     * <li>"0 0 * * * *" = the top of every hour of every day.</li>
     * <li>"*&#47;10 * * * * *" = every ten seconds.</li>
     * <li>"0 0 8-10 * * *" = 8, 9 and 10 o'clock of every day.</li>
     * <li>"0 0/30 8-10 * * *" = 8:00, 8:30, 9:00, 9:30 and 10 o'clock every day.</li>
     * <li>"0 0 9-17 * * MON-FRI" = on the hour nine-to-five weekdays</li>
     * <li>"0 0 0 25 12 ?" = every Christmas Day at midnight</li>
     * </ul>
     */
    @Scheduled(cron = "0 0 0/4 * * *")
    public void clear() {
        logger.info("======开始扫描========");

        insuranceMap.get().clear();
    }

}

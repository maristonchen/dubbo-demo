package com.mariston.dubbo.controller;

import com.alibaba.fastjson.JSON;
import com.mariston.dubbo.bean.Insurance;
import com.mariston.dubbo.service.InsuranceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 保险信息控制中心
 *
 * @author mariston
 * @version V1.0
 * @since 2016/11/30
 */
@Controller
@RequestMapping("/insurance")
public class InsuranceController {


    /**
     * 保险业务接口
     */
    @Resource
    private InsuranceService insuranceService;


    /**
     * 页面跳转
     *
     * @return string
     */
    @RequestMapping("/toPage")
    public String toPage() {
        return "insurance";
    }


    /**
     * 保存保险信息
     *
     * @param insurance 保险信息
     * @return string
     */
    @RequestMapping(value = "/save",produces = {"text/html;charset=utf-8"})
//    @ResponseBody
    public String save(Insurance insurance) {

        String success = insuranceService.save(insurance);

        return "操作成功".equals(success)?"success":"";
    }


    /**
     * 查询保险信息
     *
     * @param insuranceNo 保险编号
     * @return string
     */
    @RequestMapping(value = "/queryByNo",produces = {"text/html;charset=utf-8"})
    @ResponseBody
    public String queryByNo(String insuranceNo) {


        Insurance insurance = insuranceService.queryByNo(insuranceNo);

        return JSON.toJSONString(insurance);
    }

}

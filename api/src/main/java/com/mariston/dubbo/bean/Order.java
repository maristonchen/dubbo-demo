package com.mariston.dubbo.bean;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;
import java.util.List;

/**
 * 订单信息
 *
 * @author mariston
 * @version V1.0
 * @since 2016/12/26
 */
public class Order implements Serializable{

    private static final long serialVersionUID = 8567073028455684857L;
    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 订单信息
     */
    private String info;

    /**
     * 订单状态 0-申请中 1-未付款 2-已取消 3-已付款 4-退款申请中 5-已退款
     */
    private Integer status;

    /**
     * 订单金额
     */
    private String amount;

    /**
     * 联系人
     */
    private String linkman;

    /**
     * 联系电话
     */
    private String telephone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 乘客信息
     */
    private List<Passenger> passengers;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}

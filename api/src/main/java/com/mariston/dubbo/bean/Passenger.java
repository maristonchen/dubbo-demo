package com.mariston.dubbo.bean;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * 乘客信息
 *
 * @author mariston
 * @version V1.0
 * @since 2016/12/26
 */
public class Passenger implements Serializable{

    private static final long serialVersionUID = 1806214984875582753L;
    /**
     * 乘客编号
     */
    private String passNo;

    /**
     * 乘客名称
     */
    private String name;

    /**
     * 性别 0-女 1-男
     */
    private Integer sex;

    /**
     * 乘客类型：0-成人 1-儿童 2-婴儿
     */
    private Integer type;

    /**
     * 证件类型： 0-身份证 1-护照 2-台胞证 3-台胞通行证 4-港澳通行证
     */
    private Integer cardType;

    /**
     * 证件号
     */
    private String cardNo;


    public String getPassNo() {
        return passNo;
    }

    public void setPassNo(String passNo) {
        this.passNo = passNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}

package com.mariston.dubbo.bean;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * 保险信息
 *
 * @author mariston
 * @version V1.0
 * @since 2016/11/29
 */
public class Insurance implements Serializable{

    private static final long serialVersionUID = -2733991861242286729L;

    /**
     * 保险编号
     */
    private String insuranceNo;

    /**
     * 订单编号
     */
    private String ticketNo;

    /**
     * 航班号
     */
    private String flightNo;

    /**
     * 乘客名称
     */
    private String passName;

    /**
     * 乘客类型:1为成人 2为儿童 3为婴儿
     */
    private Integer passType;

    /**
     * 乘客证件类型 0-身份证 1-护照 2-其他
     */
    private Integer cardType;

    /**
     * 乘客证件号
     */
    private String cardCode;

    /**
     * 受益人名称
     */
    private String beneficiaryName;

    /**
     * 受益人证件类型 0-身份证 1-护照 2-其他
     */
    private Integer beneficiaryCardType;

    /**
     * 受益人证件号
     */
    private String beneficiaryCardCode;

    /**
     * 受益金额
     */
    private String benefitAmount;

    /**
     * 保险产品代码
     */
    private String insuranceCode;

    /**
     * 保险产品单价
     */
    private String price;

    /**
     * 保险数量
     */
    private Integer num;

    /**
     * 保障起始时间 yyyy-MM-dd
     */
    private String startDate;

    /**
     * 保障结束时间 yyyy-MM-dd
     */
    private String endDate;

    /**
     * 保障天数
     */
    private Integer days;

    /**
     * 保险状态：0-正常 1-取消
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 备用字段
     */
    private String reserve;

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getPassName() {
        return passName;
    }

    public void setPassName(String passName) {
        this.passName = passName;
    }

    public Integer getPassType() {
        return passType;
    }

    public void setPassType(Integer passType) {
        this.passType = passType;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public Integer getBeneficiaryCardType() {
        return beneficiaryCardType;
    }

    public void setBeneficiaryCardType(Integer beneficiaryCardType) {
        this.beneficiaryCardType = beneficiaryCardType;
    }

    public String getBeneficiaryCardCode() {
        return beneficiaryCardCode;
    }

    public void setBeneficiaryCardCode(String beneficiaryCardCode) {
        this.beneficiaryCardCode = beneficiaryCardCode;
    }

    public String getBenefitAmount() {
        return benefitAmount;
    }

    public void setBenefitAmount(String benefitAmount) {
        this.benefitAmount = benefitAmount;
    }

    public String getInsuranceCode() {
        return insuranceCode;
    }

    public void setInsuranceCode(String insuranceCode) {
        this.insuranceCode = insuranceCode;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}

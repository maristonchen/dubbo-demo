package com.mariston.dubbo.enumtype;

/**
 * 订单状态 0-申请中 1-未付款 2-已取消 3-已付款 4-退款申请中 5-已退款
 *
 * @author mariston
 * @version V1.0
 * @since 2016/12/26
 */
public enum OrderStatus {
    PENDING,
    NON_PAYMENT,
    CANCEL,
    PAID,
    REFUNDING,
    REFUNDED
}

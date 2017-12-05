package com.temsoft.oms.order.service;

import com.temsoft.oms.order.exception.OrdersSaveUpdateException;
import com.temsoft.oms.order.model.OrderGoods;
import com.temsoft.oms.order.model.Orders;
import com.temsoft.oms.order.model.OrdersRefund;

/**
 * 订单取消、退款接口
 *
 * @author KisChang
 * @version 1.0
 */
public interface OrdersRefundService {

    /**
     * 取消订单
     */
    Orders canalOrders(Orders orders) throws OrdersSaveUpdateException;

    /**
     * 订单申请退款
     * @param orders    订单信息
     * @param ogId      订单内商品ID，可为空。为空时整个订单申请，不为空时，单张票申请退款
     */
    Orders applyRefundOrder(Orders orders, Long ogId) throws OrdersSaveUpdateException;

    /**单个商品允许退款*/
    OrderGoods canRefund(OrderGoods orderGoods) throws OrdersSaveUpdateException;

    /**退款到支付宝记录创建*/
    OrdersRefund refundToAli(OrderGoods orderGoods) throws OrdersSaveUpdateException;

    /**退款到支付宝成功*/
    OrdersRefund refundToAliOk(long refundId, String resultDetails) throws OrdersSaveUpdateException;

    /**单张票退款（直接退款到用户账户）*/
    OrderGoods refundToSite(OrderGoods orderGoods) throws OrdersSaveUpdateException;

    /**单张票驳回退款申请*/
    OrderGoods refundReject(OrderGoods orderGoods, String msg) throws OrdersSaveUpdateException;

    OrdersRefund findByBatchNo(String refundBatchNo);
}

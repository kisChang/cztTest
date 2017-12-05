package com.temsoft.oms.order.service.impl;

import com.temsoft.oms.commons.annotation.TxExceptionRoll;
import com.temsoft.oms.commons.annotation.TxReadonly;
import com.temsoft.oms.order.exception.OrdersSaveUpdateException;
import com.temsoft.oms.order.model.OrderGoods;
import com.temsoft.oms.order.model.Orders;
import com.temsoft.oms.order.model.OrdersRefund;
import com.temsoft.oms.order.service.OrderCreateService;
import com.temsoft.oms.order.service.OrderOptService;
import com.temsoft.oms.order.service.OrdersMngService;
import com.temsoft.oms.order.service.OrdersRefundService;

import javax.annotation.Resource;

/**
 * 订单取消、退款接口实现
 *
 * @author KisChang
 * @version 1.0
 */
@com.alibaba.dubbo.config.annotation.Service(version = "1.0.0", interfaceName = "com.temsoft.oms.order.service.OrdersRefundService")
public class OrdersRefundServiceImpl implements OrdersRefundService {


    @Resource
    private OrdersMngService ordersMngService;
    @Resource
    private OrderOptService orderOptService;
    @Resource
    private OrderCreateService orderCreateService;

    @Override
    @TxExceptionRoll
    public Orders canalOrders(Orders orders) throws OrdersSaveUpdateException {
        throw new RuntimeException("123");
    }


    @Override
    @TxExceptionRoll
    public Orders applyRefundOrder(Orders param, Long ogId) throws OrdersSaveUpdateException {
        throw new RuntimeException("123");
    }

    @Override
    @TxExceptionRoll
    public OrderGoods canRefund(OrderGoods orderGoods) throws OrdersSaveUpdateException {
        throw new RuntimeException("123");
    }

    @Override
    @TxExceptionRoll
    public OrdersRefund refundToAli(OrderGoods orderGoods) throws OrdersSaveUpdateException {
        throw new RuntimeException("123");
    }

    @Override
    @TxExceptionRoll
    public OrdersRefund refundToAliOk(long refundId, String resultDetails) throws OrdersSaveUpdateException {
        throw new RuntimeException("123");
    }

    @Override
    @TxExceptionRoll
    public OrderGoods refundToSite(OrderGoods orderGoods) throws OrdersSaveUpdateException {
        throw new RuntimeException("123");
    }

    @Override
    @TxExceptionRoll
    public OrderGoods refundReject(OrderGoods orderGoods, String msg) throws OrdersSaveUpdateException {
        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public OrdersRefund findByBatchNo(String refundBatchNo) {
        throw new RuntimeException("123");
    }

}

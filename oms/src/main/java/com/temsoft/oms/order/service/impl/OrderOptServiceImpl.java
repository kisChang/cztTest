package com.temsoft.oms.order.service.impl;

import com.temsoft.oms.commons.annotation.TxExceptionRoll;
import com.temsoft.oms.order.exception.OrdersSaveUpdateException;
import com.temsoft.oms.order.model.OrderGoods;
import com.temsoft.oms.order.model.OrderGoodsLog;
import com.temsoft.oms.order.model.Orders;
import com.temsoft.oms.order.service.OrderCreateService;
import com.temsoft.oms.order.service.OrderOptService;
import com.temsoft.oms.order.service.OrdersRefundService;

import javax.annotation.Resource;

/**
 * @author KisChang
 * @version 1.0
 */
@com.alibaba.dubbo.config.annotation.Service(version = "1.0.0", interfaceName = "com.temsoft.oms.order.service.OrderOptService")
public class OrderOptServiceImpl implements OrderOptService {

    @Resource
    private OrdersRefundService ordersRefundService;
    @Resource
    private OrderCreateService ordersCreateService;

    @Override
    @TxExceptionRoll
    public OrderGoods faHuoGoods(OrderGoods orderGoods) throws OrdersSaveUpdateException {
        throw new RuntimeException("Error...");
    }

    @Override
    @TxExceptionRoll
    public OrderGoods faHuoGoods(OrderGoods orderGoods, OrderGoodsLog log) throws OrdersSaveUpdateException {
        throw new RuntimeException("Error...");
    }

    /**
     * 检测订单状态
     */
    @Override
    @TxExceptionRoll
    public void checkOrderStat(long orderId) throws OrdersSaveUpdateException {
        throw new RuntimeException("Error...");
    }


    @Override
    @TxExceptionRoll
    public Orders checkWxOrderStat(Orders orders) throws OrdersSaveUpdateException {
        throw new RuntimeException("Error...");
    }


}

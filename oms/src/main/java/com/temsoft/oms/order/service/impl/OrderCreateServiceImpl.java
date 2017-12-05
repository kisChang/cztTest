package com.temsoft.oms.order.service.impl;

import com.temsoft.oms.commons.annotation.TxExceptionRoll;
import com.temsoft.oms.order.exception.OrdersSaveUpdateException;
import com.temsoft.oms.order.formbean.SubOrderInfo;
import com.temsoft.oms.order.model.Orders;
import com.temsoft.oms.order.service.OrderCreateService;
import com.temsoft.oms.order.service.OrdersMngService;
import com.temsoft.oms.order.service.OrdersRefundService;

import javax.annotation.Resource;

/**
 * @author KisChang
 * @version 1.0
 */
@com.alibaba.dubbo.config.annotation.Service(version = "1.0.0", interfaceName = "com.temsoft.oms.order.service.OrderCreateService")
public class OrderCreateServiceImpl implements OrderCreateService {


    @Resource
    private OrdersMngService ordersMngService;
    @Resource
    private OrdersRefundService ordersRefundService;

    @Override
    @TxExceptionRoll
    public Orders save(Orders orders) throws OrdersSaveUpdateException {
        throw new RuntimeException("123");
    }

    @Override
    @TxExceptionRoll
    public Orders save(SubOrderInfo subOrderInfo) throws OrdersSaveUpdateException {
        throw new RuntimeException("123");
    }

    @Override
    @TxExceptionRoll
    public Orders update(Orders orders) throws OrdersSaveUpdateException{
        throw new RuntimeException("123");
    }

    @Override
    @TxExceptionRoll
    public Orders payOrders(Orders orders) throws OrdersSaveUpdateException {
        throw new RuntimeException("123");
    }


}

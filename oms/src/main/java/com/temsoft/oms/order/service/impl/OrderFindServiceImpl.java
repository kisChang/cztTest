package com.temsoft.oms.order.service.impl;

import com.temsoft.oms.commons.annotation.TxReadonly;
import com.temsoft.oms.commons.enums.Removed;
import com.temsoft.oms.order.enums.OrderStat;
import com.temsoft.oms.order.model.OrderGoods;
import com.temsoft.oms.order.model.Orders;
import com.temsoft.oms.order.service.OrderFindService;

import java.util.Date;
import java.util.List;

/**
 * @author KisChang
 * @version 1.0
 */
@com.alibaba.dubbo.config.annotation.Service(version = "1.0.0", interfaceName = "com.temsoft.oms.order.service.OrderFindService")
public class OrderFindServiceImpl implements OrderFindService {

    @Override
    @TxReadonly
    public List<Orders> findAll(OrderStat orderStat, Removed removed) {
        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public List<OrderGoods> findByCarrierAdminId(long uId, OrderStat orderStat, Date start, Date end, String goodsName, Removed removed) {

        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public List<OrderGoods> findByCoId(long coId, OrderStat orderStat, Date start, Date end, String goodsName, Removed removed) {

        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public List<OrderGoods> findByMerchantAdminId(long uId, OrderStat orderStat, Date start, Date end, String goodsName, Removed removed) {

        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public List<OrderGoods> findByMerchantId(long merchantId, OrderStat orderStat, Date start, Date end, String goodsName, Removed removed) {

        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public OrderGoods findOrderGoodsById(long oId, long orderId) {
        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public OrderGoods findOrderGoodsById(long oId) {
        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public List<Orders> findBySalesmanId(long salesmanId, Removed removed, OrderStat orderStat, Date start, Date end, boolean lazy) {

        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public List<OrderGoods> findByStudentId(long student, Removed removed) {

        throw new RuntimeException("123");
    }
    @Override
    @TxReadonly
    public List<Orders> findStartId(long startId, int onceSize) {
        throw new RuntimeException("123");
    }

}

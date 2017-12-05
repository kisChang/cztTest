package com.temsoft.oms.order.service.impl;

import com.temsoft.oms.commons.annotation.TxExceptionRoll;
import com.temsoft.oms.commons.annotation.TxReadonly;
import com.temsoft.oms.commons.enums.Removed;
import com.temsoft.oms.order.enums.OrderStat;
import com.temsoft.oms.order.exception.OrdersSaveUpdateException;
import com.temsoft.oms.order.model.OrderGoods;
import com.temsoft.oms.order.model.OrderGoodsLog;
import com.temsoft.oms.order.model.Orders;
import com.temsoft.oms.order.service.OrdersMngService;

import java.util.List;

/**
 * 订单服务接口实现
 *
 * @author KisChang
 * @version 1.0
 */
@com.alibaba.dubbo.config.annotation.Service(version = "1.0.0", interfaceName = "com.temsoft.oms.order.service.OrdersMngService")
public class OrdersMngServiceImpl implements OrdersMngService {


    @Override
    @TxExceptionRoll
    public Orders updateBase(Orders orders) throws OrdersSaveUpdateException {
        throw new RuntimeException("123");
    }


    @Override
    @TxExceptionRoll
    public OrderGoods updateOrderGoods(OrderGoods orderGoods, String msg) throws OrdersSaveUpdateException {
        orderGoods.getStat();
        return this.updateOrderGoods(orderGoods, msg, true);
    }

    @Override
    @TxExceptionRoll
    public OrderGoods updateOrderGoods(OrderGoods orderGoods, String msg, boolean checkStats) throws OrdersSaveUpdateException {

        throw new RuntimeException("123");
    }

    @Override
    @TxExceptionRoll
    public OrderGoods updateOrderGoodsLog(OrderGoods orderGoods, OrderGoodsLog log) throws OrdersSaveUpdateException {
        return this.updateOrderGoodsLog(orderGoods, log, true);
    }

    @Override
    @TxExceptionRoll
    public OrderGoods updateOrderGoodsLog(OrderGoods orderGoods, OrderGoodsLog log, boolean checkStats) throws OrdersSaveUpdateException {

        throw new RuntimeException("123");
    }

    @Override
    @TxExceptionRoll
    public Orders faGoodsByMerchant(long orderId, long merchantId) throws OrdersSaveUpdateException {
        throw new RuntimeException("123");
    }


    @Override
    @TxExceptionRoll
    public Orders deleteById(long id, Removed removed) throws OrdersSaveUpdateException {

        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public Orders findById(long id, boolean lazy) {

        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public Orders findByOrderNo(Long saleId, String orderNo, boolean lazy) {

        throw new RuntimeException("123");
    }


    @Override
    @TxExceptionRoll
    public long deleteByPlaceOrderUserId(long uId, Removed removed) throws OrdersSaveUpdateException {

        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public List<Orders> findByPlaceOrderUserId(long uId, Boolean type, OrderStat stat, Removed removed, boolean lazy) {

        throw new RuntimeException("123");
    }

    /**
     *  消费者订单统计
     * @param noRm      非该移除状态
     * @param statType  状态查询方式 true 不等于该状态  false 等于该状态
     * @param noStat    状态列表
     */
    @Override
    @TxReadonly
    public long countByPlaceOrderUserId(long uId, Boolean type, Removed noRm, boolean statType, OrderStat... noStat) {
        throw new RuntimeException("123");
    }

}

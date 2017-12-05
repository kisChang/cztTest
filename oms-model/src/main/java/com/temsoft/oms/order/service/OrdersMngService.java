package com.temsoft.oms.order.service;

import com.temsoft.oms.commons.enums.Removed;
import com.temsoft.oms.order.enums.OrderStat;
import com.temsoft.oms.order.exception.OrdersSaveUpdateException;
import com.temsoft.oms.order.model.OrderGoods;
import com.temsoft.oms.order.model.OrderGoodsLog;
import com.temsoft.oms.order.model.Orders;

import java.util.List;

/**
 * 订单服务接口
 *
 * @author KisChang
 * @version 1.0
 */
public interface OrdersMngService {


    Orders updateBase(Orders orders) throws OrdersSaveUpdateException;

    OrderGoods updateOrderGoods(OrderGoods orderGoods, String msg) throws OrdersSaveUpdateException;

    OrderGoods updateOrderGoods(OrderGoods orderGoods, String msg, boolean checkStats) throws OrdersSaveUpdateException;

    OrderGoods updateOrderGoodsLog(OrderGoods orderGoods, OrderGoodsLog log) throws OrdersSaveUpdateException;

    OrderGoods updateOrderGoodsLog(OrderGoods orderGoods, OrderGoodsLog log, boolean checkStats) throws OrdersSaveUpdateException;

    Orders faGoodsByMerchant(long orderId, long merchantId) throws OrdersSaveUpdateException;

    Orders deleteById(long id, Removed removed) throws OrdersSaveUpdateException;

    Orders findById(long id, boolean lazy);

    Orders findByOrderNo(Long saleId, String orderNo, boolean lazy);


    long deleteByPlaceOrderUserId(long uId, Removed removed) throws OrdersSaveUpdateException;

    List<Orders> findByPlaceOrderUserId(long uId, Boolean type, OrderStat stat, Removed removed,  boolean lazy);

    long countByPlaceOrderUserId(long uId, Boolean type, Removed noRm, boolean statType, OrderStat... noStat);

}

package com.temsoft.oms.order.service;

import com.temsoft.oms.commons.enums.Removed;
import com.temsoft.oms.order.enums.OrderStat;
import com.temsoft.oms.order.model.OrderGoods;
import com.temsoft.oms.order.model.Orders;

import java.util.Date;
import java.util.List;

/**
 * @author KisChang
 * @version 1.0
 */
public interface OrderFindService {

    List<Orders> findAll(OrderStat orderStat, Removed removed);

    /**
     * 根据运营商获取订单列表
     * @param uId   运营商管理员ID
     */
    List<OrderGoods> findByCarrierAdminId(long uId, OrderStat orderStat, Date start, Date end, String goodsName, Removed removed);

    /**
     * 根据运营商获取订单列表
     * @param coId  运营商ID
     */
    List<OrderGoods> findByCoId(long coId, OrderStat orderStat, Date start, Date end, String goodsName, Removed removed);

    /**
     * 根据商户获取订单列表
     * @param uId   商户管理员ID
     */
    List<OrderGoods> findByMerchantAdminId(long uId, OrderStat orderStat, Date start, Date end, String goodsName, Removed removed);

    /**
     * 根据商户获取订单列表
     * @param merchantId    商户ID
     */
    List<OrderGoods> findByMerchantId(long merchantId, OrderStat orderStat, Date start, Date end, String goodsName, Removed removed);

    OrderGoods findOrderGoodsById(long oId, long orderId);

    OrderGoods findOrderGoodsById(long oId);


    List<Orders> findBySalesmanId(long salesmanId, Removed removed, OrderStat orderStat, Date start, Date end, boolean lazy);

    List<OrderGoods> findByStudentId(long student, Removed removed);

    List<Orders> findStartId(long startId, int onceSize);

}

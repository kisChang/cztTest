package com.temsoft.oms.order.service;

import com.temsoft.oms.order.exception.OrdersSaveUpdateException;
import com.temsoft.oms.order.model.OrderGoods;
import com.temsoft.oms.order.model.OrderGoodsLog;
import com.temsoft.oms.order.model.Orders;

/**
 * @author KisChang
 * @version 1.0
 */
public interface OrderOptService {

    //发货单个商品
    OrderGoods faHuoGoods(OrderGoods orderGoods) throws OrdersSaveUpdateException;

    OrderGoods faHuoGoods(OrderGoods orderGoods, OrderGoodsLog log) throws OrdersSaveUpdateException;

    /**
     * 检测微信未支付订单的服务器状态
     */
    Orders checkWxOrderStat(Orders orders) throws OrdersSaveUpdateException;

    void checkOrderStat(long orderId) throws OrdersSaveUpdateException;

}

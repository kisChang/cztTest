package com.temsoft.oms.order.service;

import com.temsoft.oms.order.exception.OrdersSaveUpdateException;
import com.temsoft.oms.order.formbean.SubOrderInfo;
import com.temsoft.oms.order.model.Orders;

/**
 * @author KisChang
 * @version 1.0
 */
public interface OrderCreateService {


    /**
     * 仅仅执行存储操作
     * @param orders    订单信息
     * @return  存储后的订单信息
     */
    Orders save(Orders orders) throws OrdersSaveUpdateException;

    /**
     * 根据网页提交的订单信息，生成可存储的订单信息，并存储返回
     * 支持：购课积分分配、充值卡金额分配
     * @param subOrderInfo  网页提交的订单信息
     * @return  订单信息
     */
    Orders save(SubOrderInfo subOrderInfo) throws OrdersSaveUpdateException;


    Orders update(Orders orders) throws OrdersSaveUpdateException;

    /**
     * 订单支付方法
     * @param orders    订单实体类
     */
    Orders payOrders(Orders orders) throws OrdersSaveUpdateException;

}

package com.temsoft.oms.order.service;

import com.temsoft.oms.order.enums.BillType;
import com.temsoft.oms.order.enums.OrderStat;
import com.temsoft.oms.order.exception.OrdersSaveUpdateException;
import com.temsoft.oms.order.formbean.SettleReportRow;
import com.temsoft.oms.order.model.OrderGoods;
import com.temsoft.oms.order.model.SettlementBill;
import com.temsoft.oms.order.model.SettlementBillLog;

import java.util.Date;
import java.util.List;

/**
 * @author KisChang
 * @version 1.0
 */
public interface OrderBillService {

    /**********结算功能**********/
    List<OrderGoods> findByMerchantIdAndOut(long merchantId, Boolean settleState, Boolean cashState, Date outStart, Date outEnd);

    List<SettleReportRow> findGroupByMerchantIdAndOut(long merchantId, Boolean settleState, Boolean cashState, Date outStart, Date outEnd);

    long countByMerchantIdAndOut(long merchantId, Boolean settleState, Boolean cashState, Date outStart, Date outEnd);

    /**
     * 提现账单生成
     * @param merchantId    商户ID
     */
    SettlementBill settleCashBill(long merchantId, Date outStart, Date outEnd, SettlementBill cashBill, SettlementBillLog log) throws OrdersSaveUpdateException;

    /**
     * 结算账单数据更新
     */
    SettlementBill settlementBill(long merchantId, Boolean settleState, Boolean cashState, Date outStart, Date outEnd, SettlementBill settleBill) throws OrdersSaveUpdateException;

    /**
     * 单个商品订单结算
     * @param orderGoods    订单信息
     * @param bill          账单信息
     */
    OrderGoods settleOrderGoods(OrderGoods orderGoods, SettlementBill bill) throws OrdersSaveUpdateException;

    /**********报表功能**********/
    List<OrderGoods> findByBillId(long billId, BillType billType);

    List<SettleReportRow> findReportByBillId(long billId, BillType billType);

    List<OrderGoods> findByActId(long actId, OrderStat orderStat);

}

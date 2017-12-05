package com.temsoft.oms.order.service.impl;

import com.temsoft.oms.commons.annotation.TxExceptionRoll;
import com.temsoft.oms.commons.annotation.TxReadonly;
import com.temsoft.oms.commons.exception.ObjectPersistenceException;
import com.temsoft.oms.order.enums.BillType;
import com.temsoft.oms.order.enums.OrderStat;
import com.temsoft.oms.order.exception.OrdersSaveUpdateException;
import com.temsoft.oms.order.formbean.SettleReportRow;
import com.temsoft.oms.order.model.OrderGoods;
import com.temsoft.oms.order.model.SettlementBill;
import com.temsoft.oms.order.model.SettlementBillLog;
import com.temsoft.oms.order.service.OrderBillService;
import com.temsoft.oms.order.service.OrdersMngService;
import com.temsoft.oms.order.service.SettlementBillService;
import com.temsoft.oms.order.service.SettlementRuleService;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author KisChang
 * @version 1.0
 */
@com.alibaba.dubbo.config.annotation.Service(version = "1.0.0", interfaceName = "com.temsoft.oms.order.service.OrderBillService")
public class OrderBillServiceImpl implements OrderBillService {

    @Resource
    private SettlementBillService settlementBillService;
    @Resource
    private SettlementRuleService settlementRuleService;
    @Resource
    private OrdersMngService ordersMngService;

    /**************结算实现******************/
    @Override
    @TxReadonly
    public List<OrderGoods> findByMerchantIdAndOut(long merchantId, Boolean settleState, Boolean cashState, Date outStart, Date outEnd) {
        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public List<SettleReportRow> findGroupByMerchantIdAndOut(long merchantId, Boolean settleState, Boolean cashState, Date outStart, Date outEnd) {
        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public long countByMerchantIdAndOut(long merchantId, Boolean settleState, Boolean cashState, Date outStart, Date outEnd) {
        throw new RuntimeException("123");
    }

    @Override
    @TxExceptionRoll
    public SettlementBill settleCashBill(long merchantId, Date outStart, Date outEnd, SettlementBill cashBill, SettlementBillLog log) throws OrdersSaveUpdateException {

        throw new RuntimeException("123");
    }

    @Override
    @TxExceptionRoll
    public SettlementBill settlementBill(long merchantId, Boolean settleState,  Boolean cashState,  Date outStart,  Date outEnd, SettlementBill settleBill) throws OrdersSaveUpdateException {
        throw new RuntimeException("Error...");
    }


    @Override
    @TxExceptionRoll
    public OrderGoods settleOrderGoods(OrderGoods orderGoods, SettlementBill bill) throws OrdersSaveUpdateException {
        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public List<OrderGoods> findByBillId(long billId, BillType billType) {
        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public List<SettleReportRow> findReportByBillId(long billId, BillType billType) {
        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public List<OrderGoods> findByActId(long actId, OrderStat orderStat) {
        throw new RuntimeException("123");
    }


}

package com.temsoft.oms.order.service.impl;

import com.temsoft.oms.commons.annotation.TxExceptionRoll;
import com.temsoft.oms.commons.annotation.TxReadonly;
import com.temsoft.oms.commons.exception.ObjectPersistenceException;
import com.temsoft.oms.order.enums.BillGenType;
import com.temsoft.oms.order.enums.BillState;
import com.temsoft.oms.order.enums.BillType;
import com.temsoft.oms.order.model.SettlementBill;
import com.temsoft.oms.order.model.SettlementBillLog;
import com.temsoft.oms.order.service.SettlementBillService;

import java.util.List;

/**
 * 结算账单  服务接口 实现
 *
 * @author KisChang
 * @version 1.0
 */
@com.alibaba.dubbo.config.annotation.Service(version = "1.0.0", interfaceName = "com.temsoft.oms.order.service.SettlementBillService")
public class SettlementBillServiceImpl implements SettlementBillService {



    @Override
    @TxExceptionRoll
    public SettlementBill save(SettlementBill sBill, SettlementBillLog log) throws ObjectPersistenceException {
        throw new RuntimeException("123");
    }

    @Override
    @TxExceptionRoll
    public SettlementBill update(SettlementBill sBill, SettlementBillLog log) throws ObjectPersistenceException {

        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public SettlementBill findById(long id, boolean loadLog) {

        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public List<SettlementBill> findByMerchantId(long mId, String month, BillType type, BillGenType genType, BillState state, boolean loadLog) {

        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public long cashBillCount(Long mId, BillState... states) {

        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public long settleCount(Long mId, BillState... states) {
        throw new RuntimeException("123");
    }

}

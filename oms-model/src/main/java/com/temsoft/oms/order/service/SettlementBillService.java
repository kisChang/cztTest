package com.temsoft.oms.order.service;

import com.temsoft.oms.commons.exception.ObjectPersistenceException;
import com.temsoft.oms.order.enums.BillGenType;
import com.temsoft.oms.order.enums.BillState;
import com.temsoft.oms.order.enums.BillType;
import com.temsoft.oms.order.model.SettlementBill;
import com.temsoft.oms.order.model.SettlementBillLog;

import java.util.List;

/**
 * 结算账单  服务接口
 *
 * @author KisChang
 * @version 1.0
 */
public interface SettlementBillService {

    SettlementBill save(SettlementBill sBill, SettlementBillLog log) throws ObjectPersistenceException;

    SettlementBill update(SettlementBill sBill, SettlementBillLog log) throws ObjectPersistenceException;

    SettlementBill findById(long id, boolean loadLog);

    List<SettlementBill> findByMerchantId(long mId, String month, BillType type, BillGenType genType, BillState state,  boolean loadLog);

    //提现账单统计
    long cashBillCount(Long mId, BillState... states);

    //结算账单
    long settleCount(Long mId, BillState... states);

}

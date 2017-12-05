package com.temsoft.oms.order.service.impl;

import com.temsoft.oms.commons.annotation.TxExceptionRoll;
import com.temsoft.oms.commons.annotation.TxReadonly;
import com.temsoft.oms.order.model.SettlementRule;
import com.temsoft.oms.order.service.SettlementRuleService;

import java.util.List;

/**
 * 结算规则  操作接口实现
 *
 * @author KisChang
 * @version 1.0
 */
@com.alibaba.dubbo.config.annotation.Service(version = "1.0.0", interfaceName = "com.temsoft.oms.order.service.SettlementRuleService")
public class SettlementRuleServiceImpl implements SettlementRuleService {

    @Override
    @TxExceptionRoll
    public SettlementRule save(SettlementRule rule) {
        throw new RuntimeException("123");
    }

    @Override
    @TxExceptionRoll
    public SettlementRule update(SettlementRule rule) {
        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public SettlementRule findById(long id) {
        throw new RuntimeException("123");
    }

    @Override
    @TxReadonly
    public List<SettlementRule> findAll() {
        throw new RuntimeException("123");
    }

}

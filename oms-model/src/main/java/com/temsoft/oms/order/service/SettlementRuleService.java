package com.temsoft.oms.order.service;

import com.temsoft.oms.order.model.SettlementRule;

import java.util.List;

/**
 * 结算规则  操作接口
 *
 * @author KisChang
 * @version 1.0
 */
public interface SettlementRuleService {

    SettlementRule save(SettlementRule rule);

    SettlementRule update(SettlementRule rule);

    SettlementRule findById(long id);

    List<SettlementRule> findAll();

}

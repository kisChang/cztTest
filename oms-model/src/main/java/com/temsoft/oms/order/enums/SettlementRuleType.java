package com.temsoft.oms.order.enums;

/**
 * 结算规则
 *
 * @author KisChang
 * @version 1.0
 */
public enum SettlementRuleType implements java.io.Serializable{

    None(SettlementRuleType.None_Val, "不抽取金额")
    ,CutPrice(SettlementRuleType.CutPrice_Val, "单笔指定金额")
    ,Rebate(SettlementRuleType.Rebate_Val, "按比例")
    ;

    public static final int None_Val    = 0;
    public static final int CutPrice_Val= 1;
    public static final int Rebate_Val  = 2;

    private int value;
    private String name;

    SettlementRuleType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static SettlementRuleType valueOf(int value){
        switch (value){
            case None_Val:
                return None;
            case CutPrice_Val:
                return CutPrice;
            case Rebate_Val:
                return Rebate;

            default:
                return None;
        }
    }

}

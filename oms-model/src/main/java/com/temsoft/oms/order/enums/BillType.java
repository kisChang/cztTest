package com.temsoft.oms.order.enums;

/**
 * 账单类型
 *
 * @author KisChang
 * @version 1.0
 */
public enum BillType implements java.io.Serializable {

     WithdrawCash(BillType.WithdrawCash_Val, "提现")
    ,SettleOrder(BillType.SettleOrder_Val, "结算")
    ;

    public static final int WithdrawCash_Val = 0;
    public static final int SettleOrder_Val  = 1;

    private int value;
    private String name;

    BillType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static BillType valueOf(int value){
        switch (value){
            case WithdrawCash_Val:
                return WithdrawCash;
            case SettleOrder_Val:
                return SettleOrder;

            default:
                return WithdrawCash;
        }
    }

}

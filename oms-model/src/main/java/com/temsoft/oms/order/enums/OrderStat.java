package com.temsoft.oms.order.enums;

/**
 * 订单状态
 *
 * @author KisChang
 * @version 1.0
 * @date 2015年10月28日
 * @since 1.0
 */
public enum  OrderStat implements java.io.Serializable {

    WaitPay(OrderStat.WaitPay_Val, "等待支付")
    ,WaitFaGoods(OrderStat.WaitFaGoods_Val, "已支付")
    ,WaitShouGoods(OrderStat.WaitShouGoods_Val, "等待用户确认")
    ,ConfirmShouGoods(OrderStat.ConfirmShouGoods_Val, "用户已签收")
    ,WaitEvaluate(OrderStat.WaitEvaluate_Val, "待评价")
    ,End(OrderStat.End_Val, "已结束")
    ,Canal(OrderStat.Canal_Val, "已取消")
    ,RefundApply(OrderStat.RefundApply_Val, "退款中")
    ,CanRefund(OrderStat.CanRefund_Val, "可退款")
    ,RefundOk(OrderStat.RefundOk_Val, "已退款")
    ,RefundBack(OrderStat.RefundBack_Val, "退款申请被驳回")
    ;

    public static final int WaitPay_Val             = 0;
    public static final int WaitFaGoods_Val         = 1;
    public static final int WaitShouGoods_Val       = 2;
    public static final int ConfirmShouGoods_Val    = 3;
    public static final int WaitEvaluate_Val        = 4;
    public static final int End_Val                 = 5;
    public static final int Canal_Val               = 6;
    public static final int RefundApply_Val         = 7;
    public static final int CanRefund_Val           = 8;
    public static final int RefundOk_Val            = 9;
    public static final int RefundBack_Val          = 10;

    private int value;
    private String name;

    OrderStat(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static OrderStat valueOf(int value){
        switch (value){
            case WaitPay_Val:
                return WaitPay;
            case WaitFaGoods_Val:
                return WaitFaGoods;
            case WaitShouGoods_Val:
                return WaitShouGoods;
            case ConfirmShouGoods_Val:
                return ConfirmShouGoods;
            case WaitEvaluate_Val:
                return WaitEvaluate;
            case End_Val:
                return End;
            case Canal_Val:
                return Canal;
            case RefundApply_Val:
                return RefundApply;
            case CanRefund_Val:
                return CanRefund;
            case RefundOk_Val:
                return RefundOk;
            case RefundBack_Val:
                return RefundBack;

            default:
                return WaitPay;
        }
    }

    public static OrderStat defaultVal() {
        return WaitPay;
    }
}

package com.temsoft.oms.order.enums;

/**
 * 用户购买的票变动日志  类型
 *
 * @author KisChang
 * @version 1.0
 * @date 2016年01月20日
 * @since 1.0
 */
public enum OrderGoodsLogType implements java.io.Serializable {

     Buy(OrderGoodsLogType.Buy_Val, "购买")
    ,BuyFail(OrderGoodsLogType.BuyFail_Val, "购买失败")
    ,GoodsFa(OrderGoodsLogType.GoodsFa_Val, "发货")
    ,Confirm(OrderGoodsLogType.Confirm_Val, "确认收货")
    ,RefundApply(OrderGoodsLogType.RefundApply_Val, "申请退款")
    ,RefundOk(OrderGoodsLogType.RefundOk_Val, "退款成功")
    ,RefundFail(OrderGoodsLogType.RefundFail_Val, "退款失败")
    ,Log(OrderGoodsLogType.Log_Val, "订单操作")
    ;

    public static final int Buy_Val         = 0;
    public static final int BuyFail_Val     = 1;
    public static final int GoodsFa_Val     = 2;
    public static final int Confirm_Val     = 3;
    public static final int RefundApply_Val = 4;
    public static final int RefundOk_Val    = 5;
    public static final int RefundFail_Val  = 6;
    public static final int Log_Val         = 7;

    private int value;
    private String name;

    OrderGoodsLogType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static OrderGoodsLogType valueOf(int value){
        switch (value){
            case Buy_Val:
                return Buy;
            case BuyFail_Val:
                return BuyFail;
            case GoodsFa_Val:
                return GoodsFa;
            case Confirm_Val:
                return Confirm;
            case RefundApply_Val:
                return RefundApply;
            case RefundOk_Val:
                return RefundOk;
            case RefundFail_Val:
                return RefundFail;
            default:
                return Buy;
        }
    }

}

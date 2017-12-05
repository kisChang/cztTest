package com.temsoft.oms.order.enums;

/**
 * 账单状态
 *
 * @author KisChang
 * @version 1.0
 */
public enum BillState implements java.io.Serializable{

     None(BillState.None_Val, "未出账")                                 //瞬时数据
    ,BillOut(BillState.BillOut_Val, "出账")                            //该状态的账单可以重新生成
    ,MerchantRejected(BillState.MerchantRejected_Val, "商家驳回")       //商家驳回账单
    ,MerchantConfirm(BillState.MerchantConfirm_Val, "商家确认")         //商家确认账单
    ,FinanceRejected(BillState.FinanceRejected_Val, "财务驳回")         //财务驳回账单（驳回的账单需要商家重新确认）
    ,FinanceForward(BillState.FinanceForward_Val, "财务转账")           //财务转账
    ,MerchantNotReceive(BillState.MerchantNotReceive_Val,"商户未接收")   //商户未接收（需财务重新校验转账）
    ,End(BillState.End_Val, "结束")                                     //结束
    ;

    public static final int None_Val                = 0;
    public static final int BillOut_Val             = 1;
    public static final int MerchantRejected_Val    = 2;
    public static final int MerchantConfirm_Val     = 3;
    public static final int FinanceRejected_Val     = 4;
    public static final int FinanceForward_Val      = 5;
    public static final int MerchantNotReceive_Val  = 6;
    public static final int End_Val                 = 7;

    private int value;
    private String name;

    BillState(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static BillState valueOf(int value){
        switch (value){
            case None_Val:
                return None;
            case BillOut_Val:
                return BillOut;
            case MerchantRejected_Val:
                return MerchantRejected;
            case MerchantConfirm_Val:
                return MerchantConfirm;
            case FinanceRejected_Val:
                return FinanceRejected;
            case FinanceForward_Val:
                return FinanceForward;
            case MerchantNotReceive_Val:
                return MerchantNotReceive;
            case End_Val:
                return End;

            default:
                return None;
        }
    }

}

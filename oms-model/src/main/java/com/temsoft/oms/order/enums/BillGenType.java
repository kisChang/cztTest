package com.temsoft.oms.order.enums;

/**
 * 账单创建类型
 *
 * @author KisChang
 * @version 1.0
 */
public enum BillGenType implements java.io.Serializable {

     SysOutBill(BillGenType.SysOutBill_Val, "系统出账")
    ,MerchantBill(BillGenType.MerchantBill_Val, "商户创建")
    ,AdminBill(BillGenType.AdminBill_Val, "运营商创建")
    ;

    public static final int SysOutBill_Val  = 0;
    public static final int MerchantBill_Val= 1;
    public static final int AdminBill_Val   = 2;

    private int value;
    private String name;

    BillGenType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static final BillGenType valueOf(int value){
        switch (value){
            case SysOutBill_Val:
                return SysOutBill;
            case MerchantBill_Val:
                return MerchantBill;
            case AdminBill_Val:
                return AdminBill;

            default:
                return SysOutBill;
        }
    }

}

package com.temsoft.oms.commons.enums;

/**
 * 移除状态
 *
 * @author KisChang
 * @version 1.0
 * @date 2015年12月12日
 * @since 1.0
 */
public enum Removed implements java.io.Serializable{

     None(Removed.None_Val, "正常")
    ,Removing(Removed.Removing_Val, "已移除")
    ,PermanentRemoved(Removed.PermanentRemoved_Val, "永久移除")
    ;

    public static final int None_Val            = 0;
    public static final int Removing_Val        = 1;
    public static final int PermanentRemoved_Val= 2;

    private int value;
    private String name;

    Removed(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static Removed valueOf(int value){
        switch (value){
            case None_Val:
                return None;
            case Removing_Val:
                return Removing;
            case PermanentRemoved_Val:
                return PermanentRemoved;

            default:
                return None;
        }
    }
}
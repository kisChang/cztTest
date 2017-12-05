package com.temsoft.oms.order.formbean;

import java.util.Collections;
import java.util.Map;

/**
 * 小书包 详细描述
 *
 * @author KisChang
 * @version 1.0
 * @date 2015年11月20日
 * @since 1.0
 */
public class ShopCartFormBean implements java.io.Serializable{
    private long id;
    private long consumerAccountId; //所属用户
    private long salesmanAccountId; //销售人员Id
    private long goodsId;           //商品、商品包ID
    private long wcId;              //库存 Or 课程类
    private boolean goodsType;      //true商品  false课程
    private long studentId = -1;    //绑定学生
    private boolean type;           //true商品  false商品包
    private long sum;               //购买数量


    private long goldKy;            //本商品可用的购课积分数

    private long goldIncome = 0;        //本商品赠送的购课积分数

    public ShopCartFormBean() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getConsumerAccountId() {
        return consumerAccountId;
    }

    public void setConsumerAccountId(long consumerAccountId) {
        this.consumerAccountId = consumerAccountId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getSalesmanAccountId() {
        return salesmanAccountId;
    }

    public void setSalesmanAccountId(long salesmanAccountId) {
        this.salesmanAccountId = salesmanAccountId;
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public long getWcId() {
        return wcId;
    }

    public void setWcId(long wcId) {
        this.wcId = wcId;
    }

    public boolean isGoodsType() {
        return goodsType;
    }

    public void setGoodsType(boolean goodsType) {
        this.goodsType = goodsType;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public long getGoldKy() {
        return goldKy;
    }

    public void setGoldKy(long goldKy) {
        this.goldKy = goldKy;
    }

    public long getGoldIncome() {
        return goldIncome;
    }

    public void setGoldIncome(long goldIncome) {
        this.goldIncome = goldIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopCartFormBean formBean = (ShopCartFormBean) o;

        if (goodsId != formBean.goodsId) return false;
        if (goodsType != formBean.goodsType) return false;
        if (type != formBean.type) return false;
        if (wcId != formBean.wcId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (goodsId ^ (goodsId >>> 32));
        result = 31 * result + (int) (wcId ^ (wcId >>> 32));
        result = 31 * result + (goodsType ? 1 : 0);
        result = 31 * result + (type ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ShopCartFormBean{" +
                "id=" + id +
                ", consumerAccountId=" + consumerAccountId +
                ", goodsId=" + goodsId +
                ", wcId=" + wcId +
                ", goodsType=" + goodsType +
                ", type=" + type +
                ", sum=" + sum +
                '}';
    }
}

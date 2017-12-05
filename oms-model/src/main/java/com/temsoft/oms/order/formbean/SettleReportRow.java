package com.temsoft.oms.order.formbean;

import com.temsoft.oms.commons.utils.WebUtils;
import com.temsoft.oms.order.model.OrderGoods;

import java.math.BigDecimal;

/**
 * 报表单行数据
 *
 * @author KisChang
 * @version 1.0
 * @since 1.0
 */
public class SettleReportRow implements java.io.Serializable {

    private long goodsId;
    private String date;
    private String goodsName;
    private String oldPrice;
    private String price;
    private int sum = 1;
    private BigDecimal sumMoney;
    private BigDecimal settleMoney;
    private BigDecimal lastMoney;

    public SettleReportRow(OrderGoods orderGoods) {
        this.goodsId = orderGoods.getGoodsId();
        this.goodsName = orderGoods.getGoodsName();
        this.oldPrice = WebUtils.formatDecimal(orderGoods.getGoodsPrice());
        this.price = WebUtils.formatDecimal(orderGoods.getTruePrice());
        this.sum = 1;
        this.sumMoney = orderGoods.getGoodsPrice();
        this.settleMoney = orderGoods.getSettlePrice();
        this.lastMoney = WebUtils.subBigDecimal(this.sumMoney, this.settleMoney);
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public BigDecimal getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(BigDecimal sumMoney) {
        this.sumMoney = sumMoney;
    }

    public BigDecimal getSettleMoney() {
        return settleMoney;
    }

    public void setSettleMoney(BigDecimal settleMoney) {
        this.settleMoney = settleMoney;
    }

    public BigDecimal getLastMoney() {
        return lastMoney;
    }

    public void setLastMoney(BigDecimal lastMoney) {
        this.lastMoney = lastMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SettleReportRow that = (SettleReportRow) o;

        if (goodsId != that.goodsId) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        return goodsName != null ? goodsName.equals(that.goodsName) : that.goodsName == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (goodsId ^ (goodsId >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SettleReportRow{" +
                "goodsId=" + goodsId +
                ", date='" + date + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", oldPrice='" + oldPrice + '\'' +
                ", price='" + price + '\'' +
                ", sum=" + sum +
                ", sumMoney=" + sumMoney +
                ", settleMoney=" + settleMoney +
                ", lastMoney=" + lastMoney +
                '}';
    }
}

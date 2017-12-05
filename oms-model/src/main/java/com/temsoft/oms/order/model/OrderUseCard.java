package com.temsoft.oms.order.model;

import com.temsoft.oms.commons.utils.WebUtils;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单使用的充值卡信息
 *
 * @author KisChang
 * @version 1.0
 * @date 2015年12月03日
 * @since 1.0
 */
public class OrderUseCard implements java.io.Serializable {

    private long orderId;               //总订单ID
    private long orderGoodsId;          //商品订单ID
    private long cardId;                //充值卡ID
    private String cardNumber;          //充值卡卡号
    private BigDecimal money            //使用的充值卡金额
            = WebUtils.getZero();

    //数据冗余，统计功能用
    private Date payTime;               //支付时间

    private BigDecimal trueMoney        //真实金额
            = WebUtils.getZero();
    private BigDecimal giveMoney        //按比例计算出的赠送的金额的部分（可能会有所偏差，当前订单用的是充值卡的最后一笔钱时，不会按比例计算，而是剩余的赠送金额，一切以此值为准）
            = WebUtils.getZero();
    private int proportion;             //比例

    private long rechargeConfId;        //充值卡充值配置信息ID

    private long carrierOperatorId;     //所属运营商
    private long merchantId;            //所属商户

    public long getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(long orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = WebUtils.roundDecimal(money);
    }

    public BigDecimal getTrueMoney() {
        return trueMoney;
    }

    public void setTrueMoney(BigDecimal trueMoney) {
        this.trueMoney = WebUtils.roundDecimal(trueMoney);
    }

    public BigDecimal getGiveMoney() {
        return giveMoney;
    }

    public void setGiveMoney(BigDecimal giveMoney) {
        this.giveMoney = WebUtils.roundDecimal(giveMoney);
    }

    public long getRechargeConfId() {
        return rechargeConfId;
    }

    public void setRechargeConfId(long rechargeConfId) {
        this.rechargeConfId = rechargeConfId;
    }

    public long getCarrierOperatorId() {
        return carrierOperatorId;
    }

    public void setCarrierOperatorId(long carrierOperatorId) {
        this.carrierOperatorId = carrierOperatorId;
    }

    public long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public int getProportion() {
        return proportion;
    }

    public void setProportion(int proportion) {
        this.proportion = proportion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderUseCard that = (OrderUseCard) o;

        if (orderId != that.orderId) return false;
        if (cardId != that.cardId) return false;
        if (carrierOperatorId != that.carrierOperatorId) return false;
        if (merchantId != that.merchantId) return false;
        if (orderGoodsId != that.orderGoodsId) return false;
        if (proportion != that.proportion) return false;
        if (rechargeConfId != that.rechargeConfId) return false;
        if (cardNumber != null ? !cardNumber.equals(that.cardNumber) : that.cardNumber != null) return false;
        if (giveMoney != null ? !giveMoney.equals(that.giveMoney) : that.giveMoney != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (trueMoney != null ? !trueMoney.equals(that.trueMoney) : that.trueMoney != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (orderGoodsId ^ (orderGoodsId >>> 32));
        result = 31 * result + (int) (orderId ^ (orderId >>> 32));
        result = 31 * result + (int) (cardId ^ (cardId >>> 32));
        result = 31 * result + (cardNumber != null ? cardNumber.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (trueMoney != null ? trueMoney.hashCode() : 0);
        result = 31 * result + (giveMoney != null ? giveMoney.hashCode() : 0);
        result = 31 * result + proportion;
        result = 31 * result + (int) (rechargeConfId ^ (rechargeConfId >>> 32));
        result = 31 * result + (int) (carrierOperatorId ^ (carrierOperatorId >>> 32));
        result = 31 * result + (int) (merchantId ^ (merchantId >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "OrderUseCard{" +
                "orderGoodsId=" + orderGoodsId +
                ", orderId=" + orderId +
                ", cardId=" + cardId +
                ", cardNumber='" + cardNumber + '\'' +
                ", money=" + money +
                ", trueMoney=" + trueMoney +
                ", giveMoney=" + giveMoney +
                ", proportion=" + proportion +
                ", rechargeConfId=" + rechargeConfId +
                ", carrierOperatorId=" + carrierOperatorId +
                ", merchantId=" + merchantId +
                '}';
    }
}

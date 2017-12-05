package com.temsoft.oms.order.model;


import com.temsoft.oms.commons.enums.Removed;
import com.temsoft.oms.commons.utils.WebUtils;
import com.temsoft.oms.order.enums.OrderStat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单主体
 *
 * @author KisChang
 * @version 1.0
 */
public class Orders implements java.io.Serializable {

    private long id;
    private long payConfId = -1;        //支付配置信息（如果为支付宝等第三方支付，该配置必须可追溯）

    private BigDecimal price;           //最终总金额
    private long placeOrderUserId;      //下单用户
    private long carrierOperatorId;     //所属运营商（单个订单只能属于一个运营商 ）

    //时间信息
    private Date createTime;            //创建时间
    private Date payTime;               //支付时间

    //充值订单，存储充值的卡ID和配置信息
    private Long prepaidCardId = -1L;   //充值卡ID
    private Long rechargeConfId = -1L;  //充值卡充值方式配置信息ID（数据冗余）

    //优惠支付信息
    private Long giveGoldNum = 0L;      //赠送的购课积分数
    private Long goldNum = 0L;          //使用的购课积分数
    private BigDecimal goldMoney        //购课积分抵用的现金
            = WebUtils.getZero();

    //优惠券使用信息（单个订单仅支持一张优惠券）
    private long useCouponId = -1L;     //使用的优惠券ID
    private BigDecimal couponMoney      //优惠券抵用的总金额
            = WebUtils.getZero();

    //其他支付信息
    private BigDecimal cardPayMoney     //充值卡支付的部分
            = WebUtils.getZero();
    private BigDecimal cardTrueMoney    //充值卡支付部分，真实金额
            = WebUtils.getZero();
    private BigDecimal cardGiveMoney    //充值卡支付部分，赠送金额
            = WebUtils.getZero();

    private BigDecimal discountMoney    //优惠的金额
            = WebUtils.getZero();

    //真实支付金额
    private BigDecimal otherMoney        //其他支付方式（仅用在POS创建的订单上）
            = WebUtils.getZero();

    private BigDecimal userBalanceMoney //用户余额支付的部分（汇总）
            = WebUtils.getZero();
    private BigDecimal alipayMoney      //支付宝支付的金额（汇总）
            = WebUtils.getZero();

    private BigDecimal cashMoney        //现金支付（仅用在充值类订单上）
            = WebUtils.getZero();

    private OrderStat stat              //订单状态
                = OrderStat.defaultVal();
    private boolean type = true;        //订单类型，true购买商品，false充值

    private Removed removed
            = Removed.None;

    private String remark;              //订单备注
    private int source = 0;             //订单来源

    /*其他标记信息*/
    private String orderNo;         /*订单编号
                                     * 订单自增编号后8位 用O1 - O8表示  o 订单最后一位
                                     * yy年 dd时 mm日 MM月
                                     * O1yyO2O3ddO4O5mmO6O7MMO8
                                     * 最终： O1yyO2O3ddO4O5mmO6O7MMO8 + 用户ID后两位
                                     * */
    private String aliTradeNo;      //支付宝流水号
    private String aliSeller;       //卖家账户
    private String aliBuyer;        //买家账号

    //微信支付信息
    private String wxTransactionId;     //微信支付订单号
    private String wxBankType;          //付款银行

    private List<OrderGoods> goodsList; //商品列表

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPayConfId() {
        return payConfId;
    }

    public void setPayConfId(long payConfId) {
        this.payConfId = payConfId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = WebUtils.roundDecimal(price);
    }

    public long getPlaceOrderUserId() {
        return placeOrderUserId;
    }

    public void setPlaceOrderUserId(long placeOrderUserId) {
        this.placeOrderUserId = placeOrderUserId;
    }

    public long getCarrierOperatorId() {
        return carrierOperatorId;
    }

    public void setCarrierOperatorId(long carrierOperatorId) {
        this.carrierOperatorId = carrierOperatorId;
    }

    public BigDecimal getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(BigDecimal discountMoney) {
        this.discountMoney = WebUtils.roundDecimal(discountMoney);
    }

    public Long getGiveGoldNum() {
        return giveGoldNum;
    }

    public void setGiveGoldNum(Long giveGoldNum) {
        this.giveGoldNum = giveGoldNum;
    }

    public BigDecimal getGoldMoney() {
        return goldMoney;
    }

    public void setGoldMoney(BigDecimal goldMoney) {
        this.goldMoney = WebUtils.roundDecimal(goldMoney);
    }

    public BigDecimal getUserBalanceMoney() {
        return userBalanceMoney;
    }

    public void setUserBalanceMoney(BigDecimal userBalanceMoney) {
        this.userBalanceMoney = WebUtils.roundDecimal(userBalanceMoney);
    }

    public long getUseCouponId() {
        return useCouponId;
    }

    public void setUseCouponId(long useCouponId) {
        this.useCouponId = useCouponId;
    }

    public BigDecimal getCouponMoney() {
        return couponMoney;
    }

    public void setCouponMoney(BigDecimal couponMoney) {
        this.couponMoney = WebUtils.roundDecimal(couponMoney);
    }

    public BigDecimal getCardPayMoney() {
        return cardPayMoney;
    }

    public void setCardPayMoney(BigDecimal cardPayMoney) {
        this.cardPayMoney = WebUtils.roundDecimal(cardPayMoney);
    }

    public BigDecimal getOtherMoney() {
        return otherMoney;
    }

    public void setOtherMoney(BigDecimal otherMoney) {
        this.otherMoney = WebUtils.roundDecimal(otherMoney);
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public Long getGoldNum() {
        return goldNum;
    }

    public void setGoldNum(Long goldNum) {
        this.goldNum = (goldNum == null ? 0 : goldNum);
    }

    public OrderStat getStatEnum() {
        return stat;
    }

    public int getStat() {
        return stat.getValue();
    }

    public void setStat(int stat) {
        this.stat = OrderStat.valueOf(stat);
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public Long getPrepaidCardId() {
        return prepaidCardId;
    }

    public void setPrepaidCardId(Long prepaidCardId) {
        this.prepaidCardId = prepaidCardId;
    }

    public Long getRechargeConfId() {
        return rechargeConfId;
    }

    public void setRechargeConfId(Long rechargeConfId) {
        this.rechargeConfId = rechargeConfId;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public BigDecimal getCardTrueMoney() {
        return cardTrueMoney;
    }

    public void setCardTrueMoney(BigDecimal cardTrueMoney) {
        this.cardTrueMoney = WebUtils.roundDecimal(cardTrueMoney);
    }

    public BigDecimal getCardGiveMoney() {
        return cardGiveMoney;
    }

    public void setCardGiveMoney(BigDecimal cardGiveMoney) {
        this.cardGiveMoney = WebUtils.roundDecimal(cardGiveMoney);
    }

    public BigDecimal getAlipayMoney() {
        return alipayMoney;
    }

    public void setAlipayMoney(BigDecimal alipayMoney) {
        this.alipayMoney = WebUtils.roundDecimal(alipayMoney);
    }

    public BigDecimal getCashMoney() {
        return cashMoney;
    }

    public void setCashMoney(BigDecimal cashMoney) {
        this.cashMoney = WebUtils.roundDecimal(cashMoney);
    }


    public Removed getRemovedEnum() {
        return removed;
    }

    public int getRemoved() {
        return removed.getValue();
    }

    public void setRemoved(int removed) {
        this.removed = Removed.valueOf(removed);
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAliTradeNo() {
        return aliTradeNo;
    }

    public void setAliTradeNo(String aliTradeNo) {
        this.aliTradeNo = aliTradeNo;
    }

    public String getAliSeller() {
        return aliSeller;
    }

    public void setAliSeller(String aliSeller) {
        this.aliSeller = aliSeller;
    }

    public String getAliBuyer() {
        return aliBuyer;
    }

    public void setAliBuyer(String aliBuyer) {
        this.aliBuyer = aliBuyer;
    }

    public String getWxTransactionId() {
        return wxTransactionId;
    }

    public void setWxTransactionId(String wxTransactionId) {
        this.wxTransactionId = wxTransactionId;
    }

    public String getWxBankType() {
        return wxBankType;
    }

    public void setWxBankType(String wxBankType) {
        this.wxBankType = wxBankType;
    }

    public List<OrderGoods> getGoodsList() {
        if (goodsList != null && !goodsList.isEmpty()){
            for(OrderGoods orderGoods : goodsList){
                orderGoods.setOrdersId(this.getId());
                //orderGoods.setStat(this.getStat());
            }
        }
        return goodsList;
    }

    public void setGoodsList(List<OrderGoods> goodsList) {
        if (goodsList != null && !goodsList.isEmpty()){
            for(OrderGoods orderGoods : goodsList){
                orderGoods.setOrdersId(this.getId());
                //orderGoods.setStat(this.getStat());
            }
        }
        this.goodsList = goodsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orders orders = (Orders) o;

        if (carrierOperatorId != orders.carrierOperatorId) return false;
        if (payConfId != orders.payConfId) return false;
        if (id != orders.id) return false;
        if (placeOrderUserId != orders.placeOrderUserId) return false;
        if (useCouponId != orders.useCouponId) return false;
        if (type != orders.type) return false;
        if (aliBuyer != null ? !aliBuyer.equals(orders.aliBuyer) : orders.aliBuyer != null) return false;
        if (aliSeller != null ? !aliSeller.equals(orders.aliSeller) : orders.aliSeller != null) return false;
        if (aliTradeNo != null ? !aliTradeNo.equals(orders.aliTradeNo) : orders.aliTradeNo != null) return false;
        if (alipayMoney != null ? !alipayMoney.equals(orders.alipayMoney) : orders.alipayMoney != null) return false;
        if (cardGiveMoney != null ? !cardGiveMoney.equals(orders.cardGiveMoney) : orders.cardGiveMoney != null)
            return false;
        if (cardPayMoney != null ? !cardPayMoney.equals(orders.cardPayMoney) : orders.cardPayMoney != null)
            return false;
        if (cardTrueMoney != null ? !cardTrueMoney.equals(orders.cardTrueMoney) : orders.cardTrueMoney != null)
            return false;
        if (cashMoney != null ? !cashMoney.equals(orders.cashMoney) : orders.cashMoney != null) return false;
        if (discountMoney != null ? !discountMoney.equals(orders.discountMoney) : orders.discountMoney != null)
            return false;
        if (giveGoldNum != null ? !giveGoldNum.equals(orders.giveGoldNum) : orders.giveGoldNum != null) return false;
        if (goldMoney != null ? !goldMoney.equals(orders.goldMoney) : orders.goldMoney != null) return false;
        if (goldNum != null ? !goldNum.equals(orders.goldNum) : orders.goldNum != null) return false;
        if (orderNo != null ? !orderNo.equals(orders.orderNo) : orders.orderNo != null) return false;
        if (prepaidCardId != null ? !prepaidCardId.equals(orders.prepaidCardId) : orders.prepaidCardId != null)
            return false;
        if (price != null ? !price.equals(orders.price) : orders.price != null) return false;
        if (rechargeConfId != null ? !rechargeConfId.equals(orders.rechargeConfId) : orders.rechargeConfId != null)
            return false;
        if (stat != orders.stat) return false;
        if (userBalanceMoney != null ? !userBalanceMoney.equals(orders.userBalanceMoney) : orders.userBalanceMoney != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (int) (placeOrderUserId ^ (placeOrderUserId >>> 32));
        result = 31 * result + (int) (payConfId ^ (payConfId >>> 32));
        result = 31 * result + (int) (useCouponId ^ (useCouponId >>> 32));
        result = 31 * result + (int) (carrierOperatorId ^ (carrierOperatorId >>> 32));
        result = 31 * result + (prepaidCardId != null ? prepaidCardId.hashCode() : 0);
        result = 31 * result + (rechargeConfId != null ? rechargeConfId.hashCode() : 0);
        result = 31 * result + (giveGoldNum != null ? giveGoldNum.hashCode() : 0);
        result = 31 * result + (goldNum != null ? goldNum.hashCode() : 0);
        result = 31 * result + (goldMoney != null ? goldMoney.hashCode() : 0);
        result = 31 * result + (cardPayMoney != null ? cardPayMoney.hashCode() : 0);
        result = 31 * result + (cardTrueMoney != null ? cardTrueMoney.hashCode() : 0);
        result = 31 * result + (cardGiveMoney != null ? cardGiveMoney.hashCode() : 0);
        result = 31 * result + (discountMoney != null ? discountMoney.hashCode() : 0);
        result = 31 * result + (userBalanceMoney != null ? userBalanceMoney.hashCode() : 0);
        result = 31 * result + (alipayMoney != null ? alipayMoney.hashCode() : 0);
        result = 31 * result + (cashMoney != null ? cashMoney.hashCode() : 0);
        result = 31 * result + (stat != null ? stat.hashCode() : 0);
        result = 31 * result + (type ? 1 : 0);
        result = 31 * result + (orderNo != null ? orderNo.hashCode() : 0);
        result = 31 * result + (aliTradeNo != null ? aliTradeNo.hashCode() : 0);
        result = 31 * result + (aliSeller != null ? aliSeller.hashCode() : 0);
        result = 31 * result + (aliBuyer != null ? aliBuyer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", payConfId=" + payConfId +
                ", price=" + price +
                ", placeOrderUserId=" + placeOrderUserId +
                ", carrierOperatorId=" + carrierOperatorId +
                ", createTime=" + createTime +
                ", payTime=" + payTime +
                ", prepaidCardId=" + prepaidCardId +
                ", rechargeConfId=" + rechargeConfId +
                ", giveGoldNum=" + giveGoldNum +
                ", goldNum=" + goldNum +
                ", goldMoney=" + goldMoney +
                ", useCouponId=" + useCouponId +
                ", couponMoney=" + couponMoney +
                ", cardPayMoney=" + cardPayMoney +
                ", cardTrueMoney=" + cardTrueMoney +
                ", cardGiveMoney=" + cardGiveMoney +
                ", discountMoney=" + discountMoney +
                ", otherMoney=" + otherMoney +
                ", userBalanceMoney=" + userBalanceMoney +
                ", alipayMoney=" + alipayMoney +
                ", cashMoney=" + cashMoney +
                ", stat=" + stat +
                ", type=" + type +
                ", removed=" + removed +
                ", remark='" + remark + '\'' +
                ", source=" + source +
                ", orderNo='" + orderNo + '\'' +
                ", aliTradeNo='" + aliTradeNo + '\'' +
                ", aliSeller='" + aliSeller + '\'' +
                ", aliBuyer='" + aliBuyer + '\'' +
                ", wxTransactionId='" + wxTransactionId + '\'' +
                ", wxBankType='" + wxBankType + '\'' +
                ", goodsList=" + goodsList +
                '}';
    }
}

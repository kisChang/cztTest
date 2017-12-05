package com.temsoft.oms.order.formbean;

import com.temsoft.oms.commons.utils.WebUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 提交后的订单信息
 *
 * @author KisChang
 * @version 1.0
 */
public class SubOrderInfo implements java.io.Serializable {

    private long placeOrderUserId;              //下单用户
    private Long actId = -1L;                   //活动Id（代表这是一个活动报名订单）
    private String remark;                      //订单备注
    private int source = 0;                     //订单来源

    private List<ShopCartFormBean> shopCart;    //小书包列表

    private BigDecimal totalPrice;              //订单总价格

    private long goldKy;                        //本单可用的购课积分数
    private long goldMultiple;                  //购课积分使用倍数
    private long goldNum;                       //用户的购课积分总数
    private long goldIncome;                    //计算本单收入购课积分数

    private long goldUse;                       //本单使用
    private BigDecimal goldMoney;               //购课积分可抵的现金

    private OrderCardInfo cardInfo;             //本单使用的充值卡列表

    private BigDecimal availableMoney;          //本单可用的用户余额
    private BigDecimal balanceMoney;            //用户余额支付现金

    //优惠券使用
    //优惠券列表
    private Map<Long, CouponCanUseDesc> canUseCoupon;
    private Map<Long, CouponCanUseDesc> notUseCoupon;
    private long useCouponId = -1L;             //使用的优惠券Id
    private BigDecimal couponMoney;             //优惠券抵用的金额


    private static final BigDecimal zero = WebUtils.getZero();

    public SubOrderInfo() {
        this.goldMoney = zero;
        this.availableMoney = zero;
        this.balanceMoney = zero;
        this.couponMoney = zero;
    }

    public SubOrderInfo(SubOrderInfo info) {
        this.remark = info.getRemark();
        this.placeOrderUserId = info.getPlaceOrderUserId();
        this.actId = info.getActId();
        this.shopCart = info.getShopCart();
        this.totalPrice = info.getTotalPrice();
        this.goldKy = info.getGoldKy();
        this.goldMultiple = info.getGoldMultiple();
        this.goldNum = info.getGoldNum();
        this.goldIncome = info.getGoldIncome();
        this.goldUse = info.getGoldUse();
        this.goldMoney = info.getGoldMoney();
        this.availableMoney = info.getAvailableMoney();
        this.balanceMoney = info.getBalanceMoney();
        this.cardInfo = info.getCardInfo();

        this.canUseCoupon = info.getCanUseCoupon();
        this.notUseCoupon = info.getNotUseCoupon();
        this.useCouponId = info.getUseCouponId();
        this.couponMoney = info.getCouponMoney();
    }

    /************************Get Set************************************/
    public Map<Long, CouponCanUseDesc> getCanUseCoupon() {
        return canUseCoupon;
    }

    public void setCanUseCoupon(Map<Long, CouponCanUseDesc> canUseCoupon) {
        this.canUseCoupon = canUseCoupon;
    }

    public Map<Long, CouponCanUseDesc> getNotUseCoupon() {
        return notUseCoupon;
    }

    public void setNotUseCoupon(Map<Long, CouponCanUseDesc> notUseCoupon) {
        this.notUseCoupon = notUseCoupon;
    }

    public Long getActId() {
        return actId;
    }

    public void setActId(Long actId) {
        if (actId != null){
            this.actId = actId;
        }
    }

    public long getUseCouponId() {
        return useCouponId;
    }

    public void setUseCouponId(long useCouponId) {
        this.useCouponId = useCouponId;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public long getPlaceOrderUserId() {
        return placeOrderUserId;
    }

    public void setPlaceOrderUserId(long placeOrderUserId) {
        this.placeOrderUserId = placeOrderUserId;
    }

    public List<ShopCartFormBean> getShopCart() {
        return shopCart;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public long getGoldKy() {
        return goldKy;
    }

    public long getGoldUse() {
        return goldUse;
    }

    public long getGoldMultiple() {
        return goldMultiple;
    }

    public long getGoldNum() {
        return goldNum;
    }

    public long getGoldIncome() {
        return goldIncome;
    }

    public BigDecimal getGoldMoney() {
        return goldMoney;
    }

    public BigDecimal getAvailableMoney() {
        return availableMoney;
    }

    public BigDecimal getBalanceMoney() {
        return balanceMoney;
    }

    public BigDecimal getCouponMoney() {
        return couponMoney;
    }

    public OrderCardInfo getCardInfo() {
        return cardInfo;
    }

    public void setCardInfo(OrderCardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }

    public void setShopCart(List<ShopCartFormBean> shopCart) {
        this.shopCart = shopCart;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setGoldKy(long goldKy) {
        this.goldKy = parseZero(goldKy) ;
    }

    private long parseZero(long num) {
        return (num < 0 ? 0 : num);
    }

    public void setGoldUse(long goldUse) {
        this.goldUse = parseZero(goldUse);
    }

    public void setGoldMultiple(long goldMultiple) {
        this.goldMultiple = parseZero(goldMultiple);
    }

    public void setGoldIncome(long goldIncome) {
        this.goldIncome = parseZero(goldIncome);
    }

    public void setGoldNum(long goldNum) {
        this.goldNum = parseZero(goldNum);
    }

    public void setBalanceMoney(BigDecimal balanceMoney) {
        this.balanceMoney = balanceMoney;
    }

    public void setAvailableMoney(BigDecimal availableMoney) {
        this.availableMoney = availableMoney;
    }

    public void setGoldMoney(BigDecimal goldMoney) {
        this.goldMoney = goldMoney;
    }

    public void setCouponMoney(BigDecimal couponMoney) {
        this.couponMoney = couponMoney;
    }

    /********************格式化Decimal****************************************/
    public String getCouponMoneyStr() {
        return WebUtils.formatDecimal(couponMoney);
    }

    public String getGoldMoneyStr() {
        return WebUtils.formatDecimal(getGoldMoney());
    }

    public String getAvailableMoneyStr() {
        return WebUtils.formatDecimal(getAvailableMoney());
    }

    public String getBalanceMoneyStr() {
        return WebUtils.formatDecimal(getBalanceMoney());
    }

    public String getTotalPriceStr() {
        return WebUtils.formatDecimal(getTotalPrice());
    }

}

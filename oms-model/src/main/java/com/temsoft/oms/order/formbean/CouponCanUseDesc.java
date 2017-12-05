package com.temsoft.oms.order.formbean;

import com.temsoft.oms.commons.utils.WebUtils;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Set;

/**
 * 优惠券可用 描述
 *  1.优惠券信息
 *  2.用户优惠券信息
 *  3.可用商品信息
 *  4.不可用描述信息
 *
 * @author KisChang
 * @version 1.0
 */
public class CouponCanUseDesc implements java.io.Serializable {


    private Set<Long> canUseGoods;
    private BigDecimal discountMoney;
    private String noMsg;

    public CouponCanUseDesc() {
        this.canUseGoods = Collections.<Long>emptySet();
        this.discountMoney = WebUtils.getZero();
        this.noMsg = null;
    }


    //描述是否可用
    public boolean isCanUse(){
        return !(canUseGoods == null || canUseGoods.isEmpty());
    }

    public String getDiscountMoneyStr() {
        return WebUtils.formatDecimal(discountMoney);
    }

    public BigDecimal getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(BigDecimal discountMoney) {
        this.discountMoney = discountMoney;
    }

    public Set<Long> getCanUseGoods() {
        return canUseGoods;
    }

    public void setCanUseGoods(Set<Long> canUseGoods) {
        this.canUseGoods = canUseGoods;
    }

    public String getNoMsg() {
        return noMsg;
    }

    public void setNoMsg(String noMsg) {
        this.noMsg = noMsg;
    }
}

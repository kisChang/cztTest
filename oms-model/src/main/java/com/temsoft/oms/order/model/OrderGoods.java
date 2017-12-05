package com.temsoft.oms.order.model;

import com.temsoft.oms.commons.utils.WebUtils;
import com.temsoft.oms.order.enums.OrderStat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 订单包含的商品列表
 *
 * @author KisChang
 * @version 1.0
 * @date 2015年10月28日
 * @see com.temsoft.oms.order.model.Orders
 * @since 1.0
 */
public class OrderGoods implements java.io.Serializable {

    private long id;

    //商品信息
    private long ordersId;          //订单Id
    private long goodsId;           //商品Id（数据冗余）
    private long goodsPackageId     //商品所属套餐ID（如果商品来源为套餐时设置该字段，用于优惠券的计算）
            = -1L;
    private String goodsName;       //商品名称（数据冗余）
    private String goodsPic;        //商品图片（数据冗余）
    private BigDecimal goodsPrice   //商品原价（数据冗余）
            = WebUtils.getZero();
    private boolean goodsType;      //商品类型 true 商品  false 课程
    private long studentId = -1;    //学生档案ID
    private BigDecimal truePrice    //实际支付价格，单价计算需要除以购买数量
            = WebUtils.getZero();
    private long sum;               //购买数量
    private String specDesc;        //规格描述
    private long warehouseId;       //库存信息
    private int courseHour;         //课时数

    private long carrierOperatorId; //所属运营商
    private long merchantId;        //所属商户

    //时间信息
    private Date createTime;        //创建时间（数据冗余）
    private Date payTime;           //支付时间（数据冗余）

    private String orderNo;         //订单编号

    //销售线索
    private long salesmanAccountId  //销售人员
                = -1;
    private long placeOrderUserId;  //购买该商品的消费者


    //优惠支付信息
    private Long giveGoldNum = 0L;  //赠送的购课积分数
    private Long goldNum = 0L;      //使用的购课积分数
    private BigDecimal goldMoney    //购课积分抵用的现金
            = WebUtils.getZero();

    //优惠券使用信息（单个订单仅支持一张优惠券）
    private long useCouponId = -1L;     //使用的优惠券ID
    private BigDecimal couponMoney      //优惠券抵用的总金额
            = WebUtils.getZero();

    //其他支付信息
    private BigDecimal cardPayMoney //充值卡支付的部分
            = WebUtils.getZero();
    private BigDecimal cardTrueMoney//充值卡支付部分，真实金额
            = WebUtils.getZero();
    private BigDecimal cardGiveMoney//充值卡支付部分，赠送金额
            = WebUtils.getZero();

    //真实金额
    private BigDecimal otherMoney        //其他支付方式（仅用在POS创建的订单上）
            = WebUtils.getZero();
    private BigDecimal userBalanceMoney //用户余额支付的部分
            = WebUtils.getZero();
    private BigDecimal alipayMoney      //支付宝支付的金额
            = WebUtils.getZero();

    private OrderStat stat          //订单状态
            = OrderStat.defaultVal();

    private Date outDate;           //签收时间

    //结算信息
    private long sRuleId = -1;      //结算规则ID
    private String sRuleDesc;       //结算规则描述（冗余）
    private BigDecimal settlePrice; //结算金额

    //结算账单信息
    private long cashBillId = -1;   //提现账单
    private long settleBillId = -1; //结算账单


    //使用的充值卡列表，如果充值卡支付部分不为0，则该列表数量必须>=1
    private List<OrderUseCard> useCards;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(long ordersId) {
        this.ordersId = ordersId;
    }

    public long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }

    public long getGoodsPackageId() {
        return goodsPackageId;
    }

    public void setGoodsPackageId(long goodsPackageId) {
        this.goodsPackageId = goodsPackageId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public boolean isGoodsType() {
        return goodsType;
    }

    public void setGoodsType(boolean goodsType) {
        this.goodsType = goodsType;
    }

    public BigDecimal getTruePrice() {
        return truePrice;
    }

    public void setTruePrice(BigDecimal truePrice) {
        this.truePrice = WebUtils.roundDecimal(truePrice);
    }

    public String getGoodsPic() {
        return goodsPic;
    }

    public void setGoodsPic(String goodsPic) {
        this.goodsPic = goodsPic;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public long getSalesmanAccountId() {
        return salesmanAccountId;
    }

    public void setSalesmanAccountId(long salesmanAccountId) {
        this.salesmanAccountId = salesmanAccountId;
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

    public long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    public String getSpecDesc() {
        return specDesc;
    }

    public void setSpecDesc(String specDesc) {
        this.specDesc = specDesc;
    }

    public long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public int getCourseHour() {
        return courseHour;
    }

    public void setCourseHour(int courseHour) {
        this.courseHour = courseHour;
    }

    public Long getGiveGoldNum() {
        return giveGoldNum;
    }

    public void setGiveGoldNum(Long giveGoldNum) {
        this.giveGoldNum = giveGoldNum;
    }

    public Long getGoldNum() {
        return goldNum;
    }

    public void setGoldNum(Long goldNum) {
        this.goldNum = (goldNum == null ? 0 : goldNum);
    }

    public BigDecimal getGoldMoney() {
        return goldMoney;
    }

    public void setGoldMoney(BigDecimal goldMoney) {
        this.goldMoney = WebUtils.roundDecimal(goldMoney);
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

    public BigDecimal getCardTrueMoney() {
        return cardTrueMoney;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = WebUtils.roundDecimal(goodsPrice);
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

    public BigDecimal getUserBalanceMoney() {
        return userBalanceMoney;
    }

    public void setUserBalanceMoney(BigDecimal userBalanceMoney) {
        this.userBalanceMoney = WebUtils.roundDecimal(userBalanceMoney);
    }

    public BigDecimal getAlipayMoney() {
        return alipayMoney;
    }

    public void setAlipayMoney(BigDecimal alipayMoney) {
        this.alipayMoney = WebUtils.roundDecimal(alipayMoney);
    }

    public BigDecimal getOtherMoney() {
        return otherMoney;
    }

    public void setOtherMoney(BigDecimal otherMoney) {
        this.otherMoney = WebUtils.roundDecimal(otherMoney);
    }

    public List<OrderUseCard> getUseCards() {
        return useCards;
    }

    public void setUseCards(List<OrderUseCard> useCards) {
        this.useCards = useCards;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public long getsRuleId() {
        return sRuleId;
    }

    public void setsRuleId(long sRuleId) {
        this.sRuleId = sRuleId;
    }

    public String getsRuleDesc() {
        return sRuleDesc;
    }

    public void setsRuleDesc(String sRuleDesc) {
        this.sRuleDesc = sRuleDesc;
    }

    public BigDecimal getSettlePrice() {
        return settlePrice;
    }

    public void setSettlePrice(BigDecimal settlePrice) {
        this.settlePrice = WebUtils.roundDecimal(settlePrice);
    }

    public long getCashBillId() {
        return cashBillId;
    }

    public void setCashBillId(long cashBillId) {
        this.cashBillId = cashBillId;
    }

    public long getSettleBillId() {
        return settleBillId;
    }

    public void setSettleBillId(long settleBillId) {
        this.settleBillId = settleBillId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderGoods that = (OrderGoods) o;

        if (carrierOperatorId != that.carrierOperatorId) return false;
        if (courseHour != that.courseHour) return false;
        if (goodsId != that.goodsId) return false;
        if (goodsPackageId != that.goodsPackageId) return false;
        if (useCouponId != that.useCouponId) return false;
        if (goodsType != that.goodsType) return false;
        if (id != that.id) return false;
        if (merchantId != that.merchantId) return false;
        if (ordersId != that.ordersId) return false;
        if (placeOrderUserId != that.placeOrderUserId) return false;
        if (salesmanAccountId != that.salesmanAccountId) return false;
        if (sum != that.sum) return false;
        if (warehouseId != that.warehouseId) return false;
        if (alipayMoney != null ? !alipayMoney.equals(that.alipayMoney) : that.alipayMoney != null) return false;
        if (cardGiveMoney != null ? !cardGiveMoney.equals(that.cardGiveMoney) : that.cardGiveMoney != null)
            return false;
        if (cardPayMoney != null ? !cardPayMoney.equals(that.cardPayMoney) : that.cardPayMoney != null) return false;
        if (cardTrueMoney != null ? !cardTrueMoney.equals(that.cardTrueMoney) : that.cardTrueMoney != null)
            return false;
        if (giveGoldNum != null ? !giveGoldNum.equals(that.giveGoldNum) : that.giveGoldNum != null) return false;
        if (goldMoney != null ? !goldMoney.equals(that.goldMoney) : that.goldMoney != null) return false;
        if (goldNum != null ? !goldNum.equals(that.goldNum) : that.goldNum != null) return false;
        if (goodsName != null ? !goodsName.equals(that.goodsName) : that.goodsName != null) return false;
        if (goodsPic != null ? !goodsPic.equals(that.goodsPic) : that.goodsPic != null) return false;
        if (specDesc != null ? !specDesc.equals(that.specDesc) : that.specDesc != null) return false;
        if (stat != that.stat) return false;
        if (truePrice != null ? !truePrice.equals(that.truePrice) : that.truePrice != null) return false;
        if (userBalanceMoney != null ? !userBalanceMoney.equals(that.userBalanceMoney) : that.userBalanceMoney != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (ordersId ^ (ordersId >>> 32));
        result = 31 * result + (int) (goodsId ^ (goodsId >>> 32));
        result = 31 * result + (int) (goodsPackageId ^ (goodsPackageId >>> 32));
        result = 31 * result + (int) (useCouponId ^ (useCouponId >>> 32));
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (goodsPic != null ? goodsPic.hashCode() : 0);
        result = 31 * result + (goodsType ? 1 : 0);
        result = 31 * result + (truePrice != null ? truePrice.hashCode() : 0);
        result = 31 * result + (int) (sum ^ (sum >>> 32));
        result = 31 * result + (specDesc != null ? specDesc.hashCode() : 0);
        result = 31 * result + (int) (warehouseId ^ (warehouseId >>> 32));
        result = 31 * result + courseHour;
        result = 31 * result + (int) (carrierOperatorId ^ (carrierOperatorId >>> 32));
        result = 31 * result + (int) (merchantId ^ (merchantId >>> 32));
        result = 31 * result + (int) (salesmanAccountId ^ (salesmanAccountId >>> 32));
        result = 31 * result + (int) (placeOrderUserId ^ (placeOrderUserId >>> 32));
        result = 31 * result + (giveGoldNum != null ? giveGoldNum.hashCode() : 0);
        result = 31 * result + (goldNum != null ? goldNum.hashCode() : 0);
        result = 31 * result + (goldMoney != null ? goldMoney.hashCode() : 0);
        result = 31 * result + (cardPayMoney != null ? cardPayMoney.hashCode() : 0);
        result = 31 * result + (cardTrueMoney != null ? cardTrueMoney.hashCode() : 0);
        result = 31 * result + (cardGiveMoney != null ? cardGiveMoney.hashCode() : 0);
        result = 31 * result + (userBalanceMoney != null ? userBalanceMoney.hashCode() : 0);
        result = 31 * result + (alipayMoney != null ? alipayMoney.hashCode() : 0);
        result = 31 * result + (stat != null ? stat.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OrderGoods{" +
                "id=" + id +
                ", ordersId=" + ordersId +
                ", goodsId=" + goodsId +
                ", goodsPackageId=" + goodsPackageId +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPic='" + goodsPic + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", goodsType=" + goodsType +
                ", studentId=" + studentId +
                ", truePrice=" + truePrice +
                ", sum=" + sum +
                ", specDesc='" + specDesc + '\'' +
                ", warehouseId=" + warehouseId +
                ", useCouponId=" + useCouponId +
                ", couponMoney=" + couponMoney +
                ", courseHour=" + courseHour +
                ", carrierOperatorId=" + carrierOperatorId +
                ", merchantId=" + merchantId +
                ", createTime=" + createTime +
                ", payTime=" + payTime +
                ", orderNo='" + orderNo + '\'' +
                ", salesmanAccountId=" + salesmanAccountId +
                ", placeOrderUserId=" + placeOrderUserId +
                ", giveGoldNum=" + giveGoldNum +
                ", goldNum=" + goldNum +
                ", goldMoney=" + goldMoney +
                ", cardPayMoney=" + cardPayMoney +
                ", cardTrueMoney=" + cardTrueMoney +
                ", cardGiveMoney=" + cardGiveMoney +
                ", otherMoney=" + otherMoney +
                ", userBalanceMoney=" + userBalanceMoney +
                ", alipayMoney=" + alipayMoney +
                ", stat=" + stat +
                ", useCards=" + useCards +
                '}';
    }
}

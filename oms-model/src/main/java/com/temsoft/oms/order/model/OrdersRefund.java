package com.temsoft.oms.order.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单退款记录
 *
 * @author KisChang
 * @version 1.0
 */
public class OrdersRefund implements java.io.Serializable {

    private long id;
    private long userTicketsId;
    private String batchNo;
    private Date refundDate;
    private BigDecimal money;           //退款金额
    private String resultDetails;       //最终结果

    //支付宝相关信息
    private String aliTradeNo;          //支付宝流水号
    private String aliBuyer;            //付款支付宝号
    private String aliSeller;           //商家账户

    //微信相关信息
    private String transactionId;       //微信订单号
    private String refundId;            //微信退款单号


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public long getUserTicketsId() {
        return userTicketsId;
    }

    public void setUserTicketsId(long userTicketsId) {
        this.userTicketsId = userTicketsId;
    }

    public Date getRefundDate() {
        return refundDate;
    }

    public void setRefundDate(Date refundDate) {
        this.refundDate = refundDate;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getAliTradeNo() {
        return aliTradeNo;
    }

    public void setAliTradeNo(String aliTradeNo) {
        this.aliTradeNo = aliTradeNo;
    }

    public String getAliBuyer() {
        return aliBuyer;
    }

    public void setAliBuyer(String aliBuyer) {
        this.aliBuyer = aliBuyer;
    }

    public String getAliSeller() {
        return aliSeller;
    }

    public void setAliSeller(String aliSeller) {
        this.aliSeller = aliSeller;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getResultDetails() {
        return resultDetails;
    }

    public void setResultDetails(String resultDetails) {
        this.resultDetails = resultDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersRefund refund = (OrdersRefund) o;

        if (id != refund.id) return false;
        if (userTicketsId != refund.userTicketsId) return false;
        if (batchNo != null ? !batchNo.equals(refund.batchNo) : refund.batchNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (userTicketsId ^ (userTicketsId >>> 32));
        result = 31 * result + (batchNo != null ? batchNo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", userTicketsId=" + userTicketsId +
                ", batchNo='" + batchNo + '\'' +
                ", refundDate=" + refundDate +
                ", money=" + money +
                ", resultDetails='" + resultDetails + '\'' +
                ", aliTradeNo='" + aliTradeNo + '\'' +
                ", aliBuyer='" + aliBuyer + '\'' +
                ", aliSeller='" + aliSeller + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", refundId='" + refundId + '\'' +
                '}';
    }
}

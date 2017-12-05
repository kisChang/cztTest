package com.temsoft.oms.order.model;

import java.util.Date;

/**
 * 结算账单变更日志
 *
 * @author KisChang
 * @version 1.0
 * @since 1.0
 */
public class SettlementBillLog implements java.io.Serializable{

    private long id;
    private long billId;
    private Date date;
    private String remark;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBillId() {
        return billId;
    }

    public void setBillId(long billId) {
        this.billId = billId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SettlementBillLog that = (SettlementBillLog) o;

        if (billId != that.billId) return false;
        if (id != that.id) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (billId ^ (billId >>> 32));
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SettlementBillLog{" +
                "id=" + id +
                ", billId=" + billId +
                ", date=" + date +
                ", remark='" + remark + '\'' +
                '}';
    }
}
package com.temsoft.oms.order.model;


import com.temsoft.oms.order.enums.BillGenType;
import com.temsoft.oms.order.enums.BillState;
import com.temsoft.oms.order.enums.BillType;

import java.util.Date;
import java.util.List;

/**
 * 结算账单
 *
 * @author KisChang
 * @version 1.0
 */
public class SettlementBill implements java.io.Serializable {

    private long id;
    private String billId;      //账单单号
    private String name;        //账单名称

    private long merchantId;    //商户Id
    private String month;       //账单月份描述(yyyy-MM)
    private String startDate;   //开始时间(yyyy-MM-dd)
    private String endDate;     //结束时间(yyyy-MM-dd)
    private Date createDate;    //出账时间
    private Date mcDate;        //商户确认时间
    private Date sysEndDate;    //账务确认结算时间

    private BillType type       //账单类型
            = BillType.WithdrawCash;
    private BillGenType genType //出账类型
            = BillGenType.SysOutBill;
    private BillState state     //账单状态
            = BillState.None;

    private List<SettlementBillLog> logs;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(long merchantId) {
        this.merchantId = merchantId;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getState() {
        return state.getValue();
    }

    public BillState getStateEnum() {
        return state;
    }

    public void setState(int state) {
        this.state = BillState.valueOf(state);
    }

    public Date getMcDate() {
        return mcDate;
    }

    public void setMcDate(Date mcDate) {
        this.mcDate = mcDate;
    }

    public Date getSysEndDate() {
        return sysEndDate;
    }

    public void setSysEndDate(Date sysEndDate) {
        this.sysEndDate = sysEndDate;
    }

    public int getType() {
        return type.getValue();
    }

    public BillType getTypeEnum() {
        return type;
    }

    public void setType(int type) {
        this.type = BillType.valueOf(type);
    }

    public int getGenType() {
        return genType.getValue();
    }

    public BillGenType getGenTypeEnum() {
        return genType;
    }

    public void setGenType(int genType) {
        this.genType = BillGenType.valueOf(genType);
    }

    public List<SettlementBillLog> getLogs() {
        return logs;
    }

    public void setLogs(List<SettlementBillLog> logs) {
        this.logs = logs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SettlementBill that = (SettlementBill) o;

        if (id != that.id) return false;
        if (merchantId != that.merchantId) return false;
        if (billId != null ? !billId.equals(that.billId) : that.billId != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (type != that.type) return false;
        if (genType != that.genType) return false;
        if (month != null ? !month.equals(that.month) : that.month != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (state != that.state) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (billId != null ? billId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (merchantId ^ (merchantId >>> 32));
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (genType != null ? genType.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SettlementBill{" +
                "id=" + id +
                ", billId='" + billId + '\'' +
                ", name='" + name + '\'' +
                ", merchantId=" + merchantId +
                ", month='" + month + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", createDate=" + createDate +
                ", mcDate=" + mcDate +
                ", sysEndDate=" + sysEndDate +
                ", type=" + type +
                ", genType=" + genType +
                ", state=" + state +
                ", logs=" + logs +
                '}';
    }
}

package com.temsoft.oms.order.model;


import com.temsoft.oms.commons.utils.WebUtils;
import com.temsoft.oms.order.enums.OrderGoodsLogType;

/**
 * 用户购买商品变动日志
 *
 * @author KisChang
 * @version 1.0
 * @date 2016年01月14日
 * @since 1.0
 */
public class OrderGoodsLog implements java.io.Serializable{

    private long id;
    private long ogId;
    private long consumerAccountId;     //所属用户ID
    private long operateId = -1;        //操作用户
    private boolean admin = false;      //操作用户是否为管理员 false为自己， true为管理员操作
    private String date;
    private OrderGoodsLogType type;
    private String remark;

    public OrderGoodsLog() {
    }

    public OrderGoodsLog(OrderGoods orderGoods) {
        this.setConsumerAccountId(orderGoods.getPlaceOrderUserId());
        this.setOperateId(orderGoods.getPlaceOrderUserId());
        this.setOgId(orderGoods.getId());
        this.setAdmin(false);
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

    public long getOgId() {
        return ogId;
    }

    public void setOgId(long ogId) {
        this.ogId = ogId;
    }

    public long getOperateId() {
        return operateId;
    }

    public void setOperateId(long operateId) {
        this.operateId = operateId;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public OrderGoodsLogType getTypeEnum() {
        return type;
    }

    public int getType() {
        return type.getValue();
    }

    public void setType(int type) {
        this.type = OrderGoodsLogType.valueOf(type);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setRemark(String remark, String msg) {
        this.remark = remark  + (msg == null ? "" : "  " + msg);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderGoodsLog that = (OrderGoodsLog) o;

        if (id != that.id) return false;
        if (ogId != that.ogId) return false;
        return consumerAccountId == that.consumerAccountId;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (ogId ^ (ogId >>> 32));
        result = 31 * result + (int) (consumerAccountId ^ (consumerAccountId >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "OrderGoodsLog{" +
                "id=" + id +
                ", ogId=" + ogId +
                ", consumerAccountId=" + consumerAccountId +
                ", date='" + date + '\'' +
                ", type=" + type +
                ", remark='" + remark + '\'' +
                '}';
    }
}

package com.temsoft.oms.order.model;


import com.temsoft.oms.commons.utils.WebUtils;
import com.temsoft.oms.order.enums.SettlementRuleType;

import java.math.BigDecimal;

/**
 * 结算规则
 *
 * @author KisChang
 * @version 1.0
 */
public class SettlementRule implements java.io.Serializable {

    private long id;
    private String name;
    private SettlementRuleType type
            = SettlementRuleType.None;
    private BigDecimal cutPrice
            = WebUtils.getZero();
    private BigDecimal rebate
            = WebUtils.getZero();

    private String remark;
    private long sysAccountId;
    private String lastUpdateDate;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SettlementRuleType getTypeEnum() {
        return type;
    }

    public int getType() {
        return type.getValue();
    }

    public void setType(int type) {
        this.type = SettlementRuleType.valueOf(type);
    }

    public BigDecimal getCutPrice() {
        return cutPrice;
    }

    public void setCutPrice(BigDecimal cutPrice) {
        this.cutPrice = cutPrice;
    }

    public BigDecimal getRebate() {
        return rebate;
    }

    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public long getSysAccountId() {
        return sysAccountId;
    }

    public void setSysAccountId(long sysAccountId) {
        this.sysAccountId = sysAccountId;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SettlementRule that = (SettlementRule) o;

        if (id != that.id) return false;
        if (rebate != that.rebate) return false;
        if (cutPrice != null ? !cutPrice.equals(that.cutPrice) : that.cutPrice != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != that.type) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (cutPrice != null ? cutPrice.hashCode() : 0);
        result = 31 * result + (rebate != null ? rebate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SettlementRule{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", cutPrice=" + cutPrice +
                ", rebate=" + rebate +
                '}';
    }
}

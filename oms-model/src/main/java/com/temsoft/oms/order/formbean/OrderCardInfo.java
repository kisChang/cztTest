package com.temsoft.oms.order.formbean;

import com.temsoft.oms.commons.utils.WebUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 订单使用的充值卡配置
 *
 * @author KisChang
 * @version 1.0
 * @date 2015年12月08日
 * @since 1.0
 */
public class OrderCardInfo implements java.io.Serializable{

    public static class CardInfo implements java.io.Serializable{
        private Long id;
        private BigDecimal money;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public BigDecimal getMoney() {
            return money;
        }

        public void setMoney(BigDecimal money) {
            this.money = money;
        }

        @Override
        public String toString() {
            return "{" +
                    "id=" + id +
                    ", money=" + money +
                    '}';
        }
    }

    private List<CardInfo> cardList;
    private Long changeId;

    public BigDecimal getCardMoney(){
        BigDecimal[] m = new BigDecimal[getCardList().size()];
        for(int i=0; i < getCardList().size() ; i++){
            CardInfo cardInfo = getCardList().get(i);
            m[i] = cardInfo.getMoney();
        }
        return WebUtils.addBigDecimal(m);
    }

    public List<CardInfo> putCardInfo(CardInfo add){
        List<CardInfo> temp = new ArrayList<>();
        boolean has = false;
        for(CardInfo cardInfo : this.getCardList()){
            if (Objects.equals(cardInfo.getId(), add.getId())){
                has = true;
                temp.add(add);
            }else {
                temp.add(cardInfo);
            }
        }
        if (!has){
            temp.add(add);
        }
        this.setCardList(temp);
        return this.getCardList();
    }

    public CardInfo getCardInfo(Long id){
        for(CardInfo cardInfo : this.getCardList()){
            if (Objects.equals(cardInfo.getId(), id)){
                return cardInfo;
            }
        }
        return null;
    }

    public List<CardInfo> getCardList() {
        return cardList;
    }

    public void setCardList(List<CardInfo> cardList) {
        this.cardList = cardList;
    }

    public Long getChangeId() {
        return changeId;
    }

    public void setChangeId(Long changeId) {
        this.changeId = changeId;
    }

    @Override
    public String toString() {
        return "OrderCardInfo{" +
                "cardList=" + cardList +
                ", changeId=" + changeId +
                '}';
    }
}

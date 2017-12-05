package com.temsoft.oms.order.enums.converters;

import com.temsoft.oms.order.enums.OrderStat;
import org.springframework.core.convert.converter.Converter;

public class OrderStatConverters implements Converter<String, OrderStat> {
    @Override
    public OrderStat convert(String s) {
        try{
            return OrderStat.valueOf(Integer.parseInt(s));
        }catch (Exception e){
            return OrderStat.valueOf(s);
        }
    }
}

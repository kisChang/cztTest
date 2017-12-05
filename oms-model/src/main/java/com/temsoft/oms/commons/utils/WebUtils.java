package com.temsoft.oms.commons.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 工具类
 *
 * @author KisChang
 */
public class WebUtils {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    public static String getDate() {
        return getDate(new Date());
    }
    public static String getDate(Date date) {
        return dateFormat.format(date);
    }


    //价格格式化
    private static DecimalFormat decimalFormat = new DecimalFormat("0.00");
    private static final BigDecimal zero = new BigDecimal(0.00);
    public static BigDecimal getZero() {
        return zero;
    }

    public static BigDecimal addBigDecimal(BigDecimal... decimals) {
        BigDecimal count = new BigDecimal(0);
        for (BigDecimal decimal : decimals){
            if (decimal != null){
                count = count.add(decimal);
            }
        }
        return count;
    }

    public static BigDecimal roundDecimal(BigDecimal price) {
        if (price == null){
            return zero;
        }else {
            return price.setScale(2, BigDecimal.ROUND_HALF_UP);
        }
    }

    public static BigDecimal subBigDecimal(BigDecimal source, BigDecimal... decimals) {
        if (source == null){
            return null;
        }
        for (BigDecimal decimal : decimals){
            if (decimal != null){
                source = source.subtract(WebUtils.roundDecimal(decimal));
            }
        }
        return WebUtils.roundDecimal(source);
    }

    public static String formatDecimal(BigDecimal decimal){
        if (decimal == null){
            return "0";
        }
        String str = decimalFormat.format(decimal);
        if (str.endsWith(".00")){
            return str.substring(0, str.length()-3);
        }else {
            return str;
        }
    }
}

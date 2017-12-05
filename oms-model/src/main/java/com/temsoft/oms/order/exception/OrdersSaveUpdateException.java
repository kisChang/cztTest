package com.temsoft.oms.order.exception;

/**
 * 订单存储异常
 *
 * @author KisChang
 * @version 1.0
 * @date 2015年12月09日
 * @since 1.0
 */
public class OrdersSaveUpdateException extends Exception {
    private int errorCode = -1;

    public OrdersSaveUpdateException() {
    }

    public OrdersSaveUpdateException(int errorCode) {
        this.errorCode = errorCode;
    }

    public OrdersSaveUpdateException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public OrdersSaveUpdateException(String message, Throwable cause, int errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public OrdersSaveUpdateException(Throwable cause, int errorCode) {
        super(cause);
        this.errorCode = errorCode;
    }

    public OrdersSaveUpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int errorCode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}

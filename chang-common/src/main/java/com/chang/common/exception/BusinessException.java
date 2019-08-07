package com.chang.common.exception;

/**
 * @author: SunChang
 * @Date: 2019/8/7 22:57
 * @Description: 业务异常
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 7055296764259742246L;

    protected final String message;

    public BusinessException(String message) {
        this.message = message;
    }

    public BusinessException(String message, Throwable e) {
        super(message, e);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

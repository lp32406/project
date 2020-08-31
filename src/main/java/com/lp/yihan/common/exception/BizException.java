package com.lp.yihan.common.exception;

/**
 * @author lp
 * @create 2020/5/30 19:43
 * 自定义异常
 */
public class BizException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    protected Integer errorCode;

    protected String message;

    public BizException() {super();}

    public BizException(String msg) {
        super(msg);
    }

    public BizException(Integer errorCode,String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

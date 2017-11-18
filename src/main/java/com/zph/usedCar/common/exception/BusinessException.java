package com.zph.usedCar.common.exception;

/**
 * @notes 业务异常
 * @autho zph
 * @createTime 2017/11/16 20:27
 */
public class BusinessException extends RuntimeException{

    private static final long serialVersionUID = 9073068172854854350L;

    /**
     * 构造一个空的异常.
     */
    public BusinessException() {
        super();
    }

    /**
     * 构造一个异常, 指明异常的详细信息.
     *
     * @param message 详细信息
     */
    public BusinessException(String message) {
        super(message);
    }

    /**
     * 构造一个异常, 指明引起这个异常的起因.
     *
     * @param cause 异常的起因
     */
    public BusinessException(Throwable cause) {
        super(cause);
    }

    /**
     * 构造一个异常, 指明引起这个异常的起因.
     *
     * @param message 详细信息
     * @param cause 异常的起因
     */
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}

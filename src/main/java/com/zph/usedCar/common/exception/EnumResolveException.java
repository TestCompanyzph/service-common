package com.zph.usedCar.common.exception;

/**
 * @notes 枚举类解析异常
 * @autho zph
 * @createTime 2017/11/18 10:32
 */
public class EnumResolveException extends RuntimeException {

    private static final long serialVersionUID = -936537116056667742L;

    /**
     * 构造一个空的异常.
     */
    public EnumResolveException() {
        super();
    }

    /**
     * 构造一个异常, 指明异常的详细信息.
     *
     * @param message 详细信息
     */
    public EnumResolveException(String message) {
        super(message);
    }

    /**
     * 构造一个异常, 指明引起这个异常的起因.
     *
     * @param cause 异常的起因
     */
    public EnumResolveException(Throwable cause) {
        super(cause);
    }

    /**
     * 构造一个异常, 指明引起这个异常的起因.
     *
     * @param message 详细信息
     * @param cause 异常的起因
     */
    public EnumResolveException(String message, Throwable cause) {
        super(message, cause);
    }

}

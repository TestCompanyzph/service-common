package com.zph.usedCar.common.response;

import com.zph.usedCar.common.exception.EnumResolveException;

/**
 * @notes 响应状态码
 * @autho zph
 * @createTime 2017/11/18 10:31
 */
public enum ResultCode {

    RESULT_SUCCESS(101, "成功"), RESULT_FAIL(102, "失败");

    private int code;
    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }


    public static ResultCode resolve(int code) {
        for (ResultCode resultCode : ResultCode.values()) {
            if (resultCode.getCode() == code) {
                return resultCode;
            }
        }
        throw new EnumResolveException("错误的返回结果代码");
    }

    public static boolean isSuccess(int code) {
        return RESULT_SUCCESS.equals(resolve(code));
    }
}

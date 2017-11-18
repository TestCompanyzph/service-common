package com.zph.usedCar.common.response;

import java.io.Serializable;

/**
 * @notes 结果响应（无分页）
 * @autho zph
 * @createTime 2017/11/16 20:37
 */
public class Response<T> implements Serializable {

    private static final long serialVersionUID = -1803314875570831012L;
    private int code;
    private String message;
    private T data;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Response() {
    }

    public Response<T> success() {
        this.code = ResultCode.RESULT_SUCCESS.getCode();
        return this;
    }

    public Response<T> data(T data) {
        this.data = data;
        return this;
    }

    public Response fail() {
        this.code = ResultCode.RESULT_FAIL.getCode();
        return this;
    }

    public Response<T> message(String message) {
        this.message = message;
        return this;
    }

    public boolean isSuccess() {
        return ResultCode.isSuccess(this.code);
    }
}

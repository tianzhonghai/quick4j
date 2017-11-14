package com.sgs.quick4j.infrastructure;

import java.io.Serializable;

/**
 * Created by Tim_Tian ON 2017/10/13 15:20
 */
public class GeneralResp<T> implements Serializable {
    private static final long serialVersionUID = 7365417829056921958L;
    private int status;
    private String message;
    private T data;

    public GeneralResp(){
        this.status = 200;
        this.message = "";
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public GeneralResp success() {
        this.setStatus(RespEnum.SUCCESS.getValue());
        return this;
    }

    public GeneralResp fail(){
        this.setStatus(RespEnum.FAIL.getValue());
        return this;
    }
}

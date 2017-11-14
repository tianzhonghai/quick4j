package com.sgs.quick4j.facade.req;

import com.sgs.quick4j.facade.BaseReq;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by Tim_Tian ON 2017/10/17 8:38
 */
public class GetUserInfoReq extends BaseReq {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Min(1L)
    private Integer userID;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }
}

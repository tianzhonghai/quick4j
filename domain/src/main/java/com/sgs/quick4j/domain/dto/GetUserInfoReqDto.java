package com.sgs.quick4j.domain.dto;

import com.sgs.quick4j.infrastructure.BaseReq;

/**
 * Created by Tim_Tian ON 2017/10/13 14:37
 */
public class GetUserInfoReqDto extends BaseReq {
    private Integer userID;
    private String userName;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

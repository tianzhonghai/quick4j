package com.sgs.quick4j.domain.dto;

import com.sgs.quick4j.infrastructure.BasePageReq;

public class GetUserInfoListPagedReqDto extends BasePageReq {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

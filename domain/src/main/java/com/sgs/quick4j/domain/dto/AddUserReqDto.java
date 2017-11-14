package com.sgs.quick4j.domain.dto;

import com.sgs.quick4j.infrastructure.BaseReq;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by Tim_Tian ON 2017/10/13 15:09
 */
public class AddUserReqDto extends BaseReq {
    @NotBlank
    private String userName;
    @Min(0)
    private Integer deptID;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getDeptID() {
        return deptID;
    }

    public void setDeptID(Integer deptID) {
        this.deptID = deptID;
    }
}

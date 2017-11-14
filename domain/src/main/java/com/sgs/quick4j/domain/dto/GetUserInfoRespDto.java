package com.sgs.quick4j.domain.dto;

/**
 * Created by Tim_Tian ON 2017/10/13 14:37
 */
public class GetUserInfoRespDto {
    private Integer userid;

    private String name;

    private Integer deptid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
}

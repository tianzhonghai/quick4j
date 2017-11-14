package com.sgs.quick4j.facade.resp;

import com.sgs.quick4j.facade.BaseResp;

/**
 * Created by Tim_Tian ON 2017/10/17 8:39
 */
public class GetUserInfoResp extends BaseResp {
    private static final long serialVersionUID = 1L;

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

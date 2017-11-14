package com.sgs.quick4j.domain.entity.generated;

public class UserProfileEntity {
    private Integer userid;

    private String qq;

    private String msn;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn == null ? null : msn.trim();
    }
}
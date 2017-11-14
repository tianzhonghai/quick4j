package com.sgs.quick4j.facade;

import com.sgs.quick4j.facade.req.GetUserInfoReq;
import com.sgs.quick4j.facade.resp.GetUserInfoResp;

/**
 * Created by Tim_Tian ON 2017/10/17 8:40
 */
public interface UserFacade {
    GetUserInfoResp getUserInfo(GetUserInfoReq req);
}

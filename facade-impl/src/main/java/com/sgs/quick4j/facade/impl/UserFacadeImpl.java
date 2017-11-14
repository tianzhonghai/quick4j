package com.sgs.quick4j.facade.impl;

import com.sgs.quick4j.domain.dto.GetUserInfoRespDto;
import com.sgs.quick4j.domain.service.UserService;
import com.sgs.quick4j.facade.UserFacade;
import com.sgs.quick4j.facade.req.GetUserInfoReq;
import com.sgs.quick4j.facade.resp.GetUserInfoResp;
import com.sgs.quick4j.infrastructure.utils.DozerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Tim_Tian ON 2017/10/17 8:42
 */
@Service("userFacade")
public class UserFacadeImpl implements UserFacade {

    @Autowired
    private UserService userService;

    @Override
    public GetUserInfoResp getUserInfo(GetUserInfoReq req) {
        GetUserInfoRespDto dto = userService.getUserInfoByID(req.getUserID());
        return DozerUtils.mapItem(dto, GetUserInfoResp.class);
    }
}

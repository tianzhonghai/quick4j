package com.sgs.quick4j.domain.service;

import com.sgs.quick4j.domain.dto.AddUserReqDto;
import com.sgs.quick4j.domain.dto.GetUserInfoReqDto;
import com.sgs.quick4j.domain.dto.GetUserInfoRespDto;
import com.sgs.quick4j.infrastructure.exception.BizException;

import java.util.List;

/**
 * Created by Tim_Tian ON 2017/10/13 14:35
 */
public interface UserService {
    /**
     * 按userid获取用户信息
     * @param userID
     * @return
     */
    GetUserInfoRespDto getUserInfoByID(int userID);
    /**
     * 获取用户信息
     * @param getUserInfoReqDto
     * @return
     */
    List<GetUserInfoRespDto> getUserInfoList( GetUserInfoReqDto getUserInfoReqDto );

    void addUserInfo(AddUserReqDto dto);
}

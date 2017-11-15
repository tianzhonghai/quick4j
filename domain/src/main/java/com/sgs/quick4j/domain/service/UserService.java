package com.sgs.quick4j.domain.service;

import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageInterceptor;
import com.sgs.quick4j.domain.dto.*;
import com.sgs.quick4j.infrastructure.PagedCollectionResp;
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

    /**
     * 添加用户
     * @param dto
     */
    void addUserInfo(AddUserReqDto dto);

    /**
     * 分页查义用户信息
     * @param getUserInfoListPagedReqDto
     * @return
     */
    PagedCollectionResp<GetUserInfoListPagedRespDto> getUserInfoListPaged(GetUserInfoListPagedReqDto getUserInfoListPagedReqDto);
}

package com.sgs.quick4j.domain.service;

import com.sgs.quick4j.domain.dto.AddUserReqDto;
import com.sgs.quick4j.domain.dto.GetUserInfoReqDto;
import com.sgs.quick4j.domain.dto.GetUserInfoRespDto;
import com.sgs.quick4j.domain.entity.generated.UserEntity;
import com.sgs.quick4j.domain.entity.generated.UserEntityExample;
import com.sgs.quick4j.domain.repository.generated.UserMapper;
import com.sgs.quick4j.infrastructure.exception.BizException;
import com.sgs.quick4j.infrastructure.utils.DozerUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tim_Tian ON 2017/10/13 14:39
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取用户信息
     * @param userID
     * @return
     * @throws BizException
     */
    public GetUserInfoRespDto getUserInfoByID(int userID) {
        UserEntity userEntity = userMapper.selectByPrimaryKey(userID);
        if(userEntity == null) BizException.throwFail("userid="+userID+"不存在");
        return DozerUtils.mapItem(userEntity, GetUserInfoRespDto.class);
    }

    /**
     * 查询用户信息列表
     * @param getUserInfoReqDto
     * @return
     * @throws BizException
     */
    public List<GetUserInfoRespDto> getUserInfoList(GetUserInfoReqDto getUserInfoReqDto) {
        UserEntityExample userEntityExample = new UserEntityExample();
        if(getUserInfoReqDto.getUserID() != null && getUserInfoReqDto.getUserID() > 0){
            userEntityExample.createCriteria().andUseridEqualTo(getUserInfoReqDto.getUserID());
        }
        if(! StringUtils.isBlank(getUserInfoReqDto.getUserName())){
            userEntityExample.createCriteria().andNameLike(getUserInfoReqDto.getUserName());
        }

        List<UserEntity> userEntities = userMapper.selectByExample(userEntityExample);

        List<GetUserInfoRespDto> getUserInfoRespDtos = DozerUtils.mapList(userEntities, GetUserInfoRespDto.class);
        return getUserInfoRespDtos;
    }

    @Override
    public void addUserInfo(AddUserReqDto dto) {

        int a = 0;
    }
}

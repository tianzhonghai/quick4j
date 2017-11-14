package com.sgs.quick4j.web.controllers;

import com.sgs.quick4j.domain.dto.AddUserReqDto;
import com.sgs.quick4j.domain.dto.GetUserInfoReqDto;
import com.sgs.quick4j.domain.dto.GetUserInfoRespDto;
import com.sgs.quick4j.domain.service.UserService;
import com.sgs.quick4j.infrastructure.exception.BizException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Tim_Tian ON 2017/10/18 8:51
 */
@RestController
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getuserinfo")
    public GetUserInfoRespDto getUserInfo(@RequestParam("userid") Integer userID) throws BizException {
        return userService.getUserInfoByID(userID);
    }

    @RequestMapping(value = "/getuserinfolist", method = RequestMethod.POST)
    public List<GetUserInfoRespDto> getUserInfoList(@RequestBody GetUserInfoReqDto getUserInfoReqDto){
        return userService.getUserInfoList(getUserInfoReqDto);
    }

    @RequestMapping(value = "/adduserinfo", method = RequestMethod.POST)
    public String addUserInfo(@RequestBody AddUserReqDto addUserReqDto){
        userService.addUserInfo(addUserReqDto);
        return "ok";
    }

    @RequestMapping(value = "/exception", method = RequestMethod.GET)
    public String exception(){
        int a = 1,b,c;
        c = a / 0;
        return "ok";
    }
}

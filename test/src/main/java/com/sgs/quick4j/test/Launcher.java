package com.sgs.quick4j.test;

import com.sgs.quick4j.facade.UserFacade;
import com.sgs.quick4j.facade.req.GetUserInfoReq;
import com.sgs.quick4j.facade.resp.GetUserInfoResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tim_Tian ON 2017/10/17 17:56
 */
public class Launcher {
    private static Logger logger = LoggerFactory.getLogger(Launcher.class);
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserFacade userFacade = (UserFacade) ctx.getBean("userFacade");

        GetUserInfoReq req = new GetUserInfoReq();
        req.setUserID(1);
        GetUserInfoResp resp = userFacade.getUserInfo(req);


        logger.info("执行结果：" +resp.getName());
    }
}

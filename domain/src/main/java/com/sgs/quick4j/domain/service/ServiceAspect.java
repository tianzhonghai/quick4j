package com.sgs.quick4j.domain.service;

import com.sgs.quick4j.infrastructure.BaseReq;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 服务层方法统一处理
 * Created by Tim_Tian ON 2017/10/18 10:01
 */
@Aspect
@Configuration
public class ServiceAspect {

    private Logger logger = LoggerFactory.getLogger(ServiceAspect.class);

    @Pointcut("execution(* com.sgs.quick4j.domain.service.*Service.*(*)) && args(req)")
    public void executeService(BaseReq req) {};

    /*
    * 通过连接点切入
    */
    @Before("executeService(req)")
    public void doValid(BaseReq req){
        logger.debug("方法验证");
        req.doValidate();
    }
}

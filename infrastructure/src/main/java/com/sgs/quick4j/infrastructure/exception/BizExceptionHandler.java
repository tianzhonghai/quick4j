package com.sgs.quick4j.infrastructure.exception;

import com.sgs.quick4j.infrastructure.GeneralResp;
import com.sgs.quick4j.infrastructure.RespEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Tim_Tian ON 2017/10/13 15:23
 */
@RestControllerAdvice(basePackages = "com.sgs.quick4j.web.controllers")
public class BizExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(BizExceptionHandler.class);
//    @ExceptionHandler(value = Exception.class)
//    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("exception", e);
//        mav.addObject("url", req.getRequestURL());
//        mav.setViewName("error");
//        return mav;
//    }

    @ExceptionHandler(value = { BizException.class, Exception.class })
    @ResponseBody
    public GeneralResp<String> jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        logger.error(e.getMessage(),e);
        GeneralResp<String> r = new GeneralResp<>();
        r.setMessage(e.getMessage());
        r.setStatus(RespEnum.FAIL.getValue());
        //r.setData("Some Data");
        return r;
    }
}
package com.zyg.exception;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: zhaoyuanguang
 * Date: 2019/6/19 23:14
 * Content:
 */

//ControllerAdvice配合ExceptionHandler可以统一处理系统的异常
@ControllerAdvice
public class ExceptionCatch {
    public static final Logger LOGGER = LoggerFactory.getLogger(ExceptionCatch.class);

    @ExceptionHandler(CustomException.class)
    public void catchLogger(CustomException e) {
        LOGGER.error("catch exception :{}\r\nexception:", e.getMessage(),e.getClass(),e);
    }


    @ExceptionHandler(Exception.class)
    public void catchLogger2(Exception e) {
        System.out.println("exceptions not define");
        LOGGER.error("catch exception :{}\r\nexception:", e.getMessage(),e.getClass(),e);
    }
}

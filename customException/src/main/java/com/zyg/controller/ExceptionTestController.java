package com.zyg.controller;

import com.zyg.exception.CustomException;
import com.zyg.exception.ExceptionCatch;
import com.zyg.exceptionInfo.ExceptionInfoEnum;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: zhaoyuanguang
 * Date: 2019/6/20 0:19
 * Content: 异常测试类
 */
@RestController
@RequestMapping("/exception")
public class ExceptionTestController {
    /**
     * 测试自定义异常
     */
    @RequestMapping("/testCustomException")
    public void CustomException() {
       CustomException.cast(ExceptionInfoEnum.INFO_DATAISNULL);
    }

    /**
     * 测试非自定义异常
     */
    @RequestMapping("/testException")
    public void testException() {
        int a = 1/0;
    }
}

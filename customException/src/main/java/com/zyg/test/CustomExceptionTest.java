package com.zyg.test;


import com.zyg.exception.CustomException;
import com.zyg.exceptionInfo.ExceptionInfoEnum;

/**
 * Author: zhaoyuanguang
 * Date: 2019/6/19 23:03
 * Content:自定义异常测试类
 */




public class CustomExceptionTest {
    public static void main(String[] args) {
        CustomException.cast(ExceptionInfoEnum.INFO_DATAISNULL);
    }
}



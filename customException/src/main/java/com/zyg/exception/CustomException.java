package com.zyg.exception;


import com.zyg.exceptionInfo.ExceptionInfoEnum;

/**
 * Author: zhaoyuanguang
 * Date: 2019/6/19 22:35
 * Content:自定义异常继承RuntimeException
 */
public  class CustomException extends RuntimeException {
    /**
     * 构造方法
     * @param exceptionInfoEnum 自定义异常信息
     */
    public CustomException(ExceptionInfoEnum exceptionInfoEnum) {
        super("错误代码："+exceptionInfoEnum.code()+"  错误信息:"+exceptionInfoEnum.message());
    }

    /**
     * 定义抛出异常方法，直观，方便调用
     * @param exceptionInfoEnum
     */
    public static void cast(ExceptionInfoEnum exceptionInfoEnum) {
        throw new CustomException(exceptionInfoEnum);
    }
}

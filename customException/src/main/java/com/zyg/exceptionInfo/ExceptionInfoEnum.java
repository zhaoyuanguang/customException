package com.zyg.exceptionInfo;

/**
 * Author: zhaoyuanguang
 * Date: 2019/6/19 22:42
 * Content: 自定义异常的类型，方便添加
 */
public enum ExceptionInfoEnum {
    //枚举类型的值必须卸载属性和方法的上面，否则会报错
    INFO_EXISTSNAME(false, 10001, "页面名称已存在！"),
    INFO_DATAISNULL(false, 10002, "获取数据为空"),
    INFO_SAVEPAGEERROR(false, 100003, "保存页面出错！");

    //操作结果
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    private ExceptionInfoEnum(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    public boolean success() {
        return success;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }
}

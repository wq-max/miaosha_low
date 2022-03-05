package com.miaoshaproject.error;

public enum EmBusinessError implements CommonError{
    //通用错误类型00001
    PARAMETER_VALIDATION_ERROR(100001, "参数不合法"),
    UNKNOWN_ERROR(100002, "未知错误"),

    //20000开头为用户信息相关错误
    USER_NOT_EXIST(20001, "用户不存在"),
    USER_LOGIN_FAIL(20002, "用户手机号或密码错误"),
    USER_NOT_LOGIN(20003, "用户还未登录"),

    //30000开头为交易信息错误
    STOCK_NOT_ENOUGH(30001, "库存不足"),

    ;

    EmBusinessError(int errCode, String errMsg){
        this.errMsg = errMsg;
        this.errCode = errCode;
    }

    private int errCode;
    private String errMsg;

    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}

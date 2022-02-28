package com.miaoshaproject.error;

public enum EmBusinessError implements CommonError{
    //通用错误类型00001
    PARAMETER_VALIDATION_ERROR(100001, "参数不合法"),
    UNKNOWN_ERROR(100002, "未知错误"),

    //10000开头为用户信息相关错误
    USER_NOT_EXIST(20001, "用户不存在"),

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

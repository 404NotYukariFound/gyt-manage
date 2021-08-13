package com.eight.gytManage.utils;

/**
 * @Author Kele-Bing
 * @Create 2021/8/12 18:11
 * @Version 1.0
 * 
 * 返回前端前，封装状态码和状态信息
 */
public enum EnMsgType {
    CUSTOM(0,"自定义信息"),  //自定义状态码和信息
    FAIL(99999, "服务器内部开了点小差，请重试。。。。。"),                 //此错误代码仅仅可用于，拦截到未知异常，其他业务异常请自行定义
    SUCCESS(88888, "请求处理成功"),  //特殊
    PARAMETER_VALIDATION_ERROR(10001, "参数不合法"),
    UNKNOWN_ERROR(10000, "未知错误"),

    //用20000开头来表示用户模块的错误信息
    /* 用户错误 */
    USER_ACCOUNT_EXPIRED(2002, "账号已过期"),
    USER_NOT_LOGIN(20001, "用户未登录"),
    USER_CREDENTIALS_ERROR(2003, "密码错误"),
    USER_CREDENTIALS_EXPIRED(2004, "密码过期"),
    USER_ACCOUNT_DISABLE(2005, "账号不可用"),
    USER_ACCOUNT_LOCKED(2006, "账号被锁定"),
    USER_ACCOUNT_NOT_EXIST(2007, "账号不存在"),
    USER_ACCOUNT_ALREADY_EXIST(2008, "账号已存在"),
    USER_ACCOUNT_USE_BY_OTHERS(2009, "账号下线"),
    USER_REGISTER_FAILED(2010, "注册失败"),
    MOBILEPHONE_ERROR(2011, "手机号不正确"),
    IDNO_ERROR(2017, "身份证号不正确"),
    USER_LOGIN_FAILED(2012, "登陆失败"),
    MODIFY_USER_MESSAGE_FAILED(2013, "修改用户信息失败"),
    OLDPASSWORD_ERROR(2014, "旧密码错误"),
    INPUT_NOT_NULL(2015, "密码输入不能为空，请重新输入"),
    NEWPASSWORD_NOT_EQUAL(2016, "两次输入的新密码不一致，请重新输入"),
    ORG_NAME_ERROR(2018, "企业名称错误，请检查是否与注册时一致"),
    WAIT_XIAN_CHECK(2019,"等待县局审核，请耐心等待！"),
    XIAN_CHECK_NOT_PASSED(2020,"县局审核不通过，请联系县局处理！"),
    XIAN_CHECK_PASSED(2021,"县局审核通过待市局审核，请耐心等待！"),
    SHI_CHECK_NOT_PASSED(2022,"市局审核不通过，请联系县局处理！"),
    SHI_CHECK_PASSED(2023,"市局审核通过待省局审核，请耐心等待！"),
    SHENG_CHECK_NOT_PASSED(2024,"省局审核不通过，请联系县局处理！"),
    OPWD_EQUAL_NPWD(2025,"新密码与原密码相同，无需修改！"),
    USERNAME_ERROR(2026,"用户名须以字母开头，长度为5-12位！"),
    /* 业务错误 */
    NO_PERMISSION(10001, "没有权限"),
    INTEGRITY_CONSTRAINT_ERROE(40001,"违反数据完整性，请检查是否有其他数据关联"),
    
    ;

    private int code;
    private String msg;
     EnMsgType(int code, String msg) {
        this.code  = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

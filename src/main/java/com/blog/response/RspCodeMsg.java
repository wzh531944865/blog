package com.blog.response;

/**
 * 响应码及说明定义
 * 
 * @author daihui.gu
 * @create 2015年8月19日
 */
public enum RspCodeMsg {
    // 0 开头表示基本成功失败状态
    SUCCESS("0000", "处理成功"), //
    FAIL("0001", "处理失败"), //
    NULL("0002", "结果为null"), //

    TIME_FORMAT("1001","时间格式有误，格式为HH:MM"),
    DATA_PARSE_EXP("1012", "数据解析异常"), //
    NO_AUTH_EXP("1013", "没有权限"), //
    FORM_PARSE_EXP("1002", "参数解析异常"), //

    APP_GPS_POINT_LOST("2001", "APP GPS点丢失"), //

    HTTP_EXP("9002", "HTTP请求异常"), //
    EX_PARSE_EXP("-1", "参数异常");

    private String code;
    private String msg;

    RspCodeMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 根据code搜索RspCodeMsg实例
     * 
     * @param code 状态码
     * @return 状态实例，可能为null
     */
    public static RspCodeMsg find(String code) {
        RspCodeMsg result = null;
        for (RspCodeMsg rsp : RspCodeMsg.values()) {
            if (rsp.getCode().equals(code)) {
                result = rsp;
            }
        }
        return result;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return code + "-" + msg;
    }
}

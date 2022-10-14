package org.javaboy.encrypt.starter.model;

import org.javaboy.encrypt.starter.utils.HttpStatus;
import org.javaboy.encrypt.starter.utils.StringUtils;

import java.util.HashMap;

/**
 * @author 江南一点雨
 * @微信公众号 江南一点雨
 * @网站 http://www.itboyhub.com
 * @国际站 http://www.javaboy.org
 * @微信 a_java_boy
 * @GitHub https://github.com/lenve
 * @Gitee https://gitee.com/lenve
 */
public class AjaxResult extends HashMap<String, Object> {
    private String msg;
    private Integer code;
    private Object data;

    public static AjaxResult build() {
        return new AjaxResult();
    }

    public static AjaxResult ok(String msg) {
        return new AjaxResult(200, msg, null);
    }

    public static AjaxResult ok(String msg, Object obj) {
        return new AjaxResult(200, msg, obj);
    }

    public static AjaxResult error(String msg) {
        return new AjaxResult(500, msg, null);
    }

    public static AjaxResult error(String msg, Object obj) {
        return new AjaxResult(500, msg, obj);
    }

    private AjaxResult() {
    }

    private AjaxResult(Integer status, String msg, Object obj) {
        this.code = status;
        this.msg = msg;
        this.data = obj;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


//private static final long serialVersionUID = 1L;
    //
    ///** 状态码 */
    //
    //public static final String CODE_TAG = "code";
    //
    ///** 返回内容 */
    //
    //public static final String MSG_TAG = "msg";
    //
    ///** 数据对象 */
    //
    //public static final String DATA_TAG = "data";
    //
    ///**
    // * 初始化一个新创建的 AjaxResult 对象，使其表示一个空消息。
    // */
    //public AjaxResult()
    //{
    //}
    //
    ///**
    // * 初始化一个新创建的 AjaxResult 对象
    // *
    // * @param code 状态码
    // * @param msg 返回内容
    // */
    //public AjaxResult(int code, String msg)
    //{
    //    super.put(CODE_TAG, code);
    //    super.put(MSG_TAG, msg);
    //}
    //
    ///**
    // * 初始化一个新创建的 AjaxResult 对象
    // *
    // * @param code 状态码
    // * @param msg 返回内容
    // * @param data 数据对象
    // */
    //public AjaxResult(int code, String msg, Object data)
    //{
    //    super.put(CODE_TAG, code);
    //    super.put(MSG_TAG, msg);
    //    if (StringUtils.isNotNull(data))
    //    {
    //        super.put(DATA_TAG, data);
    //    }
    //}
    //
    ///**
    // * 返回成功消息
    // *
    // * @return 成功消息
    // */
    //public static AjaxResult success()
    //{
    //    return AjaxResult.success("操作成功");
    //}
    //
    ///**
    // * 返回成功数据
    // *
    // * @return 成功消息
    // */
    //public static AjaxResult success(Object data)
    //{
    //    return AjaxResult.success("操作成功", data);
    //}
    //
    ///**
    // * 返回成功消息
    // *
    // * @param msg 返回内容
    // * @return 成功消息
    // */
    //public static AjaxResult success(String msg)
    //{
    //    return AjaxResult.success(msg, null);
    //}
    //
    ///**
    // * 返回成功消息
    // *
    // * @param msg 返回内容
    // * @param data 数据对象
    // * @return 成功消息
    // */
    //public static AjaxResult success(String msg, Object data)
    //{
    //    return new AjaxResult(HttpStatus.SUCCESS, msg, data);
    //}
    //
    ///**
    // * 返回错误消息
    // *
    // * @return
    // */
    //public static AjaxResult error()
    //{
    //    return AjaxResult.error("操作失败");
    //}
    //
    ///**
    // * 返回错误消息
    // *
    // * @param msg 返回内容
    // * @return 警告消息
    // */
    //public static AjaxResult error(String msg)
    //{
    //    return AjaxResult.error(msg, null);
    //}
    //
    ///**
    // * 返回错误消息
    // *
    // * @param msg 返回内容
    // * @param data 数据对象
    // * @return 警告消息
    // */
    //public static AjaxResult error(String msg, Object data)
    //{
    //    return new AjaxResult(HttpStatus.ERROR, msg, data);
    //}
    //
    ///**
    // * 返回错误消息
    // *
    // * @param code 状态码
    // * @param msg 返回内容
    // * @return 警告消息
    // */
    //public static AjaxResult error(int code, String msg)
    //{
    //    return new AjaxResult(code, msg, null);
    //}
    //
    ///**
    // * 方便链式调用
    // *
    // * @param key 键
    // * @param value 值
    // * @return 数据对象
    // */
    //@Override
    //public AjaxResult put(String key, Object value)
    //{
    //    super.put(key, value);
    //    return this;
    //}
}

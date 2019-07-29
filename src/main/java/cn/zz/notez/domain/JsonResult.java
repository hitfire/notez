package cn.zz.notez.domain;

import cn.hutool.json.JSONUtil;

import java.io.Serializable;

/**
 * Json返回对象
 *
 * @author: zz
 * @date: 2018/10/11 16:46
 */
public class JsonResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final int RESULT_SUCCESS = 1;

    public static final int RESULT_FAIL = 0;

    private int code = 0;

    private String msg;

    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public JsonResult() {
    }

    public JsonResult(String msg) {
        this.msg = msg;
    }

    public JsonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public JsonResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return JSONUtil.toJsonStr(this);
    }
}

package top.inklov3.common.core.domain;

import java.io.Serializable;

/**
 * @author inklov3
 *
 * 响应主体
 */
public class Response<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /** 成功 */
    public static final int SUCCESS = 200;

    /** 未登录 */
    public static final int NOT_LOGIN = 401;

    /** 失败 */
    public static final int FAIL = 500;

    private int code;

    private String msg;

    private T data;

    public static <T> Response<T> ok()
    {
        return restResult(null, SUCCESS, null);
    }

    public static <T> Response<T> notLogin(){
        return restResult(null, NOT_LOGIN, "未登录");
    }

    public static <T> Response<T> ok(T data)
    {
        return restResult(data, SUCCESS, null);
    }

    public static <T> Response<T> ok(T data, String msg)
    {
        return restResult(data, SUCCESS, msg);
    }

    public static <T> Response<T> fail()
    {
        return restResult(null, FAIL, null);
    }

    public static <T> Response<T> fail(String msg)
    {
        return restResult(null, FAIL, msg);
    }

    public static <T> Response<T> fail(T data)
    {
        return restResult(data, FAIL, null);
    }

    public static <T> Response<T> fail(T data, String msg)
    {
        return restResult(data, FAIL, msg);
    }

    public static <T> Response<T> fail(int code, String msg)
    {
        return restResult(null, code, msg);
    }

    public static <T> Response<T> buildResponse(T data, int code, String msg){
        return restResult(data, code, msg);
    }

    private static <T> Response<T> restResult(T data, int code, String msg)
    {
        Response<T> apiResult = new Response<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public static <T> Boolean isError(Response<T> ret)
    {
        return !isSuccess(ret);
    }

    public static <T> Boolean isSuccess(Response<T> ret)
    {
        return Response.SUCCESS == ret.getCode();
    }
}
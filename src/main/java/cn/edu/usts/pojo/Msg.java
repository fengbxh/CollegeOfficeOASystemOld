package cn.edu.usts.pojo;

public class Msg<T> {
    /**
     * 信息状态码，0表示成功，1表示失败
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 返回的对象,因为有分页信息，方便返回json数据见名之意，这里直接变量名为pageInfo。
     */
    private T pageInfo;

    public static Msg<Object> success(Object object) {
        Msg result = new Msg();
        result.setCode(200);
        result.setMsg("成功");
        result.setPageInfo(object);
        return result;
    }

    public static Msg<Object> success() {
        Msg result = new Msg();
        result.setCode(200);
        result.setMsg("成功");
        result.setPageInfo(null);
        //return success(null);
        return result;
    }

    public static Msg<Object> fail() {
        Msg result = new Msg();
        result.setCode(400);
        result.setMsg("失败");
        return result;
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

    public T getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(T pageInfo) {
        this.pageInfo = pageInfo;
    }
}

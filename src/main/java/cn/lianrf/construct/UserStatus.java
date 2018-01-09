package cn.lianrf.construct;

/**
 * Created by lianrongfa on 2017/12/22.
 */
public enum UserStatus {
    AUDITED(0, "待审核"),
    PASS(1, "审核通过"),
    NOT_PASS(2, "未通过");

    private int code;
    private String msg;


    UserStatus(int code, String msg) {
        this.code = code;
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

    @Override
    public String toString() {
        return this.getMsg();
    }
}

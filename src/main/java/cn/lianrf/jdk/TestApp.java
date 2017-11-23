package cn.lianrf.jdk;

/**
 * Created by lianrongfa on 2017/11/6.
 */
public class TestApp {
    public static void main(String[] args) {
        Student student = new Student();
        StudentProxy studentProxy = new StudentProxy(student);
        IStudent proxy = (IStudent) studentProxy.getProxy();
        proxy.say();
    }
}

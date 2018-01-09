package cn.lianrf.jdk;

import org.aspectj.weaver.ast.Test;

/**
 * Created by lianrongfa on 2017/11/6.
 */
public class TestApp {
    public static void main(String[] args) {

        System.out.println(TestApp.class.hashCode());
        System.out.println(Object.class.hashCode());
        System.out.println(new TestApp().hashCode());
        System.out.println(new Object().hashCode());
        System.out.println(TestApp.class.hashCode());
        System.out.println(Object.class.hashCode());

    }

    private static void test1() {
        Student student = new Student();
        StudentProxy studentProxy = new StudentProxy(student);
        IStudent proxy = (IStudent) studentProxy.getProxy();
        proxy.say();
    }
    public void test2(){
        System.out.println("11");
    }
}

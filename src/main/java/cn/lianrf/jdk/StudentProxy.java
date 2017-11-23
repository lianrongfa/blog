package cn.lianrf.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by lianrongfa on 2017/11/6.
 */
public class StudentProxy implements InvocationHandler{
    private Object target;

    public StudentProxy() {
    }

    public StudentProxy(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("------------");
        Object invoke = method.invoke(target, args);
        System.out.println("------------");
        return invoke;
    }
    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                target.getClass().getInterfaces(), this);
    }
}

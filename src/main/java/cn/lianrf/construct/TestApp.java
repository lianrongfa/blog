package cn.lianrf.construct;

/**
 * Created by lianrongfa on 2017/11/13.
 */
public class TestApp {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName("cn.lianrf.construct.SingleConstruct");
        SingleConstruct o = (SingleConstruct)aClass.newInstance();
        o.say();
    }
    public void test(){
        getClass();
    }
}

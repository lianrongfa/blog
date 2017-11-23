package cn.lianrf.cglib;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lianrongfa on 2017/11/6.
 */
public class TestApp {
    
    public static void main(String[] args) {
        ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");
        IStudent bean = (IStudent)factory.getBean("student");
        bean.say();
    }

}

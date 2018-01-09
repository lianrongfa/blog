package cn.lianrf.genericity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lianrongfa on 2017/11/14.
 */
public class TestApp {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:applicationContext*.xml");
    }
}

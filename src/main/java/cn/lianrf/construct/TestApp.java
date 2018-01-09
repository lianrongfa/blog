package cn.lianrf.construct;

import sun.reflect.Reflection;

import java.math.BigDecimal;
import java.sql.*;

/**
 * Created by lianrongfa on 2017/11/13.
 */
public class TestApp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String s="sssS";
        System.out.println(s.toLowerCase());
    }

    private static void xxx() {
        String s="10.29171261189";
        BigDecimal bigDecimal = new BigDecimal("10.29171261189");
        byte[] bytes = s.getBytes();
        for (byte b:bytes) {
            System.out.print((char)b);
        }
        System.out.println();
        char[] chars = s.toCharArray();
        for (char c:chars){
            System.out.print(c);
        }
        System.out.println();
        System.out.println(bigDecimal.doubleValue());
    }

}
class Test1{
    public void test1(){
        test();
    }

    public void test(){
        Class<?> callerClass = Reflection.getCallerClass(1);
        System.out.println();
    }
}
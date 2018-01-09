package cn.lianrf.event;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

/**
 * Created by lianrongfa on 2018/1/3.
 */
public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = format.format(date);
        System.out.println(date.getTime());
        System.out.println(dateStr);
    }
    public void test(){
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            Enumeration<URL> resources = getClass().getClassLoader().getResources("");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

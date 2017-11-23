package cn.lianrf.observer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lianrongfa on 2017/11/10.
 */
public class TestApp {
    public static void main(String[] args) throws InterruptedException {
        SubjectImpl subject = new SubjectImpl();

        WeObServer haha = new WeObServer("haha");
        WeObServer hehe = new WeObServer("hehe");
        WeObServer xixi = new WeObServer("xixi");

        subject.registerObServers(haha);
        subject.registerObServers(hehe);
        subject.registerObServers(xixi);

        subject.setNum(11);

        while (true){
            System.out.println("size:"+Thread.getAllStackTraces().size());
            Thread.sleep(1000);
            subject.notifyObservers();

        }
    }
}

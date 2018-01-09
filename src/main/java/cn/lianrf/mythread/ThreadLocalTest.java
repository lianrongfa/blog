package cn.lianrf.mythread;

/**
 * Created by lianrongfa on 2018/1/4.
 */
public class ThreadLocalTest {



    public static void main(final String[] args) {
        Test2 test2 = new Test2();
        Test2 test21 = new Test2();
        test2.start();
        test21.start();
        while(test2.isAlive()||test21.isAlive()){}
        System.out.println();

    }

}
class Test implements Runnable{
    private final static ThreadLocal<String> THREAD_LOCAL=new ThreadLocal<String>();
    @Override
    public void run() {
        Thread.currentThread();
        String name = Thread.currentThread().getName();
        THREAD_LOCAL.set(name);
        test();
    }
    public void test(){
        System.out.println(THREAD_LOCAL.get());
    }
}
class Test2 extends Thread{
    @Override
    public void run() {

    }
}
class MyNum {
    private volatile static int i=0;

    public static void setI(int i) {
        MyNum.i = i;
    }
}
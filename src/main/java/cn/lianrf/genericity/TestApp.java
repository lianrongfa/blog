package cn.lianrf.genericity;

/**
 * Created by lianrongfa on 2017/11/14.
 */
public class TestApp {
    public static void main(String[] args) {
        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.sayGenericity();
    }
}

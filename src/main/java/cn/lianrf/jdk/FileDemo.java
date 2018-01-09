package cn.lianrf.jdk;

import java.io.File;

/**
 * Created by lianrongfa on 2018/1/9.
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\lianrongfa\\Desktop\\project\\Test\\HaHa");
        boolean b = file.exists();
        if(!b){
            file.mkdirs();
        }
    }
}

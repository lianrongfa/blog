package cn.lianrf.genericity;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by lianrongfa on 2017/11/14.
 */
public abstract class StudentService <X,T>{
    public void sayGenericity(){
        Type genericSuperclass= getClass().getGenericSuperclass();
        Type[] actualTypeArguments = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments();
        for (Type item:actualTypeArguments) {

        }
    }
    private static class mm{

    }
}


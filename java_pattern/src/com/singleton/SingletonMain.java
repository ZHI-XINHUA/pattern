package com.singleton;

/**
 * Created by xh.zhi on 2018-8-10.
 */
public class SingletonMain {
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            InnerClassSingleton instance = InnerClassSingleton.getInstance();
            System.out.println( instance.toString());
        }

    }
}

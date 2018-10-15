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


        //测试枚举实现单例模式
        System.out.println("========");
        EnumSingleton enumSingleton1 = EnumSingleton.SINGLETON;
        EnumSingleton enumSingleton2 = EnumSingleton.SINGLETON;
        enumSingleton1.operate();
        System.out.println(enumSingleton1== enumSingleton2);

    }
}

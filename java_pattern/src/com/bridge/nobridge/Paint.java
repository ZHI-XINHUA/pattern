package com.bridge.nobridge;

/**
 * Created by xh.zhi on 2018-9-13.
 * 定义一个绘画的抽象类
 */
public abstract class Paint {
    /**
     * 颜色
     */
    public abstract void color();

    /**
     * 形状
     */
    public abstract void shape();

    public  void draw(){
        //准备颜色
        color();

        //画图形
        shape();
    }
}

package com.bridge.nobridge;

/**
 * Created by xh.zhi on 2018-9-13.
 * 红色长方形
 */
public class RedRectangle extends Paint {
    @Override
    public void color() {
        System.out.println("红色画笔....");
    }

    @Override
    public void shape() {
        System.out.println("画长方形...");
    }
}

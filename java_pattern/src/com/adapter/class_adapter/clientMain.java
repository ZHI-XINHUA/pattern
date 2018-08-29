package com.adapter.class_adapter;

/**
 * Created by xh.zhi on 2018-8-29.
 */
public class clientMain {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.operation1();
        target.operation2();
    }
}

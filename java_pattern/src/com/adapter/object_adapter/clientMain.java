package com.adapter.object_adapter;

import com.adapter.class_adapter.Adapter;
import com.adapter.class_adapter.Target;

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

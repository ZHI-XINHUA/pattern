package com.bridge.simple;

/**
 * Created by xh.zhi on 2018-11-6.
 */
public class Client {
    public static void main(String[] args) {
        //销售联想的笔记本电脑
        Computer  c = new Laptop(new Lenovo());
        c.sale();

        //销售神舟的台式机
        Computer c2 = new Desktop(new Shenzhou());
        c2.sale();
    }
}

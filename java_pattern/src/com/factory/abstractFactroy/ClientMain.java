package com.factory.abstractFactroy;

public class ClientMain {
    public static void main(String[] args) {
        PcFactory pcFactory = null;
        KeyBo keyBo = null;
        Mouse mouse = null;

        //生产戴尔键盘和鼠标
        pcFactory = new DellFactory();
        keyBo = pcFactory.createKeyBo();
        mouse = pcFactory.createMouse();
        keyBo.wireless();
        mouse.wireless();

        //生产惠普键盘和鼠标
        pcFactory = new HpFactory();
        keyBo = pcFactory.createKeyBo();
        mouse = pcFactory.createMouse();
        keyBo.wireless();
        mouse.wireless();
    }
}

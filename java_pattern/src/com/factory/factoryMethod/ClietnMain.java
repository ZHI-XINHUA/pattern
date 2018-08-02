package com.factory.factoryMethod;

public class ClietnMain {
    public static void main(String[] args) {
        //生产戴尔鼠标
        MouseFactory dellMouseFactory = new DellMouseFactory();
        Mouse dellMouse = dellMouseFactory.createMouse();
        dellMouse.wireless();

        //生产惠普鼠标
        MouseFactory huMouseFactory = new HpMouseFactory();
        Mouse huMose = huMouseFactory.createMouse();
        huMose.wireless();
    }
}

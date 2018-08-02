package com.factory.simpleFactory;

public class ClientMain {
    public static void main(String[] args) {
        MouseFactory factory = new MouseFactory();

        Mouse dellMouse = factory.createMouse("dell");
        dellMouse.wireless();

        Mouse hpMouse = factory.createMouse("hp");
        hpMouse.wireless();
    }
}

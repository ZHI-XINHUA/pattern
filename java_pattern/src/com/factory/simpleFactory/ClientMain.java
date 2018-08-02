package com.factory.simpleFactory;

public class ClientMain {
    public static void main(String[] args) {
        Mouse dellMouse = MouseFactory.createMouse("dell");
        dellMouse.wireless();

        Mouse hpMouse = MouseFactory.createMouse("hp");
        hpMouse.wireless();
    }
}

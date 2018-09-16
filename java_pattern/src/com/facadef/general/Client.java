package com.facadef.general;

public class Client {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Light light = new Light();
        Sensor sensor= new Sensor();
        Alarm alarm = new Alarm();

        camera.trunOn();
        light.trunOn();
        sensor.activate();
        alarm.activate();

        System.out.println("=======");

        camera.turnOff();
        light.turnOff();
        sensor.deactivate();
        alarm.deactivate();

        System.out.println("=========");

        camera.rotate(5);
        light.changeBulb();
        sensor.trigger();
        alarm.stopRing();

    }
}

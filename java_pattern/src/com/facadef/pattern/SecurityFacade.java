package com.facadef.pattern;

public class SecurityFacade {
    private static  Camera camera;
    private static  Light light;
    private static  Sensor sensor;
    private static Alarm alarm;

    public SecurityFacade(){
        camera = new Camera();
        light = new Light();
        sensor = new Sensor();
        alarm = new Alarm();
    }

    public void activate(){

        camera.trunOn();
        light.trunOn();
        sensor.activate();
        alarm.activate();
    }

    public void deactivate(){
       camera.turnOff();
       light.turnOff();
       sensor.deactivate();
       alarm.deactivate();
    }

    public void other(){
        camera.rotate(5);
        light.changeBulb();
        sensor.trigger();
        alarm.stopRing();
    }

}

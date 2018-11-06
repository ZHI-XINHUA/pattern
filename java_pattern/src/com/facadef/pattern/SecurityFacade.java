package com.facadef.pattern;

/**
 * 门面（Facade）角色：客户端可以调用这个角色的方法。此角色知晓相关的（一个或多个）子系统的功能和责任。在正常情况下，本角色会将所有从客户端发来的请求
 * 委派到相应的子系统去
 */
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

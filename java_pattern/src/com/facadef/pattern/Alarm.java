package com.facadef.pattern;

/**
 * 子系统（Subsystem）角色：可以同时有一个或多个子系统。每个子系统都可以被客户端直接调用，或者被门面角色调用。子系统并不知道门面的存在，对于子系统而已，门面仅仅是另外一个客户端而已
 */
public class Alarm {

    public void activate(){
        System.out.println("Activating the alarm!");
    }

    public void deactivate(){
        System.out.println("Deactivating the alarm!");
    }

    public void ring(){
        System.out.println("Ringing the alarm!");
    }

    public void stopRing(){
        System.out.println("Stop the alarm!");
    }


}

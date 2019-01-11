package com.builder;

/**
 * Created by xh.zhi on 2018-10-29.
 *  飞船类
 *   产品（Product）角色：产品（Product）便是建造中的复制对象。一般来说，一个系统中会有多于一个的产品类，而且这些产品类并不一定有共同的接口，
 *   而完全可以是不相关联的
 */
public class AirShip {
    /**轨道舱**/
    private OrbitalModule orbitalModule;

    /**发动机**/
    private Engine engine;

    /**逃逸塔**/
    private EscapeTower sscapeTower;

    public void launch(){
        System.out.println("起飞！");
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getSscapeTower() {
        return sscapeTower;
    }

    public void setSscapeTower(EscapeTower sscapeTower) {
        this.sscapeTower = sscapeTower;
    }

    @Override
    public String toString() {
        return "AirShip{" +
                "orbitalModule=" + orbitalModule.getName() +
                ", engine=" + engine.getName() +
                ", sscapeTower=" + sscapeTower.getName() +
                '}';
    }
}


class OrbitalModule{
    private String name;

    public OrbitalModule(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Engine{
    private String name;

    public Engine(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EscapeTower{
    private String name;

    public EscapeTower(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

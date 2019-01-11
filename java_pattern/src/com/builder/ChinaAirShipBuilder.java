package com.builder;

/**
 * Created by xh.zhi on 2018-10-29.
 *  中国飞船建造
 *   具体建造者（Concrete Builder）角色：担它在应用程序调用下创建产品的实例，要完成的任务包括：
 *    1、实现抽象建造者Builder所声明的接口，给出一步一步地完成创建产品实例的操作
 *    2、在建造过程完成后，提供产品的实例
 */
public class ChinaAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine builderEngine() {
        System.out.println("构建矢量引擎！");
        return new Engine("矢量引擎");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建超级轨道舱！");
        return new OrbitalModule("超级轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建快速逃逸塔");
        return new EscapeTower("快速逃逸塔");
    }
}

package com.factory.factoryMethod;

/**
 * 宝马车（产品）
 */
public class Bmw extends Car {

    public Bmw(){
        System.out.println("提车：宝马轿车..");
    }
    @Override
    void drive() {
        System.out.println("宝马车主以时速200km/h狂奔.....");
    }
}

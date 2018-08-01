package com.factory.simpleFactory;

/**
 * 奔驰车（产品）
 */
public class Benz  extends Car {
    public Benz(){
        System.out.println("提车：奔驰轿车..");
    }
    @Override
    void drive() {
        System.out.println("奔驰车主以时速150km/h狂奔.....");
    }
}

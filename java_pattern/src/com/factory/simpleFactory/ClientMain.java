package com.factory.simpleFactory;

/**
 * Created by xh.zhi on 2018-8-1.
 */
public class ClientMain {
    public static void main(String[] args) {
        CarShop factory = new CarShop();
        //入手一台宝马
        Car car = factory.getCar("bmw");
        car.drive();

        System.out.println("=====================");
        //收入一台奔驰
        Car car1 = factory.getCar("benz");
        car1.drive();
    }
}

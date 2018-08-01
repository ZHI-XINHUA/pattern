package com.factory.factoryMethod;

/**
 * 奔驰专门店（具体工厂角色）
 */
public class BenzShop implements CarShop {
    @Override
    public Car getCar() {
        return new Benz();
    }
}

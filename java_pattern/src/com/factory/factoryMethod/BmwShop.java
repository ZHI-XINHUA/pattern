package com.factory.factoryMethod;

/**
 * 宝马专卖店（具体工厂角色）
 * @author xh.zhi
 */
public class BmwShop implements CarShop {
    @Override
    public Car getCar() {
        return new Bmw();
    }
}

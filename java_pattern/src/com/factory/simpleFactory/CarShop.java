package com.factory.simpleFactory;

/**
 * Created by xh.zhi on 2018-8-1.
 *  4s销售店（相当于工厂角色）
 */
public class CarShop {
    public Car getCar(String carType){
        if("benz".equals(carType)){
            return new Benz();
        }else if("bmw".equals(carType)){
            return new Bmw();
        }
        return null;
    }
}

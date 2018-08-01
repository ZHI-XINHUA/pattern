package com.factory.factoryMethod;

/**
 * Created by xh.zhi on 2018-8-1.
 */
public class ClientMain {
    public static void main(String[] args) {

        //A土豪
        CarShop benzShop = new BenzShop();//去奔驰专卖店
        Car benz = benzShop.getCar();//提车
        benz.drive();//开走
        System.out.println("====================");
        //B土豪
        CarShop bmwShop = new BmwShop();//去宝马专卖店
        Car bmw = bmwShop.getCar();//提车
        bmw.drive();//老司机开走
    }
}

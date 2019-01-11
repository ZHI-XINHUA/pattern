package com.builder;

/**
 * Created by xh.zhi on 2018-10-29.
 */
public class Client {

    public static void main(String[] args) {

        //构建中国飞船各种零件
       AirShipBuilder builder =  new ChinaAirShipBuilder();

        //组装中国飞船
        AirShipDirector director = new ChinaAirshipDirector(builder);

        //一部中国飞船组装完毕
        AirShip airShip = director.directAirShip();

        System.out.println("完成的中国飞船："+airShip);

        //试飞
        airShip.launch();
    }
}

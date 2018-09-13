package com.bridge.transform_bybg;

/**
 * Created by xh.zhi on 2018-9-13.
 */
public class MainTest {
    public static void main(String[] args) {
        //白色
        White white = new White();
        //红色
        Red red = new Red();

        /*******开始绘画*****/
        //白色圆形
        Circle circle = new Circle();
        circle.setColor(white);
        circle.draw();

        System.out.println("================");

        //红色圆形
        circle.setColor(red);
        circle.draw();

        System.out.println("================");

        //白色长方形
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(white);
        rectangle.draw();

        System.out.println("================");

        //红色长方形
        rectangle.setColor(red);
        rectangle.draw();
    }
}

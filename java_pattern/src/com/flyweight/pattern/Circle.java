package com.flyweight.pattern;


/**
 * Created by xh.zhi on 2018-9-13.
 *  圆形
 */
public class Circle implements Shape {
    /**颜色**/
    private String color;
    /**x坐标**/
    private int x;
    /**y坐标**/
    private int y;
    /**圆半径**/
    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                +", x : " + x +", y :" + y +", radius :" + radius);
    }
}

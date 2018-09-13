package com.flyweight.pattern;

import java.util.HashMap;

/**
 * Created by xh.zhi on 2018-9-13.
 */
public class CircleFactory {
    /***用来存放同一种颜色的圆形对象***/
    private static HashMap<String,Shape> shareCircle = new HashMap<String, Shape>();

    /**
     * 提供获取圆形实例的工厂方法
     * @param color
     * @return
     */
    public static Shape getCircle(String color){
        if(shareCircle.containsKey(color)){
            return shareCircle.get(color);
        }

        Shape shape =  new Circle(color);
        shareCircle.put(color,shape);
        System.out.println("*********创建了一个【"+color+"】色的圆形实例************");
        return shape;
    }

}

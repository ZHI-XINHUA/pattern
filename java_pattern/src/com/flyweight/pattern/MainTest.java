package com.flyweight.pattern;

/**
 * Created by xh.zhi on 2018-9-13.
 */
public class MainTest {
    //定义绘图的几种颜色
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {
        //绘画100个圆就创建100个Circle对象，而且很多都是相似对象，造成资源浪费
        for(int i=0; i < 100; ++i) {
            Circle circle = (Circle) CircleFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    /**
     * 随机选择一个颜色
     * @return
     */
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

    /**
     * 随机生成x坐标
     * @return
     */
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }

    /**
     * 随机生成y坐标
     * @return
     */
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}

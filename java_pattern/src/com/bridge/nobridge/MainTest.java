package com.bridge.nobridge;

/**
 * Created by xh.zhi on 2018-9-13.
 */
public class MainTest {
    public static void main(String[] args) {
        BlackRectangle blackRectangle = new BlackRectangle();
        blackRectangle.draw();
        System.out.println("===========");

        RedRectangle redRectangle = new RedRectangle();
        redRectangle.draw();
        System.out.println("============");

        WhiteCircle whiteCircle = new WhiteCircle();
        whiteCircle.draw();
        System.out.println("============");

        RedCircle redCircle = new RedCircle();
        redCircle.draw();

    }
}

package com.template;

/**
 * Created by xh.zhi on 2018-9-25.
 * 具体模板角色
 */
public class ShootGame extends Game {
    /**
     * 具体实现方法
     */
    @Override
    protected void initialize() {
        System.out.println("全军出击：初始化....");
    }

    /**
     * 具体实现方法
     */
    @Override
    protected void start() {
        System.out.println("全军出击：游戏开始....");
    }

    /**
     * 具体实现方法
     */
    @Override
    protected void end() {
        System.out.println("全军出击：游戏结束");
    }
}

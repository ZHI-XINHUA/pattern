package com.template;

/**
 * Created by xh.zhi on 2018-9-25.
 *  抽象模板
 */
public abstract class Game {
    /**
     * 基本方法声明（由子类实现）
     */
    protected abstract void initialize();

    /**
     * 基本方法声明（由子类实现）
     */
    protected abstract void start();

    /**
     * 基本方法声明（由子类实现）
     */
    protected abstract void end();

    /**
     * 模板方法实现
     */
    public void play(){
        initialize();
        start();
        end();
    }
}

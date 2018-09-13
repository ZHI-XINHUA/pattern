package com.bridge.transform_bybg;

/**
 * Created by xh.zhi on 2018-9-13.
 *  绘画抽象类
 */
public abstract  class Paint {
    /**
     * 颜色接口
     */
    public  Color color;


    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * 绘画
     */
    public abstract void draw();
}

package com.factory.abstractFactroy;

/**
 * 抽象工厂类
 */
public interface PcFactory {
    //生产鼠标
    Mouse createMouse();

    //生产键盘
    KeyBo createKeyBo();
}

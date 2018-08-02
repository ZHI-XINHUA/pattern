package com.factory.abstractFactroy;

/**
 * 惠普工厂类（具体产品类）
 */
public class HpFactory implements PcFactory {
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public KeyBo createKeyBo() {
        return new HpKeyBo();
    }
}

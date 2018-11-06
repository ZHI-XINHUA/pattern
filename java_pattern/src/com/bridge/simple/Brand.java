package com.bridge.simple;

/**
 * 品牌
 */
public interface Brand {
    void sale();
}

/**
 * 联想品牌
 */
class Lenovo implements Brand{
    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}

/**
 * 戴尔品牌
 */
class Dell implements Brand {

    @Override
    public void sale() {
        System.out.println("销售Dell电脑");
    }

}

/**
 * 神舟品牌
 */
class Shenzhou implements Brand {

    @Override
    public void sale() {
        System.out.println("销售神舟电脑");
    }

}

package com.factory.abstractFactroy;
/**
 * 戴尔键盘类（产品角色）
 */
public class DellKeyBo implements KeyBo {
    @Override
    public void wireless() {
        System.out.println("我是戴尔无线键盘！");
    }
}

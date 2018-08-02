package com.factory.abstractFactroy;
/**
 * 惠普键盘类（产品角色）
 */
public class HpKeyBo implements KeyBo {
    @Override
    public void wireless() {
        System.out.println("我是惠普无线键盘！");
    }
}

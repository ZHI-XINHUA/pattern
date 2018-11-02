package com.mediator;

/**
 * Created by xh.zhi on 2018-11-2.
 * 市场部
 * 具体同事类角色：实现同事类接口，实现自己行为
 */
public class Market implements Department {
    @Override
    public void myAction() {
        System.out.println("筹备市场推广中。");
    }

    @Override
    public void outAction() {
        System.out.println("申请经费：需要资金市场搞推广活动。");
    }
}

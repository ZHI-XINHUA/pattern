package com.mediator;

/**
 * Created by xh.zhi on 2018-11-2.
 * 财务部
 * 具体同事类角色：实现同事类接口，实现自己行为
 */
public class Finacial implements Department {
    @Override
    public void myAction() {
        System.out.println("数钱，清点资金....");
    }

    @Override
    public void outAction() {
        System.out.println("经过一番努力，资金已经准备好！");
    }
}

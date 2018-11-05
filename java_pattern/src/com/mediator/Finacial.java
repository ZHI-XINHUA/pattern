package com.mediator;

/**
 * Created by xh.zhi on 2018-11-2.
 * 财务部
 * 具体同事类角色：实现同事类接口，实现自己行为
 */
public class Finacial implements Department {
    //持有调停者(总经理)的引用
    private ExecutiveLeader leader;

    public Finacial(ExecutiveLeader leader){
        this.leader = leader;
        leader.register("finacial",this);
    }

    @Override
    public void myAction() {
        System.out.println("财务部：数钱，清点资金....");
    }

    @Override
    public void outAction() {
        System.out.println("财务部：经过一番努力，资金已经准备好！");
    }
}

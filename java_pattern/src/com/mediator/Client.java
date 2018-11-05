package com.mediator;

/**
 * Created by xh.zhi on 2018-11-5.
 */
public class Client {
    public static void main(String[] args) {
        //总经理，调停者角色
        ExecutiveLeader leader = new GeneralManager();
        //市场部
        Market market = new Market(leader);
        //财务部
        Finacial finacial = new Finacial(leader);

        market.myAction();//市场部内部事情
        market.outAction();//市场部需要财务部协助，向总经理申请

        leader.command("finacial");//总经理发出指令，财务部干事

    }
}

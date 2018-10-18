package com.state;

/**
 * 房间
 * 环境（Context）角色：维护一个状态（State）对象，定义了当前的状态
 */
public class RoomContext {
    private State state;

    public void setState(State state){
        System.out.println("房间状态已改变");
        this.state = state;
    }

    /**
     * 行为操作
     */
    public void useSituation(){
        state.operation();
    }
}

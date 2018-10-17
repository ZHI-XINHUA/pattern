package com.state;

/**
 * 房间空闲状态
 * 具体状态（ConcreteState）角色：每个具体状态都实现了所对应的行为
 */
public class FreeState implements State {
    @Override
    public void operation() {
        System.out.println("房间处于空闲状态，可接受预定！");
    }
}

package com.state;

/**
 * 房间已入住状态
 */
public class CheckedInState implements State {
    @Override
    public void operation() {
        System.out.println("房间已有客人入住，请不要打扰！");
    }
}

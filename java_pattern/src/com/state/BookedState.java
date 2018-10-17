package com.state;

/**
 * 房间已预定状态
 */
public class BookedState implements State
{
    @Override
    public void operation() {
        System.out.println("房间已预定，请不要接受其它预定");
    }
}

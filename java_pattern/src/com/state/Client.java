package com.state;

public class Client {
    public static void main(String[] args) {
        //设置房间（context）
        RoomContext context = new RoomContext();
        //改变状态
        context.setState(new BookedState());
        context.useSituation();

        //改变状态
        context.setState(new CheckedInState());
        context.useSituation();

        //改变状态
        context.setState(new FreeState());
        context.useSituation();

    }
}

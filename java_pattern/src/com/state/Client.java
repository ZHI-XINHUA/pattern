package com.state;

public class Client {
    public static void main(String[] args) {
        RoomContext context = new RoomContext();
        context.setState(new BookedState());
        context.setState(new CheckedInState());
        context.setState(new FreeState());
    }
}

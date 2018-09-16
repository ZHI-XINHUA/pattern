package com.facadef.pattern;

public class Client {
    public static void main(String[] args) {
        SecurityFacade facade = new SecurityFacade();
        facade.activate();

        System.out.println("=======");

        facade.deactivate();

        System.out.println("========");

        facade.other();
    }
}

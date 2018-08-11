package com.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        ProducingPlace p = new ProducingPlace("guangdong","guangzhou");
        Apple apple = new Apple("gz",2,"red",p);

        System.out.println("===clone====");
         System.out.println("original=="+apple.toString());
        Apple cloneApple = apple.clone();
        System.out.println("clone=="+cloneApple.toString());

        System.out.println("========depthClone========");
         System.out.println("original==" +apple.toString());
        Apple depthCloneApple = apple.depthClone();
        System.out.println("depthClone=="+depthCloneApple.toString());
    }
}

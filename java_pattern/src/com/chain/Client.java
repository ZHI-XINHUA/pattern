package com.chain;

public class Client {
    public static void main(String[] args) {
        Director a = new Director("张三");
        Manager b = new Manager("李四");
        GeneralManager c = new GeneralManager("王五");

        //设置组织关系
        a.setNextLeader(b);
        b.setNextLeader(c);

        //开始请假
        LeaveRequest leaveRequest = new LeaveRequest("james",3,"世界这么大，想去看看");
        a.handleRequest(leaveRequest);
    }
}

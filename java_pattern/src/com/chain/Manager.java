package com.chain;

/**
 * 经理
 */
public class Manager extends Leader {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<10){
            request.toString();
            System.out.println("经理："+name+" 审批通过！");
        }else {
            if(nextLeader!=null){
                this.nextLeader.handleRequest(request);//传递下一位领导
            }
        }
    }
}

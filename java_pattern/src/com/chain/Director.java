package com.chain;

/**
 * 主任
 */
public class Director extends Leader {
    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<3){
            request.toString();
            System.out.println("主任："+name+" 审批通过！");
        }else {
            if(nextLeader!=null){
                this.nextLeader.handleRequest(request);//传递下一位领导
            }
        }
    }
}

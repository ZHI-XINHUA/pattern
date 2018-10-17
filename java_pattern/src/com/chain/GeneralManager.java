package com.chain;

/**
 * 总经理
 */
public class GeneralManager extends Leader {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getLeaveDays()<30){
            request.toString();
            System.out.println("总经理："+name+" 审批通过！");
        }else {
            System.out.println(request.getEmpName()+"请假"+request.getLeaveDays()+"天这么多，是不是不想干了？");
        }
    }
}

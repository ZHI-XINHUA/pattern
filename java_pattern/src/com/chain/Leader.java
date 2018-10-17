package com.chain;

/**
 * 领导抽象类
 */
public abstract class Leader {
    /**名字**/
    protected String name;

    /**直属领导**/
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    /**
     * 责任链上的后继对象
     * @param nextLeader
     */
    public void setNextLeader(Leader nextLeader){
        this.nextLeader = nextLeader;
    }

    /**
     * 处理请求的核心业务方法
     * @param request
     */
    public abstract void handleRequest(LeaveRequest request);


}

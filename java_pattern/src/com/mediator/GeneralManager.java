package com.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xh.zhi on 2018-11-2.
 * 总经理
 * 具体调停者角色：实现调停者的行为。具体调停者知晓所有具体同事对象。 它从具体同事对象接受消息、向具体同事对象发出指令。
 */
public class GeneralManager implements ExecutiveLeader {

    //存放组织架构的管理信息 ，管理部门
    private Map<String,Department> map = new HashMap<String , Department>();

    // 总经理管理部门
    @Override
    public void register(String dname, Department d) {
        map.put(dname,d);
    }

    //总经理指示部门干事
    @Override
    public void command(String dname) {
        System.out.println("总经理：已阅，下面部门尽快解决");
        map.get(dname).myAction();
    }
}

package com.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xh.zhi on 2018-11-2.
 * 总经理
 * 具体调停者角色：实现调停者的行为
 */
public class GeneralManager implements ExecutiveLeader {

    //存放组织架构的管理信息 ，管理部门
    private Map<String,Department> map = new HashMap<String , Department>();

    @Override
    public void register(String dname, Department d) {

    }

    @Override
    public void command(String dname) {

    }
}

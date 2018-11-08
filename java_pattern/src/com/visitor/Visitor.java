package com.visitor;

/**
 * 抽象访问者（Visitor）角色：声明一个或者多个访问操作，形成所有的具体元素角色必须实现的接口
 */
public interface Visitor {
    /**
     * 对于ModeA的访问操作
     * @param nodeA
     */
    void visit(NodeA nodeA);

    /**
     * 对于NodeB的访问操作
     * @param nodeB
     */
    void visit(NodeB nodeB);
}

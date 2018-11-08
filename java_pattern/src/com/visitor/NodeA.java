package com.visitor;

/**
 * 具体节点角色(ConcreteNode)：实现了抽象元素所规定的接受操作
 */
public class NodeA extends Node{

    /**
     * 接受操作
     * @param visitor
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * NodeA特有方法
     * @return
     */
    public String operationA(){
        return "NodeA is visited";
    }
}

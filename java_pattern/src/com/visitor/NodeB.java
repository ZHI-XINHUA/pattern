package com.visitor;

/**
 * 具体节点角色（ConcreteNode）：实现了抽象元素所规定的接受操作
 */
public class NodeB  extends Node  {
    /**
     * 接受方法
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
    public String operationB(){
        return "NodeB is visited";
    }
}

package com.visitor;

/**
 * 具体访问者（ConcreteVisitor）角色：实现抽象访问者角色所声明的接口，也就是抽象访问者所声明的各个访问操作
 */
public class VisitorA implements Visitor {
    @Override
    public void visit(NodeA nodeA) {
        System.out.println("VisitorA:"+nodeA.operationA());
    }

    @Override
    public void visit(NodeB nodeB) {
        System.out.println("VisitorA:"+nodeB.operationB());
    }
}

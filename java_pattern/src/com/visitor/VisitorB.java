package com.visitor;

/**
 * Created by xh.zhi on 2018-11-8.
 */
public class VisitorB implements Visitor {
    @Override
    public void visit(NodeA nodeA) {
        System.out.println("VisitorB:"+nodeA.operationA());
    }

    @Override
    public void visit(NodeB nodeB) {
        System.out.println("VisitorB:"+nodeB.operationB());
    }
}

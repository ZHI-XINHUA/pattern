package com.visitor;

/**
 * Created by xh.zhi on 2018-11-8.
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.addNode(new NodeA());
        structure.addNode(new NodeB());

        Visitor visitorA = new VisitorA();
        structure.traverse(visitorA);

        Visitor visitorB = new VisitorB();
        structure.traverse(visitorB);
    }
}

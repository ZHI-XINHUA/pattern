package com.visitor;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 结构对象（ObjectStructure）角色：有如下一下责任
 *  1、可以遍历结构中的所有元素
 *  2、如果需要，提供一个高层次的接口让访问者对象可以访问每一个元素
 *  3、如果需要，可以设计成一个复合对象或者一个聚集，如列（List）或集合（Set）
 */
public class ObjectStructure {
    private Vector nodes;
    private Node node;

    public ObjectStructure(){
        nodes = new Vector();
    }

    /**
     * 执行访问操作
     * @param visitor
     */
    public void traverse(Visitor visitor){
        Enumeration enumeration = nodes.elements();
        while(enumeration.hasMoreElements()){
            Node node  = (Node) enumeration.nextElement();
            //访问操作
            node.accept(visitor);
        }
    }

    /**
     * 添加元素
     * @param node
     */
    public void addNode(Node node){
        nodes.add(node);
    }
}

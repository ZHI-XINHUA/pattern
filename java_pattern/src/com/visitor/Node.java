package com.visitor;

/**
 * 抽象节点（Node）角色：声明一个接受操作，接受一个访问者对象作为一个参量
 */
abstract  public class Node {
    /**
     * 接受操作
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}

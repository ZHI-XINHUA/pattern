package com.iterator;

/**
 * Created by xh.zhi on 2018-10-31.
 */
public class Client {
    public static void main(String[] args) {
        //创建聚集实例
        MyAggregate collection = new ConcreteMyAggregate();
        //添加元素
        collection.addObject("olay");
        collection.addObject("james");
        collection.addObject("kobi");
        collection.addObject("cp3");
        collection.addObject("test");

        //删除元素
        collection.removeObject("test");

        //获取迭代器
        MyIterator iterator = collection.createIterator();

        System.out.println("first obj = "+iterator.first());
        System.out.println("last obj = "+iterator.last());

        System.out.println("遍历集合：");
        //迭代器遍历聚集
        while (iterator.hasNext()){
            String value = iterator.getCurrentObj().toString();
            System.out.println(value);
        }
    }
}

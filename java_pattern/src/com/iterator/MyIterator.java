package com.iterator;

/**
 * Created by xh.zhi on 2018-10-31.
 * 自定义的迭代器接口
 * 抽象迭代子（Iterator）角色：定义遍历元素所需的接口
 */
public interface MyIterator {
    /**是否第一个**/
    boolean isFirst();

    /**是否最后一个**/
    boolean isLast();

    /**第一个**/
    Object first();

    /**最后一个**/
    Object last();

    /**游标下一个**/
    boolean hasNext();

    /**读取当前对象**/
    Object getCurrentObj();


}

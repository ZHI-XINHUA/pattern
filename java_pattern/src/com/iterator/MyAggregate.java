package com.iterator;

/**
 * Created by xh.zhi on 2018-10-31.
 *  聚集（Agregate）角色：给出创建迭代子（Iterator）对象接口
 */
public interface MyAggregate {
    /**
     * 创建迭代子
     * @return
     */
    MyIterator  createIterator();

    /**
     * 添加一个元素
     * @param obj
     */
    void addObject(Object obj);


    /**
     * 删除一个元素
     * @param obj
     */
    void removeObject(Object obj);


}

package com.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xh.zhi on 2018-10-31.
 *  具体聚集（ConcreteAggregate）角色：实现了创建迭代子（Iterator）对象的接口
 */
public class ConcreteMyAggregate implements MyAggregate {
    //存储数据
    private List<Object> list = new ArrayList<Object>();

    /**
     * 添加一个元素
     * @param obj
     */
    @Override
    public void addObject(Object obj){
        list.add(obj);
    }

    /**
     * 删除一个元素
     * @param obj
     */
    @Override
    public void removeObject(Object obj){
        list.remove(obj);
    }



    /**
     * 创建迭代器
     * @return
     */
    @Override
    public MyIterator createIterator() {
        return new ConcreteIterator() ;
    }

    /**
     * Created by xh.zhi on 2018-10-31.
     * 定义迭代器。 内部类，比较容易使用聚集类的集合对象
     *  具体迭代子（ConcreteIterator）角色：实现了Iterator接口，并保持迭代过程中的游标位置
     */
    private class ConcreteIterator implements MyIterator{
        //定义游标用于记录遍历时的位置
        private int cursor;

        @Override
        public boolean isFirst() {
            return cursor==0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size();
        }

        @Override
        public Object first() {
            return list.get(0);
        }

        @Override
        public Object last() {
            int lastIndex = list.size()-1;
            return  list.get(lastIndex);
        }

        @Override
        public boolean hasNext() {
            if(cursor<list.size()){
                return  true;
            }
            return false;
        }

        @Override
        public Object getCurrentObj() {
            Object o = list.get(cursor);
            cursor ++;
            return o;
        }
    }
}

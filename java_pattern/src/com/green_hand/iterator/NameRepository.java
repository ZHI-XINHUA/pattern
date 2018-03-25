package com.green_hand.iterator;

import com.green_hand.iterator.Container;
import com.green_hand.iterator.MyIterator;

import java.util.Iterator;

/**
 * 字符串（名称）迭代遍历
 *
 * @author zhixinhua
 * @date 18/3/25.
 */
public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getMyIterator() {
        return new MyIterator(names);
    }
}

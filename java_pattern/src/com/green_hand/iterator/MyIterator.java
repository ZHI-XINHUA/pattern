package com.green_hand.iterator;

import java.util.Iterator;

/**
 * 自定义迭代器
 * @author zhixinhua
 * @date 2018/3/25
 */
public class MyIterator<T>  implements Iterator<T>{
    private T[] arr = null;
    private int index;

    public MyIterator(T[] arr){
        this.arr = arr;
    }


    @Override
    public boolean hasNext() {
        if(arr!=null && index<arr.length){
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if(hasNext()){
            return arr[index++];
        }
        return null;
    }
}

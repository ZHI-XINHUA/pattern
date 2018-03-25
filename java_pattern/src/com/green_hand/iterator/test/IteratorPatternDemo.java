package com.green_hand.iterator.test;

import com.green_hand.iterator.NameRepository;

import java.util.Iterator;


/**
 * Demo class
 *
 * @author zhixinhua
 * @date 18/3/25.
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator i = nameRepository.getMyIterator();i.hasNext();){
            String name = (String)i.next();
            System.out.println(name);
        }
    }
}

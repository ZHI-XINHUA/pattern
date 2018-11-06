package com.flyweight.inner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xh.zhi on 2018-11-6.
 *  享元工厂角色（FlyweightFactory）：负责创建和管理享元角色。本角色必须保证享元对象可以被系统适当地共享。当一个客户端对象调用
 *  一个享元对象的时候，享元工厂角色会检查系统中是否已经有一个复合要求的享元对象。如果已有，享元工厂角色就应当提供这个已有
 *  的享元对象；如果没有，就创建一个合适的享元对象
 */
public class FlyweightFactory {
    private Map<String,Flyweight> map = new HashMap<String,Flyweight>();

    public FlyweightFactory(){

    }

    /**
     *  必须指出的是，客户端不可以直接将具体享元类实例化，而必须通过一个工厂对象利用一个
     *  factory()方法得到享元对象。一般而言，享元工厂对象在整个系统中只有一个，隐藏可以是单例模式。
     * @param innerState
     * @return
     */
    public Flyweight factory(String innerState){
        if(map.containsKey(innerState)){
            return map.get(innerState);
        }
        Flyweight flyweight = new ConcreteFlyweight(innerState);
        map.put(innerState,flyweight);
        return flyweight;

    }

}

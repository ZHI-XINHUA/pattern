package com.flyweight.inner;

/**
 * Created by xh.zhi on 2018-11-6.
 * 具体享元角色（ConcreteFlyweight）：实现抽象享元角色所规定的接口。如果有内蕴状态的话，必须负责为内蕴状态提供存储空间。享元对象的内蕴状态必须与
 * 对象所处的环境无关，从而使得享元对象可以在系统内共享的。
 */
public class ConcreteFlyweight extends Flyweight {
    //为内蕴状态提供存储空间
    private String innerState;

    /**
     * 构造器，内蕴状态作为参数传入
     * @param innerState
     */
    public ConcreteFlyweight(String innerState){
        this.innerState = innerState;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，但是不改变对象的内蕴状态
     * @param outState
     */
    @Override
    public void operation(String outState) {
        System.out.println("对象："+this+" 内蕴状态innerState："+innerState+" 外蕴状态outState："+outState);
    }
}

package com.bridge.simple;

/**
 *  电脑类型的维度
 */
public class Computer {
    //品牌接口
    private Brand brand;

    public Computer(Brand brand){
        this.brand = brand;
    }

    public void sale(){
        brand.sale();
    }

}

/**
 * 台式机
 */
class Desktop extends Computer {

    public Desktop(Brand b) {
        super(b);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售台式机");
    }
}

/**
 * 笔记本
 */
class Laptop extends Computer {

    public Laptop(Brand b) {
        super(b);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("销售笔记本");
    }
}

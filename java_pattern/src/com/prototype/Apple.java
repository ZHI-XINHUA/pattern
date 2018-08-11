package com.prototype;

public class Apple implements Cloneable {
    private String varieties;
    private float weight;
    private String color;
    private ProducingPlace producingPlace;

    public Apple(String varieties,float weight,String color,ProducingPlace producingPlace){
        this.varieties = varieties;
        this.weight =weight;
        this.color = color;
        this.producingPlace = producingPlace;
        System.out.println("Apple constructor");
    }


    /**
     * 浅度复制：被复制对象所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用都仍然指向
     * 原来的对象。
     * @return
     */
    public Apple clone() {
        Apple apple = null;
        try {
            apple = (Apple)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return apple;

    }

    /**
     * 深度复制:被复制对象的所有变量都包含与原来的对象相同的值，除去那些应用其他对象的变量。
     * 引用其他变量的对象将指向被复制过的新对象，而不再是原来的那些被引用的对象。
     * 换言之，深度复制就是复制的对象所引用的对象都复制咯一遍，而这种对被引用到的对象的复制叫做间接复制
     * @return
     */
    public Apple depthClone(){
        Apple apple = null;
        try {
            apple = (Apple)super.clone();
            apple.producingPlace = producingPlace.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return apple;
    }

    @Override
    public String toString() {
        return "varieties:"+this.varieties+" weight:"+this.weight+" color:"+this.color+" producingPlace:"+producingPlace;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVarieties() {
        return varieties;
    }

    public void setVarieties(String varieties) {
        this.varieties = varieties;
    }

    public ProducingPlace getProducingPlace() {
        return producingPlace;
    }

    public void setProducingPlace(ProducingPlace producingPlace) {
        this.producingPlace = producingPlace;
    }
}

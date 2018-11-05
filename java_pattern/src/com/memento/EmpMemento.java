package com.memento;

/**
 * 备忘录（Memento）角色，如下责任：
 * 1、将发起人（Originator）对象的内部状态存储起来，备忘录可以根据发起人对象的判断来决定存储多少发起人对象
 * 2、备忘录可以保护其内容不被发起人对象自我的任何对象所读取。
 */
public class EmpMemento {
    private String ename;
    private int age;
    private double salary;

    //将发起人（Originator）对象的内部状态存储起来
    public EmpMemento(Emp emp){
        this.ename = emp.getEname();
        this.age = emp.getAge();
        this.salary = emp.getSalary();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

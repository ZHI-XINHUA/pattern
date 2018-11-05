package com.memento;

/**
 * 发起人（Originator）角色，如下责任：
 *  1、创建一个含有当前的内部状态的备忘录对象
 *  2、使用备忘录对象存储其内部状态
 */
public class Emp {
    private String ename;
    private int age;
    private double salary;

    /**
     * 进行备忘操作，并返回备忘录对象
     * @return
     */
    public EmpMemento memento(){
        return new EmpMemento(this);
    }

    /**
     * 进行数据恢复，恢复成制定备忘录对象的值
     * @param empMemento
     */
    public void recovery(EmpMemento empMemento){
        this.ename = empMemento.getEname();
        this.age = empMemento.getAge();
        this.salary = empMemento.getSalary();
    }



    public Emp(String ename, int age, double salary) {
        this.ename = ename;
        this.age = age;
        this.salary = salary;
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

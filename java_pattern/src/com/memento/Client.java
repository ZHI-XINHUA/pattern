package com.memento;

/**
 * Created by xh.zhi on 2018-11-5.
 */
public class Client {
    public static void main(String[] args) {
        //负责人，管理备忘录角色
        CareTaker careTaker = new CareTaker();

        Emp emp = new Emp("olay",20,6000);
        //进行备忘操作
        EmpMemento empMemento = emp.memento();

        //管理备忘录
        careTaker.setMemento(empMemento);

        System.out.println("第一次状态：Ename="+emp.getEname() +" Age="+emp.getAge() +" Salary="+emp.getSalary());

        //修改emp
        emp.setAge(21);
        emp.setSalary(8000);

        System.out.println("第二次状态：Ename="+emp.getEname() +" Age="+emp.getAge() +" Salary="+emp.getSalary());

        // 返回第一次的状态
        emp.recovery(empMemento);

        System.out.println("第三次状态：Ename="+emp.getEname() +" Age="+emp.getAge() +" Salary="+emp.getSalary());
    }

}

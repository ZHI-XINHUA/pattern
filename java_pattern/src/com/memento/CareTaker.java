package com.memento;

/**
 * 负责人（Caretaker）角色：负责保存备忘录对象，但是不检查备忘录对象的内容
 */
public class CareTaker {
    //备忘录对象
    private EmpMemento memento;

    //对个的时候可用集合，看实际情况而定
    //private List<EmpMemento> list = new ArrayList<EmpMemento>();

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}

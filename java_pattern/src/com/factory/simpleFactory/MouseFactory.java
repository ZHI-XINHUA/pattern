package com.factory.simpleFactory;

/**
 * 生产鼠标工厂类（生产类角色）
 */
public class MouseFactory {

    public Mouse createMouse(String type){
        if("dell".equals(type)){
            return new DellMouse();
        }else if("hp".equals(type)){
            return new HpMouse();
        }
        return null;
    }
}

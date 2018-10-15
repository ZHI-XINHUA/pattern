package com.observer.jdk;
import java.util.Observable;
import java.util.Observer;

/**
 * 读者，观察者角色。 实现jdk 的Observer接口
 */
public class Reader implements Observer {
    /**读者名字**/
    String name;
    /**读者喜爱的报刊**/
    String myLoveNewspaper;

    public Reader(String name){
        this.name = name;
    }


    /**
     * 有最新一期报刊推出，则触发方法
     * @param observable  被观察者
     * @param message 变化信息
     */
    @Override
    public void update(Observable observable, Object message) {
        if(observable instanceof Newspapers){
            myLoveNewspaper = ((Newspapers)observable).getNewspaperName();

            //马上订阅
            doSubscription();
        }

    }

    /**
     * 订阅报刊
     */
    private void doSubscription(){
        System.out.println("我是"+this.name+",帮我订阅一本："+myLoveNewspaper);
    }
}

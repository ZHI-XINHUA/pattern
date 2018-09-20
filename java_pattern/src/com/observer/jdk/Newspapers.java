package com.observer.jdk;

import java.util.Observable;

/**
 * Created by xh.zhi on 2018-9-20.
 * 报社，被观察者角色。继承jdk 的Observable类
 */
public class Newspapers extends Observable {
    /**刊报名称**/
    private String newspaperName;

    /**
     * 提供获取最新一期报刊
     * @return
     */
    public String getNewspaperName(){
        return newspaperName;
    }

    /**
     * 推出最新刊报
     * @param newspaperName
     */
    public void publishWorks(String newspaperName){
        this.newspaperName = newspaperName;
        System.out.println("推出新一期刊报："+newspaperName);
        //设置为状态已改变
        setChanged();
        //通知给位订阅者
        this.notifyObservers();
    }
}

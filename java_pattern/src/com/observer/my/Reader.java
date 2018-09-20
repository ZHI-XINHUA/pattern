package com.observer.my;

/**
 * Created by xh.zhi on 2018-9-20.
 * 读者，观察者角色
 */
public class Reader implements Observer{
    /**读者名字**/
    String name;
    /**读者喜爱的报刊**/
    String myLoveNewspaper;

    public Reader(String name){
        this.name = name;
    }

    /**
     * 有最新一期报刊推出，则触发方法
     * @param observable
     */
    @Override
    public void update(Observable observable) {
        //取得最新推出消息
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

package com.observer.my;

/**
 * Created by xh.zhi on 2018-9-20.
 */
public class MainTest {
    public static void main(String[] args) {
        // 三位读者
        Reader zhangshang = new Reader("zhangshan");
        Reader lisi = new Reader("lisi");
        Reader wuwang = new Reader("wuwang");

        // 报社
        Newspapers newspapers = new Newspapers();

        //三位读者关注了报社
        newspapers.addObserver(zhangshang);
        newspapers.addObserver(lisi);
        newspapers.addObserver(wuwang);

        //报社推出第一期新报刊，三位读者就去订购
        newspapers.publishWorks("第一期，舌尖上的中国之广东美食");


        System.out.println();

        // lisi觉得不咋地，下一期打算不订阅了
        newspapers.deleteObserver(lisi);

        //报社推出第二期新报刊，三位读者就去订购
        newspapers.publishWorks("第二期，都市生活");
    }
}

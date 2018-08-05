package com.strategy;

public class ClientMain {
    public static void main(String[] args) {
        //加法计算
        Context c1 = new Context(new AddCalculator());
        int result1 = c1.executeCalculate(2,3);
        System.out.println(result1);

        //减法计算
        Context c2 = new Context(new SubCalculator());
        int result2= c1.executeCalculate(2,3);
        System.out.println(result2);

        //乘法计算
        Context c3 = new Context(new MultiCalculator());
        int result3 = c1.executeCalculate(2,3);
        System.out.println(result3);

    }
}

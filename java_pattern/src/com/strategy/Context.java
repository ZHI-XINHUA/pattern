package com.strategy;

/**
 * 环境角色：持有一个Strategy类的引用
 */
public class Context {
    private Calculator calculator;

    public Context(Calculator calculator){
        this.calculator = calculator;
    }

    public int executeCalculate(int num1,int num2){
        return calculator.calculate(num1,num2);
    }
}

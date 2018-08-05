package com.strategy;

/**
 * 加法计算。（具体策略角色：包装了相关的算法或行为）
 */
public class AddCalculator extends Calculator {

    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }

}

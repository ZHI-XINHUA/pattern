package com.state;

/**
 * 抽象状态（State）角色：定义一个状态接口，用以封装环境（Context）对象的一个特定的状态所对应的行为
 */
public interface State {
    //不同状态，会有不同的操作
    void operation();
}

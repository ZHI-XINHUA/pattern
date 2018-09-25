package com.template;

/**
 * Created by xh.zhi on 2018-9-25.
 */
public class MainTest {
    public static void main(String[] args) {
        //射击游戏
        Game game = new ShootGame();
        game.play();

        //推塔游戏
        game = new PushingGame();
        game.play();
    }
}

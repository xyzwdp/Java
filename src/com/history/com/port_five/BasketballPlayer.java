package com.history.com.port_five;

public class BasketballPlayer extends Player{

    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习如何投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃大白菜喝紫菜蛋花汤");
    }
}

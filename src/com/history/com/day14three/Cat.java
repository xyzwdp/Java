package com.history.com.day14three;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃猫粮");
    }

    public void playGame(){
        System.out.println("猫捉迷藏");
    }
}

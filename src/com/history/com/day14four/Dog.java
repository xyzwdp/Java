package com.history.com.day14four;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }

    public void lookDoor(){
        System.out.println("狗看门");
    }
}

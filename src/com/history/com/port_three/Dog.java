package com.history.com.port_three;

public class Dog extends Animal implements Jumppingdog {


    public Dog(){

    }

    public Dog(String name,int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void jump2() {
        System.out.println("狗也可以跳高了");
    }
}

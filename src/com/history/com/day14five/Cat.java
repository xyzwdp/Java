package com.history.com.day14five;

public class Cat extends Animal{

    public Cat(){

    }


    public Cat(String name,int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃老鼠");
    }
}

package com.history.com.abstract_four;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃虾米");
    }

    public Cat(){

    }

    public Cat(String name,int age){
        super(name, age);
    }
}

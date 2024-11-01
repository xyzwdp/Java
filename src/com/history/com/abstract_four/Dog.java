package com.history.com.abstract_four;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    public Dog(){

    }

    public Dog(String name,int age){
        super(name, age);
    }
}

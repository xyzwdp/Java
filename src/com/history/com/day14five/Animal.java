package com.history.com.day14five;

public class Animal {
    public int age;
    public String name;

    public Animal(){

    }

    public Animal(String name,int age){
        this.age=age;
        this.name=name;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("动物吃麻辣");
    }
}

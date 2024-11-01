package com.history.com.day12five;

public class Student {
    private String name;
    private int age;

    public Student(){

    }

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age=age;
    }

    public void sduty(){
        System.out.println("天天学习，看看美女帅哥");
    }
}

package com.history.comtwo.object;

//Student类隐含了一个继承关系：extends Object

public class Student {
    private String name;
    private int age;

    public Student(){

    }

    public Student (String name,int age){
        this.name=name;
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

    public  void setAge(int age){
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package com;

public class Application {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setName("张三");
        System.out.println(student1.getName());
        student1.setAge(999);
        System.out.println(student1.getAge());
    }
}

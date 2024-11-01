package com.history.com.day5.student;

public class StudentDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 33;
        System.out.println(s1.name+","+s1.age);

        //把第一个对象地址赋值给第二个对象
        Student s2 = s1;
        System.out.println(s2.name+","+s2.age);
        s2.name = "李四";
        s2.age = 44;
        System.out.println(s2.name+","+s2.age);
        System.out.println(s1.name+","+s1.age);
    }


}

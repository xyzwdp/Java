package com.history.com.day12six;

public class PersonDemo {
    public static void main(String[] args) {
        //创建老师类对象进行测试
        Teacher t1 = new Teacher();
        t1.setName("花花的世界");
        t1.setAge(6);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("哈哈", 2222);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();

        Student s1 = new Student();
        s1.setName("小明");
        s1.setAge(8);
        s1.study();

        Student s2 = new Student("小花",7);
        System.out.println(s2.getName()+","+s2.getAge());
        s2.study();



    }
}

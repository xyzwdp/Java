package com.history.com.day5.student2;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        //使用set方法给成员变量赋值
        s.setName("应欢欢");
        s.setAge(11);

        s.show();

        //使用get方法获取成员变量的值
        //System.out.println(s.getName() + "-----" + s.getAge());
    }
}

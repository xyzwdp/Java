package com.history.com.day6.student2;

/*创建对象并为成员变量赋值的两种方式
        无参构造方法创建对象后使用set()赋值
        使用带参构造方法方法直接创建带有属性的对象*/

public class StudentDemo {
    public static void main(String[] args) {
        //无参构造方法创建对象后使用set()赋值
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(33);
        s1.show();

        //使用带参构造方法方法直接创建带有属性的对象
        Student s2 = new Student("李四",44);
        s2.show();

    }

}

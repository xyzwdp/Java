package com.history.com.day5.student;

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        System.out.println(s);

        //使用对象
        /*System.out.println(s.name+","+s.age);
        s.name="林动";
        s.age=22;*/
        //s.setAge(-30);

        //private修饰的变量，可通过set/get方法访问
        s.setAge(30);
        long c = s.getAge();
        System.out.println(c);
        //System.out.println(s.name+","+s.age);
        s.setHigh(40);
        int d=s.getHigh();
        System.out.println(d);
        System.out.println("-------------------");
        s.study();
        s.doHomework();

        s.name="哈哈";
        s.show();
    }
}

package com.history.com.day6.student1;

//测试类

public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        s.show();

        //public Student(String name)
        Student s1 = new Student("林动");
        s1.show();

        //public Student(int age)
        Student S2 = new Student(22);
        S2.show();

        //public Student(String name,int age)
        Student s3 = new Student("张三",33);
        s3.show();
        
    }

}

package com.history.com.day13five;

public class StaticDemo {
    public static void main(String[] args) {

        Student.university="哈哈大学";

        Student s1 = new Student();
        s1.name="如花";
        s1.age=22;
        //s1.university="家里蹲大学";
        s1.show();

        Student s2 =new Student();
        s2.name="伯虎";
        s2.age=33;
        //s2.university="博客大学";
        s2.show();

        Student s3 =new Student();
        s3.name="伯虎";
        s3.age=33;
        //s2.university="家里蹲大学";
        s3.show();

    }
}

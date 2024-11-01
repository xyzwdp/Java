package com.now.seven;

import com.now.three.Student;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        Person student1 = new Student();

        student.run();
        student1.run();
        student.eat();
        ((Student) student1).eat();
        System.out.println("-----------------------");
        Student s1 = new Student();




    }
}

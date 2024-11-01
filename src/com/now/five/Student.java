package com.now.five;

//子类：派生类

import com.now.four.Person;

public class Student extends Person {
    public Student() {
        //隐藏代码：默认调用父类无参构造
        //调用父类构造器，必须在子类的第一行
        super();
        System.out.println("Student无参执行");
//        super();
    }

    private String name="lisi";
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
    public void print(){
        System.out.println("Student");
    }
    public void test1(){
        print();
        this.print();
        super.print();
    }


}

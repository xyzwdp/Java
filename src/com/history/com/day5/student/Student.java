package com.history.com.day5.student;

public class Student {
    //成员变量
    String name;
    int age;
    int High;

    //提供get/set方法
    public void setAge(int a) {
        //age = a;
        if (a < 0 || a > 120) {
            System.out.println("你给的年龄有误");
        } else {
            age = a;
        }
    }
    public void setHigh(int high){
        this.High=high;
    }
    public int getHigh(){
        return High;
    }

    public int getAge() {
        return age;
    }

    //成员方法
    public void study() {
        System.out.println("好好学习，天天向上");
    }

    public void doHomework() {
        System.out.println("键盘敲烂，月薪过万");
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}

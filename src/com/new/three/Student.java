package com;
/*
* 提高程序的安全性，保护数据
* 隐藏代码的实现细节
* 统一接口
* 系统可维护性增加了
*/
public class Student {
    //封装主要针对属性
    private String name;
    private char sex;
    private int id;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>120||age<1){//不合法
            this.age = 3;
        }else {
            this.age = age;
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getId() {
        return id;
    }
}

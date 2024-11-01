package com.history.comtwo.equals;

public class Student {
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //this-----s
        //o--------s1
        //比较地址是否相同，若相同直接返回true
        if (this == o) return true;

        //参数是否null
        //判断两个对象是否来自同一个类
        if (o == null || getClass() != o.getClass()) return false;

        //向下转型
        Student student = (Student) o;//student==s1

        return age == student.age && name.equals(student.name);
    }

}

package com.history.com.day12seven;

public class Demo {
    public static void main(String[] args) {
        //创建猫来对象进行测试
        Cat c1 = new Cat();
        c1.setName("大呲花");
        c1.setAge(18);
        System.out.println(c1.getName()+","+ c1.getAge());
        c1.catchMouse();

        Cat c2 = new Cat("猪猪侠",55);
        System.out.println(c2.getName()+","+c2.getAge());
        c1.catchMouse();

        //创建狗类对象进行测试
        Dog d1 = new Dog();
        d1.setName("灰宝");
        d1.setAge(6);
        System.out.println(d1.getName()+","+d1.getAge());
        d1.lookgoal();

        Dog d2 = new Dog("灰灰",33);
        System.out.println(d2.getName()+","+d2.getAge());
        d2.lookgoal();


    }
}

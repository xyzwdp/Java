package com.history.com.port_three;

public class AnimaDemo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Jumpping j = new Cat();
        j.jump();
        System.out.println("--------------");

        Animal a = new Cat();
        a.setAge(11);
        a.setName("如花");
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        //a.jump();

        a = new Cat("济公",22);
        System.out.println(a.getName()+","+a.getAge());
        a.eat();
        System.out.println("------------------");

        Cat c = new Cat();
        c.setName("张张");
        c.setAge(33);
        System.out.println(c.getName()+","+c.getAge());
        c.eat();
        c.jump();
    }
}

package com.history.com.abstract_four;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.setName("花花");
        a.setAge(12);
        System.out.println(a.getAge()+","+a.getName());
        a.eat();
        System.out.println("----------");

        a=new Cat("哈哈",22);
        System.out.println(a.getAge()+","+a.getName());
        a.eat();
        System.out.println("----------");

        a=new Dog("呵呵",55);
        System.out.println(a.getAge()+","+a.getName());
        a.eat();
        System.out.println("----------");


        Animal b = new Dog();
        Dog c=(Dog) b;
        c.setAge(33);
        c.setName("小三");
        System.out.println(a.getAge()+","+a.getName());
        c.eat();

    }
}

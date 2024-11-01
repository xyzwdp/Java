package com.history.com.day14two;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建动物操作类的对象，调用方法
        AnimalOperrator ao = new AnimalOperrator();

        Cat c = new Cat();
        ao.useAnimal(c);

        Dog d = new Dog();
        ao.useAnimal(d);

        /*Dog f = new Dog();
        ao.useAnimal(f);*/

        Pig g = new Pig();
        ao.useAnimal(g);

    }
}

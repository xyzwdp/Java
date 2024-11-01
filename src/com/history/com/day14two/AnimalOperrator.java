package com.history.com.day14two;

public class AnimalOperrator {

    /*public void useAnimal(Cat c){//Cat c = new Cat
        c.eat();
    }

    public void useAnimal(Dog d){//Dog d = new Dog();
        d.eat();
    }*/

    public void useAnimal(Animal a){
        //Animal a = new Cat
        //Animal a = new Dog;
        a.eat();

        //不能访问子类特有功能
        //a.lookDoor();
    }
}

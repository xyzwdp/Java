package com.history.com.day12six;

public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name,age);
    }

    public Teacher() {

    }

/*    public Teacher(){

    }
    public Teacher(String name,int age){
        //this.name=name;
        //this.age=age;
        super(name,age);
    }*/

    public void teach(){
        System.out.println("成就每一位美");
    }
}

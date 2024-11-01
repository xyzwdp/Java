package com.history.com.day12three;

public class Zi extends Fu{
    //父类中私有方法，子类中不能重写
    /*@Override
    private void show(){
        System.out.println("Fu中show()方法被调用");
    }*/

    /*@Override
    public void method(){
        System.out.println("Fu中method()方法被调用");
    }*/

    //子类中的访问权限不能比父类中低
    /*@Override
    void method(){
        System.out.println("Fu中method()方法被调用");
    }*/

    @Override
    public void method(){
        System.out.println("Fu中method()方法被调用");
    }
}

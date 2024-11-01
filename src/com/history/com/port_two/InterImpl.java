package com.history.com.port_two;

//public class InterImpl implements Inter{  等价

public class InterImpl extends Object implements Inter{
    public InterImpl(){
        super();
    }

    @Override
    public void method(){
        System.out.println("method");
    }

    @Override
    public void show() {

    }
}

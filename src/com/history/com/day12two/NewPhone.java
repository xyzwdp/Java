package com.history.com.day12two;

public class NewPhone extends Phone {
    /*public void call(String name) {
        System.out.println("开启视频功能");
        //System.out.println("给" + name + "打电话");
        super.call(name);
    }*/
    @Override   //帮忙检查重写方法的方法声明正确性
    public void call(String name){
        System.out.println("开启视频功能");
        //System.out.println("给" + name + "打电话");
        super.call(name);
    }
}

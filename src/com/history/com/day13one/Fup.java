package com.history.com.day13one;

public class Fup {
    private void show1(){
        System.out.println("private");
    }

    void show2(){
        System.out.println("默认");
    }

    protected void show3(){
        System.out.println("protected");
    }

    public void show4(){
        System.out.println("public");
    }

    public static void main(String[] args) {
        //创建Fup的对象，测试看哪些方法可以访问到
        Fup f = new Fup();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}

package com.history.com.port_two;

public interface Inter {

    public int num = 10;
    public final int num2 = 20;
    public static final int num3 = 30;
    int num4 = 40;

    //接口中不能有构造方法
    //public Inter(){}

    //public void show(){}

    public abstract void method();

    //接口里的方法默认携带 public abstract
    void show();
}

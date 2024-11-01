package com.history.com.day7;

import java.util.ArrayList;

/*
* 空集合
	pubulic ArrayList()
		创建一个空的集合对象
	public boolean add (E e)
		将指定的元素追加到此集合的末尾
	public void add（int index,E element）
		在此集合中的指定位置插入指定的元素
* */
public class ArrayListDemo1 {
    public static void main(String[] args) {
//    pubulic ArrayList()
//		创建一个空的集合对象
        ArrayList<String> arry = new ArrayList<String>();
        //public boolean add (E e)
        //将指定的元素追加到此集合的末尾
        System.out.println(arry.add("hello"));
        System.out.println(arry);
        arry.add("hello");
        arry.add("world");
        arry.add("java");

        //通过索引向列表中添加元素
        arry.add(1,"javase");

        arry.add(3,"javaee");
        //IndexOutOfBoundsException
        arry.add(7,"javacc");

        //输出集合
        System.out.println("array" + arry);
    }
}















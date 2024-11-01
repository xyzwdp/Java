package com.history.com.day7;

import java.util.Scanner;

/*Scanner :
        用于获取键盘录入数据。（基本数据类型，字符串数据）

    public String nextline();
        获取键盘录入的字符串数据*/
public class ScanerDemo {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接收数据
        System.out.println("请输入一个字符串数据：");
        //String line = sc.nextLine();
        //Ctrl+Alt+v
        int anInt = sc.nextInt();

        //输出结果
        System.out.println("你输入的数据是：" + anInt);
    }

}

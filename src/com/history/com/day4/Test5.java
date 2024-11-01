package com.history.com.day4;

/*需求：鸡翁一值钱五，鸡母一值钱三，鸡雏3值钱1，百钱买百鸡
    问：鸡翁，鸡母，鸡雏各几何*/

/*思路：
    1、第一层循环，用于表示鸡翁的范围，x=0，x<=20
    2、第二层循环，用于表示鸡母的范围，y=0.y<=33
    3、这个时候，用于表示鸡雏的数量z=100-x-y
    4、判断z%3==0和表达式5*x+3*y+z=100是否同时成立，如果成立，输出对应的x，y，z的值
    */

public class Test5 {
    public static void main(String[] args) {
        for (int x=0;x<=20;x++){
            for (int y=0;y<=33;y++){
                int z=100-x-y;
                if (z%3==0 && 5*x+3*y+z/3==100){
                    System.out.println("鸡翁的数量为"+x+","+"鸡母的数量为"+y+","+"鸡雏的数量为"+z);

                }
            }
        }
    }
}

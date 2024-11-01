package com.history.com.Day01;

import java.util.Scanner;

public class ExamIncent {
    public static void main(String[] args){
        //创建对象
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入小明得分：");
        //接收数据
        int score= sc.nextInt();

        //进行条件判断
        //数据测试：正确数据，边间数据，错误数据
        if (score<0||score>100) {
            System.out.println("输入数据有误，请重新输入");
        }else if (score>=95&&score<=100){
            System.out.println("山地自行车一辆");
        }else if (score>=90 && score<=94){
            System.out.println("游乐场玩一次");
        }else if (score>=80 && score<=89){
            System.out.println("变形金刚玩具一个");
        }else{
            System.out.println("胖揍一顿");
        }
    }


}

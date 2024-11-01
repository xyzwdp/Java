package com.history.com.Day01;

public class OperatorDemo04 {
    public static void main(String[] args){
        int i=10;
        int j=20;
        int k=30;

        //& 有false就是false
        System.out.println((i>j)&(i>k));
        System.out.println((i<j)&(i>k));
        System.out.println((i<j)&(i<k));
        System.out.println("---------");

        // |    有true就是true
        System.out.println((i>j)|(i>k));
        System.out.println((i<j)|(i>k));
        System.out.println((i<j)|(i<k));
        System.out.println("---------");

        // ^    相同为false；不同为true
        System.out.println((i>j)^(i>k));//false;false
        System.out.println((i<j)^(i>k));//true;false
        System.out.println((i<j)^(i<k));//true;true
        System.out.println("^---------");

        // !
        System.out.println("xx");
        System.out.println(!(i>j));
        System.out.println(!!(i>j));
        System.out.println(!!!(i>j));
        System.out.println("!---------");

        //&&    短路与 有false就是false
        System.out.println((i>j)&&(i>k));
        System.out.println((i<j)&&(i>k));
        System.out.println((i<j)&&(i<k));
        System.out.println("---------");

        // ||   短路或    有true就是true
        System.out.println((i>j)||(i>k));
        System.out.println((i<j)||(i>k));
        System.out.println((i<j)||(i<k));
        System.out.println("---------");

        //&&和&,验证是&&左边为false时，右边不执行
        int a = i++;
        System.out.println(a);
        System.out.println((i++>100)&(j++>100));
        System.out.println(i);
        System.out.println(j);
        System.out.println((i++>100)&&(j++>100));
        System.out.println("i:"+i);
        System.out.println("j:"+j);
    }
}

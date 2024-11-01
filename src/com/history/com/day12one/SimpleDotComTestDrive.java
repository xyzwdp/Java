package com.history.com.day12one;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        /*//初始化一个对象
        SimpleDotCom dot = new SimpleDotCom();

        int locations = {2,3,4};

        //dot.setLocationCells(locaons);

        String userGuess = "2";
        String result = dot.checkYourseself(userGuess);
        String testResult = "failed";

        if (result.equals("hit")){
            testResult = "passed";
        }
        System.out.println(testResult);*/

        SimpleDotCom dot = new SimpleDotCom();
        int [] locations = {2,3,4};
        dot.setLocationCells(locations);

        /*String userGuess = "1";
        Scanner sc = new Scanner(userGuess);
        System.out.println("请输入一个空格（0-6）：");
        //int number = sc.nextInt();
        String userGuess = sc.toString();*/

        String userGuess = "5";
        String result = dot.checkYourself(userGuess);
    }
}

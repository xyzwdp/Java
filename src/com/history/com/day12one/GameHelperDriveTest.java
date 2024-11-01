package com.history.com.day12one;

public class GameHelperDriveTest {
    public static void main(String[] args) {
        int numOfGueses = 0;

        GameHelper helper = new GameHelper();

        SimpleDotCom theDoctCom = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDoctCom.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive == true) {
            String guss = helper.getUserInput("enter a number");
            String result = theDoctCom.checkYourself(guss);
            numOfGueses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took" + numOfGueses + "gusses");
            }
        }
    }
}

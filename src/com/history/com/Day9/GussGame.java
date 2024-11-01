package com.history.com.Day9;

public class GussGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1lisRight = false;
        boolean p2lisRight = false;
        boolean p3lisRight = false;

        int targerNumber = (int) (Math.random() *10);
        System.out.println("I‘m thinking of a number between 0 and 9...");

        while (true){
            System.out.println("Number to guss is" +  targerNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player one guessed" + guessp1);

            guessp2 = p2.number;
            System.out.println("Player one guessed" + guessp2);

            guessp3 = p3.number;
            System.out.println("Player one guessed" + guessp3);

            if (guessp1 == targerNumber){
                p1lisRight = true;
            }

            if (guessp2 == targerNumber){
                p2lisRight = true;
            }

            if (guessp3 == targerNumber){
                p3lisRight = true;
            }

            if (p1lisRight || p2lisRight || p3lisRight){

                System.out.println("We have a winner!");
                System.out.println("Player one got it right?" + p1lisRight);
                System.out.println("Player one got it right?" + p2lisRight);
                System.out.println("Player one got it right?" + p3lisRight);
                System.out.println("Game is over.");
                break;
            }else {
                //都没有猜到，所以要继续下去
                System.out.println("Player will have to try again.");
            }// if/else 结束
        }//循环结束
    }//方法结束
}//类结束

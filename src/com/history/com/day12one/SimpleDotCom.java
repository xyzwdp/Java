package com.history.com.day12one;

public class SimpleDotCom {
    int [] locationCells;
    int nuOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        for (int cell : locationCells){
            if (guess == cell){
                result = "hit";
                nuOfHits++;
                break;
            }
        }
        if (nuOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
            return result;
    }
}

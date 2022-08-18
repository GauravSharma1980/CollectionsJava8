package com.challenges;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HeighestCandleLenght {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<Integer>() {
            {
                add(10);
                add(5);
                add(5);
                add(10);
            }
        };

        System.out.println("the total number of heighest length candle are "+birthdayCakeCandles(intList));
        System.out.println("the total number of heighest lenght candle are "+birthdayCakeCandlesLongApproach(intList));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int maxHeightCandle = candles.stream().max(Comparator.comparing(Integer::intValue)).get();
        int countMaxOccurances =0;
        for(int i:candles){
            if(i== maxHeightCandle)
                ++countMaxOccurances;
        }
        if(countMaxOccurances==0)
            return (countMaxOccurances+1);
        else
            return countMaxOccurances;
    }

    public static int birthdayCakeCandlesLongApproach(List<Integer> candles) {

        int maxValue = Integer.MIN_VALUE;
        int maxCountOccurances=0;
        for(int i : candles){
            if(maxValue<i){
                maxValue = i;
            }
            if(maxValue==i){
                ++maxCountOccurances;
            }
        }
        return maxCountOccurances;
    }
}


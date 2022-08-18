package com.challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SumNumberOfList {

    public static void main(String[] args) {

        List<Long> intList = Arrays.asList(396285104L, 573261094L, 759641832L, 819230764L, 364801279L);
        //miniMaxSum(intList);
        miniMaxSum1(intList);
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int temp=0;
        int arrOfSums[]= new int[arr.size()];
        int index=0;
        int arrInteger[] = arr.stream().mapToInt(Integer::intValue).toArray();

        arr.stream().sorted(Comparator.naturalOrder());
        arr.set(0,0);
        int maxSum = arr.stream().reduce(0,(sum,element)->element+sum);
        arr.set(0,1);
        arr.set(4,0);
        int minSum = arr.stream().reduce(0,(sum,element)->element+sum);
        System.out.println(maxSum+""+minSum);
    }

    public static void miniMaxSum1(List<Long> arr){

        Long minValue =  arr.stream().min(Comparator.comparing(Long::intValue)).get();
        Long maxValue = arr.stream().max(Comparator.comparing(Long::intValue)).get();
        System.out.println("min "+minValue+"max "+maxValue);

        Long sum =0L;
        for (Long i:arr){
            sum += i;
        }

        System.out.println("sum"+sum);
        Long minSum = sum - maxValue;
        Long maxSum = sum - minValue;

        System.out.println("maxSum:: "+maxSum +" minSum::"+minSum);


    }

}

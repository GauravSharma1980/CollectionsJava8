package com.challenges;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CompareArrays {

    public static void main(String[] args) {
        CompareArrays ca= new CompareArrays();
        int outResult = ca.compareArrays(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        System.out.println(outResult);

    }
    private int compareArrays(int arr1[],int arr2[])
    {
        //return (int[]) Arrays.stream(arr1).map(element->element*2).toArray();
        return Arrays.stream(arr1).iterator().next().compareTo(Arrays.stream(arr2).iterator().next());

    }

}

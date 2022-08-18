package com;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        // first way
        String nameValue =  "my name is gaurav";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(nameValue);
        stringBuilder = stringBuilder.reverse();
        System.out.println(stringBuilder);

        //second way

        System.out.println("*******************************");

        String[] strArray  = nameValue.split(" ");
        for(int i =strArray.length-1;i>=0;--i){
            System.out.println(strArray[i]);
        }


        //third way
        char[] arr = nameValue.toCharArray();

        for(int i = arr.length-1;i>=0;--i){
            System.out.print(nameValue.charAt(i));
        }


    }
}

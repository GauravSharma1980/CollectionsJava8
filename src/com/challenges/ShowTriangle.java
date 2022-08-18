package com.challenges;

import java.util.Scanner;

public class ShowTriangle {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number =  input.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<number;i++){
            sb.append(" ");
        }
        int j=0;
        for(int k=1;k<number;k++){
            sb.replace(sb.length()-k,sb.length()-j,"#");
            System.out.println(sb);
            j++;
        }
    }
}

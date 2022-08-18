package com.challenges;

import java.io.*;
import java.util.Locale;

public class AlphabatWheel {

    public static void main(String[] args) throws IOException {
        BufferedReader inputString =  new BufferedReader(new InputStreamReader(System.in));
        String str = inputString.readLine();
        System.out.println("the input string is "+str);

        BufferedReader inputKvalue =  new BufferedReader(new InputStreamReader(System.in));
        int strKvalue = Integer.parseInt(inputKvalue.readLine());
        System.out.println("the input K value is "+strKvalue);

        str = str.toUpperCase();
        char charArray[] =  str.toCharArray();
        String decryptedString="";
        int finalIvalue=0;
        for(int i =0;i<charArray.length;i++)
        {
                int ii = charArray[i] - strKvalue;
                if (ii < 65) {
                    int overIntValue = 65 - ii;
                    finalIvalue = 91 - overIntValue;
                    decryptedString += Character.toString((char) (finalIvalue));
                } else
                    decryptedString += Character.toString((char) (charArray[i] - strKvalue));
            //}
            }
        System.out.println(decryptedString);
    }
}

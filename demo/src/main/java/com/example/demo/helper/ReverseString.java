package com.example.demo.helper;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String args[])
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = br.readLine();
            System.out.println(reverseString(inputString));
        } catch (Exception e) {
            System.out.println("Exception encountered!");
            e.printStackTrace();
        }
    }

    public static char[] reverseString(String inputString) {
        if(inputString == null)
        {
            throw new NullPointerException("Input string is null");
        }
        char[] outputArray = new char[inputString.length()];
        int j=0;
        for(int i=inputString.length()-1;i>=0;i--)
        {
            outputArray[j] = inputString.charAt(i);
            j++;
        }
        return outputArray;
    }
}

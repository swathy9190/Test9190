package com.example.demo.helper;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckVowelInString {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputString = br.readLine();
            System.out.println(checkForVowel(inputString));
        } catch (Exception e) {
            System.out.println("Exception encountered!");
            e.printStackTrace();
        }
    }

    private static boolean checkForVowel(String inputString) { // Hello
        if(inputString.matches(".*[aeiouAEIOU].*"))
        {
            return true;
        }
        return false;
    }
}

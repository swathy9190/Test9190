package com.example.demo.helper;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int number1 = Integer.parseInt(br.readLine());
            int number2 = Integer.parseInt(br.readLine());
            System.out.println("number1 before " + number1);
            System.out.println("number2 before " + number2);
            swapTwoNumbers(number1, number2);
        }
         catch (Exception e) {
            System.out.println("Exception encountered!");
            e.printStackTrace();
        }
    }

    private static void swapTwoNumbers(int number1, int number2) {
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("number1 after " + number1);
        System.out.println("number2 after " + number2);
    }
}

package com.example.demo.helper;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckIfPrime {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int number = Integer.parseInt(br.readLine());
            System.out.println(IsPrime(number));
        } catch (Exception e) {
            System.out.println("Exception encountered!");
            e.printStackTrace();
        }
    }

    private static boolean IsPrime(int number) {
        if(number == 0 || number == 1)
        {
            return false;
        }

        if(number == 2)
        {
            return true;
        }

        for(int i=2; i<=number/2; i++)
        {
            if(number%i == 0)
            {
                return false;
            }
        }
        return true;
    }
}

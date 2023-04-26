package com.example.demo.helper;

public class FibonacciSequence {

    public static void main(String[] args) {
        printFibonacci();
        System.out.print(0 + " ");
        printFibonacciUsingRecursion(0, 1);
    }

    private static void printFibonacciUsingRecursion(long i, long j) {
        if (i > 1000000)
        {
            return;
        }
        System.out.print(j + " ");
        printFibonacciUsingRecursion(j, i+j);
    }

    private static void printFibonacci() {
        long i=0, j=1;
        System.out.print(i + " " + j + " ");
        for(int k=0;k<49;k++)
        {
            long sum = i+j;
            System.out.print(sum + " ");
            i = j;
            j = sum;
        }
    }
    
}

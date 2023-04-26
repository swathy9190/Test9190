package com.example.demo.helper;

public class BinarySearch {
    static int[] arr = {3, 4, 10, 12, 16, 17, 24, 32, 100};
    public static void main(String[] args) {
        int numberToSearch = 100;
        System.out.println(doesNumberExist(numberToSearch, arr));
    }

    private static boolean doesNumberExist(int numberToSearch, int[] arr) {
        int index = binarySearch(0, arr.length-1, numberToSearch);
        return index >= 0 ? true : false;
    }

    private static int binarySearch(int i, int j, int numberToSearch) {
        if(i<=j)
        {
            int mid = (i+j)/2;
            if(numberToSearch == arr[mid])
            {
                return mid;
            }
            else if(numberToSearch < arr[mid])
            {
                return binarySearch(i, mid-1, numberToSearch);
            }
            else
            {
                return binarySearch(mid+1, j, numberToSearch);
            }
        }
        return -1;
    }
}

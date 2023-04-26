package com.example.demo.helper;

public class RemoveAllOccurrences {
    public static void main(String[] args) {
        String input = "ashfcasszzza";
        String charToBeRemoved = "z";
        input = input.replace(charToBeRemoved, "");
        System.out.println(input);
    }
    
}

package com.example.demo.helper;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharacterCount {
    public static void main(String[] args) {
        String input = "ashfcasszzza";
        printDistinctCount(input);
    }

    private static void printDistinctCount(String input) {
        Map<Character, Integer> countMap = new HashMap<>();
        for(int i=0;i<input.length();i++)
        {
            char key = input.charAt(i);
            int newValue = 1;
            if(countMap.containsKey(key))
            {
                int currValue = countMap.get(key);
                countMap.remove(key);
                newValue += currValue;
            }
            countMap.put(key, newValue);
        }
        // Iterating HashMap through for loop
        for (Map.Entry<Character, Integer> characterCount :
        countMap.entrySet()) {
 
            // Printing all elements of a Map
            System.out.println(characterCount.getKey() + " = "
                               + characterCount.getValue());
        }
    }
    
}

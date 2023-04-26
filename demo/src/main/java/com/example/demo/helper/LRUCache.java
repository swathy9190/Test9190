package com.example.demo.helper;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
    static int maxCacheSize = 5;
    public static void main(String[] args) {
        int[] arr = {6, 8, 9, 6, 10, 18, 8, 12};
        Map<Integer, Integer> lookup = new HashMap<>();
        LinkedList<Integer> cache = new LinkedList<>();

        for (int value : arr) {
            insertItem(value, cache, lookup);
        }
    }

    private static boolean isCacheFull(LinkedList cache) {
        if(cache.size() == maxCacheSize)
        {
            System.out.println("Cache is full!!");
            return true;
        }
        return false;
    }

    private static void insertItem(int value, LinkedList cache, Map<Integer, Integer> lookup) {
        if(lookup.containsKey(value))
        {
            Integer item = value;
            cache.remove(item);
        }
        else 
        {
            if(isCacheFull(cache))
            {
                int itemToBeRemoved = (int) cache.peekLast();
                cache.removeLast();
                lookup.remove(itemToBeRemoved);
            }
            lookup.put(value, 1);
        }
        cache.addFirst(value);
    }
}

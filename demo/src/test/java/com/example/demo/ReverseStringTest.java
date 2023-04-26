package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.example.demo.helper.ReverseString;

public class ReverseStringTest {
    @Test
    void testReverseString_OddCharacterString()
    {
        String sampleInput = "Hello";
        StringBuilder sb = new StringBuilder();
        char[] output = ReverseString.reverseString(sampleInput);
        sb.append(output);
        assertEquals("olleH", sb.toString());
    }

    @Test
    void testReverseString_EvenCharacterString()
    {
        String sampleInput = "HelloWorld";
        StringBuilder sb = new StringBuilder();
        char[] output = ReverseString.reverseString(sampleInput);
        sb.append(output);
        assertEquals("dlroWolleH", sb.toString());
    }

    @Test
    void testReverseString_StringWithSpace()
    {
        String sampleInput = "Hello World";
        StringBuilder sb = new StringBuilder();
        char[] output = ReverseString.reverseString(sampleInput);
        sb.append(output);
        assertEquals("dlroW olleH", sb.toString());
    }

    @Test
    void testReverseString_StringWithSpecialChaarcter()
    {
        String sampleInput = "Hello@World";
        StringBuilder sb = new StringBuilder();
        char[] output = ReverseString.reverseString(sampleInput);
        sb.append(output);
        assertEquals("dlroW@olleH", sb.toString());
    }

    @Test
    void testReverseString_WithEmptyString()
    {
        String sampleInput = "";
        StringBuilder sb = new StringBuilder();
        char[] output = ReverseString.reverseString(sampleInput);
        sb.append(output);
        assertEquals("", sb.toString());
    }

    @Test
    void testReverseString_WithNullString()
    {
        assertThrows(NullPointerException.class, () -> {ReverseString.reverseString(null);});
    }
}

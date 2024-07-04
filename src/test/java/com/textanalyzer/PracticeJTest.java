package com.textanalyzer;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PracticeJTest {

    @Test
    public void testCountVowels() {
        String input = "AaEeiIoOuU";
        Map<Character, Integer> expectedCounts = new TreeMap<>();
        expectedCounts.put('a', 2);
        expectedCounts.put('e', 2);
        expectedCounts.put('i', 2);
        expectedCounts.put('o', 2);
        expectedCounts.put('u', 2);

        Map<Character, Integer> actualCounts = PracticeJ.countVowels(input);
        assertEquals(expectedCounts, actualCounts);
    }

    @Test
    public void testCountConsonants() {
    String input = "bcdfgBCDFG";
        Map<Character, Integer> expectedCounts = new TreeMap<>();
        expectedCounts.put('b', 2);
        expectedCounts.put('c', 2);
        expectedCounts.put('d', 2);
        expectedCounts.put('f', 2);
        expectedCounts.put('g', 2);

        Map<Character, Integer> actualCounts = PracticeJ.countConsonants(input);
        assertEquals(expectedCounts, actualCounts);
    }

    @Test
    public void testCountConsonantsWithEmptyString() {
        String input = "";
        Map<Character, Integer> expectedCounts = new TreeMap<>();

        Map<Character, Integer> actualCounts = PracticeJ.countConsonants(input);
        assertEquals(expectedCounts, actualCounts);
    }

    @Test
    public void testCountVowelsWithEmptyString() {
        String input = "";
        Map<Character, Integer> expectedCounts = new TreeMap<>();

        Map<Character, Integer> actualCounts = PracticeJ.countVowels(input);
        assertEquals(expectedCounts, actualCounts);
    }
}

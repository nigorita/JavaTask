package com.textanalyzer;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class PracticeJ {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java practiceJ <vowels|consonants> <inputString>");
            return;
        }

        String option = args[0]; // vowels or consonants
        String input = args[1]; // input string to analyze

        if (option.equalsIgnoreCase("vowels")){
            Map<Character, Integer> vowelCounts = countVowels(input);
            System.out.println(vowelCounts);
        } else if (option.equalsIgnoreCase("consonants")){
            Map<Character, Integer> consonantCounts = countConsonants(input);
            System.out.println(consonantCounts);
        } else {
            System.out.println("Invalid option. Use 'vowels' or 'consonants'.");
        }
    }

    public static Map<Character, Integer> countConsonants(String input) {

        input = input.toLowerCase();
        Pattern consonants = Pattern.compile("[b-df-hj-np-tv-z]");
        Map<Character, Integer> consonantCounts = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (consonants.matcher(String.valueOf(c)).matches()) {
                consonantCounts.put(c, consonantCounts.getOrDefault(c, 0) + 1);
            }
        }
        return consonantCounts;
    }

    public static Map<Character, Integer> countVowels(String input) {

        input = input.toLowerCase();
        Pattern vowels = Pattern.compile("[aeiou]");
        Map<Character, Integer> vowelCounts = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.matcher(String.valueOf(c)).matches()) {
                vowelCounts.put(c, vowelCounts.getOrDefault(c, 0) + 1);
            }
        }
        return vowelCounts;
    }
}

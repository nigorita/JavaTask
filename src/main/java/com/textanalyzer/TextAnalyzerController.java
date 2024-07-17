package com.textanalyzer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TextAnalyzerController {

    @GetMapping("/api/analyze")
    public Map<Character, Integer> analyze(
        @RequestParam String mode,
        @RequestParam String input) {
        
        if ("vowels".equalsIgnoreCase(mode)) {
            return PracticeJ.countVowels(input);
        } else if ("consonants".equalsIgnoreCase(mode)) {
            return PracticeJ.countConsonants(input);
        } else {
            throw new IllegalArgumentException("Invalid mode. Use 'vowels' or 'consonants'.");
        }
    }
}

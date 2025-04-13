// Q.20 Guess the Word

import java.util.ArrayList;
import java.util.List;

/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */

class Solution {
    public void findSecretWord(String[] words, Master master) {
        List<String> candidates = new ArrayList<>();
        for (String word : words) {
            candidates.add(word);
        }
        
        while (!candidates.isEmpty()) {
            String guessWord = getBestGuess(candidates);
            int matches = master.guess(guessWord);
            if (matches == 6) {
                return;
            }
            List<String> newCandidates = new ArrayList<>();
            for (String word : candidates) {
                if (countMatches(guessWord, word) == matches) {
                    newCandidates.add(word);
                }
            }
            candidates = newCandidates;
        }
    }
    
    private String getBestGuess(List<String> candidates) {
        if (candidates.size() <= 2) {
            return candidates.get(0);
        }
        int minMax = Integer.MAX_VALUE;
        String bestGuess = candidates.get(0);
        for (String candidate : candidates) {
            int[] groups = new int[7];
            for (String word : candidates) {
                int matches = countMatches(candidate, word);
                groups[matches]++;
            }
            int currentMax = 0;
            for (int count : groups) {
                if (count > currentMax) {
                    currentMax = count;
                }
            }
            if (currentMax < minMax) {
                minMax = currentMax;
                bestGuess = candidate;
            }
        }
        return bestGuess;
    }
    
    private int countMatches(String a, String b) {
        int matches = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                matches++;
            }
        }
        return matches;
    }
}
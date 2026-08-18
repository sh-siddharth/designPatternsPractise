package dsa.slidingWindowQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagrams {
    public static void main(String[] args) {
        String input = "cbaebabacd";
        String pattern = "abc";

        List<Integer> data = findAnagrams(input, pattern);

        System.out.println("result is: "+ data);
    }

    private static List<Integer> findAnagrams(String input, String pattern) {
        List<Integer> result = new ArrayList<>();
        // Edge case: agar main string pattern se choti hai
        if (input.length() < pattern.length())
            return result;

        int k = pattern.length();
        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        // Step 1: Pattern 'p' ki character frequency store kar lo
        for(char c: pattern.toCharArray()){
            pCount[c - 'a']++;
        }

        // Step 2: Fixed Sliding Window Template
        for(int i=0; i<input.length(); i++){
            // 1. Add current character to window
            char rightChar = input.charAt(i);
            windowCount[rightChar - 'a']++;

            // 2. Check if window size K is reached
            if (i >= k - 1) {
                // Check if current window frequency matches pattern frequency
                if(Arrays.equals(pCount, windowCount)){
                    int startIndex= i - (k-1);
                    result.add(startIndex);
                }
                // 3. Slide window: Remove leftmost character
                char leftChar = input.charAt(i - (k - 1));
                windowCount[leftChar - 'a']--;
            }
        }
        return result;
    }
}

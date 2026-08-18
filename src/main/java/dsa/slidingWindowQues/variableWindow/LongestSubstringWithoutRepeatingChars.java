package dsa.slidingWindowQues.variableWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        String s = "abcabcbb";

        /*
        * Example 1: s = "abcabcbb"

        Output: 3 (Longest unique substring hai "abc")

        Example 2: s = "bbbbb"

        Output: 1 (Longest unique substring hai "b")

        Example 3: s = "pwwkew"

        Output: 3 (Longest unique substring hai "wke")
        * */

        lengthOfLongestSubstring(s);
    }

    private static int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLength=0;
        HashSet<Character> set = new HashSet<>();

        for(int right=0; right < s.length(); right++){
            char currentChar = s.charAt(right);

            while(set.contains(currentChar)){
                set.remove(s.charAt(left)); //remove hum string ke order me karre hai
                left++;
            }

            set.add(currentChar);

            // Length update kar lo
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }


    /* Confusion wala logic
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        int[] lastSeen = new int[128]; // ASCII characters ke last seen index + 1 track karega

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // 1. Shrink/Jump: Agar currentChar pehle dekha ja chuka hai current window me
            // Toh left pointer ko direct duplicate element ke aage jump kara do
            left = Math.max(left, lastSeen[currentChar]);

            // 2. Update Result: Maximum unique window length
            maxLength = Math.max(maxLength, right - left + 1);

            // 3. Current character ka 1-based index save kar lo
            lastSeen[currentChar] = right + 1;
        }

        return maxLength;
    }*/
}

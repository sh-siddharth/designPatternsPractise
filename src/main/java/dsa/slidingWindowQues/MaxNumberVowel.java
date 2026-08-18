package dsa.slidingWindowQues;


public class MaxNumberVowel {
    public static void main(String[] args) {
        String s = "leetcode";
        int k=3;

        int maxVowelsCount = findMaxVowel(s,k);
        System.out.println("Max Vowel Count is: " + maxVowelsCount);
    }

    private static int findMaxVowel(String s, int k) {
        int maxVowelsCount=0;
        int vowelCount=0;

        for(int i=0; i<s.length(); i++){
            if(isVowel(s.charAt(i))){
                vowelCount++;
            }

            if(i>=k-1){
                maxVowelsCount = Math.max(maxVowelsCount, vowelCount);

                char leftChar = s.charAt(i-(k-1));
                if(isVowel(leftChar)){
                    vowelCount--;
                }
            }
        }

        return maxVowelsCount;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

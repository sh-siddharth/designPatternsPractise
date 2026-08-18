package dsa.slidingWindowQues.variableWindow;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k=2;

        int count = longestCount(nums, k);
    }

    private static int longestCount(int[] nums, int k) {
        int left=0;
        int maxCount=0;
        int zeroCount=0;

        for(int right=0; right < nums.length; right++){
            if(nums[right] == 0){
                zeroCount++;
            }

            while(zeroCount > k){
                // Agar left wala element 0 tha, toh zeroCount kam hoga
                if (nums[left] == 0) {
                    zeroCount--;
                }

                left++;
            }

            maxCount = Math.max(maxCount, right-left+1);

        }
        return maxCount;
    }
}

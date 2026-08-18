package dsa.slidingWindowQues.variableWindow;

public class MinimumSizeSubarraySum {


    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int minArrSize = findMinSizeSubArrSum(nums, target);

        System.out.println("size of minSubArray is: "+ minArrSize);
    }

    private static int findMinSizeSubArrSum(int[] nums, int target) { //{2, 3, 1, 2, 4, 3} , tar=7
        int left=0;
        int currentSum=0;
        int minLength = Integer.MAX_VALUE;

        for(int right=0; right < nums.length; right++){
            currentSum += nums[right];
            while(currentSum >= target){
                // Update answer with smallest length
                minLength = Math.min(minLength, right - left + 1);

                currentSum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

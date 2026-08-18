package dsa.slidingWindowQues;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k =3; //window size
        int maxOutput = fixedWindowTemplate(arr,k);
        System.out.println("Max Sum of SubArray is: " + maxOutput);
    }

    private static int fixedWindowTemplate(int[] arr, int k) {
        int windowSum=0;
        int maxResult=0;

        for(int i=0; i<arr.length; i++){
            // Line 1: Current element ko window sum me add karo
            windowSum += arr[i];

            // Line 2: Check karo ki kya humne size K ki window reach kar li hai?
            if(i>=k-1){
                // Line 3: Current window sum se maxResult upgrade karo
                maxResult = Math.max(maxResult, windowSum);

                // Line 4: Window ko slide karo (pehle element ko hatao)
                windowSum -= arr[i-(k-1)];
            }
        }
        return maxResult;
    }
}

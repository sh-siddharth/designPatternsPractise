package dsa.slidingWindowQues.twoPointers.collisionStrategy;

public class TrappedRainWater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trappedWaterCount = trappedWater(height);
        System.out.println("Total rain water trapped is: "+ trappedWaterCount);
    }

    private static int trappedWater(int[] height) {
        int maxLeft=0;
        int maxRight  = 0;
        int totalWater=0;
        int left=0;
        int right = height.length -1;

        while(left <= right){

            if(height[left] <= height[right]){
                if(height[left] > maxLeft){
                    maxLeft = height[left];
                }else{
                    totalWater += maxLeft - height[left];
                }
                left ++;
            }else{
                if(height[right] > maxRight){
                    maxRight = height[right];
                }else {
                    totalWater += maxRight - height[right];
                }
                right --;
            }

        }
        return  totalWater;
    }
}

package dsa.slidingWindowQues.twoPointers.collisionStrategy;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        //output=49

        int maxWater = findMaxArea(height);
        System.out.println("max water stored is: "+ maxWater);
    }

    private static int findMaxArea(int[] height) {
        int maxArea=0;
        int left=0;
        int right= height.length-1;

        while (left < right){

            maxArea = Math.max(maxArea,(right-left) * Math.min(height[left], height[right]));

            if(height[left] < height[right]){
                left++;
            } else if (height[left] > height[right]) {
                right--;
            }
        }

        return maxArea;
    }
}

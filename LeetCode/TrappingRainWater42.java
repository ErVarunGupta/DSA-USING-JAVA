package LeetCode;

public class TrappingRainWater42 {
    public static int trap(int[] height) {

        int n = height.length;

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int j = n-2; j >=0; j--){
            rightMax[j] = Math.max(rightMax[j+1], height[j]);
        }

        int ans = 0;
        for(int k = 0; k < height.length; k++){
            int minHeight = Math.min(leftMax[k], rightMax[k] );
            ans += (minHeight - height[k]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}

package LeetCode;

public class ContatinerWithMostWater11 {
    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int maxArea = 0;
        while(start < end){
            int length = Math.min(height[start], height[end]);
            int breath = Math.abs(end - start);
            int area = length * breath;
            maxArea = Math.max(maxArea, area);
            if(height[start] < height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int height[] = {8, 7, 6, 5, 9, 8};
        System.out.println(maxArea(height));
    }
}

package OneDimensional;

public class MaxAreaOfWater {
    public static void main(String[] args) {
        int arr[] = {1, 9, 6, 5, 4, 8, 8};
        System.out.println(areaOfWater1(arr));
    }

    public static int areaOfWater(int arr[]){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                int height = Math.min(arr[i], arr[j]);
                int breath = Math.abs(i - j);
                int area = height * breath;
                max = Math.max(area, max);
            }
        }
        return max;
    }

    public static int areaOfWater1(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int max = 0;
        while(start < end){
            int height = Math.min(arr[start], arr[end]);
            int breath = Math.abs(start - end);
            int area = height * breath;
            max = Math.max(area, max);
            if(arr[start] <= arr[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}

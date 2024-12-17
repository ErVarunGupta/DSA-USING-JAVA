package OneDimensional;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int arr[] = {9, 3, -4, 2,  -5, -3};
        System.out.println("Max : "+maxSubarrayPreSum(arr));
        //kadanes(arr);
    }

    public static int maxSubarraySum(int arr[]){

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                currSum = 0;
                for(int k = i; k <= j; k++){
                    currSum += arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.println(" => "+currSum);
                maxSum = Math.max(maxSum,currSum);
            }

        }
        return maxSum;
    }

    public static int maxSubarrayPreSum(int arr[]){
        int preifx[] = new int[arr.length];
        preifx[0] = arr[0];
        for(int i = 1; i < arr.length; i++){
            preifx[i] = preifx[i-1]+arr[i];
        }

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                currSum = i == 0 ? preifx[j] : preifx[j] - preifx[i-1];
//                System.out.println(" => "+currSum);
                maxSum = Math.max(maxSum,currSum);
            }

        }
        return maxSum;
    }

    public static void kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            cs += arr[i];
            if(cs < 0){
                cs = 0;
                count++;
            }
            ms = Math.max(ms, cs);

        }
        if(count == arr.length) {
            ms = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length; i++){
                if(ms < arr[i]){
                    ms = arr[i];
                }
            }
            System.out.println("maximium : " + ms);
            return;
        }
        System.out.println("maximium : " + ms);
    }
}

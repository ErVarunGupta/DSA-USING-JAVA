package OneDimensional;

public class SubArrays {
    public static void subArrays(int arr[]){
        int ts = 0;
        int sum = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i; j < arr.length; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] +"  ");
                    sum += arr[k];
                }
                ts++;
                System.out.println(" => "+sum);
                sum = 0;
            }
            System.out.println();
        }
        System.out.println("Total number of sub arrays : "+ts);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        subArrays(arr);
    }
}

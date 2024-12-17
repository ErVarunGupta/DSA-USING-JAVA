package OneDimensional.Assignment1;

public class Question02 {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 4, 5, 6, 7};
        rotate(arr,3);
    }

    public static void rotate(int arr[], int pivot){
        int rotate;
       int k = 0;
       while(k <= pivot){
           for(int j = 0; j < arr.length-1; j++){
               rotate = arr[arr.length-1];
               arr[arr.length-j] = arr[arr.length-j-1];
               arr[j] = rotate;
           }
       }

    }
}

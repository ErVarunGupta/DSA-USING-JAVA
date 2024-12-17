package DivideAndConquer;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        print(arr);
    }

    public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        //kaam
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        //kaam
        int newArr[] = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                newArr[k] = arr[i];
                i++;
                k++;
            }else{
                newArr[k] = arr[j];
                j++;
                k++;
            }
        }
        // left part
       while(i <= mid){
//           newArr[k] = arr[i];
//           i++;
//           k++;
           newArr[k++] = arr[i++];
       }
       // right part
        while(j <= ei){
            newArr[k++] = arr[j++];
        }
        // copy to my original array
        for( k = 0, i = si; k < newArr.length; k++, i++){
            arr[i] = newArr[k];
        }
    }
}

package PracticeSession16;

public class AllOccurence {
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        findAllOccurence(arr,2,0);
    }

    public static void findAllOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }
       // findAllOccurence(arr,key,i+1);
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        findAllOccurence(arr,key,i+1);
    }
}

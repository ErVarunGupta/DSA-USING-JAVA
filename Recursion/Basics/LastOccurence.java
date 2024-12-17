package Basics;

public class LastOccurence {
    public static int lastOccurence(int arr[], int key, int i){
//        if(i < 0){
//            return -1;
//        }
//        if(arr[i] == key){
//            return i;
//        }
//        return lastOccurence(arr, key, i-1);

        //2nd way
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = {8, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOccurence(arr, 5,0));
    }
}

package DivideAndConquer;

public class SearchingInRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(arr, 0, arr.length-1, 0));
    }
    public static int search(int arr[], int si, int ei, int target){
        if(si > ei){
            return -1;
        }
        int mid = si + (ei-si)/2;
        if(arr[mid] == target){
            return mid;
        }
        //mid on L1
        if(arr[si] <= arr[mid]){
            //target lies in left of mid
            if(target >= arr[si] && target < arr[mid]){
                ei = mid - 1;
            }else{ //target lies in right of mid
                si = mid + 1;
            }
        }
        //mid on L2
        else{
            //target lies in right of mid
            if(target > arr[mid] && target <= arr[ei]){
                si = mid + 1 ;
            }else{ //target lies in left of mid
                ei = mid - 1;
            }
        }
        return search(arr,si,ei,target);

        // By Loop
//        while(si < ei){
//            int mid = si + (ei-si)/2;
//            if(arr[mid] == target){
//                return mid;
//            }
//            //mid on L1
//            if(arr[si] <= arr[mid]){
//                //target lies in left of mid
//                if(target >= arr[si] && target < arr[mid]){
//                    ei = mid - 1;
//                }else{ //target lies in right of mid
//                    si = mid + 1;
//                }
//            }
//            //mid on L2
//            else{
//                //target lies in right of mid
//                if(target > arr[mid] && target <= arr[ei]){
//                    si = mid + 1 ;
//                }else{ //target lies in left of mid
//                    ei = mid - 1;
//                }
//            }
//        }
//        return -1;
    }
}

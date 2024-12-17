public class Min_Max_Element_Queries {

    static int tree[];
    public static void init( int n){
        tree = new int[4*n];
    }

    public static void createST(int arr[],int sti, int si, int sj){
        if(si == sj){
            tree[sti] = arr[si];
//            return tree[sti];// if int return type
            return;
        }

        int mid = (si+sj)/2;

        createST(arr, 2*sti+1, si, mid);
        createST(arr, 2*sti+2, mid+1, sj);

        tree[sti] = Math.max(tree[2*sti+1], tree[2*sti+2]);

        //if int return type
//        int left = createST(arr, 2*sti+1, si, mid);
//        int right = createST(arr, 2*sti+2, mid+1, sj);
//        tree[sti] = Math.max(left, right);
//        return tree[sti];
    }


    //getMax
    public static int getMax(int arr[],int qi, int qj){
        int n = arr.length;
        return getMaxUtil(0, 0, n-1, qi, qj);
    }
    private static int getMaxUtil(int i, int si, int sj, int qi, int qj){
        if(qj < si|| qi > sj){
            return Integer.MIN_VALUE;
        }else if(si >= qi&& sj <= qj){
            return tree[i];
        }else{
            int mid = (si+sj)/2;
            int left = getMaxUtil(2*i+1, si, mid, qi, qj);
            int right = getMaxUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.max(left, right);
        }
    }

    //update
    static void update(int arr[], int idx, int newVal){
        int n = arr.length;
        arr[idx]= newVal;
        updateUtil(0, 0, n-1, idx, newVal);
    }
    private static void updateUtil(int i, int si, int sj, int idx, int newVal){
        if(idx < si|| idx > sj){
            return;
        }
        if(si == sj){
            tree[i] = newVal;
        }
//        tree[i] = Math.max(tree[i], newVal);
        if(si != sj){
            tree[i] = Math.max(tree[i], newVal);//min case
            int mid = (si + sj)/2;
            updateUtil(2*i+1, si, mid, idx, newVal);
            updateUtil(2*i+2, mid+1, sj, idx, newVal);
        }
    }


    public static void main(String[] args) {
        int arr[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = arr.length;

        init(n);
        createST(arr, 0, 0, n-1);
        for(int i = 0; i < tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();

        //get max
        int result = getMax(arr, 3, 3);
        System.out.println("max = "+result);

        //update
        update(arr, 2, 20);
        for(int i = 0; i < tree.length;i++){
            System.out.print(tree[i]+" ");
        }
        System.out.println();
        System.out.println("max = "+getMax(arr, 0, 3));

        //original array
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}

package ArrayList.Assignment;

import java.util.ArrayList;

// Q - For a given n lines on x-axis, use 2 lines to form a container such that it holds maximum water.
// height = [ 1, 8, 6, 2, 5, 4, 8, 3, 7]
// Logic
// width - i2 - i1
// height = min(height(i1), height(i2))
// Total area = width * height
public class Container_With_Most_Water {
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
        System.out.println(mostWater(height));
    }
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        //brute force  ----- O(n^2)
        for(int i = 0; i < height.size(); i++){
            for(int j = i+1; j < height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWater = ht*width;
                maxWater = Math.max(currWater,maxWater);
            }
        }
        return maxWater;
    }

    public static int mostWater(ArrayList<Integer> height){  // O(n)
        int maxWater = 0;
        // optimized
        int start = 0;
        int end = height.size()-1;
        while(start < end){
            int ht = Math.min(height.get(start), height.get(end));
            int width = end-start;
            int currWater = ht*width;
            maxWater = Math.max(maxWater,currWater);
            if(height.get(start) < height.get(end)){
                start++;
            }else{
                end--;
            }
        }
        return maxWater;
    }

}

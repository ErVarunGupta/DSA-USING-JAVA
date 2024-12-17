package ArrayList.Assignment;

import java.io.FilterOutputStream;
import java.util.ArrayList;

public class FindMaxTarget {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(1);
        nums.add(100);
        nums.add(4);
        nums.add(1);
        nums.add(100);
        nums.add(1);
        nums.add(3);

        System.out.println(target(nums,1));
    }
    public static int target(ArrayList<Integer> nums, int key){
        int freq[] = new int[1001];
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) == key){
                freq[nums.get(i+1)]++;
            }
        }
        int maxValue = 0;
        int target = 0;
        for(int i = 0; i < freq.length; i++){
            if(maxValue < freq[i]){
                maxValue = freq[i];
                target = i;
            }
        }

        return target;
    }
}

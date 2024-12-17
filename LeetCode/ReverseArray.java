package LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ReverseArray {
    public static List<Integer> reverseArray(List<Integer> a) {
        int start = 0;
        int end = a.size() - 1;
        while (start < end) {
            int temp = a.get(start);
            a.set(start, a.get(end));
            a.set(end, temp);
            start++;
            end--;
        }
        return a;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(reverseArray(arr));
    }
}


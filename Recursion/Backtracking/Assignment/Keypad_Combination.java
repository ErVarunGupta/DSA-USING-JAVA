package Backtracking.Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Keypad_Combination {
    public static void main(String[] args) {
        String digits = "235";
        System.out.println(keypadCombination(digits));
    }
    public static ArrayList<String> keypadCombination(String digits){
        ArrayList<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder("");
        if(digits.length() == 0){
            return list;
        }
        int index = 0;
        String mapping[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve(digits, str, index, list, mapping);
        return list;
    }

    private static void solve(String digits, StringBuilder str, int index, ArrayList<String> list, String mapping[]){
        // base case
        if(index == digits.length()){
            list.add(String.valueOf(str)); // list.add(str.toString());
            return;
        }

        int number = digits.charAt(index)- '0';   // to get int number from String digits ,string "23" ->int 2 or 3(type casting)
        String value = mapping[number]; // to get value from mapping array , value = "abc"

        for(int i = 0; i < value.length(); i++){
            str.append(value.charAt(i)); // add to str
            solve(digits, str, index+1, list, mapping); // recursion
            str.deleteCharAt(str.length()-1); // backtracking
        }

    }
}

package PracticeSession13;

public class FlipBits {
    static int minBitFlips(int start, int goal) {
        int count = 0;
//        while(start > 0 || goal > 0){
//            if((start & 1) != (goal & 1)){
//                count++;
//            }
//            start = start >> 1;
//            goal = goal >> 1;
//        }

        int newNum = (start ^ goal);
        while(newNum > 0){
//            if((newNum & 1) == 1){
//                count++;
//            }
//            newNum = newNum >> 1;

            newNum = newNum & (newNum - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minBitFlips(10,7));
    }
}



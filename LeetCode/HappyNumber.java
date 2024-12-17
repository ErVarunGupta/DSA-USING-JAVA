package LeetCode;

public class HappyNumber {
    public static boolean happyNumber(int num){
        int slow = num;
        int fast = num;
        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);
        if(slow == 1){
            return true;
        }
        return false;
    }

    public static int findSquare(int num){
        int sum = 0;
        while(num > 0){
            int rem = num%10;
            sum += rem*rem;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(happyNumber(19));
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 10;
//        printNum(a);
//        System.out.println(isEven(5));
        System.out.println(isPelindrom(1));
        System.out.println(sumOfDigit(12304));
    }

    public static void printNum(int a){
        System.out.println("I am inside the function body");
        System.out.println(a);
    }

    public static boolean isEven(int num){
        if(num%2 == 0){
            return true;
        }else{
            return false;
        }

    }

    public static boolean isPelindrom(int num){
        int temp = num;
        int reverse = 0;
        while(num > 0){
            int rem = num%10;
            reverse = reverse*10 + rem;
            num /= 10;
        }
        if(temp == reverse){
            return true;
        }
        return false;
    }

    public static int sumOfDigit(int num){
        int sum = 0;
        while(num > 0){
            int rem = num%10;
//            if(rem%2 == 0){
//                sum += rem;
//            }
            sum += rem;
            num /= 10;
        }
        return sum;
    }
}

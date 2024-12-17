package Basics;

public class PowerOfN {//O(n) - TC
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int ans = x * power(x,n-1);
        return ans;
    }

    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }
        //int halfPowerSq = optimizedPower(x, n/2) * optimizedPower(x, n/2); // TC - O(n)
        int halfPower = optimizedPower(x, n/2);   // TC - O(log(n))
        int halfPowerSq = halfPower * halfPower;

        //n is odd
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(power(5,4));
        System.out.println(optimizedPower(5,5));
    }
}

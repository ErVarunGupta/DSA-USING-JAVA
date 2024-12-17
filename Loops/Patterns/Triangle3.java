package Patterns;

public class Triangle3 {
    public static void main(String[] args) {
//        triangle3(5);
        VPattern(10);
        APattern(10);
    }

    static void triangle3(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                if(col + row > n){
                    System.out.print("*");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    static void triangle2(int n){
        int space = n-1;
        int star = 1;
        int curr = 1;
        while(curr <= n){
            for(int j = 1; j <= space; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= star; k++){
                System.out.print("* ");
            }
            System.out.println();
            curr++;
            space--;
            star++;
        }
    }

    static void triangle1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void triangle0(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= n-i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void triangle4(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print("* ");
            }
            for(int k = 1; k <= 2*i-2; k++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void triangle5(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= n-i; j++){
                System.out.print("* ");
            }
            for(int k = 1; k <= 2*i-2; k++){
                System.out.print("  ");
            }
            for(int j = 0; j <= n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void piramid(int n){
        for(int i = 1; i <= 2*n-1; i++){
            if(i <= n){
                for(int j = 1; j <= n-i; j++){
                    System.out.print("  ");
                }
                for(int k = 1; k <= i; k++){
                    System.out.print(k+" ");
                }
                for(int k = i-1; k >= 1; k--){
                    System.out.print(k+" ");
                }
            }else{
                for(int j = 1; j <= i%n; j++){
                    System.out.print("  ");
                }
                for(int k = 1; k <= 2*n-i; k++){
                    System.out.print(k+" ");
                }
                for(int k = 2*n-i-1; k >= 1; k--){
                    System.out.print(k+" ");
                }
            }

            System.out.println();
        }

    }

    public static void butterFly(int n){
        int star = 1;
        int space = 2*n-2;
        int curr = 1;
        while(curr <= 2*n-1){
            if(curr <= n){
                for(int j = 1; j <= curr; j++){
                    System.out.print("* ");
                }
                for(int j = 1; j <= space; j++){
                    System.out.print("  ");
                }
                for(int j = 1; j <= curr; j++){
                    System.out.print("* ");
                }
            }else{
                for(int j = 2*n-curr; j >= 1; j--){
                    System.out.print("* ");
                }
                for(int j = 1; j <= (curr-n)*2; j++){
                    System.out.print("  ");
                }
                for(int j = 2*n-curr; j >= 1; j--){
                    System.out.print("* ");
                }
            }
            System.out.println();
            star++;
            space = space-2;
            curr++;
        }
    }

    public static void VPattern(int n){
        int star = 4;
        int space = 2*n-1;
        int curr = 1;
        int corner = 3;
        while(curr <= n+3){
            for(int i = 1; i < curr; i++){
                System.out.print(" ");
            }
            if(curr <= n){
                for(int i = 1; i <= 2; i++){
                    System.out.print("* ");
                }
                for(int i = 1; i < space; i++){
                    System.out.print(" ");
                }
                for(int i = 1; i <= 2; i++){
                    System.out.print("* ");
                }
            }else{
                for(int i = 1; i <= corner; i++){
                    System.out.print("* ");
                }
                corner--;
            }

            System.out.println();
            curr++;
            space = space-2;
        }
        System.out.println("---------------------------------");
    }

    public static void APattern(int n){
        int star = 4;
        int midSpace = 0;
        int midSpace1 = 2*n-2;
        int space1 = n+2;
        int curr = 1;
        int corner = 1;
        while(curr <= n+3){
            for(int i = 1; i <= space1; i++){
                System.out.print(" ");
            }if(curr == n || curr == n+1) {
                for (int i = 1; i <= curr+1; i++) {
                    System.out.print("* ");
                }
            }
            else if(curr > 2 && curr < n+1){
                for(int i = 1; i <= 2; i++){
                    System.out.print("* ");
                }
                for(int i = 1; i <= midSpace; i++){
                    System.out.print(" ");
                }
                for(int i = 1; i <= 2; i++){
                    System.out.print("* ");
                }
                midSpace = midSpace+2;
            }else if(curr > n+1){
                for(int i = 1; i <= 2; i++){
                    System.out.print("* ");
                }
                for(int i = 1; i <= midSpace1; i++){
                    System.out.print(" ");
                }
                for(int i = 1; i <= 2; i++){
                    System.out.print("* ");
                }
                midSpace1 = midSpace1+2;
            }
            else{
                for(int i = 0; i <= corner; i++){
                    System.out.print("* ");
                }
                corner++;
            }

            System.out.println();
            curr++;
            space1--;
        }
    }

}

package BitManipulation.Assignment;

public class Q4_UpperCaseToLowerCase {
    public static void main(String[] args) {
//        for(char ch = 'A'; ch <= 'Z'; ch++){
//            System.out.print((char)(ch | ' '));
//        }
        String name = "VARUN GUPTA";
        System.out.println(upperCaseToLowerCase(name));
    }

    public static String upperCaseToLowerCase(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < str.length(); i++){
            sb.append((char)(str.charAt(i) | ' '));
        }
        return sb.toString();
    }
}

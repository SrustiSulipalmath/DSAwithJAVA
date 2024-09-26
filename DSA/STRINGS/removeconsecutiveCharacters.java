import java.util.Scanner;
public class removeconsecutiveCharacters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A =sc.nextLine();
        int B = sc.nextInt();
        System.out.println(solve(A,B));
    }
    public static String solve(String A, int B) {
        StringBuilder result = new StringBuilder();
        int n = A.length();
        int i = 0;
        while (i < n) {
            char currentChar = A.charAt(i);
            int count = 0;
            
            while (i < n && A.charAt(i) == currentChar) {
                count++;
                i++;
            }
            
            if (count != B) {
                for (int j = 0; j < count; j++) {
                    result.append(currentChar);
                }
            }
        }

        return result.toString();
    }
}


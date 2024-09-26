import java.util.Scanner;
public class reverseStringWordbyword {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        System.out.println(solve(A));
    }

    public static String solve(String A) {
        // Split the input string into words based on spaces
        String[] words = A.split("\\s+");
        
        // Use a StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        
        // Traverse the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            
            // Add space between words, but avoid adding a space after the last word
            if (i > 0) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}



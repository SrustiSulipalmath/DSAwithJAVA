import java.util.Scanner;

public class reverseLettersinString {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A=sc.nextLine();
        System.out.println(solve(A));
    }
    public static String solve(String A) {
        char[] ch=A.toCharArray();
        StringBuilder result = new StringBuilder();
        int n=ch.length;
        int i =0,j=n-1;
        char temp;

        while(i<j){
            temp =ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            result=result.append(ch[i]);
            i++;
            j--;
            
        }
        for(i=j+1;i<n;i++){
            result=result.append(ch[i]);
        }
        
        return result.toString();
    }
}

    


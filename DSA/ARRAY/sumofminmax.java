import java.util.*;
public class sumofminmax {
    public static int solve(int[] A) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
                if(A[i]>max)
                max=A[i];
            }
        for(int i=0;i<A.length;i++){
                if(A[i]<min){
                    min=A[i];
                }
                
            }
        return (min+max);
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int[] A = new int[5];
            for(int i=0;i<A.length;i++){
                A[i]=sc.nextInt();  
                solve(A);       
            } 
}
}


import java.util.*;
 class LinearSearch{
        static int ls(int[] A, int B) {
    
            for(int i=0;i<A.length;i++){
                if(A[i]==B)
                return 1;
            }
            return 0;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int[] A = new int[4];
            for(int i=0;i<A.length;i++){
                A[i]=sc.nextInt();         
            } 
                int B=sc.nextInt();
                ls(A,B);
    
        }
    }


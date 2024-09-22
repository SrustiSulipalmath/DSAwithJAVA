import java.util.*;
public class subarraysofarray
{


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0;i<n;i++){
       arr[i] = sc.nextInt();
    } 
    int si =0;
    int ei=0;
    for(si=0;si<arr.length;si++){
        for(ei=si;ei<n;ei++){
            for(int k =si;k<=ei;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    }
}
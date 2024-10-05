public class sumOfNNumbers {
    public static int Sum(int N){
        if(N==1){
            return 1;
        }
        int SumNm1 = Sum(N-1);
        return N+SumNm1;
    }
    public static void main(String[] args) {
        int N = 5;
        System.out.println(Sum(N));
    }
}

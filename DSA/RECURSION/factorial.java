public class factorial {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fact(n));
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }

        int nm1fact =fact(n-1);
        return n*nm1fact;
    }
}

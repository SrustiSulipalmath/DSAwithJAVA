class transposeofamatrix{

    public static void transpose(int[][] arr){
        //lower triangle of the matrix -> swap(i,j)->(j,i)
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12,},
            {13,14,15,16}
        };
        transpose(arr);
       
    }
}
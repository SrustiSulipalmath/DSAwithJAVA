public class Selection{
    public static void main(String[] args) {
        int[] arr ={2,8,4,-1,7,10,5,6};
        SelectionSort(arr);
        
    }

    public static void SelectionSort(int[] arr){
        int n=arr.length;
        for(int i=0; i<n-1;i++){
            int minval =arr[i];
            int minidx =i;

            for(int j= i+1;j<arr.length;j++){
                if(arr[j]<minval){
                    minval=arr[j];
                    minidx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }

        for(int val:arr){
            System.out.println(val);
        }
    }

}
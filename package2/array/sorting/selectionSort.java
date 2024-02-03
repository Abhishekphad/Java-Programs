package package2.array.sorting;

public class selectionSort {
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        sorting(arr);
        // printsortedsrr(arr);
        arr(arr);
    }
    public static void sorting(int arr[]){
        //loop for One by one move boundary of unsorted subarray
        for(int i=0;i<arr.length-1;i++){
           int min_index=i;
            // Find the minimum element in unsorted array
           for(int j=i+1;j<arr.length-1;j++){
            if(arr[j]<arr[i]){
                min_index=j;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            
           }
            
        }
        //Swap the found minimum element with the first
    }
    public static void arr(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}

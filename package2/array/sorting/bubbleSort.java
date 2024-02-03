package package2.array.sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        sort(arr);
        printarr(arr);

    }
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            // int temp=0;
            int sortcount=0;
            for(int j=0;j<arr.length-1;j++){
                while(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    sortcount++;
                }
            }
            System.out.print(sortcount);
        } System.out.println();
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            
        }
    }
}
package DivideAndConquere;

public class QuickSort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void QuickSort(int arr[], int si, int ei){
        // ?Base case
        if(si>=ei){
            return;
        }
        int pInx=partition(arr,si,ei);
        QuickSort(arr, si, pInx-1);
        QuickSort(arr, pInx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot= arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }          
        }
        i++;
        int temp=arr[ei];
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={4,5,2,3,9,9,5};
        QuickSort(arr, 0, arr.length-1);
        print(arr);
    }
}

    
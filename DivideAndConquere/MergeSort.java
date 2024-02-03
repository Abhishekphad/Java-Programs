package DivideAndConquere;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={1,5,7,2,4,5,9};
        int arr1[]={1,5,8,6,8,8};
        MergeSort(arr, 0, arr.length-1);
        print(arr);
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void MergeSort(int arr[],int si,int ei){
        // Base case
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        // kaam
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
        // createe new function for merging array
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si, int mid, int ei){
        // Define array length
        int temp[]=new int [(ei-si)+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                k++;i++;
            }else{
                temp[k]=arr[j];
                k++;j++;
            }
        }
        while(i<=mid){
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<=ei){
            temp[k]=arr[j];
            k++;
            j++;
        }
        // insert element from temp array to original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    
}

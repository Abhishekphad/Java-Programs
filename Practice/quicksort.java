package Practice;

public class quicksort {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[]args){
        int arr[]={2,3,5,3,4,3,9,4,2,9,7};
        Sort(arr,0,arr.length-1);
        print(arr);
    }
    public static void Sort(int arr[], int si, int ei){
        // Base case
        if(si>ei){
            return;
        }
        //find pivot index
        int pivotidx=partition(arr,si,ei);
        Sort(arr,si,pivotidx-1);
        Sort(arr,pivotidx+1,ei);
    }
    static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;   //to make places for element
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
}

package Practice;

public class mergeSort {

    public static void merges(int arr[],int si,int ei){
        // Base case 
        if(si>=ei){
            return;
        }
        // Kaam
        int mid=(si+ei)/2;
        merges(arr, si, mid);
        merges(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[(ei-si)+1];
        int i=si;
        int k=mid+1;
        int j=0;
        while(i<=mid && k<=ei){
            if(arr[i]<arr[k]){
                temp[k]=arr[i];
                j++;i++;
            }else{
                temp[j]=arr[k];
                j++;k++;
            }
        }
        while(i<=mid){
            temp[j]=arr[i];
            j++;i++;
        }
        while(k<=ei){
            temp[j]=arr[i];
            j++;i++; 
        }
        for(j=0,i=si;j<temp.length;j++,i++){
            arr[i]=temp[j];
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,6,9,7,2};
        merges(arr,0,arr.length-1);
        print(arr);
    }
}

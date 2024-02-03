package Recursion;

public class LastOccurence {
    public static int Occurence(int arr[], int key,int i){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return Occurence(arr, key, i-1);
    
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,8,5,9,7};
        int key=8;
        int i=arr.length-1;
        System.out.println(Occurence(arr, key, i) );
        System.out.println(apclgOccurence(arr, key, i));
    }

    public static int apclgOccurence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int n=apclgOccurence(arr, key,i+1);
        if(n==-1 && arr[i]==key){
            return i;
        }
        return n;
    }
}

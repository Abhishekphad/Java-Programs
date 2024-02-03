package package2.array;

// import java.lang.annotation.Target;

public class binarysearch {
 public static void main(String[] args) {
    int a[]={1,2,3,4,5,6,7,8,9,10};
    int key=7;
    System.out.println(BinarySearch(a, key));
 }
 public static int BinarySearch(int a[], int key){
    int start=0;
    int end= a.length-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(key==a[mid]){
            return mid;             
        }                   
        if(key>a[mid]){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
     return -1;
 }
}

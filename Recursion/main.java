package Recursion;

public class main {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,8,4,9,5};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==5){
                count++;
            }
        }
        System.out.println(count);
    }
}

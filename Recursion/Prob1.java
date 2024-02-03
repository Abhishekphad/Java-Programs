package Recursion;

public class Prob1 {
    public static void keyoccurence(int[] arr,int key,int si){
        // base condition 
        if(si==arr.length){
            // int[] ans= new int[0];
            return;
        }
        // Kaam
        if(arr[si]==key){
            // int ans[]= new int[si+1 ];
            System.out.print(si+" ");
        }
        keyoccurence(arr,key, si+1);

    }



    public static void main(String[] args) {
        int arr[]= {3,2,5,4,6,2,7,2,2};
        int key=2;
        keyoccurence(arr,key,0);
    }
}

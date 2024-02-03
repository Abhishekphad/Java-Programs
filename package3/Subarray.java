package package3;

public class Subarray {
    public static void printSubarray(int arr[]){
        int sum=0;
        int count=0;
        for(int i=0;i<=arr.length-1;i++){
            sum=0;
            
            for(int j=i;j<=arr.length-1;j++){
                
                count++;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    
                     // sum+=arr[k];
                    if(k==j){
                      sum+=arr[k];   
                    }
                }
                System.out.println();
                System.out.println("sum is: "+sum);
            }
            
            
        }
        System.out.println("No of Subarrays is: "+count);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSubarray(arr);
    }
}

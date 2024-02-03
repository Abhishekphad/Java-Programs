package DivideAndConquere;
public class sortedAndRotetedarry{
    // public static int search(int arr[],int target,int si,int ei){
    //     // base condition
    //     if(si>ei){
    //         return -1;
    //     }
    //     // Finding mid for array
    //     int mid=(si+ei)/2;
    //     // case if target at mid
    //     if(arr[mid]==target){
    //         return mid;
    //     }
    //     // mid on line 1
    //     if(arr[si]<=arr[mid]){
    //         // case a: left side of line
    //         if(arr[si]<=target && target<=arr[mid]){
    //             return search(arr, target, si, mid);  
    //         }
    //         // case b: right side of line
    //         else{
    //             return search(arr, target, mid, ei);
    //         }
    //     }
    //     // mid in line 2
    //     else{
    //         // case c: right
    //         if(arr[mid]<=target && target<=arr[ei]){
    //             return search(arr, target, mid+1, ei);
    //         }
    //         else{
    //             // case d: left
    //             return search(arr, target, si, mid-1);
    //         }

    //     }

    // }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2,3};
        int target=1;
        // System.out.println(search(arr, target, 0, arr.length-1));
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Target at index: "+i);
            }
        }
    }
}

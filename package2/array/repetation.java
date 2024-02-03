package package2.array;

public class repetation {

    public static boolean apperance(int[] nums) {
        // int nums[]= {1,2,3,1};
        // apperance(nums);
        for(int i=0;i<nums.length;i++){
           for(int j=1; j<=nums.length;j++){
            if(nums[i]==nums[j]){
                return true;
            }
           } 
        }return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        System.out.println(apperance(nums));
    }
}
    
package Recursion;

public class Prob3 {
    public static int printLegth(String str){
        // Base condition
        if(str.length()==1){
            return 1;
        }
        int length= printLegth(str.substring(1))+1; // String start from index 1
        return length;
    }
    public static void main(String[] args) {
        String str="YashKurunkar";
        System.out.println(printLegth(str));
    }
}
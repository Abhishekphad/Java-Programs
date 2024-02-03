package Recursion;

public class sortedarray {
    public static boolean isSorted(int n[], int i){
        if(i==n.length-1){
            return true;
        }
        if(n[i]>n[i+1]){
            return false;
        }
        return isSorted(n, i+1);

    }
    public static void main(String[] args) {
        int n[]={1,2,3,4,5,8,7};
        System.out.println(isSorted(n,0));
    }
}

package Recursion;

public class revercenumber {
    public static void reverse(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n +" ");
        reverse(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        reverse(n);
    }
    
}

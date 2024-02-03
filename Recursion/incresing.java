package Recursion;

public class incresing {
    public static void incresingnumber(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        incresingnumber(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        incresingnumber(n);
    }
}

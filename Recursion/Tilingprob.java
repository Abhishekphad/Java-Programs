package Recursion;

public class Tilingprob {
    public static int tiling(int n){
        // Base case 
        if(n==0 || n==1){
            return 1;
        }
        // Choise making
        int vert= tiling(n-1);
        int hori= tiling(n-2);
        int totalways=vert+hori;
        return totalways;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(tiling(n));
    }
}

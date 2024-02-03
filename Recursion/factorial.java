package Recursion;

public class factorial {
    public static int factorialPrint(int n){
        if(n==1){
            return 1;
        }
    //   int fnm1=factorialPrint(n-1);
      int fact=n*factorialPrint(n-1);
      return fact;

    }   
    public static void main(String[] args) {
        int n=10;
        System.out.println(factorialPrint(n));
    }
}
